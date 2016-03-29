package br.com.fabrica.vraptorempty.persistence;

import java.util.List;

import br.com.fabrica.vraptorempty.model.ObjetoDoUsuario;

public interface ObjetoDoUsuarioRepository extends GenericRepository<ObjetoDoUsuario> {
	
	public List<ObjetoDoUsuario> getListaUsuario(Long idUsuario);
	
}
