package co.API.REST;

import javax.ws.rs.Consumes;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.MediaType;

import co.API.CambiosActivos.ProcActualizarActivo;
import co.API.Respuestas.RespGralPeticion;

/**
 * 
 * Clase encargada de recibir la petición de actualizar datos de activo fijo.
 * 
 * @author DAVIDRUIZ
 *
 */
@Path("/actualizarActivo")
public class ActualizarActivo {

	// Método encargado de procesar la solicitud de agregar un nuevo activo
	//------------------------------------------------------------------------
	@PUT
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public String actualizarDatos(String strJson) throws Exception {
		try {
			String strRespuesta = null;
			
			RespGralPeticion RespuestaGral=new RespGralPeticion();
			
			ProcActualizarActivo procesarNuevo = new ProcActualizarActivo(strJson, RespuestaGral);
			
			return strRespuesta;
		}catch(Exception ex) {
			throw(ex);
		}
	}
}