package com.ravi.tablebackup.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;

import com.ravi.tablebackup.dao.TableReadDAO;
import com.ravi.tablebackup.model.GenericTable;
import com.ravi.tablebackup.model.TableData;
import com.ravi.tablebackup.util.QueryUtils;
@Configuration
public class TableDataReadController {
	
	@Autowired
	private TableReadDAO tableReadDAO;

	public void backUpTableData(GenericTable table) {
		String query = QueryUtils.createQuery(table);
		TableData tableData = tableReadDAO.getTableData(table, query);
		
		for(Map<String, Object> row: tableData.getRows()) {
			for(Map.Entry<String, Object> column : row.entrySet()) {
				System.out.println("column name" + column.getKey());
				System.out.println("column value" + column.getValue());
			}
		}
	}

}
