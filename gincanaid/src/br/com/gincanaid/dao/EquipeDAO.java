package br.com.gincanaid.dao;

import java.util.List;

import javax.persistence.EntityManager;

import br.com.gincanaid.connection.Connection;
import br.com.gincanaid.model.Equipe;

public class EquipeDAO{
private EntityManager em;
	
	public EquipeDAO() {
		new Connection();
	}
	public List<Equipe> findAll(){
		em = Connection.emf.createEntityManager();
		@SuppressWarnings("unchecked")
		List<Equipe> equipes = em.createNamedQuery("Equipe.findAll").getResultList();
		em.close();
		return equipes;
	}
}
