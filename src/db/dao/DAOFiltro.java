/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package db.dao;

import db.dao.DAO;
import model.Filtro;
import db.Conexion;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author DaddyChary
 */
public class DAOFiltro implements DAO<Filtro>{

    private Conexion conn;

    public DAOFiltro(Conexion conn) {
        this.conn = conn;
    }

    @Override
    public void create(Filtro t) throws SQLException {
    }

    @Override
    public void update(Filtro t) throws SQLException {
    }

    @Override
    public void delete(Filtro t) throws SQLException {
    }

    @Override
    public Filtro getOne(int id) throws SQLException {
    }

    @Override
    public List<Filtro> getAll() throws SQLException {
    }

}
