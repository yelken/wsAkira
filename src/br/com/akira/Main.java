package br.com.akira;

import br.com.akira.ponto.Ponto;
import br.com.akira.ponto.PontoDAO;

public class Main {

	public static void main(String[] args) {
		Ponto p = new Ponto();
		p.setLatitude(-8.091571337102636);
		p.setLongitude(-8.091571337102636);
		PontoDAO pdao = new PontoDAO();
		pdao.salvar(p);
		System.out.println("Inserido com sucesso");
	}
}
