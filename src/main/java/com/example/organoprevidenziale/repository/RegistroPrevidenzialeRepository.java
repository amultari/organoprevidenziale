package com.example.organoprevidenziale.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.organoprevidenziale.model.RegistroPrevidenziale;

public interface RegistroPrevidenzialeRepository extends CrudRepository<RegistroPrevidenziale, Long> {
	RegistroPrevidenziale findByCodiceFiscale(String cfInput);
}
