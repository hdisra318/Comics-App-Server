CREATE DATABASE IF NOT EXISTS `Tienda`;
#DROP DATABASE `Tienda`;
USE `Tienda`;

CREATE TABLE `Usuario` (
  `Correo` varchar(255) PRIMARY KEY,
  `Username` varchar(255),
  `Contrasenna` varchar(255),
  `Nombre` varchar(255),
  `APaterno` varchar(255),
  `AMaterno` varchar(255),
  `Telefono` varchar(255),
  `Edad` integer,
  `Tipo` integer,
  `FechaCreacion` date
);

CREATE TABLE `Producto` (
  `Id` integer PRIMARY KEY AUTO_INCREMENT,
  `Nombre` varchar(255),
  `Descripcion` varchar(255),
  `Precio` float,
  `Cantidad` integer,
  `FechaCreacion` date
);

CREATE TABLE `Imagen` (
  `Id` integer,
  `imagen` longblob
);

CREATE TABLE `Tag` (
  `Id` integer,
  `tag` varchar(255)
);

ALTER TABLE `Imagen` ADD FOREIGN KEY (`Id`) REFERENCES `Producto` (`Id`);

ALTER TABLE `Tag` ADD FOREIGN KEY (`Id`) REFERENCES `Producto` (`Id`);


