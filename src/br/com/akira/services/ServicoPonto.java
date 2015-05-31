package br.com.akira.services;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

import br.com.akira.ponto.Ponto;
import br.com.akira.ponto.PontoDAO;

@Path("/pontos")
public class ServicoPonto {

	@Path("{latitudeFrom}/{longitudeFrom}/{latitudeTo}/{longitudeTo}")
	@GET
	@Produces("application/xml")
	public String getPontosByPath(
			@PathParam("latitudeFrom") Double latitudeFrom,
			@PathParam("longitudeFrom") Double longitudeFrom,
			@PathParam("latitudeTo") Double latitudeTo,
			@PathParam("longitudeTo") Double longitudeTo) {
		
		Ponto pontoFrom = new Ponto();
		pontoFrom.setLatitude(latitudeFrom);
		pontoFrom.setLongitude(longitudeFrom);
		
		Ponto pontoTo = new Ponto();
		pontoTo.setLatitude(latitudeTo);
		pontoTo.setLongitude(longitudeTo);
		
		
		StringBuilder result = new StringBuilder();
		
		PontoDAO pdao = new PontoDAO();
		
		@SuppressWarnings("unchecked")
		List<Ponto> list = pdao
				.listByPath(latitudeFrom, longitudeFrom, latitudeTo, longitudeTo);

		result.append("<Pontos>");

		for (Ponto ponto : list) {
			result.append("<Ponto>");
			result.append("<latitude>");
			result.append(ponto.getLatitude());
			result.append("</latitude>");
			result.append("<longitude>");
			result.append(ponto.getLongitude());
			result.append("</longitude>");
			result.append("</Ponto>");
		}
		
		result.append("</Pontos>");
		
		return result.toString();
	}

}
