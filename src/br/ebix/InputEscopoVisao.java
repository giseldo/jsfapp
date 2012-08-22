package br.ebix;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.ViewScoped;

@ManagedBean(name="listaEscopoVisao")
@ViewScoped
public class InputEscopoVisao implements Serializable{
	
	private static final long serialVersionUID = 8938854896390863587L;

	public InputEscopoVisao() {
		
	}
	
	private String nome;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

}
