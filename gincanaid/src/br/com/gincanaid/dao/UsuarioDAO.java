package br.com.gincanaid.dao;

import java.util.List;

import javax.persistence.EntityManager;

import br.com.gincanaid.connection.Connection;
import br.com.gincanaid.model.Usuario;

public class UsuarioDAO {
	private EntityManager em;
	
	public UsuarioDAO() {
		new Connection();
	}
	
	public Usuario pesquisaPorId(int id) {
		em = Connection.emf.createEntityManager();
		Usuario usuario = em.find(Usuario.class, id);
		em.close();
		return usuario;
	}
	
	public List<Usuario> pesquisaPorLogin(String login) {
		em = Connection.emf.createEntityManager();
		@SuppressWarnings("unchecked")
		List<Usuario> usarios = em.createNamedQuery("Usuario.login").setParameter("login",login).getResultList();
		em.close();
		return usarios;
	}

}
