package siniestros.diu.apicomic.api.comic.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import siniestros.diu.apicomic.api.comic.entity.Producto;

public interface ProductoRepository extends JpaRepository<Producto, Integer> {

}
