package it.aips.regbed3.tableCache;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface IGenericRepo <T> extends JpaRepository<T, Long> {
    List<T> findAllByTableName(String tableName);
}	

