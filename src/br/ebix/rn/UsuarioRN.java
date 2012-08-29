package br.ebix.rn;

import java.sql.SQLException;
import java.util.List;

import br.ebix.dao.UsuarioDAO;
import br.ebix.vo.Usuario;

public class UsuarioRN {

	public void incluirUsuario(Usuario usuario) {
		UsuarioDAO auth = new UsuarioDAO();
		try {
			auth.incluirUsuario(usuario);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public List<Usuario> getUsuarios()  {
		UsuarioDAO auth = new UsuarioDAO();
		try {
			return auth.getUsuarios();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	public void excluir(Usuario usuario) {
		// TODO Auto-generated method stub
		
	}

	public void salvar(Usuario usuario) {
		// TODO Auto-generated method stub
		
	}
}
