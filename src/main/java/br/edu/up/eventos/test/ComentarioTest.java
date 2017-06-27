package br.edu.up.eventos.test;

import org.junit.Test;

import br.edu.up.eventos.business.BusinessException;
import br.edu.up.eventos.business.ComentarioBusiness;
import br.edu.up.eventos.entity.Comentario;

public class ComentarioTest {

	@Test
	public void testarCadastrarComentario() {
		
		Comentario comentario = new Comentario();
		comentario.setId(null);
		comentario.setTexto("qjehkqwj");
		
		try {
			new ComentarioBusiness().salvar(comentario);
		} catch (BusinessException e) {
			
			e.printStackTrace();
		}
	
		
	}
}
