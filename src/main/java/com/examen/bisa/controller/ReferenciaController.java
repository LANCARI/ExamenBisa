package com.examen.bisa.controller;

import java.util.List;

import com.examen.bisa.Global;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.examen.bisa.model.Referencia;

import org.springframework.http.HttpStatus;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/referencia")
public class ReferenciaController {

    Global global = new Global();

    @GetMapping("")
    public List<Referencia> getReferent(){
        return this.global.getReferencias();
    }

    @GetMapping("/{id}")
    public Referencia getReferencia(@PathVariable("id") int id){
        return this.global.getReferencia(id);
    }

    @GetMapping("contar/{id}")
    public Referencia getRef(@PathVariable("id") int id){
        return this.global.getContarClientesReferencia(id);
    }


    @DeleteMapping("/{id}")
    public ResponseEntity removeReferencia(@PathVariable("id") int id){

     List<Referencia> referencias =  this.global.getReferencias();
        Referencia referencia=null;
        for (Referencia referenciaItem : referencias) {
            if (referenciaItem.getId()==id){
                referencia = referenciaItem;
            }

        }

        if (referencia!=null){
            referencia.setEstado("Eliminado");
            referencia.setMotivo_eliminacion("La referencia desistio");
            return new ResponseEntity("Se elimino la referencia", HttpStatus.ACCEPTED);
        }else {
            return new ResponseEntity("La referencia no existe", HttpStatus.ACCEPTED);
        }


    }


}
