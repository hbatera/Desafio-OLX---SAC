package br.com.desafioolxsac.repository.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name="chamados")
public class ChamadosEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="idChamados")
	private Integer idChamados;
 
	@Column(name="dscDetalhesChamado")	
	private String  dscDetalhesChamado;
 
	@Column(name="DataChamado")
	private Date  dataChamado;
	
	@Column(name="idTipoChamado")
	private Integer  idTipoChamado;
	
	@Column(name="dscTipoChamado", nullable = true)	
	private String  dscTipoChamado;
	
	@Column(name="idMotivoChamado")
	private Integer  idMotivoChamado;
	
	@Column(name="dscMotivoChamado", nullable = true)	
	private String  dscMotivoChamado;
	
	@Column(name="idEstadosBR")
	private Integer  idEstadosBR;
	
	@Column(name="dscEstado", nullable = true)	
	private String  dscEstado;
 
	public Integer getIdChamados() {
		return idChamados;
	}
 
	public void setIdChamados(Integer idChamados) {
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
	
	public Integer getIdTipoChamado() {
		return idTipoChamado;
	}
 
	public void setIdTipoChamado(Integer idTipoChamado) {
		this.idTipoChamado = idTipoChamado;
	}
	
	public String getDscTipoChamado() {
		return dscTipoChamado;
	}
 
	public void setDscTipoChamado(String dscTipoChamado) {
		this.dscTipoChamado = dscTipoChamado;
	}
	
	public Integer getIdMotivoChamado() {
		return idMotivoChamado;
	}
 
	public void setIdMotivoChamado(Integer idMotivoChamado) {
		this.idMotivoChamado = idMotivoChamado;
	}
	
	public String getDscMotivoChamado() {
		return dscMotivoChamado;
	}
 
	public void setDscMotivoChamado(String dscMotivoChamado) {
		this.dscMotivoChamado = dscMotivoChamado;
	}

	public Integer getIdEstadosBR() {
		return idEstadosBR;
	}
 
	public void setIdEstadosBR(Integer idEstadosBR) {
		this.idEstadosBR = idEstadosBR;
	}
	
	public String getDscEstado() {
		return dscEstado;
	}
 
	public void setDscEstado(String dscEstado) {
		this.dscEstado = dscEstado;
	}
}
