package com.example.organoprevidenziale.service;

import java.util.List;

import com.example.organoprevidenziale.model.RegistroPrevidenziale;

public interface RegistroPrevidenzialeService {

	public RegistroPrevidenziale caricaPerCf(String cfInput);

	public RegistroPrevidenziale inserisciNuovo(RegistroPrevidenziale transientInstance);

	public List<RegistroPrevidenziale> listAll();

}
