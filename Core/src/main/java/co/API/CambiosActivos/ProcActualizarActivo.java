package co.API.CambiosActivos;

import java.util.Date;

import co.API.Respuestas.RespGralPeticion;

public class ProcActualizarActivo {
	
	//Variables de Entrada
	//--------------------------------------
	private String 	strNombre;
	private String 	strDescripcion;
	private String 	strTipo;
	private String 	strSerial;
	private Integer intNumInventario;
	private Double 	dlePeso;
	private Double 	dleAlto;
	private Double 	dleAncho;
	private Double 	dleLargo;
	private Double 	dleValCompra;
	private Date	dteFechaCompra;
	private Date	dteFechaBaja;
	private String	strEstado;
	private String	strColor;  
	//--------------------------------------
	
	public ProcActualizarActivo(String strJson, RespGralPeticion vlRespGral) {
		
	}
}