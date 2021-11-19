package com.example.organoprevidenziale.controller.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.organoprevidenziale.model.RegistroPrevidenziale;
import com.example.organoprevidenziale.repository.RegistroPrevidenzialeRepository;

@RestController
@RequestMapping("/api/registro")
public class RegistroPrevidenzialeRestController {

	@Autowired
	private RegistroPrevidenzialeRepository repository;

	@GetMapping("/{cf}")
	public RegistroPrevidenziale findById(@PathVariable(value = "cf", required = true) String cfInput) {
		return repository.findByCodiceFiscale(cfInput);
	}

}
