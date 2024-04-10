package it.aips.regbed3.tableCache;

import java.util.List;
import java.util.Map;
import java.util.HashMap;

public class TableCacheSingleton {
    private static final TableCacheSingleton instance = new TableCacheSingleton();
    private Map<String, List<?>> tableDataMap;

    private TableCacheSingleton() {
        // Inizializza la mappa dei dati delle tabelle
        this.tableDataMap = new HashMap<>();
    }

    public static TableCacheSingleton getInstance() {
        return instance;
    }

    public Map<String, List<?>> getTableDataMap() {
        return tableDataMap;
    }

    public void setTableDataMap(Map<String, List<?>> tableDataMap) {
        this.tableDataMap = tableDataMap;
    }
}
