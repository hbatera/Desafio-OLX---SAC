package br.com.desafioolxsac.repository.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Tipo_Chamado")
public class TipoChamadoEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="idTipoChamado")
	private Integer idTipoChamado;
 
	@Column(name="dscTipoChamado")	
	private String  dscTipoChamado;
	
	public Integer getIdTipoChamados() {
		return idTipoChamado;
	}
 
	public void setIdTipoChamados(Integer idTipoChamado) {
		this.idTipoChamado = idTipoChamado;
	}
 
	public String getDscTipoChamado() {
		return dscTipoChamado;
	}
 
	public void setDscTipoChamado(String dscTipoChamado) {
		this.dscTipoChamado = dscTipoChamado;
	}
}
