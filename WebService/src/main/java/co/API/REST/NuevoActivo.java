package co.API.REST;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 * 
 * Clase encargada de recibir la petici�n de registrar un nuevo activo fijo.
 * 
 * @author DAVIDRUIZ
 *
 */
@Path("/nuevoActivo")
public class NuevoActivo {

	// M�todo encargado de procesar la solicitud de agregar un nuevo activo
	//------------------------------------------------------------------------
	@POST
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public String agregarActivo() {
		String strRespuesta = null;
		
		return strRespuesta;
	}
	//------------------------------------------------------------------------
}
