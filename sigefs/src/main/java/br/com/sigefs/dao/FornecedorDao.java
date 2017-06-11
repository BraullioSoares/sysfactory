package br.com.sigefs.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.sigefs.model.Fornecedor;

public class FornecedorDao implements CrudFornecedor{
	private Connection connection;
	
	public FornecedorDao (){
		this.connection = new ConnectionFactory().getConnection();
	}
	
	@Override
	public void adiciona (Fornecedor produto) {
		
		String sql =  "insert into fornecedores " + "(nome,email,tel,tipoProduto)"
				+ " values (?,?,?,?)";
		try{
			PreparedStatement stmt = connection.prepareStatement(sql);
			stmt.setString(1, produto.getNome());
			stmt.setString(2, produto.getEmail());
			stmt.setString(3, produto.getTel());
			stmt.setString(4, produto.getTipoProduto());
			stmt.execute();
			stmt.close();
		}catch(SQLException e){
			throw new RuntimeException(e);
		}
	}

	@Override
	public List<Fornecedor> getLista() {
		
		try {
			
			List<Fornecedor> forn = new ArrayList<>();
			PreparedStatement stmt = this.connection.prepareStatement("select * from fornecedores");
			ResultSet rs = stmt.executeQuery();
			
			while(rs.next()){
				Fornecedor f = new Fornecedor();
				f.setId(rs.getInt("id"));
				f.setNome(rs.getString("nome"));
				f.setEmail(rs.getString("email"));
				f.setTel(rs.getString("tel"));
				f.setTipoProduto(rs.getString("tipoProduto"));
				
				forn.add(f);
			}
			rs.close();
			stmt.close();
			return forn;
			
		}catch(SQLException e){
			
			throw new RuntimeException();
			
		}

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
	public void altera(Fornecedor f) {
		String sql = "update fornecedores set nome=?, email=?," + "tel=?, tipoProduto=? where id=?";

		try {
			PreparedStatement stmt = connection.prepareStatement(sql);
			stmt.setString(1, f.getNome());
			stmt.setString(2, f.getEmail());
			stmt.setString(3, f.getTel());
			stmt.setString(4, f.getTipoProduto());
			stmt.setInt(5, f.getId());
			stmt.execute();
			stmt.close();
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}
	
	@Override
	public void salvar(Fornecedor f) {
		if (f.getId()!= -1) {
			altera(f);
		} else {
			adiciona(f);
		}
	}

	@Override
	public void remove(Fornecedor f) {
		try {
			String sql = "delete from fornecedores where id = ?";
			PreparedStatement ps = connection.prepareStatement(sql);
			ps.setInt(1, f.getId());
			ps.executeQuery();
			ps.close();
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}
	
}