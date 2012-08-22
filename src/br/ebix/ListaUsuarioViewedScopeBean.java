package br.ebix;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;

import org.primefaces.event.SelectEvent;

@ManagedBean(name = "listaUsuarioViewedScopeBean")
@ViewScoped
public class ListaUsuarioViewedScopeBean implements Serializable{
	
	private static final long serialVersionUID = -1167294922350840116L;

	private List<Usuario> usuarios;

	private List<Usuario> usuariosSelecionado;

	private UsuarioDataModel usuariosModel;

	private Usuario selectedUser;

	public ListaUsuarioViewedScopeBean() {
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

		usuarios = new ArrayList<Usuario>();

		Usuario user = new Usuario();
		user.setNome("giseldo");
		user.setEmail("giseldo@gmail.com");

		Usuario user2 = new Usuario();
		user2.setNome("alana");
		user2.setEmail("alana@gmail.com");

		usuarios.add(user);
		usuarios.add(user2);

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
