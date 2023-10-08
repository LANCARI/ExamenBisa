package com.examen.bisa.controller;

import java.util.List;

import com.examen.bisa.Global;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.examen.bisa.model.Persona;

import org.springframework.http.HttpStatus;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/persona")
public class PersonaController {
	
	
	Global global = new Global();
	
	@GetMapping("")
	public List<Persona> getPersonas(){
		return this.global.getPersonas();
	}
	
	
	@PostMapping("")
	public ResponseEntity addClient(@RequestBody Persona persona){
		this.global.setPersona(persona);
		return new ResponseEntity<>(persona, HttpStatus.CREATED);
	}
	
	
	
	
	


	
	
	

}
