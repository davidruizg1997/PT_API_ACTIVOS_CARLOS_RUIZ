package co.API.Respuestas;

/**
 * 
 * Contiene los mensajes relacionados con las respuestas y diferentes excepciones.
 * 
 * @author DAVIDRUIZ
 *
 */
public class Mensajes {

	// Mensaje de errores ocurridos en la capa Backend
	//-----------------------------------------------
	public static final String GNRSP_EXCPTN_500 = "Error Interno de Procesamiento.";
	//-----------------------------------------------
	
	
	// Mensajes Estandarizados de respuestas HTTP
	//-----------------------------------------------
	public static final String RSP_HTTP_200 	= "Consulta realizada de Forma Exitosa";
	public static final String RSP_HTTP_400 	= "Datos Faltantes en el Proceso.";
	public static final String RSP_HTTP_404 	= "La busqueda realizada no obtuvo resultados.";
	//-----------------------------------------------
	
	
	// Mensajes JWT
	//-----------------------------------------------
	public static final String HEADER_NULL_EMPTY 	 = "La petición requiere JWT. Consuma el servicio /***** para obtenerlo.";
	//-----------------------------------------------
}