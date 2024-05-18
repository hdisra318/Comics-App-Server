package siniestros.diu.apicomic.api.comic.entity;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "Producto")
public class Producto {
	private Integer id;
	private String nombre;
	private String descripcion;
	private Float precio;
	private List<Producto> oferta;
}
