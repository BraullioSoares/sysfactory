package br.com.sigefs.dao;

import java.util.List;
import br.com.sigefs.model.Usuario;

public interface CrudUsuario {
	
	void adiciona (Usuario u);
	
	public List<Usuario> getLista ();

	public void altera (Usuario u);

	public void remove (Usuario u);
	
	public void salvar (Usuario u);
	
	public Usuario buscaPorId (Integer id);
	
	public Usuario autentica (Usuario u);

	public void close ();

}
