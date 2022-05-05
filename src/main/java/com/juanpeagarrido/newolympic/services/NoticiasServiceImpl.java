package com.juanpeagarrido.newolympic.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.juanpeagarrido.newolympic.entities.Noticias;
import com.juanpeagarrido.newolympic.repository.INoticiasRepository;

@Service
public class NoticiasServiceImpl implements INoticiasService {
	
	@Autowired
	INoticiasRepository repo;

	@Override
	public void add(Noticias n) {
		repo.save(n);

	}

	@Override
	public List<Noticias> findAll() {
		return repo.findAll();
	}

	@Override
	public void delete(Integer id) {
		repo.deleteById(id);

	}

}
