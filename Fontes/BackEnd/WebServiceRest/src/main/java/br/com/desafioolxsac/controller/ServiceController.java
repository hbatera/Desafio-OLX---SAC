package br.com.desafioolxsac.controller;


import java.util.ArrayList;
import java.util.Date;
import java.util.List;
 
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

import br.com.desafioolxsac.http.Chamados;
import br.com.desafioolxsac.repository.ChamadosRepository;
import br.com.desafioolxsac.repository.entity.ChamadosEntity;
import br.com.desafioolxsac.repository.entity.ChamadosSalvarEntity;

import br.com.desafioolxsac.http.TipoChamado;
import br.com.desafioolxsac.repository.TipoChamadoRepository;
import br.com.desafioolxsac.repository.entity.TipoChamadoEntity;

import br.com.desafioolxsac.http.MotivoChamado;
import br.com.desafioolxsac.repository.MotivoChamadoRepository;
import br.com.desafioolxsac.repository.entity.MotivoChamadoEntity;

import br.com.desafioolxsac.http.Estados;
import br.com.desafioolxsac.repository.EstadosRepository;
import br.com.desafioolxsac.repository.entity.EstadosEntity;

@Path("/service")
public class ServiceController {

	private final  ChamadosRepository repository = new ChamadosRepository();
	private final  TipoChamadoRepository repositoryTC = new TipoChamadoRepository();
	private final  MotivoChamadoRepository repositoryMC = new MotivoChamadoRepository();
	private final  EstadosRepository repositoryE = new EstadosRepository();
	 
	/**
	 * Esse método cadastra um novo chamado
	 * */
	@POST	
	@Consumes("application/json; charset=UTF-8")
	@Produces("application/json; charset=UTF-8")
	@Path("/chamado/cadastrar")
	public String Cadastrar(Chamados chamados){
 
		String retorno;
		
		ChamadosSalvarEntity entity = new ChamadosSalvarEntity();
		
		Date date = new Date();
 
		try {
 
			entity.setDscDetalhesChamado(chamados.getDscDetalhesChamado());
			entity.setDataChamado(date);
			entity.setIdTipoChamado(chamados.getIdTipoChamado());
			entity.setIdMotivoChamado(chamados.getIdMotivoChamado());
			entity.setIdEstadosBR(chamados.getIdEstadosBR());
 
			retorno = repository.Salvar(entity);
 
			return retorno;
 
		} catch (Exception e) {
 
			return "{"+ "\"Resultado\"" + ":" + "\"true\"" +"}";
		}
 
	}
	
	/**
	 * Essse método altera um Chamado já cadastrado
	 * **/
	@PUT
	@Produces("application/json; charset=UTF-8")
	@Consumes("application/json; charset=UTF-8")	
	@Path("/chamado/alterar")
	public String Alterar(Chamados chamado){
 
		String retorno;
		
		ChamadosSalvarEntity entity = new ChamadosSalvarEntity();
		
		//Date date = new Date();
 
		try {
 
			entity.setIdChamados(chamado.getIdChamados());
			entity.setDscDetalhesChamado(chamado.getDscDetalhesChamado());
			//entity.setDataChamado(date);
			entity.setIdTipoChamado(chamado.getIdTipoChamado());
			entity.setIdMotivoChamado(chamado.getIdMotivoChamado());
			entity.setIdEstadosBR(chamado.getIdEstadosBR());
 
			retorno = repository.Alterar(entity);
 
			return retorno;
 
		} catch (Exception e) {
 
			return "{"+ "\"Resultado\"" + ":" + "\"true\"" +"}";
 
		}
 
	}
	
	/**
	 * Esse método lista todos os chamados cadastrados na base de dados
	 * */
	@GET
	@Produces("application/json; charset=UTF-8")
	@Path("/chamado/todosChamados")
	public List<Chamados> TodosChamados(){
 
		List<Chamados> chamados =  new ArrayList<Chamados>();
 
		List<ChamadosEntity> listaEntityChamados = repository.TodosChamados();
 
		for (ChamadosEntity entity : listaEntityChamados) {
 
			chamados.add(new Chamados(entity.getIdChamados(), entity.getDscDetalhesChamado(),entity.getDataChamado(), entity.getIdTipoChamado(), entity.getDscTipoChamado(), entity.getIdTipoChamado(), entity.getDscMotivoChamado(), entity.getIdEstadosBR(), entity.getDscEstado()));
		}
 
		return chamados;
	}
	
	/**
	 * Esse método busca um chamado cadastrado pelo id
	 * */
	@GET
	@Produces("application/json; charset=UTF-8")
	@Path("/chamado/getChamado/{id}")
	public Chamados GetChamado(@PathParam("id") Integer id){
 
		ChamadosEntity entity = repository.GetChamado(id);
 
		if(entity != null)
			return new Chamados(entity.getIdChamados(), entity.getDscDetalhesChamado(),entity.getDataChamado(), entity.getIdTipoChamado(), entity.getDscTipoChamado(), entity.getIdTipoChamado(), entity.getDscMotivoChamado(), entity.getIdEstadosBR(), entity.getDscEstado());
 
		return null;
	}
	
	/**
	 * Excluindo um chamado pelo id
	 * */
	@DELETE
	@Produces("application/json; charset=UTF-8")
	@Path("/chamado/excluir/{id}")	
	public String Excluir(@PathParam("id") Integer id){
 
		String retorno;
		
		try {
 
			retorno = repository.Excluir(id);
 
			return retorno;
 
		} catch (Exception e) {
 
			return  "{"+ "\"Resultado\"" + ":" + "\"true\"" +"}";
		}
 
	}
	
	/*Tipo de Chamado*/
	/**
	 * Esse método lista todos os tipos de chamados cadastrados na base de dados
	 * */
	@GET
	@Produces("application/json; charset=UTF-8")
	@Path("/chamado/todosTiposChamados")
	public List<TipoChamado> TodosTiposChamado(){
 
		List<TipoChamado> tipoChamados =  new ArrayList<TipoChamado>();
 
		List<TipoChamadoEntity> listaEntityTipoChamado = repositoryTC.TodosTiposChamados();
 
		for (TipoChamadoEntity entity : listaEntityTipoChamado) {
 
			tipoChamados.add(new TipoChamado(entity.getIdTipoChamados(), entity.getDscTipoChamado()));
		}
 
		return tipoChamados;
	}
	
	/*Tipo de Chamado*/
	/**
	 * Esse método lista todos os tipos de chamados cadastrados na base
	 * */
	@GET
	@Produces("application/json; charset=UTF-8")
	@Path("/chamado/todosMotivosChamados")
	public List<MotivoChamado> TodosMotivosChamado(){
 
		List<MotivoChamado> motivoChamados =  new ArrayList<MotivoChamado>();
 
		List<MotivoChamadoEntity> listaEntityMotivoChamado = repositoryMC.TodosMotivosChamados();
 
		for (MotivoChamadoEntity entity : listaEntityMotivoChamado) {
 
			motivoChamados.add(new MotivoChamado(entity.getIdMotivoChamados(), entity.getDscMotivoChamado()));
		}
 
		return motivoChamados;
	}
	
	/*Estados*/
	/**
	 * Esse método lista todos os estados cadastrados na base
	 * */
	@GET
	@Produces("application/json; charset=UTF-8")
	@Path("/chamado/todosEstados")
	public List<Estados> TodosEstados(){
 
		List<Estados> estados =  new ArrayList<Estados>();
 
		List<EstadosEntity> listaEntityEstados = repositoryE.TodosTiposChamados();
 
		for (EstadosEntity entity : listaEntityEstados) {
 
			estados.add(new Estados(entity.getIdEstadosBR(), entity.getDscEstado(), entity.getSigla(), entity.getCodigoIBGE()));
		}
 
		return estados;
	}
}
