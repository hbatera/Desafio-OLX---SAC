package br.com.desafioolxsac.repository.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="estadosbr")
public class EstadosEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="idEstadosBR")
	private Integer idEstadosBR;
	
	@Column(name="codigoIBGE")
	private Integer codigoIBGE;
 
	@Column(name="dscEstado")	
	private String  dscEstado;
	
	@Column(name="sigla")	
	private String  sigla;
	
	public Integer getIdEstadosBR() {
		return idEstadosBR;
	}
 
	public void setIdEstadosBR(Integer idEstadosBR) {
		this.idEstadosBR = idEstadosBR;
	}
	
	public void setCodigoIBGE(Integer codigoIBGE) {
		this.codigoIBGE = codigoIBGE;
	}
	
	public Integer getCodigoIBGE() {
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
