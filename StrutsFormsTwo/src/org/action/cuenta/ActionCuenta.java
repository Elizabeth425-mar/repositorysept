package org.action.cuenta;

import java.util.ArrayList;
import java.util.List;

import org.dao.generic.DaoGeneric;
import org.modelo.cuenta.Cuenta;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
@SuppressWarnings("serial")
public class ActionCuenta extends ActionSupport implements ModelDriven<Cuenta>{
	private Cuenta cuenta= new Cuenta();
	private DaoGeneric dao= new DaoGeneric();
	private List<Cuenta>list= new ArrayList<Cuenta>();//get and set
	
	public String execute() {
		return ERROR;
	}
	/*RESTRICTIVO: COMPARA EL DATO VALOR, Y COMPARA EL TIPO DE DATO
	 * String number_one = "1";
	 * int number_two = 1;
	 * 		number_one == number_two		number_one === number_two
	 * ==(no es restrictivo) ===(si es restrictivo) equals(si es restrictivo) */
	public String autentica() {
		setList(dao.listCuenta());
		for (Cuenta x :list) {
			if(cuenta.getLogin().equals(x.getLogin())&&cuenta.getPassword().equals(x.getPassword())) {
				return SUCCESS;
			}
		}
		return ERROR;
	}
	@Override
	public Cuenta getModel() {
		//TODO Auto-generated method stub
		return cuenta;
	}
	
	//get and set of list
	public List<Cuenta> getList() {
		return list;
	}
	public void setList(List<Cuenta> list) {
		this.list = list;
	}
	
}
