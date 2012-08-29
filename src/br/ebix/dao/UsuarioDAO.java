package br.ebix.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.ebix.vo.Usuario;

public class UsuarioDAO {

	final String dbname = "jsfapp";
	final String db = "jdbc:mysql://localhost:3306/" + dbname;
	final String user = "root";
	final String pass = "123456";

	public void incluirUsuario(Usuario usuario) throws ClassNotFoundException,
			SQLException {

		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection(db, user, pass);
		String query = "INSERT INTO USUARIO (NOME, CPF, EMAIL, " +
				"SENHA, ATIVO, IDIOMA, LOGIN, CELULAR, NASCIMENTO) VALUES ( ?, ?, ?, ?, ?, ?, ?, ?, ?) ";
		PreparedStatement ps = con.prepareStatement(query);
		ps.setString(1, usuario.getNome());
		ps.setString(2, usuario.getCpf());
		ps.setString(3, usuario.getEmail());
		ps.setString(4, usuario.getSenha());
		ps.setString(5, (usuario.isAtivo() ? "True" : "False"));
		ps.setString(6, usuario.getIdioma());
		ps.setString(7, usuario.getLogin());
		ps.setString(8, usuario.getCelular());
		ps.setString(9, usuario.getNascimento().toString());
		ps.executeUpdate();

	}

	// public String getLoginUsuario(Usuario usuario)
	// throws ClassNotFoundException, SQLException {
	//
	// String query = "SELECT NOME FROM USUARIO WHERE CPF = ? AND SENHA = ?";
	// Class.forName("com.mysql.jdbc.Driver");
	// Connection con = DriverManager.getConnection(db, user, pass);
	// PreparedStatement ps = con.prepareStatement(query);
	// ps.setString(1, usuario.getCpf());
	// ps.setString(2, usuario.getSenha());
	// ResultSet rs = ps.executeQuery();
	// while (rs.next()) {
	// return rs.getString("NOME");
	// }
	//
	// return "";
	//
	// }

	public List<Usuario> getUsuarios() throws ClassNotFoundException,
			SQLException {
		String query = "SELECT NOME FROM USUARIO";
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection(db, user, pass);
		PreparedStatement ps = con.prepareStatement(query);
		ResultSet rs = ps.executeQuery();

		List<Usuario> listaUsuarios = new ArrayList<Usuario>();
		Usuario user = new Usuario();
		while (rs.next()) {
			user.setNome(rs.getString("NOME"));
			user.setCodigo(rs.getInt("CODIGO"));
			user.setNome(rs.getString("NOME"));
			user.setCpf(rs.getString("CPF"));
			user.setEmail(rs.getString("EMAIL"));
			user.setSenha(rs.getString("SENHA"));
			user.setAtivo(rs.getString("ATIVO").trim() == "True" ? true : false);
			user.setIdioma(rs.getString("IDIOMA"));
			listaUsuarios.add(user);
		}

		return listaUsuarios;
	}
}
