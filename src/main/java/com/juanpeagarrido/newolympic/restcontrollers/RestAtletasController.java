package com.juanpeagarrido.newolympic.restcontrollers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.juanpeagarrido.newolympic.entities.Atletas;
import com.juanpeagarrido.newolympic.services.IAtletasService;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
public class RestAtletasController {
	
	@Autowired
	IAtletasService atletasService;

	@GetMapping(path = "/atletasJSON", produces = { MediaType.APPLICATION_JSON_VALUE })
	List<Atletas> getDeportes() {
		return atletasService.findAll();
	}

	
	

}
