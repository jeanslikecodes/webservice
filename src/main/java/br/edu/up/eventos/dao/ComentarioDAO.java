package br.edu.up.eventos.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import br.edu.up.eventos.entity.Comentario;

public class ComentarioDAO implements InterfaceDAO<Comentario> {

	EntityManager em = Conexao.getInstance().createEntityManager();

	@Override
	public void salvar(Comentario comentario) {
		
		
		em.getTransaction().begin();
		em.persist(comentario);
		em.getTransaction().commit();
		
	}

	
	@SuppressWarnings("unchecked")
	@Override
	public List<Comentario> listar() {
		
		
		
		Query q = em.createQuery("from Eventos");	
		
		return q.getResultList();
	}


	@Override
	public void excluir(Integer id) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void alterar(Comentario t) {
		// TODO Auto-generated method stub
		
	}

}
