package br.com.gincanaid.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the equipe database table.
 * 
 */
@Entity
@NamedQuery(name="Equipe.findAll", query="SELECT e FROM Equipe e")
public class Equipe implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int id;

	private String nome;

	private int ponto;

	//bi-directional many-to-one association to Pessoa
	@OneToMany(mappedBy="equipe1")
	private List<Pessoa> pessoas1;

	//bi-directional many-to-one association to Pessoa
	@OneToMany(mappedBy="equipe2")
	private List<Pessoa> pessoas2;

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

	public List<Pessoa> getPessoas1() {
		return this.pessoas1;
	}

	public void setPessoas1(List<Pessoa> pessoas1) {
		this.pessoas1 = pessoas1;
	}

	public Pessoa addPessoas1(Pessoa pessoas1) {
		getPessoas1().add(pessoas1);
		pessoas1.setEquipe1(this);

		return pessoas1;
	}

	public Pessoa removePessoas1(Pessoa pessoas1) {
		getPessoas1().remove(pessoas1);
		pessoas1.setEquipe1(null);

		return pessoas1;
	}

	public List<Pessoa> getPessoas2() {
		return this.pessoas2;
	}

	public void setPessoas2(List<Pessoa> pessoas2) {
		this.pessoas2 = pessoas2;
	}

	public Pessoa addPessoas2(Pessoa pessoas2) {
		getPessoas2().add(pessoas2);
		pessoas2.setEquipe2(this);

		return pessoas2;
	}

	public Pessoa removePessoas2(Pessoa pessoas2) {
		getPessoas2().remove(pessoas2);
		pessoas2.setEquipe2(null);

		return pessoas2;
	}

}