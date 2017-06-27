package br.edu.up.eventos.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import br.edu.up.eventos.entity.Usuario;

public class UsuarioDAO implements InterfaceDAO<Usuario> {

	EntityManager em = Conexao.getInstance().createEntityManager();
	
	@Override
	public void salvar(Usuario usuario) {
		
		
		em.getTransaction().begin();
		em.persist(usuario);
		em.getTransaction().commit();
		
	}

	@Override
	public void alterar(Usuario usuario) {

		em.getTransaction().begin();
		em.merge(usuario);
		em.getTransaction().commit();
		
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Usuario> listar() {
		
		
		
		Query q = em.createQuery("from Eventos");	
		
		return q.getResultList();
	}

	@Override
	public void excluir(Integer id) {
		// TODO Auto-generated method stub
		
	}
	
}
