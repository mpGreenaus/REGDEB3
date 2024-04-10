package it.aips.regbed3.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import it.aips.regbed3.DTOs.CoObbligatoDTO;
import it.aips.regbed3.DTOs.SoggettoDTO;
import it.aips.regbed3.entity.Nomi;
import it.aips.regbed3.entity.PersonaGiuridicaEntity;
import it.aips.regbed3.services.NomiService;

@RestController
@RequestMapping("/api")
public class NomiController {
  
	@Autowired
	NomiService nomiService;
	
    @GetMapping("/nomi2")
    public List<Nomi> getNomi2() {
        return nomiService.getNomi();
    }
    
    @GetMapping("/nomi")
    public List<String> getNomi() {
    	List<String>aa=new ArrayList<>();
    	aa.add("pippo");
    	aa.add("pluto");
    	aa.add("paperino");
    	return aa;
        //return nomiService.getNomi();
    }
    
}
