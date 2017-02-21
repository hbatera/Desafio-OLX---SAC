package br.com.desafioolxsac.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.desafioolxsac.repository.entity.EstadosEntity;

public class EstadosRepository {

	private final EntityManagerFactory entityManagerFactory;
	 
	private final EntityManager entityManager;
 
	public EstadosRepository(){
 
		/*CRIANDO O NOSSO EntityManagerFactory COM AS PROPRIEDADES DO ARQUIVO persistence.xml */
		this.entityManagerFactory = Persistence.createEntityManagerFactory("persistence_unit_desafioolx");
 
		this.entityManager = this.entityManagerFactory.createEntityManager();
	}
	
	/**
	 * RETORNA TODOS OS ESTADOS CADASTRADOS NO BANCO DE DADOS 
	 * */
	@SuppressWarnings("unchecked")
	public List<EstadosEntity> TodosTiposChamados(){
 
		return this.entityManager.createQuery("SELECT e FROM EstadosEntity e ORDER BY e.dscEstado").getResultList();
	}
	
}
