package br.ebix;

import java.util.ArrayList;
import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;

import org.primefaces.event.SelectEvent;

@ManagedBean(name = "usuarioBean")
@RequestScoped
public class UsuarioBean {

	private String confirmaSenha;
	private List<UsuarioBean> usuarios;
	private UsuarioBean usuarioSelecionado;
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


	public UsuarioBean getUsuarioSelecionado() {
		return usuarioSelecionado;
	}

	public void setUsuarioSelecionado(UsuarioBean usuarioSelecionado) {
		this.usuarioSelecionado = usuarioSelecionado;
	}
	
	public String getConfirmaSenha() {
		return confirmaSenha;
	}

	public void setConfirmaSenha(String confirmaSenha) {
		this.confirmaSenha = confirmaSenha;
	}
	
	public void setUsuarios(List<UsuarioBean> usuarios) {
		this.usuarios = usuarios;
	}

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

		return users;

	}

}
