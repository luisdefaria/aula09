package br.lufaria.sample02.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import br.lufaria.sample02.dao.ProdutoRepo;
import br.lufaria.sample02.model.Produto;

//Descreve a logica que o metodo da interface tem q fazer
// sem @component o autowired nao funciona
@Component
public class ProdutoServiceImp implements IProdutoService {

    @Autowired
    private ProdutoRepo repo;

    @Override
    public Produto buscarProdutoPorCod(int cod) {
        return repo.findById(cod).get();
    }

    @Override
    public List<Produto> buscarTodos() {
        return (List<Produto>) repo.findAll();
    }

    @Override
    public void gravarProduto(Produto produto) {
        repo.save(produto);

    }

    @Override
    public Produto buscarPorNome(String nome) {
        return repo.findByNome(nome);
    }

    @Override
    public List<Produto> buscarBaratos() {
        return repo.findMenoresPrecos();
    }

    @Override
    public void apagarProduto(int idProduto) {
        repo.deleteById(idProduto);

    }

    @Override
    public List<Produto> buscarBaratoCustom(double valor) {
        return repo.findMenoresPrecosCustom(valor);
    }

      
    
}