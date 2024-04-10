package it.aips.regbed3.DTOs;

public class SoggettoDTO {
    private String ragioneSociale;
    private String indirizzoAzienda;
    
    public SoggettoDTO(String ragioneSociale, String indirizzoAzienda) {
        this.ragioneSociale = ragioneSociale;
        this.indirizzoAzienda = indirizzoAzienda;
    }
    
	public String getRagioneSociale() {
		return ragioneSociale;
	}
	public void setRagioneSociale(String ragioneSociale) {
		this.ragioneSociale = ragioneSociale;
	}
	public String getIndirizzoAzienda() {
		return indirizzoAzienda;
	}
	public void setIndirizzoAzienda(String indirizzoAzienda) {
		this.indirizzoAzienda = indirizzoAzienda;
	}
}
