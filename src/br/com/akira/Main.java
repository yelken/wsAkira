package br.com.akira;

import java.util.ArrayList;
import java.util.List;

import br.com.akira.avaliacao.Avaliacao;
import br.com.akira.ponto.Ponto;
import br.com.akira.ponto.PontoDAO;

public class Main {

	public static void main(String[] args) {
		Ponto ponto = new Ponto();
		ponto.setLatitude(-8.062815);
		ponto.setLongitude(-34.871141);
		
		Ponto pontoX = new Ponto();
		pontoX.setLatitude(-8.062717);
		pontoX.setLongitude(-34.871216);
		
		List<Avaliacao> listaAvaliacao = new ArrayList<>();
		
		
		
//		Ponto ponto = new Ponto();
//		PontoDAO pontoDAO = new PontoDAO();
//		ponto.setLatitude(-8.055047);
//		ponto.setLongitude(-34.953698);
//		pontoDAO.salvar(ponto);
//		System.out.println("1");
//		ponto.setLatitude(-8.054199);
//		ponto.setLongitude(-34.953595);
//		pontoDAO.salvar(ponto);
//		System.out.println("1");
//		ponto.setLatitude(-8.05435);
//		ponto.setLongitude(-34.9535129);
//		pontoDAO.salvar(ponto);
//		System.out.println("1");
//		ponto.setLatitude(-8.054143);
//		ponto.setLongitude(-34.9535859);
//		pontoDAO.salvar(ponto);
//		System.out.println("1");
//		ponto.setLatitude(-8.054149);
//		ponto.setLongitude(-34.953507);
//		pontoDAO.salvar(ponto);
//		System.out.println("1");
//		ponto.setLatitude(-8.052876);
//		ponto.setLongitude(-34.953484);
//		pontoDAO.salvar(ponto);
//		System.out.println("1");
//		ponto.setLatitude(-8.052809);
//		ponto.setLongitude(-34.953479);
//		pontoDAO.salvar(ponto);
//		System.out.println("1");
//		ponto.setLatitude(-8.051752);
//		ponto.setLongitude(-34.953371);
//		pontoDAO.salvar(ponto);
//		System.out.println("1");
//		ponto.setLatitude(-8.05168);
//		ponto.setLongitude(-34.9533619);
//		pontoDAO.salvar(ponto);
//		System.out.println("1");
	}
}
