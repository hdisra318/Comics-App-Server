package siniestros.diu.apicomic.api.comic.entity;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Clase que modela un producto
 * @author Kassandra Mirael
 * @version 1.0
 */
@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "Producto")
public class Producto {
	
	@Id
	@JsonProperty("id")
	@Column(name = "Id")
	private Integer id;
	
	@JsonProperty("nombre")
	@Column(name = "nombre")
	private String nombre;
	
	@JsonProperty("descripcion")
	@Column(name = "Descripcion")
	private String descripcion;
	
	@JsonProperty("precio")
	@Column(name = "Precio")
	private Float precio;
	
	@JsonProperty("imagen")
	@Valid
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "id")
	private List<Imagen> imagenes;
	
	/*@JsonProperty("oferta")
	private List<String> oferta;//Pensarlo mas a detalle al final
	*/
	
	@JsonProperty("tags")
	@Valid
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "id")
	private List<String> tags;
}
