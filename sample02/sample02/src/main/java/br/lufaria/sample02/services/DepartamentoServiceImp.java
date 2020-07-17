package br.lufaria.sample02.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import br.lufaria.sample02.dao.DepartamentoRepo;
import br.lufaria.sample02.model.Departamento;

@Component
public class DepartamentoServiceImp implements IDepartamentoService {

    @Autowired
    private DepartamentoRepo repo;

    @Override
    public Departamento buscarDeptoPorId(int id) {
        return repo.findById(id).get();
    }

    @Override
    public List<Departamento> buscarTodosDeptos() {
        
        return (List<Departamento>) repo.findAll();
    }

    
    
    
}