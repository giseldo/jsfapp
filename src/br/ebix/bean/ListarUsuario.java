package br.ebix.bean;

import java.io.Serializable;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;

import org.primefaces.event.SelectEvent;

import br.ebix.rn.UsuarioRN;
import br.ebix.vo.Usuario;

@ManagedBean(name = "listarUsuario")
@RequestScoped
public class ListarUsuario implements Serializable {

	private static final long serialVersionUID = 3549175577858802869L;

	private List<Usuario> usuarios = new ArrayList<Usuario>();

	private List<Usuario> usuariosSelecionado;

	private UsuarioDataModel usuariosModel;

	private Usuario selectedUser;

	public String carregar() {
		return "listarUsuario";
	}

	public ListarUsuario() {
		UsuarioRN userRN = new UsuarioRN();
		try {
			usuarios = new ArrayList<Usuario>();
			this.usuarios = userRN.getUsuarios();
		} catch (ClassNotFoundException e) {
			FacesMessage msg = new FacesMessage("Classe não encontrada " + e.getMessage());
			FacesContext.getCurrentInstance().addMessage(null, msg);
		} catch (SQLException e) {
			FacesMessage msg = new FacesMessage("Classe não encontrada " + e.getMessage());
			FacesContext.getCurrentInstance().addMessage(null, msg);
		}
	}

	public void onRowSelected(SelectEvent event) {
		FacesMessage msg = new FacesMessage("Pessoa selecionada",
				"Ola mundo completo");
		FacesContext.getCurrentInstance().addMessage(null, msg);
	}

	public void rowUnselect(SelectEvent event) {
		FacesMessage msg = new FacesMessage("Pessoa não mais selecionada",
				"Ola mundo completo");
		FacesContext.getCurrentInstance().addMessage(null, msg);
	}

	public List<Usuario> getUsuarios() throws ClassNotFoundException,
			SQLException {
		UsuarioRN userRN = new UsuarioRN();
		return userRN.getUsuarios();
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
