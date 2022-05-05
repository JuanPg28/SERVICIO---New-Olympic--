package com.juanpeagarrido.newolympic.restcontrollers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.juanpeagarrido.newolympic.entities.JuegosOlimpicos;
import com.juanpeagarrido.newolympic.services.IJuegosOlimpicosService;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
public class RestJuegosOlimpicosControlle {

	class Respuesta {
		int code;
		String message;

		// Constructor
		public Respuesta() {
			super();
		}

		public Respuesta(int code, String message) {
			super();
			this.code = code;
			this.message = message;
		}
		
		//Getter and Setter
		public int getCode() {
			return code;
		}

		public void setCode(int code) {
			this.code = code;
		}

		public String getMessage() {
			return message;
		}

		public void setMessage(String message) {
			this.message = message;
		}
		

	}
	
	@Autowired
	IJuegosOlimpicosService juegosolimpicosService;

	@GetMapping(path = "/juegosolimpicosJSON", produces = { MediaType.APPLICATION_JSON_VALUE })
	List<JuegosOlimpicos> getJuegosOlimpicos() {
		return juegosolimpicosService.findAll();
	}

	@GetMapping(path = "/juegosolimpicosJSON/findByAnyo", produces = { MediaType.APPLICATION_JSON_VALUE })
	List<JuegosOlimpicos> getJuegosOlimpicosByAnyo(@RequestParam(required = true) Integer juegos) {
		return juegosolimpicosService.findAllByAnyo(juegos);
	}
	
	@DeleteMapping(path = "/eliminarJuegosOlimpicos", produces = {MediaType.APPLICATION_JSON_VALUE})
	Respuesta borrarJuegosOlimpicos(@RequestParam(required=false)Integer id) {
			juegosolimpicosService.delete(id);
			return new Respuesta(0, "OK");
}
	
	@PostMapping(path = "/juegosolimpicosnew", produces = { MediaType.APPLICATION_JSON_VALUE })
	Respuesta addJuegosOlimpicos(
			@RequestParam(required = false) Integer identificador,
			@RequestParam(required = false) Integer anyo, 
			@RequestParam(required = false) String ciudad,
			@RequestParam(required = false) String nombre_olimpico,
			@RequestParam(required = false) String logo_olimpico, 
			@RequestParam(required = false) String descripcion) {
		try {
			juegosolimpicosService.save(new JuegosOlimpicos(0, anyo, ciudad, nombre_olimpico, logo_olimpico, descripcion));
		} catch(Exception e) {
			return new Respuesta(-1, e.getMessage());
		}
			return new Respuesta(0, "OK");
		
	}
	
	@PutMapping(path = "/juegosolimpicosmodi", produces = { MediaType.APPLICATION_JSON_VALUE})
	Respuesta updateJuegosOlimpicos(
			@RequestParam(required = true) Integer identificador,
			@RequestParam(required = true) Integer anyo, 
			@RequestParam(required = true) String ciudad,
			@RequestParam(required = true) String nombre_olimpico,
			@RequestParam(required = true) String logo_olimpico, 
			@RequestParam(required = true) String descripcion) {
		try {
			juegosolimpicosService.save(new JuegosOlimpicos(identificador, anyo, ciudad, nombre_olimpico, logo_olimpico, descripcion));
		} catch(Exception e) {
			return new Respuesta(-1, e.getMessage());
		}
			return new Respuesta(0, "OK");
	}

}
