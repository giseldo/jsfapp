package br.ebix;

import java.io.Serializable;
import java.util.List;

import javax.faces.model.ListDataModel;

import org.primefaces.model.SelectableDataModel;

public class UsuarioDataModel extends ListDataModel<Usuario> implements SelectableDataModel<Usuario>, Serializable {

	private static final long serialVersionUID = 7156350338589307709L;

	public UsuarioDataModel() {
		
	}
	
	public UsuarioDataModel(List<Usuario> usuario) {
		super(usuario);
	}
	
	
	@Override
	public Usuario getRowData(String arg0) {
		
		List<Usuario> usuarios = (List<Usuario>)getWrappedData();
		
//		for (Usuario usuario : usuarios) {
//			
//		}
		
		return null;
	}

	@Override
	public Object getRowKey(Usuario usuario) {
		return usuario;
	}

}
