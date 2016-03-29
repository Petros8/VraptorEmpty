package br.com.fabrica.vraptorempty.controller;

import java.util.List;

import javax.inject.Inject;

import br.com.caelum.vraptor.Controller;
import br.com.caelum.vraptor.Get;
import br.com.caelum.vraptor.Post;
import br.com.fabrica.vraptorempty.model.ObjetoDoUsuario;
import br.com.fabrica.vraptorempty.model.Usuario;
import br.com.fabrica.vraptorempty.persistence.ObjetoDoUsuarioRepository;
import br.com.fabrica.vraptorempty.persistence.UsuarioRepository;

@Controller
public class IndexController extends GenericController {
	
	@Inject
	private UsuarioRepository urepository;
	@Inject
	private ObjetoDoUsuarioRepository ourepository;

	//Página para testar cadastro
	@Get("/index")
	public void index(){
		
	}
	
	//Página para testar busca
	@Get("/index2")
	public void index2(){
		List<Usuario> usuarios = (List<Usuario>) urepository.list();
		result.include("usuarios",usuarios);
	}
	
	//Você pode passar um parametro na URL e é assim que você mapeia/trata
	@Get("/lista_{idUsuario}")
	public void listando(Long idUsuario){
		List<ObjetoDoUsuario> lista = ourepository.getListaUsuario(idUsuario);
		result.include("objetos",lista);
		result.include("id_usuario",idUsuario);
	}
	
	//Mostra uma lista de todos os objetos e seus donos
	@Get("/listaObjetos")
	public void listaObjetos(){
		
		/*
		Hibernate ja trás todas as informações sobre o dono do 
		objeto como foi mapeado na classe 'ObjetoDoUsuario'
		*/
		List<ObjetoDoUsuario> lista = (List<ObjetoDoUsuario>) ourepository.list();
		
		result.include("objetos",lista);
	}
	
	//Método para cadastrar 
	@Post("/cadastrar")
	public void cadastrar(Usuario usuario,ObjetoDoUsuario objeto){
		
		//O método save retorna o objeto que acabou de ser salvo inclusive com o id que foi gerado pra ele.
		objeto.setDonoDoObjeto(urepository.save(usuario));
		
		ourepository.save(objeto);
		
		/*
		O result.include recebe como parametro o nome da variavel que voce quer incluir na proxima pagina 
		em String e o segundo argumento recebe o valor da variavel, podendo ser qualquer objeto da aplicação
		*/
		result.include("mensagem","Usuario e Objeto cadastrados com sucesso!"); 
		result.redirectTo(this).index();
		
	}
}
