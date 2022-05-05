package com.juanpeagarrido.newolympic.services;

import java.util.List;

import com.juanpeagarrido.newolympic.entities.Atletas;


public interface IAtletasService {
	
	//Agregar
	public void add(Atletas a);
	
	//Mostrar
	public List<Atletas> findAll();
	
	//Eliminar
	public void delete(Integer id);

}
