package it.aips.regbed3.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import it.aips.regbed3.entity.CoObbligato;
import it.aips.regbed3.entity.Nomi;
import it.aips.regbed3.entity.Soggetto;
import it.aips.regbed3.tableCache.TableService;

@RestController
@RequestMapping("/api")
public class TableCacheController {

	@Autowired
	private TableService<Nomi> tableServiceNomi;
	@Autowired
	private TableService<CoObbligato> tableServiceCoObbligato;
	@Autowired
	private TableService<Soggetto> tableServiceSoggetto;
	
	
    @GetMapping("/tnomi2")
    public List<Nomi> getNomi2() {
        return tableServiceNomi.getTableData("Nomi");
    }
    
    @GetMapping("/tco-obbligato2")
    public List<CoObbligato> getCoObbligato2() {
        return tableServiceCoObbligato.getTableData("coObbligato");
    }
    
    @GetMapping("/tsoggetto2")
    public List<Soggetto> getSoggetto2() {
        return tableServiceSoggetto.getTableData("soggetto");
    }
}
