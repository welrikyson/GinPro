package br.com.gincanaid.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the pessoa database table.
 * 
 */
@Entity
@NamedQuery(name="Pessoa.findAll", query="SELECT p FROM Pessoa p")
public class Pessoa implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int id;

	private String nome;

	//bi-directional many-to-one association to Equipe
	@ManyToOne
	@JoinColumn(name="equipe_id")
	private Equipe equipe1;

	//bi-directional many-to-one association to Equipe
	@ManyToOne
	@JoinColumn(name="equipe_id")
	private Equipe equipe2;

	public Pessoa() {
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

	public Equipe getEquipe1() {
		return this.equipe1;
	}

	public void setEquipe1(Equipe equipe1) {
		this.equipe1 = equipe1;
	}

	public Equipe getEquipe2() {
		return this.equipe2;
	}

	public void setEquipe2(Equipe equipe2) {
		this.equipe2 = equipe2;
	}

}