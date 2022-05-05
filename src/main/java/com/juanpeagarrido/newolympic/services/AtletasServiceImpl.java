package com.juanpeagarrido.newolympic.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.juanpeagarrido.newolympic.entities.Atletas;
import com.juanpeagarrido.newolympic.repository.IAtletasRepository;

@Service
public class AtletasServiceImpl implements IAtletasService {
	
	@Autowired
	IAtletasRepository repo;

	@Override
	public void add(Atletas a) {
		repo.save(a);

	}

	@Override
	public List<Atletas> findAll() {
		return repo.findAll();
	}

	@Override
	public void delete(Integer id) {
		repo.deleteById(id);

	}

}
