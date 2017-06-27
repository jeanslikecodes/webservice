package br.edu.up.eventos.dao;

import java.util.List;

public interface InterfaceDAO<T> {

	public void salvar(T t);
	
	public void excluir(Integer id);
	
	public void alterar(T t);
	
	public List<T> listar();
}
