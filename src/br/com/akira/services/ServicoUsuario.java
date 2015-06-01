package br.com.akira.services;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

import br.com.akira.avaliacao.Avaliacao;
import br.com.akira.avaliacao.AvaliacaoDAO;
import br.com.akira.tipo.TipoProblema;
import br.com.akira.usuario.Usuario;
import br.com.akira.usuario.UsuarioDAO;

@Path("/usuarios")
public class ServicoUsuario {

	@Path("{usuario}/{senha}/{nome}/{cpf}")
	@GET
	@Produces("application/xml")
	public String inserirUsuario(@PathParam("usuario") String pUsuario,
			@PathParam("senha") String senha, @PathParam("nome") String nome,
			@PathParam("cpf") String cpf) {
		
		Usuario usuario = new Usuario();
		usuario.setCpf(cpf);
		usuario.setNome(nome);
		usuario.setSenha(senha);
		usuario.setUsuario(pUsuario);
		
		UsuarioDAO usuarioDAO = new UsuarioDAO();
		usuarioDAO.salvar(usuario);
		return "<respostaServico>OK</respostaServico>";
	}

}
