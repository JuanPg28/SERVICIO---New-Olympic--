package com.juanpeagarrido.newolympic.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.juanpeagarrido.newolympic.entities.JuegosOlimpicos;
import com.juanpeagarrido.newolympic.repository.IJuegosOlimpicosRepository;

@Service
public class JuegosOlimpicosServiceImpl implements IJuegosOlimpicosService {
	
	final static int ANYO_MINIMO=1991;
	
	@Autowired
	IJuegosOlimpicosRepository repo;

	@Override
	public void add(JuegosOlimpicos j) {
		repo.save(j);
	}

	@Override
	public List<JuegosOlimpicos> findAll() {
		return repo.findAll();
	}

	@Override
	public void delete(Integer id) {
		repo.deleteById(id);
	}

	@Override
	public List<JuegosOlimpicos> findAllByAnyo(Integer juegos) {
		List<JuegosOlimpicos> juegosolimpicos = repo.findAllByAnyo(juegos);
		return juegosolimpicos;
	}

	@Override
	public void save(JuegosOlimpicos p) throws Exception {
		if (p.getAnyo()<ANYO_MINIMO) {
			throw new Exception("El año de los juegos debe ser mayor al " + ANYO_MINIMO);
		}
		repo.save(p);

	}

	@Override
	public void update(JuegosOlimpicos modi) {
		repo.save(modi);

	}

}
