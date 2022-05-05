package com.juanpeagarrido.newolympic.services;

import java.util.List;

import com.juanpeagarrido.newolympic.entities.JuegosOlimpicos;

public interface IJuegosOlimpicosService {
	
	//Agregar
	public void add(JuegosOlimpicos j);
	
	//Mostrar
	public List<JuegosOlimpicos> findAll();
	
	//Eliminar
	public void delete(Integer id);
	
	//Buscar
	public List<JuegosOlimpicos> findAllByAnyo(Integer juegos);
	
	//Guardar
	public void save(JuegosOlimpicos p) throws Exception;
	
	//Modificar
	public void update(JuegosOlimpicos modi);

}
