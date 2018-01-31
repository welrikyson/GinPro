package br.com.gincanaid.connection;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Connection {
	public static EntityManagerFactory emf;

	public Connection() {
		// TODO Auto-generated constructor stub
		if (emf == null) {
			System.out.println("criei a conexao");
			//emf = Persistence.createEntityManagerFactory("gincanaidHost");
			emf = Persistence.createEntityManagerFactory("gincanaidLocal");
		} else
			System.out.println("nao precisei de criar a conexao");
	}

	public EntityManagerFactory getConection() {
		return emf;
	}

	public boolean connectionActiva() {
		return emf.isOpen();
	}
}
