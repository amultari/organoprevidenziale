package com.example.organoprevidenziale.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.organoprevidenziale.model.RegistroPrevidenziale;
import com.example.organoprevidenziale.repository.RegistroPrevidenzialeRepository;

@Service
public class RegistroPrevidenzialeServiceImpl implements RegistroPrevidenzialeService {

	@Autowired
	private RegistroPrevidenzialeRepository repository;

	@Override
	public RegistroPrevidenziale caricaPerCf(String cfInput) {
		return repository.findByCodiceFiscale(cfInput);
	}

	@Override
	public RegistroPrevidenziale inserisciNuovo(RegistroPrevidenziale transientInstance) {
		return repository.save(transientInstance);
	}

	@Override
	public List<RegistroPrevidenziale> listAll() {
		return (List<RegistroPrevidenziale>) repository.findAll();
	}

}
