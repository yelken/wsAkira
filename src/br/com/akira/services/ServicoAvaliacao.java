package br.com.akira.services;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

import br.com.akira.avaliacao.Avaliacao;
import br.com.akira.avaliacao.AvaliacaoDAO;
import br.com.akira.tipo.TipoProblema;

@Path("/avaliacao")
public class ServicoAvaliacao {

	@Path("{latitude}/{longitude}/{isOK}/{tipoProblema}")
	@GET
	@Produces("application/xml")
	public String inserirAvaliacao(
			@PathParam("latitude") Double latitude,
			@PathParam("longitude") Double longitude,
			@PathParam("isOK") boolean isOK,
			@PathParam("tipoProblema") String tipoProblema) {

		Avaliacao avaliacao = new Avaliacao();
		avaliacao.setLatitude(latitude);
		avaliacao.setLongitude(longitude);

		TipoProblema pTipoProblema = new TipoProblema();
		pTipoProblema.setDescricao(tipoProblema);

		avaliacao.setTipoProblema(pTipoProblema);
		avaliacao.setOk(isOK);
		AvaliacaoDAO avaliacaoDAO = new AvaliacaoDAO();
		avaliacaoDAO.salvar(avaliacao);
		return "<respostaServico>OK</respostaServico>";
	}

}
