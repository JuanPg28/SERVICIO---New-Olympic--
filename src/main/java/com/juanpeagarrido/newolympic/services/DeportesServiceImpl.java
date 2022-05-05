package com.juanpeagarrido.newolympic.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.juanpeagarrido.newolympic.entities.Deportes;
import com.juanpeagarrido.newolympic.repository.IDeportesRepository;

@Service
public class DeportesServiceImpl implements IDeportesService {
	
	@Autowired
	IDeportesRepository repo;

	@Override
	public void add(Deportes d) {
		repo.save(d);

	}

	@Override
	public List<Deportes> findAll() {
		return repo.findAll();
	}

	@Override
	public void delete(Integer id) {
		repo.deleteById(id);

	}

}
