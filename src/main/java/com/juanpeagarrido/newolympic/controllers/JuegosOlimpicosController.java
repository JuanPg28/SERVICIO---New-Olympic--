package com.juanpeagarrido.newolympic.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.juanpeagarrido.newolympic.entities.JuegosOlimpicos;
import com.juanpeagarrido.newolympic.services.IJuegosOlimpicosService;

@Controller
public class JuegosOlimpicosController {

	@Autowired
	private IJuegosOlimpicosService juegosolimpicosService;

	@RequestMapping(value = "/crearJuegosOlimpicos")
	public ModelAndView crearJuegos(
			@RequestParam(required = false) Integer identificador,
			@RequestParam(required = false) Integer anyo, 
			@RequestParam(required = false) String ciudad,
			@RequestParam(required = false) String nombre_olimpico,
			@RequestParam(required = false) String logo_olimpico, 
			@RequestParam(required = false) String descripcion) {
		if (ciudad != null) {
			JuegosOlimpicos j = new JuegosOlimpicos(0, anyo, ciudad, nombre_olimpico, logo_olimpico, descripcion);
			juegosolimpicosService.add(j);
			return new ModelAndView("redirect:/crearJuegosOlimpicos");
		}
		List<JuegosOlimpicos> juegosolimpicos = juegosolimpicosService.findAll();
		ModelAndView mav = new ModelAndView();
		mav.setViewName("crear_juegosolimpicos");
		mav.addObject("lista_juegosolimpicos", juegosolimpicos);
		return mav;
	}

	@RequestMapping(value = "/borrarJuegosOlimpicos")
	public ModelAndView borrarJuegosOlimpicos(@RequestParam(required = false) Integer id) {
		juegosolimpicosService.delete(id);
		return new ModelAndView("redirect:/crearJuegosOlimpicos");
	}

}
