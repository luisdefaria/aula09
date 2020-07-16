package br.lufaria.sample02.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import br.lufaria.sample02.dao.ProdutoRepo;
import br.lufaria.sample02.model.Produto;


//Descreve a logica que o metodo da interface tem q fazer
@Component
public class ProdutoServiceImp implements IProdutoService {

    @Autowired
    private ProdutoRepo repo;


    @Override
    public Produto buscarProdutoPorCod(int cod) {
        return repo.findById(cod).get();
    }

    @Override
    public List<Produto> buscarTodos(){
        return (List<Produto>)repo.findAll();
    }
    
    
}