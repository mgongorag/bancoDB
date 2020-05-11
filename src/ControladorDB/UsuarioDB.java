package ControladorDB;

import Modelo.Banco.Cuenta;
import Modelo.Banco.CuentaAhorro;
import Modelo.Banco.CuentaMonetaria;
import Modelo.Banco.Departamento;
import Modelo.Banco.Usuario;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import javax.swing.table.DefaultTableModel;

public class UsuarioDB {

    private Connection con = null;
    private ResultSet rs = null;

    private static UsuarioDB instancia;

    public static UsuarioDB getInstancia() {
        if (instancia == null) {
            instancia = new UsuarioDB();
        }
        return instancia;
    }

    /*<--------------METODO PARA INSERTAR UN USUARIO ----------------->*/
    public void insertarUsuario(Usuario usuario) throws SQLException {

        con = Conexion.getInstancia().Conectar();
        PreparedStatement ps = null;

        try {
            ps = con.prepareStatement("call insertarUsuario(?,?,?,?,?)");

            ps.setString(1, usuario.getDPI());
            ps.setString(2, usuario.getNombre());
            ps.setString(3, usuario.getApellido());
            ps.setString(4, usuario.getTelefono());
            ps.setString(5, String.valueOf(usuario.getGenero()));
            ps.executeUpdate();
        } catch (SQLException e) {
            System.out.println("No se puedo hacer la Insercion! ");
            e.getMessage();
            e.printStackTrace();
        } finally {
            con.close();
            ps.close();
        }

    }

    /*<-----------------------METODO PARA INSERTAR CUENTA DE AHORRO-------------------->*/
    public void insertarCuentaA(CuentaAhorro cuenta) throws SQLException {
        UsuarioDB usuarioDB = new UsuarioDB();
        con = Conexion.getInstancia().Conectar();
        PreparedStatement ps = null;

        usuarioDB.insertarUsuario(cuenta.getUser());

        try {
            ps = con.prepareStatement("call InsertarCuenta(?,?,?,?,?);");
            ps.setString(1, cuenta.getNumeroCuenta());
            ps.setDouble(2, cuenta.getSaldo());
            ps.setString(3, cuenta.getUser().getDPI());
            ps.setInt(4, cuenta.getId_tipoCuenta());
            ps.setString(5, null);
            ps.executeUpdate();
        } catch (SQLException e) {
            System.out.println("No se pudo hacer la consulta");
            e.printStackTrace();
            e.getMessage();
        } finally {
            con.close();
            ps.close();

        }

    }

    /*<-----------------------METODO PARA INSERTAR CUENTA MONETARIA-------------------->*/
    public void insertarCuentaM(CuentaMonetaria cuenta) throws SQLException {
        UsuarioDB usuarioDB = new UsuarioDB();
        con = Conexion.getInstancia().Conectar();
        PreparedStatement ps = null;

        usuarioDB.insertarUsuario(cuenta.getUser());

        try {
            ps = con.prepareStatement("call InsertarCuenta(?,?,?,?,?) ");
            ps.setString(1, cuenta.getNumeroCuenta());
            ps.setDouble(2, cuenta.getSaldo());
            ps.setString(3, cuenta.getUser().getDPI());
            ps.setInt(4, cuenta.getId_tipoCuenta());
            ps.setString(5, cuenta.getNumeroChequera());
            ps.executeUpdate();
        } catch (SQLException e) {
            System.out.println("No se pudo hacer la insersion");
            e.printStackTrace();
            e.getMessage();
        } finally {
            ps.close();
            con.close();
        }

    }

    public boolean existeUsuario(String dpi) throws SQLException {
        con = Conexion.getInstancia().Conectar();
        PreparedStatement ps = null;
        try {
            ps = con.prepareStatement("call ExisteUsuario(?);");
            ps.setString(1, dpi);
            rs = ps.executeQuery();
            if (rs.next()) {
                return true;
            } else {
                return false;
            }

        } catch (SQLException e) {
            System.out.println("El error esta en existeUsuario");
            e.printStackTrace();
            e.getMessage();
        } finally {
            con.close();
            ps.close();

        }

        return false;

    }

    public Usuario buscarUsuario(String dpi) throws SQLException {
        PreparedStatement ps = null;
        con = Conexion.getInstancia().Conectar();
        Usuario usuario = new Usuario();
        try {
            ps = con.prepareStatement("call ExisteUsuario(?);");
            ps.setString(1, dpi);
            rs = ps.executeQuery();
            if (rs.next()) {

                usuario.setDPI(rs.getString(1));
                usuario.setNombre(rs.getString(2));
                usuario.setApellido(rs.getString(3));
                usuario.setTelefono(rs.getString(4));
                usuario.setGenero(rs.getString(5).charAt(0));

                return usuario;
            }
        } catch (SQLException e) {

            e.printStackTrace();
            e.getMessage();
        } finally {
            con.close();
            ps.close();
        }

        return usuario;

    }

    public int numerUsuarios() throws SQLException {

        con = Conexion.getInstancia().Conectar();
        PreparedStatement ps = null;

        try {
            ps = con.prepareStatement("call TotalUsuarios()");
            rs = ps.executeQuery();

            if (rs.next()) {
                return rs.getInt("num");
            } else {
                return 0;
            }

        } catch (SQLException e) {
            System.out.println("No se pudo obtener el total de usuarios");
            e.getMessage();
            e.printStackTrace();
            return 0;
        } finally {
            con.close();
            ps.close();
        }
    }

    public boolean actualizarUsuario(Usuario usuario) throws SQLException {
        con = Conexion.getInstancia().Conectar();
        PreparedStatement ps = null;

        try {
            ps = con.prepareStatement("call ActualizarUsuario(?,?,?,?,?);");

            ps.setString(1, usuario.getNombre());
            ps.setString(2, usuario.getApellido());
            ps.setString(3, usuario.getTelefono());
            ps.setString(4, String.valueOf(usuario.getGenero()));
            ps.setString(5, usuario.getDPI());
            ps.executeUpdate();

        } catch (SQLException e) {
            System.out.println("No se pudo modificar al usuario: " + usuario.getNombre() + " " + usuario.getApellido());
            e.getMessage();
            e.printStackTrace();
            return false;
        } finally {
            con.close();
            ps.close();
        }

        return true;
    }

    public Cuenta buscarCuenta(String numCuenta) throws SQLException {
        PreparedStatement ps = null;
        UsuarioDB userDB = new UsuarioDB();
        Cuenta cuenta = null;
        con = Conexion.getInstancia().Conectar();

        try {

            ps = con.prepareStatement("call ExisteCuenta(?);");
            ps.setString(1, numCuenta);
            rs = ps.executeQuery();

            if (rs.next()) {
                
                String dpi = rs.getString(3);
                int tipoCuenta = rs.getInt(4);
                
                if (tipoCuenta == 1) {
                    cuenta = new CuentaAhorro();
                    
                    cuenta.setUser(userDB.buscarUsuario(dpi));
                    
                    cuenta.setNumeroCuenta(rs.getString(1));
                    cuenta.setSaldo(rs.getDouble(2));
                    cuenta.setId_tipoCuenta(tipoCuenta);
                    
                    return cuenta;

                } else if (tipoCuenta == 2) {
                    cuenta = new CuentaMonetaria();
                    
                    cuenta.setUser(userDB.buscarUsuario(dpi));
                    cuenta.setNumeroCuenta(rs.getString(1));
                    cuenta.setSaldo(rs.getDouble(2));
                    cuenta.setId_tipoCuenta(tipoCuenta);
                    
                    return cuenta;
                }
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
            ex.getMessage();
        } finally {
            con.close();
            ps.close();
        }
        return cuenta;
    }

    public boolean existeCuenta(String numCuenta) throws SQLException {
        PreparedStatement ps = null;
        con = Conexion.getInstancia().Conectar();

        try {
            ps = con.prepareStatement("call ExisteCuenta(?);");
            ps.setString(1, numCuenta);
            rs = ps.executeQuery();

            if (rs.next()) {
                return true;

            } else {
                return false;
            }

        } catch (SQLException e) {
            System.out.println("Error al conectar con la DB");
            e.getMessage();
            e.printStackTrace();
        } finally {
            con.close();
            ps.close();
        }

        return false;
    }

    public boolean depositar(double monto, String numeroCuenta) throws SQLException {
        PreparedStatement ps = null;
        con = Conexion.getInstancia().Conectar();

        try {

            ps = con.prepareStatement("call Depositar(?,?);");
            ps.setString(1, numeroCuenta);
            ps.setDouble(2, monto);
            ps.executeUpdate();

            return true;

        } catch (SQLException e) {
            System.out.println("Error al depositar");
            e.printStackTrace();
            e.getMessage();
            return false;
        } finally {
            con.close();
            ps.close();
        }

    }

    public boolean retirar(double monto, String numeroCuenta) throws SQLException {
        PreparedStatement ps = null;
        CallableStatement cs = null;
        con = Conexion.getInstancia().Conectar();

        try {

            cs = con.prepareCall("call Retirar(?,?);");
            cs.setString(1, numeroCuenta);
            cs.setDouble(2, monto);

            cs.executeUpdate();

            return true;

        } catch (SQLException e) {
            System.out.println("Error al retirar");
            e.printStackTrace();
            e.getMessage();
            return false;
        } finally {
            con.close();
            cs.close();
        }

    }

    public double getSaldo(String numeroCuenta) throws SQLException {
        con = Conexion.getInstancia().Conectar();
        PreparedStatement ps = null;
        double saldo = 0;

        try {
            ps = con.prepareStatement("call ConsultaSaldo(?);");
            ps.setString(1, numeroCuenta);
            rs = ps.executeQuery();

            if (rs.next()) {
                saldo = rs.getDouble("saldo");
                return saldo;
            }
        } catch (SQLException e) {
            e.getMessage();
            e.printStackTrace();
            return 0;

        } finally {
            con.close();
            ps.close();
        }
        return 0;
    }

    public DefaultTableModel getCuentas(String dpi) throws SQLException {
        PreparedStatement ps = null;
        DefaultTableModel modelo = new DefaultTableModel();

        modelo.addColumn("Numero de Cuenta");
        modelo.addColumn("Tipo de Cuenta");
        modelo.addColumn("Saldo");

        try {
            con = Conexion.getInstancia().Conectar();
            ps = con.prepareStatement("call ConsultaCuentas(?);");
            ps.setString(1, dpi);

            rs = ps.executeQuery();

            ResultSetMetaData rsMD = rs.getMetaData();
            int cantidadColumnas = rsMD.getColumnCount();

            while (rs.next()) {
                Object[] cuentas = new Object[cantidadColumnas];

                for (int i = 0; i < cantidadColumnas; i++) {
                    cuentas[i] = rs.getObject(i + 1);
                }
                modelo.addRow(cuentas);

            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            con.close();
            ps.close();
            rs.close();
        }

        return modelo;

    }

    public DefaultTableModel getCuentasT(String dpi) throws SQLException {
        PreparedStatement ps = null;
        DefaultTableModel modelo = new DefaultTableModel();

        modelo.addColumn("Tipo de Cuenta");
        modelo.addColumn("Numero de Cuenta");

        try {
            con = Conexion.getInstancia().Conectar();
            ps = con.prepareStatement("call ConsultaCuentasT(?);");
            ps.setString(1, dpi);

            rs = ps.executeQuery();

            ResultSetMetaData rsMD = rs.getMetaData();
            int cantidadColumnas = rsMD.getColumnCount();

            while (rs.next()) {
                Object[] cuentas = new Object[cantidadColumnas];

                for (int i = 0; i < cantidadColumnas; i++) {
                    cuentas[i] = rs.getObject(i + 1);
                }
                modelo.addRow(cuentas);

            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            con.close();
            ps.close();
            rs.close();
        }

        return modelo;

    }

    /*<-----------------------METODO PARA INSERTAR CUENTA AHORRO SIN USUARIO-------------------->*/
    public void insertarCuentaA1(CuentaAhorro cuenta) throws SQLException {
        con = Conexion.getInstancia().Conectar();
        PreparedStatement ps = null;

        try {
            ps = con.prepareStatement("call InsertarCuenta(?,?,?,?,?);");
            ps.setString(1, cuenta.getNumeroCuenta());
            ps.setDouble(2, cuenta.getSaldo());
            ps.setString(3, cuenta.getUser().getDPI());
            ps.setInt(4, cuenta.getId_tipoCuenta());
            ps.setString(5, null);
            ps.executeUpdate();
        } catch (SQLException e) {
            System.out.println("No se pudo hacer la consulta");
            e.printStackTrace();
            e.getMessage();
        } finally {
            con.close();
            ps.close();

        }
    }

    /*<-----------------------METODO PARA INSERTAR CUENTA MONETARIO SIN USUARIO-------------------->*/
    public void insertarCuentaM1(CuentaMonetaria cuenta) throws SQLException {
        con = Conexion.getInstancia().Conectar();
        PreparedStatement ps = null;

        try {
            ps = con.prepareStatement("call InsertarCuenta(?,?,?,?,?);");
            ps.setString(1, cuenta.getNumeroCuenta());
            ps.setDouble(2, cuenta.getSaldo());
            ps.setString(3, cuenta.getUser().getDPI());
            ps.setInt(4, cuenta.getId_tipoCuenta());
            ps.setString(5, cuenta.getNumeroChequera());
            ps.executeUpdate();
        } catch (SQLException e) {
            System.out.println("No se pudo hacer la insersion");
            e.printStackTrace();
            e.getMessage();
        } finally {
            ps.close();
            con.close();
        }
    }

}
