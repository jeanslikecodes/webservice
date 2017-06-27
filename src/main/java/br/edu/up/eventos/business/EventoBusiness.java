package br.edu.up.eventos.business;

import br.edu.up.eventos.dao.EventoDAO;
import br.edu.up.eventos.dao.InterfaceDAO;
import br.edu.up.eventos.entity.Eventos;

public class EventoBusiness {

	public void salvar(Eventos eventos) throws BusinessException {
		
		if (eventos.getLugar().isEmpty()) {
			throw new BusinessException("RN01 - O local do evento não pode ser nulo!");
		}
		
		InterfaceDAO<Eventos> eventoDAO = new EventoDAO();
		eventoDAO.salvar(eventos);
	
	}
	
	
	public void excluir(Integer id) throws BusinessException {
	
		
		InterfaceDAO<Eventos> eventoDAO = new EventoDAO();
		eventoDAO.excluir(id);
	
	}
}
