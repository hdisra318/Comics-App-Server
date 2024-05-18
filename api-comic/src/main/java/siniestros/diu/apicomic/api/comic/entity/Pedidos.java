package siniestros.diu.apicomic.api.comic.entity;

import jakarta.persistence.Id;

public class Pedidos {
	@Id
	private Integer pedidoId;
	private Usuario correo;
}
