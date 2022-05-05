package com.juanpeagarrido.newolympic.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name="atletas")
public class Atletas {
	
	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer Identificador;
	private String Nombre;
	private String Nacionalidad;
	private String Bandera;
	private String Medallas;
	private String Bibliografia;
	private String Foto_atleta;
	
	
	//Constructor vacio
	public Atletas() {
		super();
	}
	
	
	//Constructor completo
	public Atletas(Integer identificador, String nombre, String nacionalidad, String bandera, String medallas,
			String bibliografia, String foto_atleta) {
		super();
		Identificador = identificador;
		Nombre = nombre;
		Nacionalidad = nacionalidad;
		Bandera = bandera;
		Medallas = medallas;
		Bibliografia = bibliografia;
		Foto_atleta = foto_atleta;
	}
	
	
	//Getter and Setter
	public Integer getIdentificador() {
		return Identificador;
	}


	public void setIdentificador(Integer identificador) {
		Identificador = identificador;
	}


	public String getNombre() {
		return Nombre;
	}


	public void setNombre(String nombre) {
		Nombre = nombre;
	}


	public String getNacionalidad() {
		return Nacionalidad;
	}


	public void setNacionalidad(String nacionalidad) {
		Nacionalidad = nacionalidad;
	}


	public String getBandera() {
		return Bandera;
	}


	public void setBandera(String bandera) {
		Bandera = bandera;
	}


	public String getMedallas() {
		return Medallas;
	}


	public void setMedallas(String medallas) {
		Medallas = medallas;
	}


	public String getBibliografia() {
		return Bibliografia;
	}


	public void setBibliografia(String bibliografia) {
		Bibliografia = bibliografia;
	}


	public String getFoto_atleta() {
		return Foto_atleta;
	}


	public void setFoto_atleta(String foto_atleta) {
		Foto_atleta = foto_atleta;
	}
	

}
