package br.edu.up.eventos.rest;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import br.edu.up.eventos.dao.ComentarioDAO;
import br.edu.up.eventos.entity.Comentario;

@Path("/comentarioRest")
public class ComentarioRest {

	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Path("/cadastrar")
	public void salvarComentario(Comentario comentario){
		try{
			new ComentarioDAO().salvar(comentario);
		}catch (Exception e) {
			e.printStackTrace();
			//e.getMessage();
		}
	}
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/listar")
	public List<Comentario> listar(){
		List<Comentario> listarComentario = new ComentarioDAO().listar();
		return listarComentario;
	}
}
