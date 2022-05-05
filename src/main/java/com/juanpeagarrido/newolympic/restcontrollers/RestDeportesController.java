package com.juanpeagarrido.newolympic.restcontrollers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.juanpeagarrido.newolympic.entities.Deportes;
import com.juanpeagarrido.newolympic.services.IDeportesService;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
public class RestDeportesController {
	
	@Autowired
	IDeportesService deportesService;

	@GetMapping(path = "/deportesJSON", produces = { MediaType.APPLICATION_JSON_VALUE })
	List<Deportes> getDeportes() {
		return deportesService.findAll();
	}

}
