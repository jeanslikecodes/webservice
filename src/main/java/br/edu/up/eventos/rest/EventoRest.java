package br.edu.up.eventos.rest;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import br.edu.up.eventos.business.EventoBusiness;
import br.edu.up.eventos.dao.EventoDAO;
import br.edu.up.eventos.entity.Eventos;

@Path("/eventoRest")
public class EventoRest {

	
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Path("/cadastrar")
	public void salvarEvento(Eventos eventos){
		try{
			new EventoBusiness().salvar(eventos);
		}catch (Exception e) {
			e.printStackTrace();
			//e.getMessage();
		}
	}
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/listar")
	public List<Eventos> listar(){
		List<Eventos> listaEventos = new EventoDAO().listar();
		return listaEventos;
	}
	
	@DELETE
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/excluir/{id}")	
	public void Excluir(@PathParam("id") Integer id){
		try{
			new EventoBusiness().excluir(id);
		}catch (Exception e) {
			e.printStackTrace();
			//e.getMessage();
		}
		
	}
}
