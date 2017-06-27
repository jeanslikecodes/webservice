package br.edu.up.eventos.business;

import br.edu.up.eventos.dao.InterfaceDAO;
import br.edu.up.eventos.dao.UsuarioDAO;
import br.edu.up.eventos.entity.Usuario;

public class UsuarioBusiness {

	public void salvar(Usuario usuario) throws BusinessException {
		
		if (usuario.getUsername().isEmpty()) {
			throw new BusinessException("RN01 - O username não pode ser nulo!");
		}
		
		InterfaceDAO<Usuario> usuariDAO = new UsuarioDAO();
		usuariDAO.salvar(usuario);
	
	}
	
}
