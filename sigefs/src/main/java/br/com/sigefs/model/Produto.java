package br.com.sigefs.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

@Entity
public class Produto implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer cod;
	
	private String nome;
	private String descricao;
	private double preco;
	private Integer quant;
	
	@ManyToOne
	@JoinColumn(name="codfornecedor")
	private Fornecedor codFornecedor;
	
	@ManyToMany(mappedBy = "produtos")
	private List<Cliente> cliente;
	
	@ManyToMany
	@JoinTable(name="Produto_MateriaPrima",
			joinColumns = @JoinColumn(name = "produto_id"),
			inverseJoinColumns = @JoinColumn(name = "materia_id"))
	private List<MateriaPrima> materia;
	
	public List<MateriaPrima> getMateria() {
		return materia;
	}
	
	public void setMateria(List<MateriaPrima> materia) {
		this.materia = materia;
	}
	
	public List<Cliente> getCliente() {
		return cliente;
	}
	
	public void setCliente(List<Cliente> cliente) {
		this.cliente = cliente;
	}
	
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
	
	public Fornecedor getCodFornecedor() {
		return codFornecedor;
	}
	
	public void setCodFornecedor(Fornecedor codFornecedor) {
		this.codFornecedor = codFornecedor;
	}
	
	@Override
	public String toString() {
		return "Produto [cod=" + cod + ", nome=" + nome + ", descricao=" + descricao + ", preco=" + preco + ", quant="
				+ quant + ", codFornecedor=" + codFornecedor + "]";
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cod == null) ? 0 : cod.hashCode());
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Produto other = (Produto) obj;
		if (cod == null) {
			if (other.cod != null)
				return false;
		} else if (!cod.equals(other.cod))
			return false;
		return true;
	}
	
}
