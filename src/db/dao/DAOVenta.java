/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package db.dao;

import db.dao.DAO;
import model.Venta;
import db.Conexion;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author DaddyChary
 */
public class DAOVenta implements DAO<Venta> {

    private Conexion conn;

    public DAOVenta(Conexion conn) {
        this.conn = conn;
    }

    @Override
    public void create(Venta t) throws SQLException {
        String sql = "INSERT INTO ventas (producto_id_fk, user_id_fk, cantidad, fecha) SELECT productos.id,"
                + " users.id, 123, '2023-12-25' FROM productos JOIN users ON users.id = productos.id WHERE productos.id = 2;";
        conn.execute(sql);
    }

    @Override
    public void update(Venta t) throws SQLException {
        String sql = "UPDATE ventas INNER JOIN productos ON ventas.producto_id_fk = productos.id "
                + "INNER JOIN users ON ventas.user_id_fk = users.id SET ventas.cantidad = 10,"
                + " ventas.fecha = '2023-12-03' WHERE ventas.id = 1";
        conn.execute(sql);
    }

    @Override
    public void delete(Venta t) throws SQLException {
        String sql = "DELETE ventas, productos, users FROM ventas"
                + " INNER JOIN productos ON ventas.producto_id_fk = productos.id INNER JOIN "
                + "users ON ventas.user_id_fk = users.id WHERE ventas.id = 1";
    }

    @Override
    public Venta getOne(int id) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<Venta> getAll() throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
