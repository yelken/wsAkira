package br.com.akira;

import br.com.akira.usuario.Usuario;
import br.com.akira.usuario.UsuarioDAO;


public class Main {

	public static void main(String[] args) {
		Usuario usuario = new Usuario();
		usuario.setCpf("08111277458");
		usuario.setNome("Yelken Gonzales");
		usuario.setSenha("abc1020");
		usuario.setUsuario("yelkezin@gmail.com");
		UsuarioDAO usuarioDAO = new UsuarioDAO();
		usuarioDAO.salvar(usuario);
		System.out.println("Usuário inserido com sucesso");
		
		
		// Avaliacao avaliacao = new Avaliacao();
		// avaliacao.setLatitude(-8.091571337102636);
		// avaliacao.setLongitude(-8.091571337102636);

		// TipoProblema tipoProblema = new TipoProblema();
		// tipoProblema.setDescricao("Pedra na rua");

		// avaliacao.setTipoProblema(tipoProblema);
		// avaliacao.setOk(false);
		// AvaliacaoDAO avaliacaoDAO = new AvaliacaoDAO();
		// avaliacaoDAO.salvar(avaliacao);
		// System.out.println("Inserido com sucesso");

//		Ponto p = new Ponto();
//		p.setLatitude(-8.055602);
//		p.setLongitude(-34.951265);
//		PontoDAO pdao = new PontoDAO();
//		List<Ponto> list = pdao
//				.listByLatitudeLongitude(p.getLatitude(), p.getLongitude());
//
//		for (Ponto ponto : list) {
//			System.out.println(ponto.getIdentifier() + " "
//					+ ponto.getLatitude() + " " + ponto.getLongitude());
//		}

//		System.out.println("Inserido com sucesso");

	}
}
