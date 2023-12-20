package com.douglas.developer.radio.interprete.service;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.douglas.developer.core.crud.CrudServiceImpl;
import com.douglas.developer.core.model.Interprete;
import com.douglas.developer.core.repository.InterpreteRepository;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
@AllArgsConstructor
public class InterpreteServiceImpl extends CrudServiceImpl<Interprete, Long> implements InterpreteService {

    private final InterpreteRepository interpreteRepository;

    @Override
    protected JpaRepository<Interprete, Long> getRepository() {
        return interpreteRepository;
    }

    @Transactional(readOnly = true)
	@Override
	public List<Interprete> findByName(String name) {
		return interpreteRepository.findByNome(name);
	}
    
	@Transactional(readOnly = false)
	@Override
	public void update(Long id, Interprete interprete) {
		log.info("alteração em service.");
	}
	
	
}
