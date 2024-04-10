package it.aips.regbed3.DTOs;

public class CoIntestatarioDTO {

	private Long ProgressivoGaranzia;
	private Long NumeroGaranzia;
	private Integer DataScadenzaGaranzia;
	private Double ImportoGaranzia;
	
	public CoIntestatarioDTO(Long ProgressivoGaranzia, Long NumeroGaranzia,
			Integer DataScadenzaGaranzia, Double ImportoGaranzia) {
		this.DataScadenzaGaranzia=DataScadenzaGaranzia;
		this.ImportoGaranzia=ImportoGaranzia;
		this.NumeroGaranzia=NumeroGaranzia;
		this.ProgressivoGaranzia=ProgressivoGaranzia;
	}
	
	public Long getProgressivoGaranzia() {
		return ProgressivoGaranzia;
	}
	public void setProgressivoGaranzia(Long progressivoGaranzia) {
		ProgressivoGaranzia = progressivoGaranzia;
	}
	public Long getNumeroGaranzia() {
		return NumeroGaranzia;
	}
	public void setNumeroGaranzia(Long numeroGaranzia) {
		NumeroGaranzia = numeroGaranzia;
	}
	public Integer getDataScadenzaGaranzia() {
		return DataScadenzaGaranzia;
	}
	public void setDataScadenzaGaranzia(Integer dataScadenzaGaranzia) {
		DataScadenzaGaranzia = dataScadenzaGaranzia;
	}
	public Double getImportoGaranzia() {
		return ImportoGaranzia;
	}
	public void setImportoGaranzia(Double importoGaranzia) {
		ImportoGaranzia = importoGaranzia;
	}
}
