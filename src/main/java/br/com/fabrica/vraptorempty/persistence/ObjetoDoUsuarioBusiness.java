package br.com.fabrica.vraptorempty.persistence;

import java.util.List;

import javax.persistence.NoResultException;
import javax.persistence.Query;

import br.com.fabrica.vraptorempty.model.ObjetoDoUsuario;

public class ObjetoDoUsuarioBusiness extends GenericBusiness<ObjetoDoUsuario> implements ObjetoDoUsuarioRepository{
	
	@SuppressWarnings("unchecked")
	public List<ObjetoDoUsuario> getListaUsuario(Long idUsuario){
		
		List<ObjetoDoUsuario> lista = null;
		
		try{
			Query query = manager.createQuery("FROM ObjetoDoUsuario WHERE donodoobjeto='"+idUsuario+"'");
			lista = (List<ObjetoDoUsuario>) query.getResultList();
		}catch(NoResultException e){
			System.out.println("Não foi encontrado nenhum objeto");
		}
		
		return lista;
	}
	
}
