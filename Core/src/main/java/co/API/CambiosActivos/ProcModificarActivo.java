package co.API.CambiosActivos;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import co.API.Respuestas.RespGralPeticion;

public class ProcModificarActivo {

	// Variables de Entrada
	// ----------------------------------
	private String strSerialActual;
	private String strSerialNuevo;
	private Date dteFechaBajaActual;
	private Date dteFechaBajaNuevo;
	// ----------------------------------

	
	// Variables de Proceso y/o Salida
	// ----------------------------------
	private RespGralPeticion vgRespuestaGral;
	// ----------------------------------

	
	public ProcModificarActivo(String strJson, RespGralPeticion respuestaGral) throws Exception {
		try {
			ObjectMapper mapper = new ObjectMapper();
			Map<String, Object> map = new HashMap<String, Object>();
			
			
			map=mapper.readValue(strJson, new TypeReference<Map<String, String>>() {});
			
			this.strSerialActual = String.valueOf(map.get("serialActual"));
			this.strSerialNuevo = String.valueOf(map.get("serialNuevo"));
			this.dteFechaBajaActual = new SimpleDateFormat("dd-MM-yyyy").parse(String.valueOf(map.get("fechaBajaActual")));
			this.dteFechaBajaNuevo = new SimpleDateFormat("dd-MM-yyyy").parse(String.valueOf(map.get("fechaBajaNuevo")));
		} catch (Exception ex) {
			throw (ex);
		}
	}
	
	public RespGralPeticion procesarModificacion() throws Exception {
		
		try {
			RespGralPeticion respuestaGral = null;
			
			
			
			return respuestaGral;
		}catch(Exception ex) {
			throw(ex);
		}
		
	}
}