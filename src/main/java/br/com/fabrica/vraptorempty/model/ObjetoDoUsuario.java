package br.com.fabrica.vraptorempty.model;

import javax.inject.Named;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
@Named("objeto")
public class ObjetoDoUsuario extends AbstractEntity {

	private String nome;
	private String tipo;
	
	//Exemplo de mapeamento de chave estrangeira no hibernate
	@OneToOne(targetEntity=Usuario.class)
	@JoinColumn(name="donoDoObjeto",referencedColumnName="id")
	private Usuario donoDoObjeto;
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public Usuario getDonoDoObjeto() {
		return donoDoObjeto;
	}

	public void setDonoDoObjeto(Usuario donoDoObjeto) {
		this.donoDoObjeto = donoDoObjeto;
	}
	
	
	
}
