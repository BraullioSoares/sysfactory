package br.com.sigefs.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Fornecedor {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	private String nome;
	private String email;
	private String tel;
	private String tipoProduto;
	
	
	public Integer getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public String getTipoProduto() {
		return tipoProduto;
	}

	public void setTipoProduto(String tipoProduto) {
		this.tipoProduto = tipoProduto;
	}
	
	@Override
	public String toString() {
		return "Fornecedor [id=" + id + ", nome=" + nome + ", email=" + email + ", tel=" + tel + ", tipoProduto="
				+ tipoProduto + "]";
	}

	
}
