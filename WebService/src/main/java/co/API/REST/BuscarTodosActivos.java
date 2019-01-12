package co.API.REST;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 * 
 * Clase encargada de recibir la petición de Buscar Todos los Activos Fijos Registrados.
 * 
 * @author DAVIDRUIZ
 *
 */
@Path("/BuscarTodosActivos")
public class BuscarTodosActivos {

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public String buscarTodos() {
		String strRespuesta = null;
		
		return strRespuesta;
	}
}