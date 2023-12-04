/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package db.dao;

import db.dao.DAO;
import model.Venta;
import db.Conexion;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Date;
import java.util.List;
import java.util.ArrayList;

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
        String sql = "INSERT INTO ventas (id, producto_id_fk, user_id_fk, cantidad, fecha) VALUES (null, " + t.getProductID() + ", " + t.getUserID() + "," + t.getAmount() + ", NOW())";
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
        String sql = "SELECT * FROM ventas WHERE id =" + id + "";
        ResultSet rs = conn.execute(sql);

        Venta venta = new Venta();

        if (rs.next()) {
            venta.setId(rs.getInt("id"));
            venta.setProductID(rs.getInt("producto_id_fk"));
            venta.setUserID(rs.getInt("user_id_fk"));
            venta.setAmount(rs.getInt("cantidad"));
            venta.setFecha(rs.getDate("fecha"));
        }
        conn.close();
        return venta;
    }

    @Override
    public List<Venta> getAll() throws SQLException {
        String sql = "SELECT * FROM ventas";
        ResultSet rs = conn.execute(sql);

        List<Venta> listadeVenta = new ArrayList<>();

        while (rs.next()) {
            Venta venta = new Venta();

            venta.setId(rs.getInt("id"));
            venta.setProductID(rs.getInt("producto_id_fk"));
            venta.setUserID(rs.getInt("user_id_fk"));
            venta.setAmount(rs.getInt("cantidad"));
            venta.setFecha(rs.getDate("fecha"));
            listadeVenta.add(venta);

        }
        conn.close();
        return listadeVenta;
    }

    public List<Venta> getAll(Date fecha_Start, Date fecha_end) throws SQLException {
        String sql = "SELECT ventas.id,productos.nombre AS nombreProducto,users.nombre AS nombreUsuario,ventas.cantidad,ventas.fecha FROM "
                + "ventas INNER JOIN productos ON ventas.producto_id_fk = productos.id "
                + "INNER JOIN users ON ventas.user_id_fk = users.id WHERE fecha BETWEEN '" + fecha_Start + "' AND '" + fecha_end + "'";
        //System.out.println(sql);
        ResultSet rs = conn.execute(sql);

        List<Venta> listaVenta = new ArrayList<>();

        while (rs.next()) {
            Venta venta = new Venta();

            venta.setId(rs.getInt("id"));
            venta.setProductName(rs.getString("nombreProducto"));
            venta.setUserName(rs.getString("nombreUsuario"));
            venta.setAmount(rs.getInt("cantidad"));
            venta.setFecha(rs.getDate("fecha"));

            listaVenta.add(venta);

        }
        conn.close();
        return listaVenta;
    }

    public int getTotalVentas(Date fecha_Start, Date fecha_end) throws SQLException {
        String sql = "SELECT SUM(precio * cantidad) AS total_ventas FROM ventas INNER JOIN productos "
                + "ON ventas.producto_id_fk = productos.id WHERE fecha BETWEEN '" + fecha_Start + "' AND '" + fecha_end + "';";
        //System.out.println(sql);
        ResultSet rs = conn.execute(sql);

        int ventaTotal = 0;

        while (rs.next()) {

            ventaTotal = (rs.getInt("total_ventas"));

        }
        conn.close();
        return ventaTotal;

    }

}
