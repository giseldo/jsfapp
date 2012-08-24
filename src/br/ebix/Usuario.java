package br.ebix;

import java.io.Serializable;

public class Usuario implements Serializable {

	private static final long serialVersionUID = 437026715676365195L;

	private String nome;
	private String email;
	private String senha;
	private Estado estado;
	private String cidade;

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getNome() {
		return (nome == null ? "" : nome);
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return (email == null ? "" : email);
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSenha() {
		return (senha == null ? "" : senha);
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	public Estado getEstado() {
		return estado;
	}

	public void setEstado(Estado estado) {
		this.estado = estado;
	}

}
