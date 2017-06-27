package br.edu.up.eventos.test;

import org.junit.Test;

import br.edu.up.eventos.business.EventoBusiness;
import br.edu.up.eventos.entity.Eventos;
import br.edu.up.eventos.business.BusinessException;

public class EventoTest {

	@Test
	public void testarCadastrarEvento() {
		
		Eventos eventos = new Eventos();
		eventos.setId(null);
		eventos.setNome("123123");
		eventos.setLugar("qwe123123rqwer");
		
		try {
			new EventoBusiness().salvar(eventos);
		} catch (BusinessException e) {
			
			e.printStackTrace();
		}
	
		
	}
	
}
