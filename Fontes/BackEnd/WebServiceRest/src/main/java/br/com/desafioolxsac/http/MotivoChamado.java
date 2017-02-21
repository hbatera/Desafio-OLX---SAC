package br.com.desafioolxsac.http;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement

public class MotivoChamado {

	private int idMotivoChamado;
	
	private String  dscMotivoChamado; 
	
	public MotivoChamado(){
		 
	}
 
	public MotivoChamado(int idMotivoChamado, String dscMotivoChamado) {
		super();
		this.idMotivoChamado = idMotivoChamado;
		this.dscMotivoChamado = dscMotivoChamado;
	}
	
	public int getIdMotivoChamado() {
		return idMotivoChamado;
	}
 
	public void setIdMotivoChamado(int idMotivoChamado) {
		this.idMotivoChamado = idMotivoChamado;
	}
 
	public String getDscMotivoChamado() {
		return dscMotivoChamado;
	}
 
	public void setDscMotivoChamado(String dscMotivoChamado) {
		this.dscMotivoChamado = dscMotivoChamado;
	}
}
