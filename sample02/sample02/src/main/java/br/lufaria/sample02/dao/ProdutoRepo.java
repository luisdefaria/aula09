package br.lufaria.sample02.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import br.lufaria.sample02.model.Produto;

//CrudRepository<Classe,Tipo da chave primaria>
//'dao' nao pode acessar direto 'model' por convenção, por isso criamos a folder 'services'
//Abaixo da camada do Model
public interface ProdutoRepo extends CrudRepository<Produto,Integer>{
    //select * from tblProduto where nome = nome
    public Produto findByNome(String nome);

    @Query(value = "select tblproduto.* from tblproduto where preco < 100",nativeQuery = true)
    List<Produto> findMenoresPrecos();
    
    
    @Query(value = "select tblproduto.* from tblproduto where preco < ?1",nativeQuery = true)
    List<Produto> findMenoresPrecosCustom(double valor);
    

}