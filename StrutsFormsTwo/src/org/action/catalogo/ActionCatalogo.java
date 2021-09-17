package org.action.catalogo;

import java.util.ArrayList;
import java.util.List;

import org.dao.generic.DaoGeneric;
import org.modelo.ciudad.Ciudad;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
@SuppressWarnings("serial")
public class ActionCatalogo extends ActionSupport implements ModelDriven<Ciudad>{
	private Ciudad ciudad= new Ciudad();
	private DaoGeneric dao= new DaoGeneric();
	private List<Ciudad> list = new ArrayList<Ciudad>();
	private List<String> nombreCiudades = new ArrayList<String>();
	
	public String execute() {
		return SUCCESS;
	}
	public String catalog() {
		setList(dao.listCiudad());
		for (Ciudad ciudad : list) {
			nombreCiudades.add(ciudad.getNombre());
		}
		return SUCCESS;
	}
	@Override
	public Ciudad getModel() {
		//todo auto-generated method stub
		return ciudad;
	}
	//getters and setters of 
	public List<Ciudad> getList() {
		return list;
	}
	public void setList(List<Ciudad> list) {
		this.list = list;
	}
	public List<String> getNombreCiudades() {
		return nombreCiudades;
	}
	public void setNombreCiudades(List<String> nombreCiudades) {
		this.nombreCiudades = nombreCiudades;
	}
	
	
	
}
