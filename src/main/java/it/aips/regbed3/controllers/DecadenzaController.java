package it.aips.regbed3.controllers;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import it.aips.regbed3.costanti.Costanti;
import it.aips.regbed3.entity.PersonaGiuridicaEntity;
import it.aips.regbed3.service.supporto.Risposta;
import it.aips.regbed3.services.CoIntestatarioService;
import it.aips.regbed3.services.CoObbligatoService;
import it.aips.regbed3.services.SoggettoService;

@RestController
@RequestMapping("/api")
public class DecadenzaController {

	@Autowired
	SoggettoService soggettoService;
	@Autowired
	CoObbligatoService coObbligatoService;
	@Autowired
	CoIntestatarioService coIntestatarioService;
	
    @GetMapping("/soggetto-sisco/{CUAA}")
    public ResponseEntity<?> getSoggettoByCUAA(@PathVariable("CUAA") String CUAA) {
    	if (!CUAA.matches(Costanti.REGEX_CUAA)) {
            return ResponseEntity.badRequest().body(new PersonaGiuridicaEntity<>(null, 
            			new Risposta(false, Costanti.CF_NON_TROVATO)));
        }
        //quando scrivo il service deve controllare la anomalia vedi PG10 del documento
    	//ma CUAA è sia per p.iva che cf?
        //REGDEB-v_1.8
        return ResponseEntity.ok(soggettoService.getSoggetto(CUAA));
    }
    
    @GetMapping("/co-obbligato-sisco/{CUAA}")
    public ResponseEntity<?> getSoggettoByCUAACoObbligato(@PathVariable("CUAA") String CUAA) {
    	if (!CUAA.matches(Costanti.REGEX_CUAA)) {
            return ResponseEntity.badRequest().body(new PersonaGiuridicaEntity<>(null, 
            			new Risposta(false, Costanti.CF_NON_TROVATO)));
        }
        //quando scrivo il service deve controllare la anomalia vedi PG10 del documento
    	//ma CUAA è sia per p.iva che cf?
        //REGDEB-v_1.8

        return ResponseEntity.ok(coObbligatoService.getCoObbligato(CUAA));
    }
    
    @PostMapping("/co-intestato-sisco")
    public ResponseEntity<?> postSoggettoCoIntestato(@RequestBody Map<String, String> data) {
      return ResponseEntity.ok(coIntestatarioService.postSoggettoCoIntestato(data));
    }
}
