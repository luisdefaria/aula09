package br.lufaria.sample02.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

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

    //Relacionamento
    @ManyToOne
    @JoinColumn(name = "departamento_id")
    @JsonIgnoreProperties("listaProdutos")
    private Departamento depto;


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

	public Departamento getDepto() {
		return depto;
	}

	public void setDepto(Departamento depto) {
		this.depto = depto;
	}

       
}