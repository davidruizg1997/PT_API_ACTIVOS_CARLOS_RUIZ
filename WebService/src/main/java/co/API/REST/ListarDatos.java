package co.API.REST;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.MediaType;

/**
 * 
 * Clase encargada de recibir la petici�n de Listar (�reas y Personas).
 * 
 * @author DAVIDRUIZ
 *
 */
@Path("/listarDatos")
public class ListarDatos {

	// M�todo encargado de procesar la solicitud de listar �reas y �rea especifica
	//------------------------------------------------------------------------
	@GET
	@Path("/areas")
	@Produces(MediaType.APPLICATION_JSON)
	public String listarAreas(@Context HttpHeaders headers) {
		String strRespuesta = null;
		
		return strRespuesta;
	}
	
	@GET
	@Path("/area/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public String listarArea(@Context HttpHeaders headers, @PathParam("id") String strId) {
		String strRespuesta = null;
		
		return strRespuesta;
	}
	//------------------------------------------------------------------------
	
	
	// M�todo encargado de procesar la solicitud de listar personas y persona especifica
	//------------------------------------------------------------------------
	@GET
	@Path("/personas")
	@Produces(MediaType.APPLICATION_JSON)
	public String listarPersonas(@Context HttpHeaders headers) {
		String strRespuesta = null;
		
		return strRespuesta;
	}
	
	@GET
	@Path("/persona/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public String listarPersona(@Context HttpHeaders headers, @PathParam("id") String strId) {
		String strRespuesta = null;
		
		return strRespuesta;
	}
	//------------------------------------------------------------------------
	
}