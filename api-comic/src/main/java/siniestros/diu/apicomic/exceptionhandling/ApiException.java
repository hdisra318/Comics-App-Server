package siniestros.diu.apicomic.exceptionhandling;

import org.springframework.http.HttpStatus;

/**
 * Calse que nos ayudara para enviar mensajes de error persoanlizados
 * como response
 * @author Kassandra Mirael
 * @version 1.0
 */
public class ApiException extends RuntimeException {
	private static final long serialVersionUID = 1L;
	
	private HttpStatus status;
	
	public ApiException(HttpStatus status, String mensaje) {
		super(mensaje);
		this.status = status;
	}
	
	/**
	 * MEtodo que regresa el Status
	 * @return El status
	 */
	public HttpStatus getStatus() {
		return status;
	}

	/**
	 * Metodo que asigna un nuevo status
	 * @param status El nuevo status
	 */
	public void setStatus(HttpStatus status) {
		this.status = status;
	}
}
