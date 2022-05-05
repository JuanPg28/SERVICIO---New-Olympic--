package com.juanpeagarrido.newolympic.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name="noticias")
public class Noticias {
	
	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer Identificador;
	private String Titulo;
	private String Fecha;
	private String Noticia;
	private String Imagen_noticia;
	
	
	//Constructor vacio
	public Noticias() {
		super();
	}

	
	//Constructor completo
	public Noticias(Integer identificador, String titulo, String fecha, String noticia, String imagen_noticia) {
		super();
		Identificador = identificador;
		Titulo = titulo;
		Fecha = fecha;
		Noticia = noticia;
		Imagen_noticia = imagen_noticia;
	}
	
	
	//Getter and Setter
	public Integer getIdentificador() {
		return Identificador;
	}


	public void setIdentificador(Integer identificador) {
		Identificador = identificador;
	}


	public String getTitulo() {
		return Titulo;
	}


	public void setTitulo(String titulo) {
		Titulo = titulo;
	}


	public String getFecha() {
		return Fecha;
	}


	public void setFecha(String fecha) {
		Fecha = fecha;
	}


	public String getNoticia() {
		return Noticia;
	}


	public void setNoticia(String noticia) {
		Noticia = noticia;
	}


	public String getImagen_noticia() {
		return Imagen_noticia;
	}


	public void setImagen_noticia(String imagen_noticia) {
		Imagen_noticia = imagen_noticia;
	}
	
	
}
