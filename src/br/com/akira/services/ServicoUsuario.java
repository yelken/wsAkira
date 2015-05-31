package br.com.akira.services;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

@Path("/usuarios")
public class ServicoUsuario {
	
	@Path("{usuario}/{senha}/{nome}/{cpf}/{facebook}")
	@GET
	@Produces("application/xml")
	public String inserirUsuario() {
		return null;
	}

}
