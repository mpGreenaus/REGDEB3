package it.aips.regbed3.service.supporto;

import it.aips.regbed3.DTOs.CoIntestatarioDTO;
import it.aips.regbed3.entity.CoIntestatario;

public class CoIntestatarioMapper {
	
    public static CoIntestatarioDTO toDTO(CoIntestatario coIntestatario) {
        if (coIntestatario == null) {
            return null;
        }

        return new CoIntestatarioDTO(
        		coIntestatario.getProgressivoGaranzia(),
        		coIntestatario.getNumeroGaranzia(),
        		coIntestatario.getDataScadenzaGaranzia(), 
        		coIntestatario.getImportoGaranzia()
        		);
    }
}
