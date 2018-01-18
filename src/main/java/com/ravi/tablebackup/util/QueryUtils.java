package com.ravi.tablebackup.util;

import java.util.Map;

import com.ravi.tablebackup.model.GenericTable;

public class QueryUtils {
	
	public static String createQuery(GenericTable table) {
		if (!table.getColumnsNames().isEmpty()) {
			String query = "SELECT ";
			for(Map.Entry<Integer, String> entry: table.getColumnsNames().entrySet()) {
				query = query + " " + entry.getValue() + ",";
			}
			query += "ROWNUM FROM " + table.getTableName();
			
			return query;
		} else {
			return null;
		}
		
	}

}
