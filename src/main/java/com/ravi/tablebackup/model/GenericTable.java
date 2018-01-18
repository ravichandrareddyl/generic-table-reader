package com.ravi.tablebackup.model;

import java.util.Map;

public class GenericTable {
	
	private String tableName;
	private Map<Integer, String> columnsNames;
	
	public String getTableName() {
		return tableName;
	}
	public void setTableName(String tableName) {
		this.tableName = tableName;
	}
	public Map<Integer, String> getColumnsNames() {
		return columnsNames;
	}
	public void setColumnsNames(Map<Integer, String> columnsNames) {
		this.columnsNames = columnsNames;
	}

}
