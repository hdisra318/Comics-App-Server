package siniestros.diu.apicomic.api.comic.entity;

import com.fasterxml.jackson.annotation.JsonProperty;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Clase que modela la tabla multivaluada de Imagenes
 * @author Kassandra Mirael
 * @version 1.0
 */
@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "Imagen")
public class Imagen {
	
	@JsonProperty("imagen")
	@Column(name = "imagen", columnDefinition = "LONGBLOB")
	private Byte[] imagen;
}
