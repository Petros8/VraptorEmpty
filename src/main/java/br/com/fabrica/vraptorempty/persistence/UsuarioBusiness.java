package br.com.fabrica.vraptorempty.persistence;

import javax.persistence.NoResultException;
import javax.persistence.Query;

import br.com.fabrica.vraptorempty.model.Usuario;

public class UsuarioBusiness extends GenericBusiness<Usuario> implements UsuarioRepository{
	
	public Usuario getFernando(){
		Usuario u = null;
		
		try{
			Query query = manager.createNativeQuery("SELECT * FROM USUARIO WHERE nome='Fernando'");
			u = (Usuario) query.getSingleResult();
		}catch(NoResultException e){
			System.out.println("Não Achou!");
		}
		
		return u;
	}
	
}
