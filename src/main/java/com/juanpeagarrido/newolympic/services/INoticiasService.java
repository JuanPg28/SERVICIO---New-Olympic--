package com.juanpeagarrido.newolympic.services;

import java.util.List;

import com.juanpeagarrido.newolympic.entities.Noticias;

public interface INoticiasService {
	
	//Agregar
	public void add(Noticias n);
	
	//Mostrar
	public List<Noticias> findAll();
	
	//Eliminar
	public void delete(Integer id);

}
