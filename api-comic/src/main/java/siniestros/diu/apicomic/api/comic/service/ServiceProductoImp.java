package siniestros.diu.apicomic.api.comic.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import siniestros.diu.apicomic.api.comic.entity.Producto;
import siniestros.diu.apicomic.api.comic.repository.ProductoRepository;

/**
 * Clase que implementa ServiceProducto
 * @author Kassandra Mirael
 * @version 1.0
 */
@Service
public class ServiceProductoImp implements ServiceProducto {
	
	@Autowired
	ProductoRepository productoRepository;
	
	@Autowired
	RestTemplate restTemplate;

	@Override
	public List<Producto> getProductos() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Producto getProducto(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Producto> getProductosByTags(List<String> tags) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void createProducto(Producto producto) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteProducto(Integer id) {
		// TODO Auto-generated method stub

	}

}
