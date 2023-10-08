package com.examen.bisa.controller;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.examen.bisa.Global;
import com.examen.bisa.model.Cliente;
import com.examen.bisa.model.Direccion;
import com.examen.bisa.model.Referencia;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.examen.bisa.model.Persona;



@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/data")

public class DataController {
	
	
	Global global = new Global();
	
	@GetMapping("")
	public ResponseEntity getData(){
		
		
		if (global.getClientes().isEmpty()) {
			Direccion direccion1 = new Direccion(1, "nn", "San Pedro", "24544", "dfs");

			Persona persona1= new Persona(1, direccion1,  "Luis", "Sachez", "Peres",this.FormatDatse("25-06-1986") , "3945745");
			global.setPersona(persona1);
			
			Direccion direccion2 = new Direccion(1, "nn", "Obrajes", "4565", "dfs");
			Persona persona2=	new Persona(2, direccion2, "Mario", "Mercado", "Peres", this.FormatDatse("25-06-1986"), "456456");
			global.setPersona(persona2);

			Direccion direccion3 = new Direccion(3, "sdf", "Calacoto", "453", "porton verde");
			Persona persona3=	new Persona(3, direccion3, "Camila", "Campos", "Rojas", this.FormatDatse("35-05-2001"), "85645645");
			global.setPersona(persona3);

			Direccion direccion4 = new Direccion(4, "ttt", "Satelite", "453", "porton verde");
			Persona persona4=	new Persona(4, direccion4, "Dany", "Contreras", "Mamani", this.FormatDatse("35-05-1985"), "923765");
			global.setPersona(persona4);

			Direccion direccion5 = new Direccion(5, "sdf", "Calacoto", "453", "callejon 5");
			Persona persona5=	new Persona(5, direccion5, "Roger", "Yandel", "Perez", this.FormatDatse("35-05-2001"), "85645645");
			global.setPersona(persona5);

			Direccion direccion6 = new Direccion(6, "ttt", "Calacoto", "852", "porton rosado");
			Persona persona6=	new Persona(6, direccion6, "Maria", "Contreras", "Mamani", this.FormatDatse("35-05-1985"), "6457723");
			global.setPersona(persona6);

			Direccion direccion7 = new Direccion(7, "sdf", "Rio Abajo", "453", "callejon 5");
			Persona persona7=	new Persona(7, direccion7, "Gustavo", "Asencio", "Perez", this.FormatDatse("35-05-2001"), "85645645");
			global.setPersona(persona7);

			Direccion direccion8 = new Direccion(8, "ttt", "Garita", "852", "porton rosado");
			Persona persona8=	new Persona(8, direccion8, "Pedro", "Rios", "Mamani", this.FormatDatse("35-05-1985"), "6457723");
			global.setPersona(persona8);

			Direccion direccion9 = new Direccion(9, "sdf", "Senkata", "453", "casa color negro");
			Persona persona9=	new Persona(9, direccion9, "Juana", "Rodriguez", "Ergueta", this.FormatDatse("35-05-2001"), "85645645");
			global.setPersona(persona9);

			Direccion direccion10 = new Direccion(10, "ttt", "Puente Vela", "852", "frente al colegio");
			Persona persona10=	new Persona(10, direccion10, "Carla", "Tarqui", "Espejo", this.FormatDatse("35-05-1985"), "6457723");
			global.setPersona(persona10);

			Cliente cliente1 = new Cliente(1, persona1,  "cliente1@gmail.com", "7845444", "Abogado", "Creado", "");
			global.setCliente(cliente1);

			Cliente cliente2 = new Cliente(2, persona2,  "cliente2@gmail.com", "22586324", "Veterinario", "Creado", "");
			global.setCliente(cliente2);

			Cliente cliente3 = new Cliente(3, persona9,  "cliente3@gmail.com", "7526825", "Mecanico", "Creado", "");
			global.setCliente(cliente3);

			Cliente cliente4 = new Cliente(4, persona10,  "cliente4@gmail.com", "751868", "comerciente", "Creado", "");
			global.setCliente(cliente4);


			Referencia referencia1 = new Referencia(1, persona3, cliente1, "personareferencia@gmail.com", "524566", "madre", "Activo","", this.global.verificaEsCliente(persona3));
			global.setReferencia(referencia1);

			Referencia referencia2 = new Referencia(2, persona4, cliente2,"personareferencia@gmail.com", "7864534", "padre", "Activo","", this.global.verificaEsCliente(persona4));
			global.setReferencia(referencia2);

			Referencia referencia3 = new Referencia(3, persona5, cliente2,"personareferencia@gmail.com", "524566", "madre", "Activo","", this.global.verificaEsCliente(persona5));
			global.setReferencia(referencia3);

			Referencia referencia4 = new Referencia(4, persona6, cliente3,"personareferencia@gmail.com", "7864534", "padre", "Activo","", this.global.verificaEsCliente(persona6));
			global.setReferencia(referencia4);

			Referencia referencia5 = new Referencia(5, persona7, cliente3,"personareferencia@gmail.com", "785645", "hoja", "Activo","",this.global.verificaEsCliente(persona7));
			global.setReferencia(referencia5);

			Referencia referencia6 = new Referencia(6, persona8, cliente3,"personareferencia@gmail.com", "578645", "tia", "Activo","", this.global.verificaEsCliente(persona8));
			global.setReferencia(referencia6);

			Referencia referencia7 = new Referencia(7, persona10, cliente3,"personareferencia@gmail.com", "578645", "tia", "Activo","", this.global.verificaEsCliente(persona10));
			global.setReferencia(referencia7);



			return new ResponseEntity("Se registro los datos", HttpStatus.CREATED);
		}else {
			return new ResponseEntity("Los registros ya se realizaron", HttpStatus.CREATED);
		}
		
	
	}
	
	private Date FormatDatse(String fecha) {
		DateFormat df = new SimpleDateFormat("MM-dd-yyyy");
		Date f = null;
		try {
			f = df.parse(fecha);
		} catch (ParseException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		return f;

	}

}
