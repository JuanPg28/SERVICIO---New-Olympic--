package com.juanpeagarrido.newolympic;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.juanpeagarrido.newolympic.entities.JuegosOlimpicos;
import com.juanpeagarrido.newolympic.repository.IJuegosOlimpicosRepository;
import com.juanpeagarrido.newolympic.services.IJuegosOlimpicosService;

@SpringBootTest
class NewolympicApplicationTests {

	@Autowired
	IJuegosOlimpicosRepository juegosolimpicosRepository;
	@Autowired
	IJuegosOlimpicosService juegosolimpicosService;

	//@Test
	void findAllJuegosOlimpicos() {
		List<JuegosOlimpicos> juegos = juegosolimpicosRepository.findAll();
		for (JuegosOlimpicos juego : juegos) {
			System.out.println(juego.getAnyo());
		}
	}
	
	//@Test
	void findAllJuegosOlimpicosService() {
		List<JuegosOlimpicos> juegos = juegosolimpicosService.findAll();
		for (JuegosOlimpicos juego : juegos) {
			System.out.println(juego.getNombre_olimpico());
		}
	}
	
	@Test
	void findAllJuegosOlimpicosServiceByAnyo() {
		List<JuegosOlimpicos> juegos = juegosolimpicosService.findAllByAnyo(1992);
		for (JuegosOlimpicos juego : juegos) {
			System.out.println(juego.getAnyo());
		}
	}

}
