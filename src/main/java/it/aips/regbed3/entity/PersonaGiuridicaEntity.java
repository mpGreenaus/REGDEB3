package it.aips.regbed3.entity;

import it.aips.regbed3.service.supporto.Risposta;

public class PersonaGiuridicaEntity<T> {
	private T data;
	private Risposta message;
	
	public Risposta getMessage() {
		return message;
	}

	public void setMessage(Risposta message) {
		this.message = message;
	}

	public PersonaGiuridicaEntity(T data, Risposta message) {
		this.data=data;
		this.message=message;
	}
	
	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}
	
}
