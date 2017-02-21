package br.com.desafioolxsac.repository;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import java.util.Date;

import br.com.desafioolxsac.repository.entity.ChamadosEntity;
import br.com.desafioolxsac.repository.entity.ChamadosSalvarEntity;

public class ChamadosRepository {

	private final EntityManagerFactory entityManagerFactory;
	 
	private final EntityManager entityManager;
 
	public ChamadosRepository(){
 
		/*CRIANDO O NOSSO EntityManagerFactory COM AS PROPRIEDADES DO ARQUIVO persistence.xml */
		this.entityManagerFactory = Persistence.createEntityManagerFactory("persistence_unit_desafioolx");
 
		this.entityManager = this.entityManagerFactory.createEntityManager();
	}
 
	/**
	 * CRIA UM NOVO CHAMADO NO BANCO DE DADOS
	 * */
	public String Salvar(ChamadosSalvarEntity chamadosEntity){
 
		String resultado = "{"+ "\"Resultado\"" + ":" + "\"false\"" +"}";
		try
		{
			this.entityManager.getTransaction().begin();
			this.entityManager.persist(chamadosEntity);
			this.entityManager.getTransaction().commit();
			
			resultado =  "{"+ "\"Resultado\"" + ":" + "\"true\"" +"}";
		}
		catch (ArrayIndexOutOfBoundsException e) {
			resultado = "{"+ "\"Resultado\"" + ":" + "\"false\"" +"}";
		}
		
		return resultado;
	}
	
	/**
	 * ALTERA UM CHAMADO CADASTRADO
	 * */
	public String Alterar(ChamadosSalvarEntity chamadosEntity){
 
		String resultado = "{"+ "\"Resultado\"" + ":" + "\"false\"" +"}";
		
		ChamadosSalvarEntity chamados = new ChamadosSalvarEntity();
		
		chamados = this.entityManager.find(ChamadosSalvarEntity.class, chamadosEntity.getIdChamados());
		
		chamadosEntity.setDataChamado(chamados.getDataChamado());
		
		try
		{
			this.entityManager.getTransaction().begin();
			this.entityManager.merge(chamadosEntity);
			this.entityManager.getTransaction().commit();
			
			resultado =  "{"+ "\"Resultado\"" + ":" + "\"true\"" +"}";
		}
		catch (ArrayIndexOutOfBoundsException e) {
			resultado = "{"+ "\"Resultado\"" + ":" + "\"false\"" +"}";
		}
		
		return resultado;
	}
 
	/**
	 * RETORNA TODOS OS CHAMADOS CADASTRADOS NO BANCO DE DADOS 
	 * */
	@SuppressWarnings("unchecked")
	public List<ChamadosEntity> TodosChamados(){
 
		List<ChamadosEntity> Chamados = new ArrayList<ChamadosEntity>();
		
		Query query = this.entityManager.createNativeQuery("Select c.idChamados, c.dscDetalhesChamado, c.DataChamado, c.idTipoChamado, tc.dscTipoChamado, "
														 + "c.idMotivoChamado, mc.dscMotivoChamado, c.idEstadosBR, e.dscEstado "
														 + " from chamados c "
														 + "inner join tipo_chamado tc on c.idTipoChamado = tc.idTipoChamado "
														 + "inner join motivo_chamado mc on c.idMotivoChamado = mc.idMotivoChamado "
   													 	 + "inner join estadosbr e on c.idEstadosBR = e.idEstadosBR "
														 + "group by c.DataChamado, e.dscEstado "
   													 	 + "order by c.dscDetalhesChamado desc ");
		
		List<Object[]> objs = query.getResultList();
		
		for(Object[] o : objs) {
			
			Object[] aux = o;
			
			ChamadosEntity cham = new ChamadosEntity();
			
			cham.setIdChamados((Integer) aux[0]);
			cham.setDscDetalhesChamado((String) aux[1]);
			cham.setDataChamado((Date) aux[2]);
			cham.setIdTipoChamado((Integer) aux[3]);
			cham.setDscTipoChamado((String) aux[4]);
			cham.setIdMotivoChamado((Integer) aux[5]);
			cham.setDscMotivoChamado((String) aux[6]);
			cham.setIdEstadosBR((Integer) aux[7]);
			cham.setDscEstado((String) aux[8]);
			
			Chamados.add(cham);
		}
		
		return Chamados;
	}
 
	/**
	 * CONSULTA UM CHAMADO CADASTRO PELO ID
	 * */
	public ChamadosEntity GetChamado(Integer codigo){
 
				
		Query query = this.entityManager.createNativeQuery("Select c.idChamados, c.dscDetalhesChamado, c.DataChamado, c.idTipoChamado, tc.dscTipoChamado, "
				 	  									 + "c.idMotivoChamado, mc.dscMotivoChamado, c.idEstadosBR, e.dscEstado "
				 	  									 + " from chamados c "
				 	  									 + "inner join tipo_chamado tc on c.idTipoChamado = tc.idTipoChamado "
				 	  									 + "inner join motivo_chamado mc on c.idMotivoChamado = mc.idMotivoChamado "
				 	  									 + "inner join estadosbr e on c.idEstadosBR = e.idEstadosBR "
				 	  									 + "Where c.idChamados = " + codigo);

		Object objs = query.getSingleResult();
		
		
			
	    Object[] obj = (Object[])objs;
			
		ChamadosEntity cham = new ChamadosEntity();
		
		
		cham.setIdChamados((Integer) obj[0]);
		cham.setDscDetalhesChamado((String) obj[1]);
		cham.setDataChamado((Date) obj[2]);
		cham.setIdTipoChamado((Integer) obj[3]);
		cham.setDscTipoChamado((String) obj[4]);
		cham.setIdMotivoChamado((Integer) obj[5]);
		cham.setDscMotivoChamado((String) obj[6]);
		cham.setIdEstadosBR((Integer) obj[7]);
		cham.setDscEstado((String) obj[8]);

		return cham;
		
		
	}
 
	/**
	 * EXCLUINDO UM REGISTRO PELO ID
	**/
	public String Excluir(Integer codigo){
 
		String resultado = "{"+ "\"Resultado\"" + ":" + "\"false\"" +"}";
		
		try
		{
			ChamadosEntity chamado = this.entityManager.find(ChamadosEntity.class, codigo);
 
			this.entityManager.getTransaction().begin();
			this.entityManager.remove(chamado);
			this.entityManager.getTransaction().commit();
 
			resultado =  "{"+ "\"Resultado\"" + ":" + "\"true\"" +"}";
		}
		catch (ArrayIndexOutOfBoundsException e) {
			resultado =  "{"+ "\"Resultado\"" + ":" + "\"false\"" +"}";
		}
		
		return resultado;
	}
}
