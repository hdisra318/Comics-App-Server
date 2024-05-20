package siniestros.diu.apicomic.api.comic.controller;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.validation.Valid;
import siniestros.diu.apicomic.api.comic.entity.Producto;
import siniestros.diu.apicomic.api.comic.service.ServiceProducto;
import siniestros.diu.apicomic.exceptionhandling.ApiException;

@RestController
@RequestMapping("/producto")
public class ControllerProducto {

	@Autowired
	ServiceProducto serviceProducto;
	
	@GetMapping
	public ResponseEntity<List<Producto>> getProductos(){
		return new ResponseEntity<>(serviceProducto.getProductos(),HttpStatus.OK);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Producto> getProducto(@PathVariable("id") Integer id){
		return new ResponseEntity<>(serviceProducto.getProducto(id),HttpStatus.OK);
	}
	
	@PostMapping
	public ResponseEntity<HttpStatus> createProducto(@Valid @RequestBody Producto producto, 
			BindingResult bindingResult){
		if(bindingResult.hasErrors()) {
			throw new ApiException(HttpStatus.BAD_REQUEST,bindingResult.getAllErrors().get(0).getDefaultMessage());
		}
		producto.setFechaCreacionHOLA(java.sql.Date.valueOf(LocalDateTime.now().toLocalDate()));
		serviceProducto.createProducto(producto);
		return new ResponseEntity<>(HttpStatus.CREATED);
	}
}
