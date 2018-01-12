package br.com.gincanaid.test;

import java.util.List;

import br.com.gincanaid.dao.UsuarioDAO;
import br.com.gincanaid.model.Usuario;

public class TesteUsuarioConsultas {

	public static void main(String[] args) {
		List<Usuario> usuarios= null;
		
		UsuarioDAO dao = new UsuarioDAO();
		
		usuarios = dao.pesquisaPorLogin("welrikyson");
		
		usuarios.forEach(u -> System.out.println(u.getLogin()));
		

	}

}
