/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ControladorDB;

/**
 *
 * @author mikesb
 */

import Modelo.Banco.Departamento;
import Modelo.Banco.Empleado;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;



import Modelo.Banco.Departamento;
import Modelo.Banco.Empleado;
import Modelo.Banco.Usuario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class EmpleadoDB {

    private Connection con = null;
    private ResultSet rs = null;

    private static EmpleadoDB instancia;

    public static EmpleadoDB getInstancia() {
        if (instancia == null) {
            instancia = new EmpleadoDB();
        }
        return instancia;
    }

    public boolean LoginEmpleado(Empleado empleado) throws SQLException {

        PreparedStatement ps = null;
        con = Conexion.getInstancia().Conectar();

        try {
            ps = con.prepareStatement("call ExisteEmpleado(?)");
            ps.setString(1, empleado.getUsername());
            rs = ps.executeQuery();

            if (rs.next()) {

                if (empleado.getUsername().equalsIgnoreCase(rs.getString(1)) && empleado.getPassword().equals(rs.getString(4))) {

                    ps = con.prepareStatement("call ActualizarSesion(?,?);");
                    ps.setString(1, empleado.getLast_session());
                    ps.setString(2, empleado.getUsername());
                    ps.executeUpdate();

                    return true;
                } else {
                    return false;
                }

            }
            return false;
        } catch (SQLException e) {
            System.out.println("Problema al conectar a la base de datos!");
            e.getMessage();
            e.printStackTrace();
        } finally {
            con.close();
            ps.close();

        }
        return false;
    }

    public Empleado getEmpleado(Empleado usuario) throws SQLException {

        PreparedStatement ps = null;
        con = Conexion.getInstancia().Conectar();
        Departamento depart = new Departamento();

        
            try{
                ps = con.prepareStatement("call ExisteEmpleado(?);");
                ps.setString(1, usuario.getUsername());
                rs = ps.executeQuery();
                
                    if(rs.next()){
                        usuario.setUsername(rs.getString(1));
                        System.out.println(usuario.getUsername());
                        usuario.setNombre(rs.getString(2));
                        usuario.setApellido(rs.getString(3));
                        depart.setId_departamento(rs.getInt(5));
                        usuario.setDepartamento(depart);
                        
                        return usuario;
                        
                    }
                   
            }catch(SQLException e){
                System.out.println("No se pudo conectar a la base de Datos");
                e.getMessage();
                e.printStackTrace();
            }finally{
                con.close();
                ps.close();
            }
        try {
            ps = con.prepareStatement("call ExisteEmpleado(?);");
            ps.setString(1, usuario.getUsername());
            rs = ps.executeQuery();

            if (rs.next()) {
                usuario.setNombre(rs.getString(1));
                usuario.setNombre(rs.getString(2));
                usuario.setApellido(rs.getString(3));
                depart.setId_departamento(rs.getInt(5));
                usuario.setDepartamento(depart);

                return usuario;

            }

        } catch (SQLException e) {
            System.out.println("No se pudo conectar a la base de Datos");
            e.getMessage();
            e.printStackTrace();
        } finally {
            con.close();
            ps.close();
        }
        return usuario;
    }

    public boolean insertarEmpleado(Empleado empleado) throws SQLException {

        con = Conexion.getInstancia().Conectar();
        PreparedStatement ps = null;

        try {
            ps = con.prepareStatement("call InsertarEmpleado (?,?,?,?,?);");

            ps.setString(1, empleado.getUsername());
            ps.setString(2, empleado.getNombre());
            ps.setString(3, empleado.getApellido());
            ps.setString(4, empleado.getPassword());
            ps.setInt(5, empleado.getDepartamento().getId_departamento());
            ps.executeUpdate();
            return true;
        } catch (SQLException e) {
            System.out.println("No se puedo hacer la Insersion! ");
            e.getMessage();
            e.printStackTrace();
            return false;
        } finally {
            con.close();
            ps.close();
        }

    }

    public boolean existeEmpleado(String user) throws SQLException {
        con = Conexion.getInstancia().Conectar();
        PreparedStatement ps = null;
        try {
            ps = con.prepareStatement("call ExisteEmpleado(?)");
            ps.setString(1, user);
            rs = ps.executeQuery();
            if (rs.next()) {
                return true;
            }

        } catch (SQLException e) {
            e.printStackTrace();
            e.getMessage();
            return false;
        } finally {
            con.close();
            ps.close();
        }
        return false;
    }
}