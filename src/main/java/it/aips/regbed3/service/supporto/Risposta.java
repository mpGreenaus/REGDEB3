package it.aips.regbed3.service.supporto;

public class Risposta {
    private boolean esito;
    private String messaggio;
    //private CoObbligatoDTO dati;

    public Risposta(boolean esito, String messaggio) { //, CoObbligatDTO dati) {
        this.esito = esito;
        this.messaggio = messaggio;
       // this.dati = dati;
    }

	public boolean isEsito() {
		return esito;
	}

	public void setEsito(boolean esito) {
		this.esito = esito;
	}

	public String getMessaggio() {
		return messaggio;
	}

	public void setMessaggio(String messaggio) {
		this.messaggio = messaggio;
	}

}
