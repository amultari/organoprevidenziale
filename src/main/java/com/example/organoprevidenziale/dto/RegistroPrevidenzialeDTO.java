package com.example.organoprevidenziale.dto;

import com.example.organoprevidenziale.model.RegistroPrevidenziale;

public class RegistroPrevidenzialeDTO {

	private Long id;
	private String nome;
	private String cognome;
	private String codiceFiscale;
	private String codicePrevidenziale;

	public RegistroPrevidenzialeDTO() {

	}

	public RegistroPrevidenzialeDTO(Long id, String nome, String cognome, String codiceFiscale,
			String codicePrevidenziale) {
		super();
		this.id = id;
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

	public RegistroPrevidenziale buildRegistroPrevidenzialeModel() {
		return new RegistroPrevidenziale(this.id, this.nome, this.cognome, this.codiceFiscale,
				this.codicePrevidenziale);
	}

	public static RegistroPrevidenzialeDTO buildRegistroPrevidenzialeDTOFromModel(RegistroPrevidenziale input) {
		return new RegistroPrevidenzialeDTO(input.getId(), input.getNome(), input.getCognome(),
				input.getCodiceFiscale(), input.getCodicePrevidenziale());
	}

}
