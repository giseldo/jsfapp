package br.ebix;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean(name="listaUsuariosMemoria")
@SessionScoped
public class ListaUsuariosMemoria implements Serializable {
	
	private static final long serialVersionUID = -3764538703073891131L;
	
	public List<Usuario> usuarios;
	
	public void adicionaUsuario(Usuario user) {
		this.usuarios.add(user);
	}

	public List<Usuario> getUsuarios() {
		if ( usuarios == null ) {
			usuarios = new ArrayList<Usuario>();
		}
		return usuarios;
	}

	public void setUsuarios(List<Usuario> usuarios) {
		this.usuarios = usuarios;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((usuarios == null) ? 0 : usuarios.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ListaUsuariosMemoria other = (ListaUsuariosMemoria) obj;
		if (usuarios == null) {
			if (other.usuarios != null)
				return false;
		} else if (!usuarios.equals(other.usuarios))
			return false;
		return true;
	}

}
