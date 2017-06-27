package br.edu.up.eventos.business;

import br.edu.up.eventos.dao.ComentarioDAO;
import br.edu.up.eventos.dao.InterfaceDAO;
import br.edu.up.eventos.entity.Comentario;

public class ComentarioBusiness {

public void salvar(Comentario comentario) throws BusinessException {
		
		if (comentario.getTexto().isEmpty()) {
			throw new BusinessException("RN01 - O texto não pode ser nulo!");
		}
		
		InterfaceDAO<Comentario> comentarioDAO = new ComentarioDAO();
		comentarioDAO.salvar(comentario);
	
	}
}
