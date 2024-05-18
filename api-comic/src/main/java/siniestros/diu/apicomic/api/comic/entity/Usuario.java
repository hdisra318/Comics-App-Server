package siniestros.diu.apicomic.api.comic.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "Usuario")
public class Usuario {
	private String correo;
	private String contrasenna;
	private String nombre;
	private String APaterno;
	private String AMaterno;
	private String telefono;
	private Short edad;
}
