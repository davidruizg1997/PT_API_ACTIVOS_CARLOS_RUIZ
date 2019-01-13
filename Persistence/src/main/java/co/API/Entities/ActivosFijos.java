package co.API.Entities;

import java.util.Date;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="ACTIVOS_FIJOS")
public class ActivosFijos {

	@Basic(optional = true)
	@Column(name="NOM_ACTI")
	private String strNombre;
	
	@Basic(optional = false)
	@Column(name="DES_ACTI")
	private String strDescripcion;
	
	@Column(name="TIP_ACTI")
	@Basic(optional = true)
	private String strTipo;
	
	@Id
	@Basic(optional = true)
	@Column(name="SER_ACTI")
	private String strSerial;
	
	@Basic(optional = true)
	@Column(name="NII_ACTI")
	private String strNumeroInventario;
	
	@Basic(optional = true)
	@Column(name="PES_ACTI")
	private double dlePeso;
	
	@Basic(optional = true)
	@Column(name="ALT_ACTI")
	private double dleAlto;
	
	@Basic(optional = true)
	@Column(name="ANC_ACTI")
	private double dleAncho;
	
	@Basic(optional = true)
	@Column(name="LAR_ACTI")
	private double dleLargo;
	
	@Basic(optional = true)
	@Column(name="VLC_ACTI")
	private double dleValCompra;
	
	@Basic(optional = true)
	@Column(name="FCC_ACTI")
	private Date dteFechaCompra;
	
	@Basic(optional = true)
	@Column(name="FCB_ACTI")
	private Date dteFechaBaja;
	
	@Basic(optional = true)
	@Column(name="EST_ACTI")
	private String strEstado;
	
	@Basic(optional = true)
	@Column(name="COL_ACTI")
	private String strColor;

	public String getStrNombre() {
		return strNombre;
	}

	public void setStrNombre(String strNombre) {
		this.strNombre = strNombre;
	}

	public String getStrDescripcion() {
		return strDescripcion;
	}

	public void setStrDescripcion(String strDescripcion) {
		this.strDescripcion = strDescripcion;
	}

	public String getStrTipo() {
		return strTipo;
	}

	public void setStrTipo(String strTipo) {
		this.strTipo = strTipo;
	}

	public String getStrSerial() {
		return strSerial;
	}

	public void setStrSerial(String strSerial) {
		this.strSerial = strSerial;
	}

	public String getStrNumeroInventario() {
		return strNumeroInventario;
	}

	public void setStrNumeroInventario(String strNumeroInventario) {
		this.strNumeroInventario = strNumeroInventario;
	}

	public double getDlePeso() {
		return dlePeso;
	}

	public void setDlePeso(double dlePeso) {
		this.dlePeso = dlePeso;
	}

	public double getDleAlto() {
		return dleAlto;
	}

	public void setDleAlto(double dleAlto) {
		this.dleAlto = dleAlto;
	}

	public double getDleAncho() {
		return dleAncho;
	}

	public void setDleAncho(double dleAncho) {
		this.dleAncho = dleAncho;
	}

	public double getDleLargo() {
		return dleLargo;
	}

	public void setDleLargo(double dleLargo) {
		this.dleLargo = dleLargo;
	}

	public double getDleValCompra() {
		return dleValCompra;
	}

	public void setDleValCompra(double dleValCompra) {
		this.dleValCompra = dleValCompra;
	}

	public Date getDteFechaCompra() {
		return dteFechaCompra;
	}

	public void setDteFechaCompra(Date dteFechaCompra) {
		this.dteFechaCompra = dteFechaCompra;
	}

	public Date getDteFechaBaja() {
		return dteFechaBaja;
	}

	public void setDteFechaBaja(Date dteFechaBaja) {
		this.dteFechaBaja = dteFechaBaja;
	}

	public String getStrEstado() {
		return strEstado;
	}

	public void setStrEstado(String strEstado) {
		this.strEstado = strEstado;
	}

	public String getStrColor() {
		return strColor;
	}

	public void setStrColor(String strColor) {
		this.strColor = strColor;
	}
	
}