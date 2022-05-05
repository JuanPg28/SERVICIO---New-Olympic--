package com.juanpeagarrido.newolympic.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.juanpeagarrido.newolympic.entities.JuegosOlimpicos;

public interface IJuegosOlimpicosRepository extends JpaRepository<JuegosOlimpicos, Integer>{
	
	@Query ("select v from juegos_olimpicos v where anyo like %:juegos%")
	List<JuegosOlimpicos> findAllByAnyo(Integer juegos);
}
