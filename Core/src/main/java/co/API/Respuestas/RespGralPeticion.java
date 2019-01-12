package co.API.Respuestas;

public class RespGralPeticion {

	// Variable con información de Petición
	// ---------------------------------------------
	private int intCodHTTPPeticion;
	private String strMensajeHTTP;
	// ---------------------------------------------

	// Tratamiento de la petición HTTP.
	// ---------------------------------------------
	public void procesamientoPeticion(char chrServicio, char chrEstado, String strDescrExt) {

		// Servicio Nuevo Activo
		if (chrServicio == 'N') {
			switch (chrEstado) {
			case 'E':
				this.intCodHTTPPeticion = 200;
				this.strMensajeHTTP = Mensajes.RSP_HTTP_200;
				break;
			case 'F':
				this.intCodHTTPPeticion = 400;
				this.strMensajeHTTP = Mensajes.RSP_HTTP_400;
				break;
			default:
				this.intCodHTTPPeticion = 500;
				this.strMensajeHTTP = Mensajes.GNRSP_EXCPTN_500;
				break;
			}
		}

		// Servicio Actualizar Activo Fijo
		if (chrServicio == 'A') {
			switch (chrEstado) {
			case 'E':
				this.intCodHTTPPeticion = 200;
				this.strMensajeHTTP = Mensajes.RSP_HTTP_200;
				break;
			case 'F':
				this.intCodHTTPPeticion = 400;
				this.strMensajeHTTP = Mensajes.RSP_HTTP_400;
				break;
			default:
				this.intCodHTTPPeticion = 500;
				this.strMensajeHTTP = Mensajes.GNRSP_EXCPTN_500;
				break;
			}
		}

		// Servicio Buscar Todos los Activos Fijos
		if (chrServicio == 'T') {
			switch (chrEstado) {
			case 'E':
				this.intCodHTTPPeticion = 200;
				this.strMensajeHTTP = Mensajes.RSP_HTTP_200;
				break;
			case 'F':
				this.intCodHTTPPeticion = 400;
				this.strMensajeHTTP = Mensajes.RSP_HTTP_400;
				break;
			case 'S':
				this.intCodHTTPPeticion = 404;
				this.strMensajeHTTP = Mensajes.RSP_HTTP_404;
				break;
			default:
				this.intCodHTTPPeticion = 500;
				this.strMensajeHTTP = Mensajes.GNRSP_EXCPTN_500;
				break;
			}
		}

		// Servicio Buscar Clasificado los Activos Fijos
		if (chrServicio == 'C') {
			switch (chrEstado) {
			case 'E':
				this.intCodHTTPPeticion = 200;
				this.strMensajeHTTP = Mensajes.RSP_HTTP_200;
				break;
			case 'F':
				this.intCodHTTPPeticion = 400;
				this.strMensajeHTTP = Mensajes.RSP_HTTP_400;
				break;
			case 'S':
				this.intCodHTTPPeticion = 404;
				this.strMensajeHTTP = Mensajes.RSP_HTTP_404;
				break;
			default:
				this.intCodHTTPPeticion = 500;
				this.strMensajeHTTP = Mensajes.GNRSP_EXCPTN_500;
				break;
			}
		}

		// Servicio Listar Datos
		if (chrServicio == 'L') {
			switch (chrEstado) {
			case 'E':
				this.intCodHTTPPeticion = 200;
				this.strMensajeHTTP = Mensajes.RSP_HTTP_200;
				break;
			case 'F':
				this.intCodHTTPPeticion = 400;
				this.strMensajeHTTP = Mensajes.RSP_HTTP_400;
				break;
			case 'S':
				this.intCodHTTPPeticion = 404;
				this.strMensajeHTTP = Mensajes.RSP_HTTP_404;
				break;
			default:
				this.intCodHTTPPeticion = 500;
				this.strMensajeHTTP = Mensajes.GNRSP_EXCPTN_500;
				break;
			}
		}

		// Servicio Modificar Datos Activo Fijo
		if (chrServicio == 'M') {
			switch (chrEstado) {
			case 'E':
				this.intCodHTTPPeticion = 200;
				this.strMensajeHTTP = Mensajes.RSP_HTTP_200;
				break;
			case 'F':
				this.intCodHTTPPeticion = 400;
				this.strMensajeHTTP = Mensajes.RSP_HTTP_400;
				break;
			default:
				this.intCodHTTPPeticion = 500;
				this.strMensajeHTTP = Mensajes.GNRSP_EXCPTN_500;
				break;
			}
		}
	}
	// ---------------------------------------------
}