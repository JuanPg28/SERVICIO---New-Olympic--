package com.juanpeagarrido.newolympic.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.juanpeagarrido.newolympic.entities.Atletas;

public interface IAtletasRepository extends JpaRepository<Atletas, Integer>{

}
