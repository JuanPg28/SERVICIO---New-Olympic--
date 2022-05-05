package com.juanpeagarrido.newolympic.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name="juegos_olimpicos")
public class JuegosOlimpicos {
	
	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer Identificador;
	private Integer Anyo;
	private String Ciudad;
	private String Nombre_olimpico;
	private String Logo_olimpico;
	private String Descripcion;
	
	
	//Constructor vacio
	public JuegosOlimpicos() {
		super();
	}


	
	//Constructor completo
	public JuegosOlimpicos(Integer identificador, Integer anyo, String ciudad, String nombre_olimpico,
			String logo_olimpico, String descripcion) {
		super();
		Identificador = identificador;
		Anyo = anyo;
		Ciudad = ciudad;
		Nombre_olimpico = nombre_olimpico;
		Logo_olimpico = logo_olimpico;
		Descripcion = descripcion;
	}
	
	
	//Getter and Setter
	public Integer getIdentificador() {
		return Identificador;
	}



	public void setIdentificador(Integer identificador) {
		Identificador = identificador;
	}



	public Integer getAnyo() {
		return Anyo;
	}



	public void setAnyo(Integer anyo) {
		Anyo = anyo;
	}



	public String getCiudad() {
		return Ciudad;
	}



	public void setCiudad(String ciudad) {
		Ciudad = ciudad;
	}



	public String getNombre_olimpico() {
		return Nombre_olimpico;
	}



	public void setNombre_olimpico(String nombre_olimpico) {
		Nombre_olimpico = nombre_olimpico;
	}



	public String getLogo_olimpico() {
		return Logo_olimpico;
	}



	public void setLogo_olimpico(String logo_olimpico) {
		Logo_olimpico = logo_olimpico;
	}



	public String getDescripcion() {
		return Descripcion;
	}



	public void setDescripcion(String descripcion) {
		Descripcion = descripcion;
	}
}
