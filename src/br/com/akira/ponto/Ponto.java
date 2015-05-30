package br.com.akira.ponto;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

import br.com.akira.basica.Basica;

@Entity
@Table(name="ponto")
@Inheritance(strategy=InheritanceType.TABLE_PER_CLASS)  
@AttributeOverrides(value={  
        @AttributeOverride(name="id",column=@Column(name="id")),  
})  
public class Ponto extends Basica {

	private Double latitude;
	private Double longitude;

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

}
