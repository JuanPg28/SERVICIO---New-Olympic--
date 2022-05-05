package com.juanpeagarrido.newolympic.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.juanpeagarrido.newolympic.entities.Deportes;
import com.juanpeagarrido.newolympic.services.IDeportesService;

@Controller
public class DeportesController {
	
	@Autowired
	private IDeportesService deportesService;

	@RequestMapping(value = "/crearDeportes")
	public ModelAndView crearDeportes(
			@RequestParam(required = false) Integer identificador,
			@RequestParam(required = false) String nombre_deporte,
			@RequestParam(required = false) String descripcion,
			@RequestParam(required = false) String mejores_atletas, 
			@RequestParam(required = false) String icono_deporte) {
		if (nombre_deporte != null) {
			Deportes d = new Deportes(0, nombre_deporte, descripcion, mejores_atletas, icono_deporte);
			deportesService.add(d);
			return new ModelAndView("redirect:/crearDeportes");
		}
		List<Deportes> deportes = deportesService.findAll();
		ModelAndView mav = new ModelAndView();
		mav.setViewName("crear_deportes");
		mav.addObject("lista_deportes", deportes);
		return mav;
	}

	@RequestMapping(value = "/borrarDeportes")
	public ModelAndView borrarDeportes(@RequestParam(required = false) Integer id) {
		deportesService.delete(id);
		return new ModelAndView("redirect:/crearDeportes");
	}

}
