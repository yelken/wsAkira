package br.com.akira.avaliacao;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import br.com.akira.basica.Basica;
import br.com.akira.tipo.TipoProblema;

@Entity
@Table(name = "avaliacao_pontos")
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
@AttributeOverrides(value = { @AttributeOverride(name = "id", column = @Column(name = "id")), })
public class Avaliacao extends Basica {

	private Double latitude;
	private Double longitude;
	
	@OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "tipo_ProblemaId")
	private TipoProblema tipoProblema;
	
	private boolean isOk;

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

	public boolean isOk() {
		return isOk;
	}

	public void setOk(boolean isOk) {
		this.isOk = isOk;
	}

}
