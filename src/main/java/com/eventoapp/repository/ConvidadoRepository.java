package com.eventoapp.repository;

import org.springframework.data.repository.CrudRepository;

import com.eventoapp.model.Convidado;
import com.eventoapp.model.Evento;

public interface ConvidadoRepository extends CrudRepository<Convidado, Long> {

	Iterable<Convidado> findByEvento(Evento evento);
	
	Convidado findByRg(String rg);
}
