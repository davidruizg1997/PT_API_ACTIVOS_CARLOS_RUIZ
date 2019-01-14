package co.API.REST;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import co.API.NuevosActivos.ProcRegistrarActivo;
import co.API.Respuestas.RespGralPeticion;

/**
 * 
 * Clase encargada de recibir la petición de registrar un nuevo activo fijo.
 * 
 * @author DAVIDRUIZ
 *
 */
@Path("/nuevoActivo")
public class NuevoActivo {

	// Método encargado de procesar la solicitud de agregar un nuevo activo
	//------------------------------------------------------------------------
	@POST
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public String agregarActivo(String strJson) throws Exception {
		
		try {
			String strRespuesta = null;
			
			RespGralPeticion RespuestaGral=new RespGralPeticion();
			
			ProcRegistrarActivo procesarNuevo = new ProcRegistrarActivo(strJson, RespuestaGral);
			
			return strRespuesta;
		}catch(Exception ex) {
			throw(ex);
		}
	}
	//------------------------------------------------------------------------
}
