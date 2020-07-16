package br.lufaria.sample02.dao;

import org.springframework.data.repository.CrudRepository;

import br.lufaria.sample02.model.Produto;

//CrudRepository<Classe,Tipo da chave primaria>
//'dao' nao pode acessar direto 'model' por convenção, por isso criamos a folder 'services'
//Abaixo da camada do Model
public interface ProdutoRepo extends CrudRepository<Produto,Integer>{
    
}