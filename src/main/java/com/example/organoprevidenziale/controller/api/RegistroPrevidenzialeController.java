package com.example.organoprevidenziale.controller.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.example.organoprevidenziale.dto.RegistroPrevidenzialeDTO;
import com.example.organoprevidenziale.model.RegistroPrevidenziale;
import com.example.organoprevidenziale.service.RegistroPrevidenzialeService;

@RestController
@RequestMapping("/api/registro")
public class RegistroPrevidenzialeController {

	@Autowired
	private RegistroPrevidenzialeService registroPrevidenzialeService;

	@GetMapping("/{cf}")
	public RegistroPrevidenzialeDTO findById(@PathVariable(value = "cf", required = true) String cfInput) {
		RegistroPrevidenziale result = registroPrevidenzialeService.caricaPerCf(cfInput);
		//qui andrebbe gestito con un 404 ma per semplicit√† mandiamo un oggetto vuoto
		return result == null ? new RegistroPrevidenzialeDTO()
				: RegistroPrevidenzialeDTO.buildRegistroPrevidenzialeDTOFromModel(result);
	}

	@GetMapping
	public List<RegistroPrevidenzialeDTO> getAll() {
		return RegistroPrevidenzialeDTO.createFilmDTOListFromModelList(registroPrevidenzialeService.listAll());
	}

	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public RegistroPrevidenzialeDTO createNew(@RequestBody RegistroPrevidenzialeDTO input) {
		// ANDREBBE GESTITA CON ADVICE!!!
		// se mi viene inviato un id jpa lo interpreta come update ed a me (producer)
		// non sta bene
		if (input.getId() != null)
			throw new RuntimeException("Non √® ammesso fornire un id per la creazione");

		RegistroPrevidenziale newEntry = input.buildRegistroPrevidenzialeModel();
		// andrebbe in un service!!!
		newEntry.setCodicePrevidenziale("REGPREV-" + newEntry.getCodiceFiscale());

		RegistroPrevidenzialeDTO result = RegistroPrevidenzialeDTO
				.buildRegistroPrevidenzialeDTOFromModel(registroPrevidenzialeService.inserisciNuovo(newEntry));
		return result;
	}

}
