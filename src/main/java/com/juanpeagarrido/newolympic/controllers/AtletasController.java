package com.juanpeagarrido.newolympic.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.juanpeagarrido.newolympic.entities.Atletas;
import com.juanpeagarrido.newolympic.services.IAtletasService;

@Controller
public class AtletasController {
	
	@Autowired
	private IAtletasService atletasService;

	@RequestMapping(value = "/crearAtletas")
	public ModelAndView crearAtletas(
			@RequestParam(required = false) Integer identificador,
			@RequestParam(required = false) String nombre,
			@RequestParam(required = false) String nacionalidad,
			@RequestParam(required = false) String bandera, 
			@RequestParam(required = false) String medallas,
			@RequestParam(required = false) String bibliografia,
			@RequestParam(required = false) String foto_atleta){
		if (nombre != null) {
			Atletas a = new Atletas(0, nombre, nacionalidad, bandera, medallas, bibliografia, foto_atleta);
			atletasService.add(a);
			return new ModelAndView("redirect:/crearAtletas");
		}
		List<Atletas> atletas = atletasService.findAll();
		ModelAndView mav = new ModelAndView();
		mav.setViewName("crear_atletas");
		mav.addObject("lista_atletas", atletas);
		return mav;
	}

	@RequestMapping(value = "/borrarAtletas")
	public ModelAndView borrarAtletas(@RequestParam(required = false) Integer id) {
		atletasService.delete(id);
		return new ModelAndView("redirect:/crearAtletas");
	}

}
