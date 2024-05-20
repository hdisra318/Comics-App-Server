package siniestros.diu.apicomic.api.comic.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import siniestros.diu.apicomic.api.comic.entity.Producto;
import siniestros.diu.apicomic.api.comic.repository.ProductoRepository;
import siniestros.diu.apicomic.exceptionhandling.ApiException;

/**
 * Clase que implementa ServiceProducto
 * @author Kassandra Mirael
 * @version 1.0
 */
@Service
public class ServiceProductoImp implements ServiceProducto {
    public static final String LOG = "ServiceProductoImp";
	
	@Autowired
	ProductoRepository productoRepository;
	
	@Autowired
	RestTemplate restTemplate;

	@Override
	public List<Producto> getProductos() {
        final String log = "getProductos";
		try {
			List<Producto> productos = productoRepository.findAll();
			return productos;
		}catch(Exception e) {
			throw new ApiException(HttpStatus.NOT_FOUND,e.getLocalizedMessage());
		}
	}

	@Override
	public Producto getProducto(Integer id) {
        final String log = "getProducto";
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Producto> getProductosByTags(List<String> tags) {
        final String log = "getProductosByTags";
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void createProducto(Producto producto) {
        final String log = "createProducto";
		try {
			System.out.println("CREATEPRODUCTO "+ producto.toString());
			productoRepository.save(producto);
		}catch(Exception e) {
			throw new ApiException(HttpStatus.NOT_FOUND,e.getLocalizedMessage());
		}
		
	}

	@Override
	public void deleteProducto(Integer id) {
        final String log = "delateProducto";
		// TODO Auto-generated method stub

	}

}
