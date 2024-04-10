package it.aips.regbed3.costanti;

public class Costanti {
	//--------------------------- DECADENZA -----------------------------
	public static final String REGEX_CUAA = "[A-Za-z0-9]{11}|[A-Za-z0-9]{16}";
	public static final String CF_ERRATO ="CUAA non valido (CF): deve contenere solo caratteri alfanumerici e avere una lunghezza di 16 caratteri";
	public static final String PIVA_ERRATO ="CUAA non valido (P.IVA): deve contenere solo caratteri numerici e avere una lunghezza di 11 caratteri";
	public static final String ERR_CALL_SERVICE ="Errore nell’invocazione del servizio Anagrafica";
	public static final String CF_NON_TROVATO ="Codice fiscale non presente in Anagrafica";
	public static final String CF_TROVATO ="OK";
	public static final String GARANZIA_TROVATA ="OK";
	public static final String GARANZIA_NON_TROVATA ="Codice fiscale non trovato";
}
