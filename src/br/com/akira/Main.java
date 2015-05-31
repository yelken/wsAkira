package br.com.akira;

import java.util.List;

import br.com.akira.avaliacao.Avaliacao;
import br.com.akira.avaliacao.AvaliacaoDAO;
import br.com.akira.ponto.Ponto;
import br.com.akira.ponto.PontoDAO;
import br.com.akira.tipo.TipoProblema;

public class Main {

	public static void main(String[] args) {
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

		Ponto p = new Ponto();
		p.setLatitude(-8.091571337102636);
		p.setLongitude(-8.091571337102636);
		PontoDAO pdao = new PontoDAO();
		List<Ponto> list = pdao
				.listagem("FROM br.com.akira.ponto.Ponto");

		for (Ponto ponto : list) {
			System.out.println(ponto.getIdentifier() + " "
					+ ponto.getLatitude() + " " + ponto.getLongitude());
		}

//		System.out.println("Inserido com sucesso");

	}
}
