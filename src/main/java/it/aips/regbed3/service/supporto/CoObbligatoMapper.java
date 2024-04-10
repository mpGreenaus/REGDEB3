package it.aips.regbed3.service.supporto;

import it.aips.regbed3.DTOs.CoObbligatoDTO;
import it.aips.regbed3.entity.CoObbligato;

public class CoObbligatoMapper {
    public static CoObbligatoDTO toDTO(CoObbligato coObbligato) {
        if (coObbligato == null) {
            return null;
        }
        return new CoObbligatoDTO(coObbligato.getRagioneSociale(), coObbligato.getIndirizzoAzienda());
    }
}
