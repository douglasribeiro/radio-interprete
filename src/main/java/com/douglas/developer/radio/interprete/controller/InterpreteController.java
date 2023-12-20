package com.douglas.developer.radio.interprete.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.douglas.developer.core.crud.CrudController;
import com.douglas.developer.core.crud.CrudService;
import com.douglas.developer.core.model.Interprete;
import com.douglas.developer.radio.interprete.service.InterpreteService;

import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("/interprete")
@Slf4j
@CrossOrigin
public class InterpreteController extends CrudController<Interprete, Long> {
	
	@Autowired
	private InterpreteService interpreteService;
	
	@Override
	public CrudService<Interprete, Long> getService() {
		return interpreteService;
	}
	
	@GetMapping("status")
    public String status() {
    	log.info("Serviço interprete esta ok!");
    	return "Serviço interprete esta ok!";
    }
	
	@GetMapping({"/nome/{nome}"})
	public List<Interprete> findByName(@PathVariable("nome") String nome) {
		log.info("Pesquisa interprete por nome {}", nome);
		List<Interprete> lista = interpreteService.findByName(nome);
		return lista;
	}

}
