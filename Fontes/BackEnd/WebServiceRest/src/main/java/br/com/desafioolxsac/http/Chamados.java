package br.com.desafioolxsac.http;

import javax.xml.bind.annotation.XmlRootElement;
import java.util.Date;

@XmlRootElement

public class Chamados {

	private int idChamados;
		
	private String  dscDetalhesChamado; 
	
	private Date  dataChamado;
	
	private int  idTipoChamado;
	
	private String  dscTipoChamado;
	
	private int  idMotivoChamado;
	
	private String  dscMotivoChamado;
	
	private int  idEstadosBR;
	
	private String  dscEstado;
	
	public Chamados(){
		 
	}
 
	public Chamados(int idChamados, String dscDetalhesChamado, Date dataChamado, 
			int idTipoChamado, String  dscTipoChamado, int idMotivoChamado, String  dscMotivoChamado, int idEstadosBR, String  dscEstado) {
		super();
		this.idChamados = idChamados;
		this.dscDetalhesChamado = dscDetalhesChamado;
		this.dataChamado = dataChamado;
		this.idTipoChamado = idTipoChamado;
		this.dscTipoChamado = dscTipoChamado;
		this.idMotivoChamado = idMotivoChamado;
		this.dscMotivoChamado = dscMotivoChamado;
		this.idEstadosBR = idEstadosBR;
		this.dscEstado = dscEstado;
	}
	
	public int getIdChamados() {
		return idChamados;
	}
 
	public void setIdChamados(int idChamados) {
		this.idChamados = idChamados;
	}
 
	public String getDscDetalhesChamado() {
		return dscDetalhesChamado;
	}
 
	public void setDscDetalhesChamado(String dscDetalhesChamado) {
		this.dscDetalhesChamado = dscDetalhesChamado;
	}
 
	public Date getDataChamado() {
		return dataChamado;
	}
 
	public void setDataChamado(Date dataChamado) {
		this.dataChamado = dataChamado;
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

	public int getIdEstadosBR() {
		return idEstadosBR;
	}
 
	public void setIdEstadosBR(int idEstadosBR) {
		this.idEstadosBR = idEstadosBR;
	}
	
	public String getDscEstado() {
		return dscEstado;
	}
 
	public void setDscEstado(String dscEstado) {
		this.dscEstado = dscEstado;
	}
}
