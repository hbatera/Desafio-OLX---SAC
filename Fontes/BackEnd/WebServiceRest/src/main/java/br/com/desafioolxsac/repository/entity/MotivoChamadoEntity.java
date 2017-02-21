package br.com.desafioolxsac.repository.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="motivo_chamado")
public class MotivoChamadoEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="idMotivoChamado")
	private Integer idMotivoChamado;
 
	@Column(name="dscMotivoChamado")	
	private String  dscMotivoChamado;
	
	public Integer getIdMotivoChamados() {
		return idMotivoChamado;
	}
 
	public void setIdMotivoChamados(Integer idMotivoChamado) {
		this.idMotivoChamado = idMotivoChamado;
	}
 
	public String getDscMotivoChamado() {
		return dscMotivoChamado;
	}
 
	public void setDscTipoChamado(String dscMotivoChamado) {
		this.dscMotivoChamado = dscMotivoChamado;
	}
}
