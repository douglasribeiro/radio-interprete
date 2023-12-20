package com.douglas.developer.radio.interprete.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.douglas.developer.core.crud.CrudService;
import com.douglas.developer.core.model.Interprete;

@Service
public interface InterpreteService extends CrudService<Interprete, Long> {
	
	List<Interprete> findByName(String name);
	
	void update(Long id, Interprete interprete);

}
