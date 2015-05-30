package br.com.akira.avaliacao;

import br.com.akira.basica.Basica;
import br.com.akira.tipo.TipoProblema;

public class Avaliacao extends Basica {

	private Double latitude;
	private Double longitude;
	private TipoProblema tipoProblema;

	public Double getLatitude() {
		return latitude;
	}

	public void setLatitude(Double latitude) {
		this.latitude = latitude;
	}

	public Double getLongitude() {
		return longitude;
	}

	public void setLongitude(Double longitude) {
		this.longitude = longitude;
	}

	public TipoProblema getTipoProblema() {
		return tipoProblema;
	}

	public void setTipoProblema(TipoProblema tipoProblema) {
		this.tipoProblema = tipoProblema;
	}

}
