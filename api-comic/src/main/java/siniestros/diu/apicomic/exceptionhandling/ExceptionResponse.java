package siniestros.diu.apicomic.exceptionhandling;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;

import com.fasterxml.jackson.annotation.JsonFormat;

/**
 * Clase que fungira como response de acuerdo a la excepcion generada
 * @author Kassandra Mirael
 * @version 1.0
 */
public class ExceptionResponse {
	
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern="dd-MM-yyyy hh:mm:ss")
	private LocalDateTime timeStamp;
	private Integer status;
	private HttpStatus error;
	private String message;
	private String path;
	
	/**
	 * Metodo constructor
	 */
	public ExceptionResponse() {
		this.timeStamp = LocalDateTime.now();
	}

	/**
	 * Metodo constructor
	 * @param timeStamp La fecha
	 * @param status El status
	 * @param error El error generado
	 * @param message El mensaje a dar
	 * @param path La ruta
	 */
	public ExceptionResponse(LocalDateTime timeStamp, Integer status, HttpStatus error, String message, String path) {
		super();
		this.timeStamp = timeStamp;
		this.status = status;
		this.error = error;
		this.message = message;
		this.path = path;
	}

	/**
	 * Metodo que retorna el timestamp
	 * @return El time stamp
	 */
	public LocalDateTime getTimeStamp() {
		return timeStamp;
	}
	
	/**
	 * Metodo que obtiene el status
	 * @return El status
	 */
	public Integer getStatus() {
		return status;
	}
	
	/**
	 * Metodo que retorna el error
	 * @return El error
	 */
	public HttpStatus getError() {
		return error;
	}

	/**
	 * Metodo que retorna el menssage
	 * @return El mensaje
	 */
	public String getMessage() {
		return message;
	}
	
	/**
	 * Metodo que obtiene el path
	 * @return El path
	 */
	public String getPath() {
		return path;
	}
	
	/**
	 * Metodo que asigna nuevo time stamp
	 * @param timeStamp El nuevo time stamp
	 */
	public void setTimeStamp(LocalDateTime timeStamp) {
		this.timeStamp = timeStamp;
	}
	
	/**
	 * Metodo que asigna un nuevo status
	 * @param status El nuevo status
	 */
	public void setStatus(Integer status) {
		this.status = status;
	}

	/**
	 * Metodo que asigna un nuevo error
	 * @param error El nuevo error
	 */
	public void setError(HttpStatus error) {
		this.error = error;
	}

	/**
	 * Metodo que asigna un nuevo mensaje
	 * @param message El nuevo mensaje
	 */
	public void setMessage(String message) {
		this.message = message;
	}

	/**
	 * Metodo que asigna un nuevo path
	 * @param path El nuevo Path
	 */
	public void setPath(String path) {
		this.path = path;
	}

}
