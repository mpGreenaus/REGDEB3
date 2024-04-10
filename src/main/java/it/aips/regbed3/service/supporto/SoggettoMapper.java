package it.aips.regbed3.service.supporto;

import it.aips.regbed3.DTOs.SoggettoDTO;
import it.aips.regbed3.entity.Soggetto;

public class SoggettoMapper {
    public static SoggettoDTO toDTO(Soggetto soggetto) {
        if (soggetto == null) {
            return null;
        }
        return new SoggettoDTO(soggetto.getRagioneSociale(), soggetto.getIndirizzoAzienda());
    }
}
