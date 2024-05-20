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
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Clase que modela un usuario de la base de datos
 * @author Kassandra Mirael
 * @version 1.0
 */
@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "Usuario")
public class Usuario {
	
	@Id
	@JsonProperty("correo")
	@Column(name = "Correo")
	@NotNull
	@NotEmpty(message = "Se requiere un correo")
	@Pattern(regexp = "[a-zA-Z0-9]*", message = "El correo debe tener el formato correcto")
	private String correo;
	
	@JsonProperty("contrasenna")
	@Column(name = "Contrasenna")
	@NotEmpty(message = "Se requiere una contrasenna")
	private String contrasenna;
	
	@JsonProperty("nombre")
	@Column(name = "Nombre")
	@NotEmpty(message = "Se requiere un nombre")
	private String nombre;
	
	@JsonProperty("apellido_paterno")
	@Column(name = "APaterno")
	@NotEmpty(message = "Se requiere un apellido Paterno")
	private String APaterno;
	
	@JsonProperty("apellido_materno")
	@Column(name = "AMaterno")
	@NotEmpty(message = "Se requiere un apellido Materno")
	private String AMaterno;
	
	@JsonProperty("telefono")
	@Column(name = "Telefono")
	@NotEmpty(message = "Se requiere un telefono")
	private String telefono;
	
	@JsonProperty("edad")
	@Column(name = "Edad")
	@NotEmpty(message = "Se requiere una edad")
	private Short edad;
	
	@JsonProperty("lista_de_deseos")
	@Valid
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "id")
	private List<Producto> listaDeDeseos;
}
