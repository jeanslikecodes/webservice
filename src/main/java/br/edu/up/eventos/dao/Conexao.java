package br.edu.up.eventos.dao;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;


public class Conexao {
	
	static EntityManagerFactory emf = Persistence.
			createEntityManagerFactory("eventos");
	
	public static EntityManagerFactory getInstance() {
		return emf;
	}

}
