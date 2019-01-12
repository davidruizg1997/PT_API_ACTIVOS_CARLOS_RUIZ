package co.API.REST;

import java.util.Date;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.MediaType;

/**
 * 
 * Clase encargada de recibir la petición de Buscar Activos Fijos por Clasificación:
 * 
 * - Tipo
 * - Fecha
 * - Serial
 * 
 * @author DAVIDRUIZ
 *
 */
@Path("/BuscarClasiActivos")
public class BuscarClasificadoActivos {

	// Método encargado de procesar la solicitud de buscar activos por tipo
	//------------------------------------------------------------------------
	@GET
	@Path("/tipo/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public String buscarXTipo(@Context HttpHeaders headers, @PathParam("id") String strId) {
		String strRespuesta = null;
		
		return strRespuesta;
	}
	//------------------------------------------------------------------------
	
	
	// Método encargado de procesar la solicitud de buscar activos por fecha
	//------------------------------------------------------------------------
	@GET
	@Path("/fecha/{date}")
	@Produces(MediaType.APPLICATION_JSON)
	public String buscarXFecha(@Context HttpHeaders headers, @PathParam("date") Date dteFecha) {
		String strRespuesta = null;
		
		return strRespuesta;
	}
	//------------------------------------------------------------------------
	
	
	// Método encargado de procesar la solicitud de buscar activos por serial
	//------------------------------------------------------------------------
	@GET
	@Path("/serial/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public String buscarXSerial(@Context HttpHeaders headers, @PathParam("id") String strId) {
		String strRespuesta = null;
		
		return strRespuesta;
	}
	//------------------------------------------------------------------------
}