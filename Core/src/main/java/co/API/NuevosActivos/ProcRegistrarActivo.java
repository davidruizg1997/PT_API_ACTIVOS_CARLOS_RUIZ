package co.API.NuevosActivos;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import co.API.Entities.ActivosFijos;
import co.API.Respuestas.RespGralPeticion;

public class ProcRegistrarActivo {
	
	// Variables de entrada
	//----------------------------------
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
	//----------------------------------
	
	// Variables de Proceso y/o Salida
	//----------------------------------
	private RespGralPeticion vgRespuestaGral;
	//----------------------------------
	
	public ProcRegistrarActivo(String strJson, RespGralPeticion vlRespuestaGral) throws Exception {
		try {
			ObjectMapper mapper = new ObjectMapper();
			Map<String, Object> map = new HashMap<String, Object>();
			
			
			map=mapper.readValue(strJson, new TypeReference<Map<String, String>>() {});
			
			
			this.strNombre = String.valueOf(map.get("nombre"));
			this.strDescripcion = String.valueOf(map.get("descripcion"));
			this.strTipo = String.valueOf(map.get("tipo"));
			this.strSerial = String.valueOf(map.get("serial"));
			this.intNumInventario = Integer.parseInt(String.valueOf(map.get("numInventario")));
			this.dlePeso = Double.parseDouble(String.valueOf(map.get("peso")));
			this.dleAlto = Double.parseDouble(String.valueOf(map.get("alto")));
			this.dleAncho = Double.parseDouble(String.valueOf(map.get("ancho")));
			this.dleLargo = Double.parseDouble(String.valueOf(map.get("largo")));
			this.dleValCompra = Double.parseDouble(String.valueOf(map.get("valorCompra")));
			this.dteFechaCompra = new SimpleDateFormat("dd-MM-yyyy").parse(String.valueOf(map.get("fechaCompra")));
			this.dteFechaBaja = new SimpleDateFormat("dd-MM-yyyy").parse(String.valueOf(map.get("fechaBaja")));
			this.strEstado = String.valueOf(map.get("estado"));
			this.strColor = String.valueOf(map.get("color"));
		}catch(Exception ex) {
			throw(ex);
		}
	}
	
	public ActivosFijos procesarNuevo() throws Exception {
		
		ActivosFijos activo = null;
		
		try {
			if(strNombre!=null && strTipo!=null && intNumInventario!=null && dlePeso!=null && dleAlto!=null && dleAncho!=null && dleLargo!=null && dleValCompra!=null && dteFechaCompra!=null && dteFechaBaja!=null && strEstado!=null && strColor!=null) {
				activo.setStrNombre(strNombre);
				if(strDescripcion==null) {
					
				}else {
					activo.setStrDescripcion(strDescripcion);
				}
				activo.setStrTipo(strTipo);
				activo.setIntNumeroInventario(intNumInventario);
				activo.setDlePeso(dlePeso);
				activo.setDleAlto(dleAlto);
				activo.setDleAncho(dleAncho);
				activo.setDleLargo(dleLargo);
				activo.setDleValCompra(dleValCompra);
				activo.setDteFechaCompra(dteFechaCompra);
				activo.setDteFechaBaja(dteFechaBaja);
				activo.setStrEstado(strEstado);
				activo.setStrColor(strColor);
			}else {
				
			}
			
			return activo;
		}catch(Exception ex) {
			throw(ex);
		}
	}
	
}