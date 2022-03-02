package com.eventoapp.repository;

import org.springframework.data.repository.CrudRepository;

import com.eventoapp.model.Evento;

public interface EventoRepository extends CrudRepository<Evento, Long> {
	
	Evento findById(long id);

}
