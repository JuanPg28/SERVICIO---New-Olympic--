package com.juanpeagarrido.newolympic.restcontrollers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.juanpeagarrido.newolympic.entities.Noticias;
import com.juanpeagarrido.newolympic.services.INoticiasService;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
public class RestNoticiasController {
	
	@Autowired
	INoticiasService noticiasService;

	@GetMapping(path = "/noticiasJSON", produces = { MediaType.APPLICATION_JSON_VALUE })
	List<Noticias> getNoticias() {
		return noticiasService.findAll();
	}


}
