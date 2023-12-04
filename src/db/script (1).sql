/* 
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/SQLTemplate.sql to edit this template
 */
/**
 * Author:  morag
 * Created: 29-11-2023
 */

CREATE DATABASE navidad;
USE navidad;

CREATE TABLE users(
    id int AUTO_INCREMENT,
    nombre VARCHAR(20),
    rut VARCHAR(20) UNIQUE,
    PRIMARY KEY(id)
);

CREATE TABLE productos(
    id int AUTO_INCREMENT,
    nombre VARCHAR(20),
    precio int,
    descripcion TEXT,
    PRIMARY KEY(id)
);

CREATE TABLE ventas(
    id int AUTO_INCREMENT,
    producto_id_fk int,
    user_id_fk int,
    cantidad int,
    fecha DATE,
    PRIMARY KEY(id),
    FOREIGN KEY(producto_id_fk) REFERENCES productos(id),
    FOREIGN KEY(user_id_fk) REFERENCES users(id)
);