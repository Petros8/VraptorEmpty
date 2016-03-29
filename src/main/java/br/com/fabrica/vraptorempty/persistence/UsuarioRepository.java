package br.com.fabrica.vraptorempty.persistence;

import br.com.fabrica.vraptorempty.model.Usuario;

public interface UsuarioRepository extends GenericRepository<Usuario> {
	
	public Usuario getFernando();

}
