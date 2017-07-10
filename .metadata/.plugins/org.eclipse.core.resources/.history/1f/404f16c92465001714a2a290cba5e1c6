package br.com.sigefs.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

@Entity
public class MateriaPrima {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer material_id;
	
	private String descricao;
	private Integer quantidade;
	
	@OneToMany(mappedBy="materia")
	private List<Fornecedor> forncedor;
	
	@ManyToMany
	@JoinColumn(name="materia_id")
	private List<Produto> produtos;
	
	public List<Fornecedor> getForncedor() {
		return forncedor;
	}

	public void setForncedor(List<Fornecedor> forncedor) {
		this.forncedor = forncedor;
	}

	public Integer getMaterial_id() {
		return material_id;
	}

	public void setMaterial_id(Integer material_id) {
		this.material_id = material_id;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Integer getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}

	public List<Produto> getProdutos() {
		return produtos;
	}

	public void setProdutos(List<Produto> produtos) {
		this.produtos = produtos;
	}
	
}
