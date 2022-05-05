package com.juanpeagarrido.newolympic.services;

import java.util.List;

import com.juanpeagarrido.newolympic.entities.Deportes;

public interface IDeportesService {
	
	//Agregar
	public void add(Deportes d);
		
	//Mostrar
	public List<Deportes> findAll();
	
	//Eliminar
	public void delete(Integer id);

}
