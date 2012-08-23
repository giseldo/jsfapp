package br.ebix;

import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean(name="listaUsuarios")
@SessionScoped
public class ListaUsuariosMemoria implements Serializable {
	
	private static final long serialVersionUID = -3764538703073891131L;
	
	public List<Usuario> usuarios;

	public List<Usuario> getUsuarios() {
		return usuarios;
	}

	public void setUsuarios(List<Usuario> usuarios) {
		this.usuarios = usuarios;
	}

}
