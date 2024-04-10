package it.aips.regbed3.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import it.aips.regbed3.DTOs.CoIntestatarioDTO;
import it.aips.regbed3.costanti.Costanti;
import it.aips.regbed3.entity.CoIntestatario;
import it.aips.regbed3.entity.PersonaGiuridicaEntity;
import it.aips.regbed3.repo.CoIntestatarioRepo;
import it.aips.regbed3.service.supporto.CoIntestatarioMapper;
import it.aips.regbed3.service.supporto.Risposta;

@Service
public class CoIntestatarioService {

	@Autowired
	CoIntestatarioRepo coIntestatarioRepo;
	
	public List<PersonaGiuridicaEntity<CoIntestatarioDTO>> postSoggettoCoIntestato(Map<String, String> data) {
    	//questa lista è da BUTTARE perchè funge da mock per la interrogazione sql
		List<CoIntestatarioDTO> lista = new ArrayList<>();
		CoIntestatario mock=new CoIntestatario();
    	mock.setDataScadenzaGaranzia(11022024);
    	mock.setImportoGaranzia(234.45D);
    	mock.setNumeroGaranzia(24356789L);
    	mock.setProgressivoGaranzia(736372L);
    	CoIntestatarioDTO coint=CoIntestatarioMapper.toDTO(mock);
    	lista.add(coint);

		CoIntestatario mock2=new CoIntestatario();
    	mock2.setDataScadenzaGaranzia(11022024);
    	mock2.setImportoGaranzia(234.45D);
    	mock2.setNumeroGaranzia(24356789L);
    	mock2.setProgressivoGaranzia(736372L);
    	CoIntestatarioDTO coint2=CoIntestatarioMapper.toDTO(mock2);
    	lista.add(coint2);

       	//  -------------------------- fine buttare ------------------
    	Risposta risposta; 
    	List<PersonaGiuridicaEntity<CoIntestatarioDTO>> listaEntita = null;
		
    	try {
            //Optional<CoObbligatoDTO> risultato = coObbligatoRepo.findByCUAA(CUAA); è OK manca DB e config
            //if risultato!=null && risultato >1 ...
    		listaEntita = new ArrayList<>();
    		if (ctrlCampi(mock)) {  // La risposta ha i dati, quindi va bene
            	risposta=new Risposta(true, Costanti.GARANZIA_TROVATA);
            	for (CoIntestatarioDTO cointesta : lista) {
            	    listaEntita.add(new PersonaGiuridicaEntity<>(cointesta, risposta));
            	}
            } else {  // La risposta non ha nulla, è vuota
            	risposta=new Risposta(false, Costanti.GARANZIA_NON_TROVATA);
            	listaEntita.add(new PersonaGiuridicaEntity<>(null, risposta));
            }
        } catch (Exception e) {
            // Il servizio non risponde o si verifica un errore
        	risposta=new Risposta(false, Costanti.ERR_CALL_SERVICE); // + e.getMessage());
            //FARE EXCEPTION CENTRALIZZATA
        }

    	return listaEntita;
	}
	
	private boolean ctrlCampi(CoIntestatario mock) {
		if((mock.getDataScadenzaGaranzia()!=null && mock.getDataScadenzaGaranzia() >-1) &&
		    	(mock.getImportoGaranzia()!=null && mock.getImportoGaranzia() > -1) &&
		    	(mock.getNumeroGaranzia()!=null && mock.getNumeroGaranzia() > -1) &&
		    	(mock.getProgressivoGaranzia()!=null && mock.getProgressivoGaranzia() > -1)
		) {
			return true;
		};
		
		return false;
	}
}
