package co.API.Entities;

import java.util.Date;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="PERSONAS")
public class Personas {

	@Id
	@Basic(optional = true)
	@Column(name="ID_PERS")
	private String strIDPersona;
	
	@Basic(optional = true)
	@Column(name="FCN_PERS")
	private Date dteFechaNacimiento;
	
	@Basic(optional = true)
	@Column(name="NOM_PERS")
	private String strNombrePersona;
	
	@Basic(optional = true)
	@Column(name="APE_PERS")
	private String strApellidoPersona;
	
	@Basic(optional = true)
	@Column(name="DIR_PERS")
	private String strDireccionPersona;
	
	@Basic(optional = true)
	@Column(name="CIU_PERS")
	private String strCiudadPersona;
	
	@Basic(optional = true)
	@Column(name="ARE_PERS")
	private String strAreaPersona;

	public String getStrIDPersona() {
		return strIDPersona;
	}

	public void setStrIDPersona(String strIDPersona) {
		this.strIDPersona = strIDPersona;
	}

	public Date getDteFechaNacimiento() {
		return dteFechaNacimiento;
	}

	public void setDteFechaNacimiento(Date dteFechaNacimiento) {
		this.dteFechaNacimiento = dteFechaNacimiento;
	}

	public String getStrNombrePersona() {
		return strNombrePersona;
	}

	public void setStrNombrePersona(String strNombrePersona) {
		this.strNombrePersona = strNombrePersona;
	}

	public String getStrApellidoPersona() {
		return strApellidoPersona;
	}

	public void setStrApellidoPersona(String strApellidoPersona) {
		this.strApellidoPersona = strApellidoPersona;
	}

	public String getStrDireccionPersona() {
		return strDireccionPersona;
	}

	public void setStrDireccionPersona(String strDireccionPersona) {
		this.strDireccionPersona = strDireccionPersona;
	}

	public String getStrCiudadPersona() {
		return strCiudadPersona;
	}

	public void setStrCiudadPersona(String strCiudadPersona) {
		this.strCiudadPersona = strCiudadPersona;
	}

	public String getStrAreaPersona() {
		return strAreaPersona;
	}

	public void setStrAreaPersona(String strAreaPersona) {
		this.strAreaPersona = strAreaPersona;
	}
	
}
