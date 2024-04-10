package it.aips.regbed3.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import it.aips.regbed3.DTOs.SoggettoDTO;
import it.aips.regbed3.costanti.Costanti;
import it.aips.regbed3.entity.PersonaGiuridicaEntity;
import it.aips.regbed3.entity.Soggetto;
import it.aips.regbed3.repo.SoggettoRepo;
import it.aips.regbed3.service.supporto.Risposta;
import it.aips.regbed3.service.supporto.SoggettoMapper;

@Service
public class SoggettoService {

    @Autowired
    private SoggettoRepo soggettoRepo;
    
    public PersonaGiuridicaEntity<SoggettoDTO> getSoggetto(String CUAA) {
    	//questa lista è da buttare perchè funge da mock per la interrogazione sql
    	Soggetto mock=new Soggetto();
    	mock.setIndirizzoAzienda("indirizzo mio");
    	mock.setRagioneSociale("società abc");
    	SoggettoDTO sogg=SoggettoMapper.toDTO(mock);
    	//  -------------------------- fine buttare ------------------
    	Risposta risposta; //= new Risposta();
    	
    	try {
    		//ATTENZIONE! la sezione commentata è da usare quando si avrà il db
           /* Optional<Soggetto> risultato = soggettoRepo.findByCUAA(CUAA); // è OK manca DB e config
            if (risultato.isPresent()) {
                SoggettoDTO soggettoDTO = SoggettoMapper.toDTO(risultato.get());
                // Verifica che l'indirizzo azienda non sia vuoto
                if (!soggettoDTO.getIndirizzoAzienda().isEmpty()) {
                    risposta = new Risposta(true, Costanti.CF_TROVATO);
                } else {
                    risposta = new Risposta(false, Costanti.CF_NON_TROVATO);
                }
            } else {
                risposta = new Risposta(false, Costanti.CF_NON_TROVATO);
            } */
            
            if (!mock.getIndirizzoAzienda().isEmpty()) {
                // La risposta ha i dati, quindi va bene
            	risposta=new Risposta(true, Costanti.CF_TROVATO);
            } else {
                // La risposta non ha nulla, è vuota
            	risposta=new Risposta(false, Costanti.CF_NON_TROVATO);
            }
        } catch (Exception e) {
            // Il servizio non risponde o si verifica un errore
        	risposta=new Risposta(false, Costanti.ERR_CALL_SERVICE); // + e.getMessage());
            //FARE EXCEPTION CENTRALIZZATA
        }

    	return new PersonaGiuridicaEntity<SoggettoDTO>(sogg, risposta);
    }
}
