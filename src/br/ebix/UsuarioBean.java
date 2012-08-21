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

	private String nome;
	private String email;
	private String senha;
	private String confirmaSenha;
	private List<UsuarioBean> usuarios;
	private UsuarioBean usuarioSelecionado;

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
		if (!this.senha.equalsIgnoreCase(this.confirmaSenha)) {
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
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getConfirmaSenha() {
		return confirmaSenha;
	}

	public void setConfirmaSenha(String confirmaSenha) {
		this.confirmaSenha = confirmaSenha;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}


	public List<UsuarioBean> getUsuarios() {

		List<UsuarioBean> users = new ArrayList<UsuarioBean>();

		UsuarioBean user = new UsuarioBean();
		user.setNome("giseldo");
		user.setEmail("giseldo@gmail.com");

		UsuarioBean user2 = new UsuarioBean();
		user2.setNome("alana");
		user2.setEmail("alana@gmail.com");

		users.add(user);
		users.add(user2);

		return users;

	}

	public void setUsuarios(List<UsuarioBean> usuarios) {
		this.usuarios = usuarios;
	}

}
