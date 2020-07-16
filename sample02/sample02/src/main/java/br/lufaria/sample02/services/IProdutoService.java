package br.lufaria.sample02.services;

import java.util.List;

import br.lufaria.sample02.model.Produto;

//DEscreve soh o metodo
public interface  IProdutoService {
    public Produto buscarProdutoPorCod(int cod);
    public List<Produto> buscarTodos();
    
}