package co.API.REST;

import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.MediaType;

/**
 * 
 * Clase encarga de recibir la petición de modificar datos relevantes de activo fijo
 * 
 * - Serial
 * - Fecha de Baja
 * 
 * @author DAVIDRUIZ
 *
 */
@Path("/modificar")
public class ModificarActivo {

	// Método encargado de procesar la solicitud de modificar serial
	//------------------------------------------------------------------------
	@PUT
	@Path("/serial")
	@Produces(MediaType.APPLICATION_JSON)
	public String cambiarSerial(@Context HttpHeaders headers) {
		String strRespuesta = null;
		
		return strRespuesta;
	}
	//------------------------------------------------------------------------
	
	
	// Método encargado de procesar la solicitud de modificar fecha de baja
	//------------------------------------------------------------------------
	@PUT
	@Path("/fechaBaja")
	@Produces(MediaType.APPLICATION_JSON)
	public String cambiarFechaBaja(@Context HttpHeaders headers) {
		String strRespuesta = null;
		
		return strRespuesta;
	}
	//------------------------------------------------------------------------
}