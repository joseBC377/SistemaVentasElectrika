package com.electrika.tech.dao.impl;

import com.electrika.tech.dao.DaoDistribuidor;
import com.electrika.tech.entidades.Distribuidor;
import java.util.List;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Connection;
import java.util.ArrayList;

import com.electrika.tech.util.ConectaBD;

public class DaoDistribuidorImpl implements DaoDistribuidor {

    private ConectaBD con;
    private String mensaje;

    public DaoDistribuidorImpl() {
        con = ConectaBD.getInstance();
    }
    
    
    @Override
    public String getMessage() {
        return mensaje;
    }

    @Override
    public List<Distribuidor> select() {
        List<Distribuidor> lista = null;
        StringBuilder sql = new StringBuilder();
        sql.append("SELECT ")
                .append("idDistribuidor,")
                .append("ruc,")
                .append("nombre,")
                .append("direccion,")
                .append("telefono")
                .append(" FROM Distribuidor");
        //try con recursos para no usar el finally
        //lo va a cerrar funcione o falle
        try (Connection c = con.getConexion()) {
            //PreparedStatement limpia de inyecciones a la secuencia sql
            PreparedStatement ps = c.prepareStatement(sql.toString());
            ResultSet rs = ps.executeQuery();
            lista = new ArrayList<>();
            //mientras exista un registro resultSet continúa
            while (rs.next()) {
                Distribuidor distribuidor = new Distribuidor();
                distribuidor.setIdDistribuidor(rs.getInt(1));
                distribuidor.setRuc(rs.getString(2));
                distribuidor.setNombre(rs.getString(3));
                distribuidor.setDireccion(rs.getString(4));
                distribuidor.setTelefono(rs.getString(5));
                lista.add(distribuidor);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return lista;
    }

    @Override
    public String insert(Distribuidor distribuidor) {
        StringBuilder sql = new StringBuilder();
        sql.append("INSERT INTO Distribuidor(")
                .append("ruc,")
                .append("nombre,")
                .append("direccion,")
                .append("telefono")
                .append(") VALUES (?,?,?,?)");

        try (Connection c = con.getConexion()) {

            PreparedStatement ps = c.prepareStatement(sql.toString());
            ps.setString(1, distribuidor.getRuc());
            ps.setString(2, distribuidor.getNombre());
            ps.setString(3, distribuidor.getDireccion());
            ps.setString(4, distribuidor.getTelefono());

            mensaje = (ps.executeUpdate() == 0) ? "No se actualizó" : null;

        } catch (Exception e) {
            mensaje = e.getMessage();
        }
        return mensaje;
    }

    @Override
    public String update(Distribuidor distribuidor) {
        StringBuilder sql = new StringBuilder();
        sql.append("UPDATE Distribuidor SET ")
                .append("ruc = ?,")
                .append("nombre = ?,")
                .append("direccion = ?,")
                .append("telefono = ?")
                .append(" WHERE idDistribuidor=?");

        try (Connection c = con.getConexion()) {
            PreparedStatement ps = c.prepareStatement(sql.toString());
            ps.setString(1, distribuidor.getRuc());
            ps.setString(2, distribuidor.getNombre());
            ps.setString(3, distribuidor.getDireccion());
            ps.setString(4, distribuidor.getTelefono());
            ps.setInt(5, distribuidor.getIdDistribuidor());

            mensaje = (ps.executeUpdate() == 0) ? "No se actualizó" : null;
        } catch (Exception e) {
            mensaje = e.getMessage();
        }
        return mensaje;
    }

    @Override
    public String delete(Integer id) {
        StringBuilder sql = new StringBuilder();
        sql.append("DELETE FROM Distribuidor ")
           .append("WHERE idDistribuidor = ?");
        try (Connection c = con.getConexion()) {
            PreparedStatement ps = c.prepareStatement(sql.toString());
            ps.setInt(1, id);
            mensaje = (ps.executeUpdate() == 0) ? "No se eliminó" : null;
        } catch (Exception e) {
            mensaje = e.getMessage();
        }
        return mensaje;
    }

    @Override
    public Distribuidor get(Integer id) {
        Distribuidor distri = null;
        StringBuilder sql = new StringBuilder();
        sql.append("SELECT ")
                .append("idDistribuidor,")
                .append("ruc,")
                .append("nombre,")
                .append("direccion,")
                .append("telefono")
                .append(" FROM Distribuidor")
                .append(" WHERE idDistribuidor =?");
        try (Connection c = con.getConexion()) {
            PreparedStatement ps = c.prepareStatement(sql.toString());
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                distri = new Distribuidor();
                distri.setIdDistribuidor(rs.getInt(1));
                distri.setRuc(rs.getString(2));
                distri.setNombre(rs.getString(3));
                distri.setDireccion(rs.getString(4));
                distri.setTelefono(rs.getString(5));
            }
        } catch (Exception e) {
            mensaje = e.getMessage();
        }
        return distri;
    }
}
