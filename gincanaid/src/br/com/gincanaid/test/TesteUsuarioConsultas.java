package br.com.gincanaid.test;

import br.com.gincanaid.dao.UsuarioDAO;
import br.com.gincanaid.model.Usuario;

public class TesteUsuarioConsultas {

	public static void main(String[] args) {
		Usuario usuario= null;
		
		UsuarioDAO dao = new UsuarioDAO();
		
		usuario = dao.pesquisaPorId(1);
		
		System.out.println(usuario.getSenha());
		

	}

}
