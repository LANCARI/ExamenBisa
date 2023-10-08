package com.examen.bisa.controller;

import java.util.List;

import com.examen.bisa.model.Cliente;
import com.examen.bisa.model.Referencia;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.examen.bisa.Global;

import org.springframework.http.HttpStatus;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/cliente")
public class ClienteController {
	
	
	Global global = new Global();
	
	@GetMapping("")
	public List<Cliente> getClients(){

		List<Cliente> clientes =	this.global.getClientes();

		for (Cliente cliente: clientes){
			int nroRefenciasCliente =	this.global.nroReferenciasCliente(cliente.getId());
			if ((this.nroReferencias(cliente.getId()) >=2 &&  nroRefenciasCliente >= 2) || (this.nroReferencias(cliente.getId()) >=3 &&  nroRefenciasCliente >= 1) ){
				cliente.setAccesibilidad("Buena");
			}

			if ((this.nroReferencias(cliente.getId()) >=2 &&  nroRefenciasCliente == 0) || (this.nroReferencias(cliente.getId()) ==1 &&  nroRefenciasCliente == 1) ){
				cliente.setAccesibilidad("Regular");
			}

			if ((this.nroReferencias(cliente.getId()) ==1 &&  nroRefenciasCliente == 0) ){
				cliente.setAccesibilidad("Mala");
			}

			if ((this.nroReferencias(cliente.getId()) ==0 &&  nroRefenciasCliente == 0) ){
				cliente.setAccesibilidad("Nula");
			}
		}

		return clientes;
	}
	public int nroReferencias(int id){
		List<Referencia> referencias =	this.global.getReferencias();
		Cliente cliente = this.global.getCliente(id);
		int countReferencias =0;

		for (Referencia referencia : referencias){
			if (referencia.getCliente().getId()==id){
				if (!referencia.getCliente().getEstado().equals("Eliminado")){
					countReferencias++;
				}

			}
		}
		return  countReferencias;
	}
	@GetMapping("/{id}")
	public Cliente getClient(@PathVariable("id") int id){

	List<Referencia> referencias =	this.global.getReferencias();
		Cliente cliente = this.global.getCliente(id);
	int countReferencias =0;

	for (Referencia referencia : referencias){
		if (referencia.getCliente().getId()==id){
			if (!referencia.getCliente().getEstado().equals("Eliminado")){
				countReferencias++;
			}

		}
	}

	switch (countReferencias){
		case 0: cliente.setEstado("Bloqueado");
		break;

	}



		System.out.println("countReferencias:"+countReferencias);

		return this.global.getCliente(id);
	}

	@GetMapping("edad/{id}")
	public Cliente getClientEdad(@PathVariable("id") int id){
		return this.global.getClienteEdad(id);
	}
	
	@PostMapping("")
	public ResponseEntity addClient(@RequestBody Cliente client){

		client.setId(this.global.identificadorCliente());
		client.setEstado("Creado");
		if (this.global.clienteVerificaEdad(client)){
			this.global.setCliente(client);
			return new ResponseEntity<>(client.getId(), HttpStatus.CREATED);
		}else{
			return new ResponseEntity("El cliente no registrado (es menor a 20 años)", HttpStatus.CREATED);
		}
	}
	
	
	@DeleteMapping("/{id}")
	public ResponseEntity removeClient(@PathVariable("id") int id){
		if (this.removeCliente(id)) {
			return new ResponseEntity("Se Elimino al cliente", HttpStatus.CREATED);
		} else {
			return new ResponseEntity("El cliente no existe", HttpStatus.ACCEPTED);
		}	
	}

	public boolean removeCliente(int id) {
		boolean resp=false;
		resp=	this.global.removeCliente(id);
		return resp;
	}

}
