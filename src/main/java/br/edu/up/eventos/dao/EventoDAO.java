package br.edu.up.eventos.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import br.edu.up.eventos.entity.Eventos;

public class EventoDAO implements InterfaceDAO<Eventos>{
	
	EntityManager em = Conexao.getInstance().createEntityManager();
	
	@Override
	public void salvar(Eventos eventos) {
		
		
		em.getTransaction().begin();
		em.persist(eventos);
		em.getTransaction().commit();
		
	}

	@Override
	public void alterar(Eventos eventos) {

		em.getTransaction().begin();
		em.merge(eventos);
		em.getTransaction().commit();
		
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Eventos> listar() {
		
		
		
		Query q = em.createQuery("from Eventos");	
		
		return q.getResultList();
	}
	
	/*public Eventos GetReceita(Integer id){
	
		
		return em.find(Eventos.class, null);
	} */

	@Override
	public void excluir(Integer id) {
		
		Eventos evento = em.find(Eventos.class, id);
		
		em.getTransaction().begin();
		em.remove(evento);
		em.getTransaction().commit();
		
	}
	
	

}
