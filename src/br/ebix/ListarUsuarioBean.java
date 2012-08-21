package br.ebix;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean(name="listaUsuarioBean")
@RequestScoped
public class ListarUsuarioBean {

	private List<Usuario> usuarios;
	
	private List<Usuario> usuariosSelecionado;

	public List<Usuario> getUsuarios() {
		
		List<Usuario> users = new ArrayList<Usuario>();

		Usuario user = new Usuario();
		user.setNome("giseldo");
		user.setEmail("giseldo@gmail.com");

		Usuario user2 = new Usuario();
		user2.setNome("alana");
		user2.setEmail("alana@gmail.com");

		users.add(user);
		users.add(user2);
		
		return usuarios;
	}

	public void setUsuarios(List<Usuario> usuarios) {
		this.usuarios = usuarios;
	}
	
	public List<Usuario> getUsuariosSelecionado() {
		return usuariosSelecionado;
	}

	public void setUsuariosSelecionado(List<Usuario> usuariosSelecionado) {
		this.usuariosSelecionado = usuariosSelecionado;
	}

}
