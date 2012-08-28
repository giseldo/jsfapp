package br.ebix.rn;

import java.sql.SQLException;
import java.util.List;

import br.ebix.dao.UsuarioDAO;
import br.ebix.vo.Usuario;

public class UsuarioRN {

	public void incluirUsuario(Usuario usuario) throws ClassNotFoundException, SQLException {
		UsuarioDAO auth = new UsuarioDAO();
		auth.incluirUsuario(usuario);
	}

	public List<Usuario> getUsuarios() throws ClassNotFoundException, SQLException {
		UsuarioDAO auth = new UsuarioDAO();
		return auth.getUsuarios();
		
	}
}
