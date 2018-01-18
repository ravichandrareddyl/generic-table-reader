package com.ravi.tablebackup.dao;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;

import com.ravi.tablebackup.model.GenericTable;
import com.ravi.tablebackup.model.TableData;

@Configuration
public class TableReadDAO {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	public TableData getTableData(GenericTable table, String queryString) {
		
		TableData tableData = new TableData();
		
		List<Map<String, Object>> rows = jdbcTemplate.queryForList(queryString);
		
		tableData.setRows(rows);
             
		return tableData;
	}
}
