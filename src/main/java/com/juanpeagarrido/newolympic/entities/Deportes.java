package com.juanpeagarrido.newolympic.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name="deportes")
public class Deportes {
	
	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer Identificador;
	private String Nombre_deporte;
	private String Descripcion;
	private String Mejores_atletas;
	private String Icono_deporte;
	
	
	//Constructor vacio
	public Deportes() {
		super();
	}

	
	//Constructor completo
	public Deportes(Integer identificador, String nombre_deporte, String descripcion, String mejores_atletas,
			String icono_deporte) {
		super();
		Identificador = identificador;
		Nombre_deporte = nombre_deporte;
		Descripcion = descripcion;
		Mejores_atletas = mejores_atletas;
		Icono_deporte = icono_deporte;
	}
	
	
	//Getter and Setter
	public Integer getIdentificador() {
		return Identificador;
	}


	public void setIdentificador(Integer identificador) {
		Identificador = identificador;
	}


	public String getNombre_deporte() {
		return Nombre_deporte;
	}


	public void setNombre_deporte(String nombre_deporte) {
		Nombre_deporte = nombre_deporte;
	}


	public String getDescripcion() {
		return Descripcion;
	}


	public void setDescripcion(String descripcion) {
		Descripcion = descripcion;
	}


	public String getMejores_atletas() {
		return Mejores_atletas;
	}


	public void setMejores_atletas(String mejores_atletas) {
		Mejores_atletas = mejores_atletas;
	}


	public String getIcono_deporte() {
		return Icono_deporte;
	}


	public void setIcono_deporte(String icono_deporte) {
		Icono_deporte = icono_deporte;
	}
	
}
