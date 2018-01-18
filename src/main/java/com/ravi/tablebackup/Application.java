package com.ravi.tablebackup;

import java.util.HashMap;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.ravi.tablebackup.controller.TableDataReadController;
import com.ravi.tablebackup.model.GenericTable;

@SpringBootApplication
public class Application implements CommandLineRunner {

    private static final Logger log = LoggerFactory.getLogger(Application.class);
    
    @Autowired
    private TableDataReadController tableReadCtrl;

    public static void main(String args[]) {
        SpringApplication.run(Application.class, args);
    }

    @Override
    public void run(String... strings) throws Exception {

        log.info("reading tables");
        
        GenericTable genericTable = new GenericTable();
        genericTable.setTableName("COUNTRIES");
        Map<Integer, String> columnsNames = new HashMap<Integer, String>();
        columnsNames.put(1, "COUNTRY_ID");
        genericTable.setColumnsNames(columnsNames);
        
        tableReadCtrl.backUpTableData(genericTable);
        
        
    }
}