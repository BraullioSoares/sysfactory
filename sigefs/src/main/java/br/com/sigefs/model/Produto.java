package br.com.sigefs.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Produto implements Serializable {
	
	@Id
	@GeneratedValue
	private Integer cod;
	
	private String nome;
	private String descricao;
	private double preco;
	private Integer quant;
	private Integer codFornecedor;
	
	public Integer getCod() {
		return cod;
	}
	public void setCod(Integer cod) {
		this.cod = cod;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	public Integer getQuant() {
		return quant;
	}
	public void setQuant(Integer quant) {
		this.quant = quant;
	}
	public Integer getCodFornecedor() {
		return codFornecedor;
	}
	public void setCodFornecedor(Integer codFornecedor) {
		this.codFornecedor = codFornecedor;
	}
	@Override
	public String toString() {
		return "Produto [cod=" + cod + ", nome=" + nome + ", descricao=" + descricao + ", preco=" + preco + ", quant="
				+ quant + ", codFornecedor=" + codFornecedor + "]";
	}
	
}
