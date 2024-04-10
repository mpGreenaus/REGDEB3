package it.aips.regbed3.DTOs;

public class CoObbligatoDTO {
    private String ragioneSociale;
    private String indirizzoAzienda;
    
    public CoObbligatoDTO(String ragioneSociale, String indirizzoAzienda) {
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
