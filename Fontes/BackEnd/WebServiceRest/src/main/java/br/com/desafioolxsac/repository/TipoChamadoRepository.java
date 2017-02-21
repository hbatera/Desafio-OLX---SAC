package br.com.desafioolxsac.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.desafioolxsac.repository.entity.TipoChamadoEntity;

public class TipoChamadoRepository {

	private final EntityManagerFactory entityManagerFactory;
	 
	private final EntityManager entityManager;
 
	public TipoChamadoRepository(){
 
		/*CRIANDO O NOSSO EntityManagerFactory COM AS PROPRIEDADES DO ARQUIVO persistence.xml */
		this.entityManagerFactory = Persistence.createEntityManagerFactory("persistence_unit_desafioolx");
 
		this.entityManager = this.entityManagerFactory.createEntityManager();
	}
	
	/**
	 * RETORNA TODOS OS TIPOS DE CHAMADOS CADASTRADOS NO BANCO DE DADOS 
	 * */
	@SuppressWarnings("unchecked")
	public List<TipoChamadoEntity> TodosTiposChamados(){
 
		return this.entityManager.createQuery("SELECT tc FROM TipoChamadoEntity tc ORDER BY tc.dscTipoChamado").getResultList();
	}
	
	/**
	 * RETORNA AS DESCRICOES DE TODOS OS TIPOS DE CHAMADOS CADASTRADOS NO BANCO DE DADOS 
	 * */
	@SuppressWarnings("unchecked")
	public List<TipoChamadoEntity> TodosTiposChamadosDesc(){
 
		return this.entityManager.createQuery("SELECT tc.dscTipoChamado FROM TipoChamadoEntity tc ORDER BY tc.dscTipoChamado").getResultList();
	}

}
