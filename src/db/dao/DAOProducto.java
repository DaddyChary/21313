/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package db.dao;

import db.dao.DAO;
import model.Producto;
import db.Conexion;
import java.sql.ResultSet;
import java.sql.SQLException;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author DaddyChary
 */
public class DAOProducto implements DAO<Producto> {

    private Conexion conn;

    public DAOProducto(Conexion conn) {
        this.conn = conn;

    }

    @Override
    public void create(Producto t) throws SQLException {
        String sql = "INSERT INTO productos VALUES(" + t.getId() + ",'" + t.getName() + "'," + t.getPrice() + ",'" + t.getDescription() + "')";
        conn.execute(sql);
    }

    @Override
    public void update(Producto t) throws SQLException {
        String sql = "UPDATE productos SET id =" + t.getId() + ",nombre='" + t.getName() + "',precio=" + t.getPrice() + ",descripcion='" + t.getDescription() + "' WHERE id = " + t.getId();
        conn.execute(sql);
    }

    @Override
    public void delete(Producto t) throws SQLException {
        String sql = "DELETE FROM productos WHERE id=" + t.getId();
        conn.execute(sql);
    }

    @Override
    public Producto getOne(int id) throws SQLException {
        String sql = "SELECT * FROM productos WHERE id=" + id;
        ResultSet rs = conn.execute(sql);

        Producto producto = null;
        
        if (rs.next()) {
            producto = new Producto();

            producto.setId(rs.getInt("id"));
            producto.setName(rs.getString("nombre"));
            producto.setPrice(rs.getInt("precio"));
            producto.setDescription(rs.getString("descripcion"));
 
        }

        return producto;

    }

    @Override
    public List<Producto> getAll() throws SQLException {

        String sql = "SELECT * FROM productos";
        ResultSet rs = conn.execute(sql);

        List<Producto> listadeProductos = new ArrayList<>();

        while (rs.next()) {
            Producto producto = new Producto();

            producto.setId(rs.getInt(("id")));
            producto.setName(rs.getString("nombre"));
            producto.setPrice(rs.getInt(("precio")));
            producto.setDescription(rs.getString("descripcion"));
            listadeProductos.add(producto);

        }
        conn.close();
        return listadeProductos;

    }
}
