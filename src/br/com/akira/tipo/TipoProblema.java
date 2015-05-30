package br.com.akira.tipo;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

import br.com.akira.basica.Basica;

@Entity
@Table(name="tipo_problema")
@Inheritance(strategy=InheritanceType.TABLE_PER_CLASS)  
@AttributeOverrides(value={  
        @AttributeOverride(name="id",column=@Column(name="id")),  
}) 
public class TipoProblema extends Basica {
	
	private String descricao;

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

}
