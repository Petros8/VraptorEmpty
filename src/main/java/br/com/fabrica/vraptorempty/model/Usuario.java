package br.com.fabrica.vraptorempty.model;

import javax.inject.Named;
import javax.persistence.Entity;

@Entity
@Named("usuario")
public class Usuario extends AbstractEntity {
	
	private String nome;
	private String email;

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

}
