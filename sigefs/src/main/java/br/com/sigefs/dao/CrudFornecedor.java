package br.com.sigefs.dao;

import java.util.List;

import br.com.sigefs.model.Fornecedor;

public interface CrudFornecedor {
	
	void adiciona (Fornecedor f);
	
	public List<Fornecedor> getLista();

	public void altera(Fornecedor f);

	public void remove(Fornecedor f);
	
	public void salvar (Fornecedor f);

	public void close();
}
