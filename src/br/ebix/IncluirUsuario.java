package br.ebix;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.SessionScoped;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpSession;

import org.primefaces.event.SelectEvent;

@ManagedBean(name = "incluirUsuario")
@ViewScoped
public class IncluirUsuario implements Serializable {

	private static final long serialVersionUID = 7752657626478478037L;

	// TODO Resolver o problema do view spired exception do mesmo jeito que tem
	// no demo do prime faces

	// Este bean é escopo de seção para poder ser acessado em outros locais
//	@ManagedProperty(value = "#{listaUsuariosMemoria}")
//	private ListaUsuariosMemoria listaUsuariosMemoria;

	private Usuario usuario = new Usuario();

	private String estado;
	private String cidade;
	
	// Está aqui pois não faz parte do bean de usuario
	private String confirmaSenha = "";

	private Map<String, String> estados = new HashMap<String, String>(); 
	private Map<String, Map<String, String>> cidadesTodas = new HashMap<String, Map<String, String>>();
	private Map<String, String> cidades = new HashMap<String, String>();
	
	public IncluirUsuario() {
		cidades = new HashMap<String, String>();
		
		estados.put("ALAGOAS", "ALAGOAS");
		estados.put("CEARA", "CEARA");
		estados.put("SERGIPE", "SERGIPE");
		
		Map<String, String> cidadesAlagoas = new HashMap<String, String>(); 
		cidadesAlagoas.put("MACEIO", "MACEIO");
		cidadesAlagoas.put("SAO MIGUEL", "SAO MIGUEL");
		
		Map<String, String> cidadesCeara = new HashMap<String, String>(); 
		cidadesCeara.put("FORTALEZA", "FORTALEZA");
		cidadesCeara.put("SAO MIGUEL", "SAO MIGUEL");
		
		Map<String, String> cidadesSergipe = new HashMap<String, String>(); 
		cidadesSergipe.put("ARACAJU", "ARACAJU");
		cidadesSergipe.put("SAO CRISTOVAO", "SAO CRISTOVAO");
		
		cidadesTodas.put("ALAGOAS", cidadesAlagoas);
		cidadesTodas.put("CEARA", cidadesCeara);
		cidadesTodas.put("SERGIPE", cidadesSergipe);
	}

	public String novo() {
		this.usuario = new Usuario();
		return "incluirUsuario";
	}

	public String salvar() {
		FacesContext context = FacesContext.getCurrentInstance();

		if (!this.usuario.getSenha().equalsIgnoreCase(this.confirmaSenha)) {
			context.addMessage(null, new FacesMessage(
					FacesMessage.SEVERITY_ERROR,
					"Senha confirmada incorretamente", ""));
			return null;
		}

// 		simula uma base de dados em memoria
//		ListaUsuariosMemoria listaUsuariosMemoria = (ListaUsuariosMemoria)((HttpSession) FacesContext.getCurrentInstance().getExternalContext().getSession(true)).getAttribute("listaUsuariosMemoria");
//		listaUsuariosMemoria.adicionaUsuario(usuario);

		return "sucesso";
	}

	public void onRowSelect(SelectEvent e) {
		FacesMessage msg = new FacesMessage("Ola mensagem");
		FacesContext.getCurrentInstance().addMessage("Ola", msg);
	}

	public void handlerMudarEstado() {
		cidades = cidadesTodas.get(estado);
	}

	public String mostra() {
		return "sucesso2";
	}
	
	public void displayLocation() {
		FacesMessage msg = new FacesMessage("Selecionado", "Estado:" + estado + ", Cidade: " + cidade);
		FacesContext.getCurrentInstance().addMessage(null, msg);
	}

	/* get and sets */

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

	public void setCidades(Map<String, String> cidades) {
		this.cidades = cidades;
	}

	public Map<String, String> getCidades() {
		return cidades;
	}
	
	public Map<String, Map<String, String>> getCidadesTodas() {
		return cidadesTodas;
	}

	public void setCidadesTodas(Map<String, Map<String, String>> cidadesTodas) {
		this.cidadesTodas = cidadesTodas;
	}

	public Map<String, String> getEstados() {
		return estados;
	}

	public void setEstados(Map<String, String> estados) {
		this.estados = estados;
	}
	
	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

}
