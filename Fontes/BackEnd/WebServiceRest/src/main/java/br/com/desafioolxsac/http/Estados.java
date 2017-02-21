package br.com.desafioolxsac.http;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement

public class Estados {

	private int idEstadosBR;
	private int codigoIBGE;
	private String  dscEstado;
	private String  sigla;
	
	public Estados(){
		 
	}
	
	public Estados(int idEstadosBR, String dscEstado, String sigla, int CodigoIBGE) {
		super();
		this.idEstadosBR = idEstadosBR;
		this.dscEstado = dscEstado;
		this.sigla = sigla;
		this.codigoIBGE = CodigoIBGE;
	}
	
	public int getIdEstadosBR() {
		return idEstadosBR;
	}
	
	public void setIdEstadosBR(int idEstadosBR) {
		this.idEstadosBR = idEstadosBR;
	}
 
	public void setCodigoIBGE(int codigoIBGE) {
		this.codigoIBGE = codigoIBGE;
	}
	
	public int getCodigoIBGE() {
		return codigoIBGE;
	}
 
	public String getDscEstado() {
		return dscEstado;
	}
 
	public void setDscEstado(String dscEstado) {
		this.dscEstado = dscEstado;
	}
	
	public String getSigla() {
		return sigla;
	}
 
	public void setSigla(String sigla) {
		this.sigla = sigla;
	}
}
