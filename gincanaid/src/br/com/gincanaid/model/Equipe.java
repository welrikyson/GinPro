package br.com.gincanaid.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the Equipe database table.
 * 
 */
@Entity
@NamedQuery(name="Equipe.findAll", query="SELECT e FROM Equipe e")
public class Equipe implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private Integer id;

	private String nome;

	private int ponto;

	public Equipe() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return this.nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getPonto() {
		return this.ponto;
	}

	public void setPonto(int ponto) {
		this.ponto = ponto;
	}

}