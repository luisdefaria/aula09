package br.lufaria.sample02.services;

import java.util.List;

import br.lufaria.sample02.model.Departamento;

public interface IDepartamentoService {
    public Departamento buscarDeptoPorId(int id);

    public List<Departamento> buscarTodosDeptos();
    
}