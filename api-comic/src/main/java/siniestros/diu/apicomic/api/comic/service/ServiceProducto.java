package siniestros.diu.apicomic.api.comic.service;

import java.util.List;

import siniestros.diu.apicomic.api.comic.entity.Producto;

/**
 * Servicio para los productos
 * @author Kassandra Mirael
 * @version 1.0
 */
public interface ServiceProducto {
	
	/**
	 * Metodo que devuelve todos los productos
	 * @return Todos los productos
	 */
	public List<Producto> getProductos();
	
	/**
	 * Metodo que regresa un producto mediante el id
	 * @param id El Id del producto
	 * @return El producto en cuestion
	 */
	public Producto getProducto(Integer id);
	
	/**
	 * Metodo que regresa los productos mediante los tags
	 * @return Los productos en cuestion
	 */
	public List<Producto> getProductosByTags(List<String> tags);
	
	/**
	 * Metodo que crea un producto
	 * @param producto El producto a Crear
	 */
	public void createProducto(Producto producto);
	
	/**
	 * Metodo que elimina un producto de acuerdo a su id
	 * @param id El id del producto
	 */
	public void deleteProducto(Integer id);
}
