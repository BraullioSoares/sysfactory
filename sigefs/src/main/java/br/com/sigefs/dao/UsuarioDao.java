package br.com.sigefs.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.sigefs.model.Usuario;

public class UsuarioDao implements CrudUsuario{
	private Connection connection;
	
	public UsuarioDao (){
		this.connection = new ConnectionFactory().getConnection();
	}

	@Override
	public void adiciona(Usuario u) {
		String sql =  "insert into usuarios " + "(email,usuario,senha)"
				+ " values (?,?,?)";
		try{
			PreparedStatement stmt = connection.prepareStatement(sql);
			stmt.setString(1, u.getEmail());
			stmt.setString(2, u.getUser());
			stmt.setString(3, u.getSenha());
			stmt.execute();
			stmt.close();
		}catch(SQLException e){
			throw new RuntimeException(e);
		}
		
	}

	@Override
	public List<Usuario> getLista() {
		
		try {
			
			List<Usuario> usu = new ArrayList<>();
			PreparedStatement stmt = this.connection.prepareStatement("select * from usuarios order by id");
			ResultSet rs = stmt.executeQuery();
			
			while(rs.next()){
				Usuario u = new Usuario();
				u.setId(rs.getInt("id"));
				u.setEmail(rs.getString("email"));
				u.setUser(rs.getString("usuario"));
				u.setSenha(rs.getString("senha"));
				
				usu.add(u);
			}
			rs.close();
			stmt.close();
			return usu;
			
		}catch(SQLException e){
			
			throw new RuntimeException();
			
		}
	}

	@Override
	public void altera(Usuario u) {
		String sql = "update usuarios set email=?, usuario=?," + "senha=? where id=?";

		try {
			PreparedStatement stmt = connection.prepareStatement(sql);
			stmt.setString(1, u.getEmail());
			stmt.setString(2, u.getUser());
			stmt.setString(3, u.getSenha());
			stmt.setInt(4, u.getId());
			stmt.execute();
			stmt.close();
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}

	@Override
	public void remove(Usuario u) {
		try {
			String sql = "delete from usuarios where id = ?";
			PreparedStatement ps = connection.prepareStatement(sql);
			ps.setInt(1, u.getId());
			ps.execute();
			ps.close();
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}

	@Override
	public void salvar(Usuario u) {
		if (u.getId() != null) {
			altera(u);
		} else {
			adiciona(u);
		}
	}

	@Override
	public Usuario buscaPorId(Integer id) {
		String sql = "select * from usuarios where id =?";
		
		try (PreparedStatement stmt = connection.prepareStatement(sql)){
			stmt.setInt(1, id);
			
			ResultSet resultado = stmt.executeQuery();
			
			// posicionando o cursor no primeiro registro;
			if (resultado.next()){
				Usuario u = new Usuario();
				u.setId(resultado.getInt("id"));
				u.setEmail(resultado.getString("email"));
				u.setUser(resultado.getString("usuario"));
				u.setSenha(resultado.getString("senha"));
				
				return u;
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public void close() {
		try {
			connection.close();
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	@Override
	public Usuario autentica(Usuario u) {
		String sql = "select * from usuarios where usuario=? and senha=?";
		
		try (PreparedStatement preparador = connection.prepareStatement(sql)){
			preparador.setString(1, u.getUser());
			preparador.setString(2, u.getSenha());
			ResultSet resultado = preparador.executeQuery();
			
			if (resultado.next()){
				Usuario usu = new Usuario();
				usu.setId(resultado.getInt("id"));
				usu.setEmail(resultado.getString("email"));
				usu.setUser(resultado.getString("usuario"));
				usu.setSenha(resultado.getString("senha"));
				
				return usu;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
}
