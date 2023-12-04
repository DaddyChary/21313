/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package db.dao;

import db.dao.DAO;
import model.Producto;
import model.Usuario;
import db.Conexion;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author DaddyChary
 */
public class DAOUser implements DAO<Usuario> {

    private Conexion conn;

    public DAOUser(Conexion conn) {
        this.conn = conn;
    }

    @Override
    public void create(Usuario t) throws SQLException {
        String sql = "INSERT INTO users VALUES(null,'" + t.getName() + "','" + t.getRut() + "')";
        conn.execute(sql);
    }

    @Override
    public void update(Usuario t) throws SQLException {
        String sql = "UPDATE users SET id ='" + t.getId() + "',nombre='" + t.getName() + "',rut='" + t.getRut() + "' WHERE id = '" + t.getId() + "'";
        conn.execute(sql);
    }

    @Override
    public void delete(Usuario t) throws SQLException {
        String sql = "DELETE FROM users WHERE id='" + t.getId() + "'";
        conn.execute(sql);
    }

    @Override
    public Usuario getOne(int id) throws SQLException {
        String sql = "SELECT * FROM users WHERE id =" + id + "";
        ResultSet rs = conn.execute(sql);
        Usuario usuario = new Usuario();
        if (rs.next()) {
            usuario.setId(rs.getInt("id"));
            usuario.setName(rs.getString("nombre"));
            usuario.setRut(rs.getString("rut"));
        }
        conn.close();
        return usuario;
    }

    @Override
    public List<Usuario> getAll() throws SQLException {
        String sql = "SELECT * FROM users";
        ResultSet rs = conn.execute(sql);

        List<Usuario> listadeUsuarios = new ArrayList<>();

        while (rs.next()) {
            Usuario usuario = new Usuario();

            usuario.setId(rs.getInt(rs.getString("id")));
            usuario.setName(rs.getString("nombre"));
            usuario.setRut(rs.getString("rut"));
            listadeUsuarios.add(usuario);

        }
        conn.close();
        return listadeUsuarios;
    }

    public Usuario getOne(String rut) throws SQLException {
        String sql = "SELECT * FROM users WHERE rut ='" + rut + "'";
        ResultSet rs = conn.execute(sql);
        Usuario usuario = new Usuario();
        if (rs.next()) {
            usuario.setId(rs.getInt("id"));
            usuario.setName(rs.getString("nombre"));
            usuario.setRut(rs.getString("rut"));
        }
        conn.close();
        return usuario;
    }
}
