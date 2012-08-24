package br.ebix;

import java.io.Serializable;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;

import org.primefaces.event.SelectEvent;

@ManagedBean(name = "incluirUsuarioRequestScoped")
@RequestScoped
public class IncluirUsuarioRequestScoped implements Serializable {

	private static final long serialVersionUID = 7752657626478478037L;
	
	// Este bean é escopo de seção para poder ser acessado em outros locais
	@ManagedProperty(value = "#{listaUsuariosMemoria}")
	private ListaUsuariosMemoria listaUsuariosMemoria;
	
	private Usuario usuario = new Usuario();
	
	// Está aqui pois não faz parte do bean de usuario
	private String confirmaSenha = "";
	
	// Para popular o combo
	private Estado[] estadoArray;
	
	public String salvar() {

		FacesContext context = FacesContext.getCurrentInstance();

		if (!this.usuario.getSenha().equalsIgnoreCase(this.confirmaSenha)) {
			context.addMessage(null, new FacesMessage(
					FacesMessage.SEVERITY_ERROR,
					"Senha confirmada incorretamente", ""));

			return "usuario";
		}

		// incluindo o usuario na lista com escopo de visão
		listaUsuariosMemoria.getUsuarios().add(usuario);

		return "sucesso";

	}

	public void onRowSelect(SelectEvent e) {
		FacesMessage msg = new FacesMessage("Ola mensagem");
		FacesContext.getCurrentInstance().addMessage("Ola", msg);
	}

	public String novo() {
		return "usuario";
	}

	public String mostra() {
		return "sucesso2";
	}
	
	/* get andsets */
	
	public ListaUsuariosMemoria getListaUsuariosMemoria() {
		return listaUsuariosMemoria;
	}

	public void setListaUsuariosMemoria(
			ListaUsuariosMemoria listaUsuariosMemoria) {
		this.listaUsuariosMemoria = listaUsuariosMemoria;
	}

	public String getConfirmaSenha() {
		return confirmaSenha;
	}

	public void setConfirmaSenha(String confirmaSenha) {
		this.confirmaSenha = confirmaSenha;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	
	public Estado[] getEstadoArray() {
		this.estadoArray = Estado.values();
		return estadoArray;
	}

	public void setEstadoArray(Estado[] estadoArray) {
		this.estadoArray = estadoArray;
	}

}
