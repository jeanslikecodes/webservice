package br.edu.up.eventos.rest;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import br.edu.up.eventos.business.UsuarioBusiness;
import br.edu.up.eventos.dao.UsuarioDAO;
import br.edu.up.eventos.entity.Usuario;

@Path("/usuarioRest")
public class UsuarioRest {

	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Path("/cadastrar")
	public void salvarUsuario(Usuario usuario){
		try{
			new UsuarioBusiness().salvar(usuario);
		}catch (Exception e) {
			e.printStackTrace();
			//e.getMessage();
		}
	}
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/listar")
	public List<Usuario> listar(){
		List<Usuario> listaUsuario = new UsuarioDAO().listar();
		return listaUsuario;
	}
}
