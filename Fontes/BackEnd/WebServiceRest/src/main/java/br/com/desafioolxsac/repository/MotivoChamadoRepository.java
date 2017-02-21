package br.com.desafioolxsac.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.desafioolxsac.repository.entity.MotivoChamadoEntity;



public class MotivoChamadoRepository {

	private final EntityManagerFactory entityManagerFactory;
	 
	private final EntityManager entityManager;
 
	public MotivoChamadoRepository(){
 
		/*CRIANDO O NOSSO EntityManagerFactory COM AS PROPRIEDADES DO ARQUIVO persistence.xml */
		this.entityManagerFactory = Persistence.createEntityManagerFactory("persistence_unit_desafioolx");
 
		this.entityManager = this.entityManagerFactory.createEntityManager();
	}
	
	/**
	 * RETORNA TODOS OS TIPOS DE CHAMADOS CADASTRADOS NO BANCO DE DADOS 
	 * */
	@SuppressWarnings("unchecked")
	public List<MotivoChamadoEntity> TodosMotivosChamados(){
 
		return this.entityManager.createQuery("SELECT mc FROM MotivoChamadoEntity mc ORDER BY mc.dscMotivoChamado").getResultList();
	}
	
	/**
	 * RETORNA AS DESCRICOES DE TODOS OS TIPOS DE CHAMADOS CADASTRADOS NO BANCO DE DADOS 
	 * */
	@SuppressWarnings("unchecked")
	public List<MotivoChamadoEntity> TodosMotivosChamadosDesc(){
 
		return this.entityManager.createQuery("SELECT mc.dscTipoChamado FROM MotivoChamadoEntity mc ORDER BY mc.dscMotivoChamado").getResultList();
	}
}
