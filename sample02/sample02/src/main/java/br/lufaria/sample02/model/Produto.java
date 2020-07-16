package br.lufaria.sample02.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tblproduto")
public class Produto {
    
    @Id
    @Column(name="cod")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int cod;
    
    @Column(name="nome",length = 100)
    private String nome;
    
    @Column(name="preco")
    private double preco;


    public int getCod() {
        return cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

       
}