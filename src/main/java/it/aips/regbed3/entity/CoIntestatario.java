package it.aips.regbed3.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="garanzia")
public class CoIntestatario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id; //non inserire il settere, table in sola lettura
	private Long ProgressivoGaranzia;
	private Long NumeroGaranzia;
	private Integer DataScadenzaGaranzia;
	private Double ImportoGaranzia;
	
	
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
	public Long getId() {
		return id;
	}
}
