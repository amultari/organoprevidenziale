package com.example.organoprevidenziale.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class RegistroPrevidenziale {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nome;
	private String cognome;
	private String codiceFiscale;
	private String codicePrevidenziale;

	public RegistroPrevidenziale() {

	}

	public RegistroPrevidenziale(String nome, String cognome, String codiceFiscale, String codicePrevidenziale) {
		super();
		this.nome = nome;
		this.cognome = cognome;
		this.codiceFiscale = codiceFiscale;
		this.codicePrevidenziale = codicePrevidenziale;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCodiceFiscale() {
		return codiceFiscale;
	}

	public void setCodiceFiscale(String codiceFiscale) {
		this.codiceFiscale = codiceFiscale;
	}

	public String getCodicePrevidenziale() {
		return codicePrevidenziale;
	}

	public void setCodicePrevidenziale(String codicePrevidenziale) {
		this.codicePrevidenziale = codicePrevidenziale;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCognome() {
		return cognome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

}
