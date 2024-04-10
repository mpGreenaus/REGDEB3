package it.aips.regbed3.tableCache;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TableService<T>{
    @Autowired
    private IGenericRepo<T> genericRepository;

    @Autowired
    private TableCacheSingleton tableCacheSingleton;

    public List<T> getTableData(String tableName) {
        List<T> data;
        if (!tableCacheSingleton.getTableDataMap().containsKey(tableName) || tableCacheSingleton.getTableDataMap().get(tableName).isEmpty()) {
            // La cache per questa tabella è vuota, interroga il database
            data = (List<T>) genericRepository.findAllByTableName(tableName);
            // Aggiorna la cache con i dati dalla tabella
            tableCacheSingleton.getTableDataMap().put(tableName, data);
        } else {
            // Utilizza i dati dalla cache
            data = (List<T>) tableCacheSingleton.getTableDataMap().get(tableName);
        }
        return data;
    }
}
