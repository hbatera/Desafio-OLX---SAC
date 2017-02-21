package br.com.desafioolxsac.http;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement

public class TipoChamado {

	private int idTipoChamado;
	
	private String  dscTipoChamado; 
	
	public TipoChamado(){
		 
	}
 
	public TipoChamado(int idTipoChamado, String dscTipoChamado) {
		super();
		this.idTipoChamado = idTipoChamado;
		this.dscTipoChamado = dscTipoChamado;
	}
	
	public int getIdTipoChamado() {
		return idTipoChamado;
	}
 
	public void setIdTipoChamado(int idTipoChamado) {
		this.idTipoChamado = idTipoChamado;
	}
 
	public String getDscTipoChamado() {
		return dscTipoChamado;
	}
 
	public void setDscTipoChamado(String dscTipoChamado) {
		this.dscTipoChamado = dscTipoChamado;
	}
}
