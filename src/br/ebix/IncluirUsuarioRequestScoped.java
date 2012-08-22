package br.ebix;

import java.util.ArrayList;
import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;

import org.primefaces.event.SelectEvent;

@ManagedBean(name = "incluirUsuarioRequestScoped")
@RequestScoped
public class IncluirUsuarioRequestScoped {

	private String confirmaSenha;
	private List<Usuario> usuarios;
	private Usuario usuarioSelecionado;
	private Usuario usuario;

	public String novo() {
		return "usuario";
	}
	
	public String mostra() {
		return "sucesso2";
//		return "mostraUsuario2";
//		return "mostraUsuario2?faces-redirect=true";
//		return "mostraUsuario2?includeViewParams=true";
	}
	
	

	public String salvar() {
		FacesContext context = FacesContext.getCurrentInstance();
		if (!this.usuario.getSenha().equalsIgnoreCase(this.confirmaSenha)) {
			context.addMessage(null, new FacesMessage(
					FacesMessage.SEVERITY_ERROR,
					"Senha confirmada incorretamente", ""));
			return "usuario";
		}
		return "sucesso";
	}

	public void onRowSelect(SelectEvent e) {
		FacesMessage msg = new FacesMessage("Ola mensagem");
		FacesContext.getCurrentInstance().addMessage("Ola", msg);
	}

	public String getConfirmaSenha() {
		return confirmaSenha;
	}

	public void setConfirmaSenha(String confirmaSenha) {
		this.confirmaSenha = confirmaSenha;
	}
	
	public Usuario getUsuarioSelecionado() {
		return usuarioSelecionado;
	}

	public void setUsuarioSelecionado(Usuario usuarioSelecionado) {
		this.usuarioSelecionado = usuarioSelecionado;
	}

	public void setUsuarios(List<Usuario> usuarios) {
		this.usuarios = usuarios;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public List<Usuario> getUsuarios() {

		this.usuarios = new ArrayList<Usuario>();

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
	
}
