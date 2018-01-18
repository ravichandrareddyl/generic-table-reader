package com.ravi.tablebackup.model;

import java.util.List;
import java.util.Map;

public class TableData {
	
	private List<Map<String, Object>> rows;

	public List<Map<String, Object>> getRows() {
		return rows;
	}

	public void setRows(List<Map<String, Object>> rows) {
		this.rows = rows;
	}

}
