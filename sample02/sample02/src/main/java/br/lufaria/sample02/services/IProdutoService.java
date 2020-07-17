package br.lufaria.sample02.services;

import java.util.List;

import br.lufaria.sample02.model.Produto;

//DEscreve soh o metodo
//interface é similar a classe abstrata, onde sou obrigado a implementar todas as classes na implementação
public interface  IProdutoService {
    public Produto buscarProdutoPorCod(int cod);
    public List<Produto> buscarTodos();
    public void gravarProduto(Produto produto);
    public Produto buscarPorNome(String nome);
    public List<Produto> buscarBaratos();
    public void apagarProduto(int idProduto);
    public List<Produto> buscarBaratoCustom(double valor);
    
}