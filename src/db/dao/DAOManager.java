/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package db.dao;

import db.Conexion;
import java.sql.SQLException;

/**
 *
 * @author DaddyChary
 */
public class DAOManager {

    private Conexion conn;
    private DAOProducto dProducto;
    private DAOVenta dVenta;
    private DAOUser dUser;
    private DAOFiltro dFiltro;

    public DAOManager() throws SQLException {
        conn = Conexion.getConexion();
        this.dProducto = new DAOProducto(conn);
        this.dVenta = new DAOVenta(conn);
        this.dUser = new DAOUser(conn);
    }

    public DAOProducto getdProducto() {
        return dProducto;
    }

    public DAOVenta getdVenta() {
        return dVenta;
    }

    public DAOUser getdUser() {
        return dUser;
    }

    public DAOFiltro getdFiltro() {
        return dFiltro;
    }

    
}
