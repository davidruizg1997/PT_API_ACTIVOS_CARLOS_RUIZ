package co.API.Entities;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="AREAS")
public class Areas {
	
	@Id
	@Basic(optional = true)
	@Column(name="COD_AREA")
	private String strCodigoArea;
	
	@Basic(optional = true)
	@Column(name="NOM_AREA")
	private String strNombreArea;
	
	@Basic(optional = true)
	@Column(name="CIU_AREA")
	private String strCiudadArea;

	public String getStrCodigoArea() {
		return strCodigoArea;
	}

	public void setStrCodigoArea(String strCodigoArea) {
		this.strCodigoArea = strCodigoArea;
	}

	public String getStrNombreArea() {
		return strNombreArea;
	}

	public void setStrNombreArea(String strNombreArea) {
		this.strNombreArea = strNombreArea;
	}

	public String getStrCiudadArea() {
		return strCiudadArea;
	}

	public void setStrCiudadArea(String strCiudadArea) {
		this.strCiudadArea = strCiudadArea;
	}
	
}