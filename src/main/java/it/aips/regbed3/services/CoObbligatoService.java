package it.aips.regbed3.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import it.aips.regbed3.DTOs.CoObbligatoDTO;
import it.aips.regbed3.costanti.Costanti;
import it.aips.regbed3.entity.CoObbligato;
import it.aips.regbed3.entity.PersonaGiuridicaEntity;
import it.aips.regbed3.repo.CoObbligatoRepo;
import it.aips.regbed3.service.supporto.CoObbligatoMapper;
import it.aips.regbed3.service.supporto.Risposta;

@Service
public class CoObbligatoService {

    @Autowired
    private CoObbligatoRepo coObbligatoRepo;
    
    public PersonaGiuridicaEntity<CoObbligatoDTO> getCoObbligato(String CUAA) {
    	//questa lista è da BUTTARE perchè funge da mock per la interrogazione sql
    	//CoObbligatoDTO mock=new CoObbligatoDTO();
    	CoObbligato mock=new CoObbligato();
    	mock.setId(1L);
    	mock.setIndirizzoAzienda("indirizzo mio");
    	mock.setRagioneSociale("società abc");
    	CoObbligatoDTO cobb=CoObbligatoMapper.toDTO(mock);
    	//  -------------------------- fine buttare ------------------
    	Risposta risposta; //= new Risposta();
    	
    	try {
            //Optional<CoObbligatoDTO> risultato = coObbligatoRepo.findByCUAA(CUAA); è OK manca DB e config
            //if (risultato.isPresent()) {
            if (!mock.getIndirizzoAzienda().isEmpty()) {  // La risposta ha i dati, quindi va bene
                
            	risposta=new Risposta(true, Costanti.CF_TROVATO);
            } else {  // La risposta non ha nulla, è vuota
                
            	risposta=new Risposta(false, Costanti.CF_NON_TROVATO);
            }
        } catch (Exception e) {
            // Il servizio non risponde o si verifica un errore
        	risposta=new Risposta(false, Costanti.ERR_CALL_SERVICE); // + e.getMessage());
            //FARE EXCEPTION CENTRALIZZATA
        }

    	return new PersonaGiuridicaEntity<CoObbligatoDTO>(cobb, risposta);
    }
}
