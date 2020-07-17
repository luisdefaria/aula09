package br.lufaria.sample02.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;

import br.lufaria.sample02.model.Departamento;
import br.lufaria.sample02.services.IDepartamentoService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


@RestController
@CrossOrigin("*")

public class DepartamentoController {

    //AutoWired é para explicar que nao vamos usar o servico de forma explicita
    @Autowired
    private IDepartamentoService servico;

    @GetMapping ("/departamento/{cod}")
    public ResponseEntity<Departamento> buscarDeptoPorId(@PathVariable int cod){
        Departamento depto = servico.buscarDeptoPorId(cod);

        if(depto != null){
            return ResponseEntity.ok(depto);
        }
        return ResponseEntity.notFound().build();
    }

    @GetMapping ("/departamento")
    public ResponseEntity<List<Departamento>> mostrarTodosDeptos(){
        return ResponseEntity.ok (servico.buscarTodosDeptos());

    }
    



    
}