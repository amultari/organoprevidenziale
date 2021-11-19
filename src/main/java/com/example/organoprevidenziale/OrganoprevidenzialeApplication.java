package com.example.organoprevidenziale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.organoprevidenziale.model.RegistroPrevidenziale;
import com.example.organoprevidenziale.repository.RegistroPrevidenzialeRepository;

@SpringBootApplication
public class OrganoprevidenzialeApplication implements CommandLineRunner {

	@Autowired
	private RegistroPrevidenzialeRepository repository;

	public static void main(String[] args) {
		SpringApplication.run(OrganoprevidenzialeApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// Popolo DB
		repository.save(new RegistroPrevidenziale("Mario","Rossi","MARROSS78P13H501F", "REGPREV-MARROSS78P13H501F"));
		repository.save(new RegistroPrevidenziale("Peppe","Bianchi","PPPBBB58P13H501F", "REGPREV-PPPBBB58P13H501F"));
		repository.save(new RegistroPrevidenziale("Antonio","Marrone","ANTMAR88P13H501F", "REGPREV-ANTMAR88P13H501F"));

	}

}
