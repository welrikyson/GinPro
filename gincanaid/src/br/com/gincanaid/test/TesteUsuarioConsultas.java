package br.com.gincanaid.test;

import br.com.gincanaid.dao.UsuarioDAO;
import br.com.gincanaid.model.Usuario;

public class TesteUsuarioConsultas {

	public static void main(String[] args) {
		Usuario usuarios= null;
		
		UsuarioDAO dao = new UsuarioDAO();
		
		usuarios = dao.pesquisaPorLogin("welrikyson");
		
		System.out.println(usuarios.getId());
		

	}

}
