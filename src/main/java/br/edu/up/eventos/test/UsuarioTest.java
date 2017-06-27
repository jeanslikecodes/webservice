package br.edu.up.eventos.test;

import org.junit.Test;

import br.edu.up.eventos.business.BusinessException;
import br.edu.up.eventos.business.UsuarioBusiness;
import br.edu.up.eventos.entity.Usuario;

public class UsuarioTest {

	@Test
	public void testarCadastrarUsuario() {
		
		Usuario usuario = new Usuario();
		usuario.setId(null);
		usuario.setUsername("jeans");
		usuario.setSenha("123123123");
		
		try {
			new UsuarioBusiness().salvar(usuario);
		} catch (BusinessException e) {
			
			e.printStackTrace();
		}
	
		
	}
}
