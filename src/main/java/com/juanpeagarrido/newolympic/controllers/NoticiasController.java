package com.juanpeagarrido.newolympic.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.juanpeagarrido.newolympic.entities.Noticias;
import com.juanpeagarrido.newolympic.services.INoticiasService;

@Controller
public class NoticiasController {
	
	@Autowired
	private INoticiasService noticiasService;

	@RequestMapping(value = "/crearNoticias")
	public ModelAndView crearNoticias(
			@RequestParam(required = false) Integer identificador,
			@RequestParam(required = false) String titulo, 
			@RequestParam(required = false) String fecha,
			@RequestParam(required = false) String noticia,
			@RequestParam(required = false) String imagen_noticia) {
		if (titulo != null) {
			Noticias n = new Noticias(0, titulo, fecha, noticia, imagen_noticia);
			noticiasService.add(n);
			return new ModelAndView("redirect:/crearNoticias");
		}
		List<Noticias> noticias = noticiasService.findAll();
		ModelAndView mav = new ModelAndView();
		mav.setViewName("crear_noticias");
		mav.addObject("lista_noticias", noticias);
		return mav;
	}

	@RequestMapping(value = "/borrarNoticias")
	public ModelAndView borrarNoticias(@RequestParam(required = false) Integer id) {
		noticiasService.delete(id);
		return new ModelAndView("redirect:/crearNoticias");
	}

}
