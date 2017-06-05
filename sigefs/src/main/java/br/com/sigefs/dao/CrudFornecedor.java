package br.com.sigefs.dao;

import java.util.List;

import br.com.sigefs.model.Fornecedor;

public interface CrudFornecedor {
	
	void adiciona (Fornecedor produto);
	
	public List<Fornecedor> getLista();

	public void altera(Fornecedor contato);

	public void remove(Fornecedor contato);

	public void close();
}
