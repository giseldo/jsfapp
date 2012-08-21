package br.ebix;

import java.util.List;

import javax.faces.model.ListDataModel;

import org.primefaces.model.SelectableDataModel;

public class UsuarioDataModel extends ListDataModel<UsuarioBean> implements SelectableDataModel<UsuarioBean>{

	@Override
	public UsuarioBean getRowData(String arg0) {
		// TODO Auto-generated method stub
		
		List<UsuarioBean> usuarios = (List<UsuarioBean>)getWrappedData();
		
		for (UsuarioBean usuario : usuarios) {
			
		}
		
		return null;
	}

	@Override
	public Object getRowKey(UsuarioBean usuario) {
		return usuario;
	}

}
