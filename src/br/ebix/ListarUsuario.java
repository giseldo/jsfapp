package br.ebix;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpSession;

import org.primefaces.event.SelectEvent;

@ManagedBean(name = "listarUsuario")
@RequestScoped
public class ListarUsuario implements Serializable{
	
	private static final long serialVersionUID = 3549175577858802869L;

	private List<Usuario> usuarios = new ArrayList<Usuario>();

	private List<Usuario> usuariosSelecionado;

	private UsuarioDataModel usuariosModel;

	private Usuario selectedUser;
	
	public String carregar() {
		return "listarUsuario";
	}

	public ListarUsuario() {
		usuariosModel = new UsuarioDataModel(getUsuarios());
	}

	public void onRowSelected(SelectEvent event) {
		FacesMessage msg = new FacesMessage("Pessoa selecionada", "Ola mundo completo");
		FacesContext.getCurrentInstance().addMessage(null, msg);
	}
	
	public void rowUnselect(SelectEvent event) {
		FacesMessage msg = new FacesMessage("Pessoa não mais selecionada", "Ola mundo completo");
		FacesContext.getCurrentInstance().addMessage(null, msg);
	}
	
	public List<Usuario> getUsuarios() {
		
		ListaUsuariosMemoria listaUsuariosMemoria = (ListaUsuariosMemoria)((HttpSession) FacesContext.getCurrentInstance().getExternalContext().getSession(true)).getAttribute("listaUsuariosMemoria");
		List<Usuario> l = listaUsuariosMemoria.getUsuarios();
		
		for (Usuario user : l) {
			usuarios.add(user);
		}
		
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

	public UsuarioDataModel getUsuariosModel() {
		return usuariosModel;
	}

	public void setUsuariosModel(UsuarioDataModel usuariosModel) {
		this.usuariosModel = usuariosModel;
	}

	public Usuario getSelectedUser() {
		return selectedUser;
	}

	public void setSelectedUser(Usuario selectedUser) {
		this.selectedUser = selectedUser;
	}

}
