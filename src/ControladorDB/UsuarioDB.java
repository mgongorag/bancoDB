package ControladorDB;

import Modelo.Banco.Cuenta;
import Modelo.Banco.CuentaAhorro;
import Modelo.Banco.CuentaMonetaria;
import Modelo.Banco.Departamento;
import Modelo.Banco.Usuario;
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
    
    public static UsuarioDB getInstancia(){
        if(instancia == null)
            instancia = new UsuarioDB();
             return instancia;      
    }
    
    /*<--------------METODO PARA INSERTAR UN USUARIO ----------------->*/
    
    public void insertarUsuario(Usuario usuario)throws SQLException{
        
        con = Conexion.getInstancia().Conectar();
        PreparedStatement ps = null;
        
            try{
                ps = con.prepareStatement("INSERT INTO usuario " + 
                        "(dpi, nombre, apellido, telefono, genero) " + 
                          "VALUES (?,?,?,?,?)");
                
                ps.setString(1, usuario.getDPI());
                ps.setString(2, usuario.getNombre());
                ps.setString(3, usuario.getApellido());
                ps.setString(4, usuario.getTelefono());
                ps.setString(5, String.valueOf(usuario.getGenero()));
                ps.executeUpdate();
            }catch(SQLException e){
                System.out.println("No se puedo hacer la Insersion! ");
                e.getMessage();
                e.printStackTrace();
            }finally{
                con.close();
                ps.close();       
            }
        
    }
    
    /*<-----------------------METODO PARA INSERTAR CUENTA DE AHORRO-------------------->*/
    public void insertarCuentaA(CuentaAhorro cuenta) throws SQLException{
        UsuarioDB usuarioDB = new UsuarioDB();
        con = Conexion.getInstancia().Conectar();
        PreparedStatement ps = null;
        
        usuarioDB.insertarUsuario(cuenta.getUser());
        
        try{
            ps = con.prepareStatement("INSERT INTO banco.cuenta (numero_cuenta, saldo, Usuario_dpi, tipo_cuenta_id) VALUES(?,?,?,?) ");
            ps.setString(1, cuenta.getNumeroCuenta());
            ps.setDouble(2, cuenta.getSaldo());
            ps.setString(3, cuenta.getUser().getDPI());
            ps.setInt(4, cuenta.getId_tipoCuenta());
            ps.executeUpdate();
        }catch(SQLException e){
            System.out.println("No se pudo hacer la consulta");
            e.printStackTrace();
            e.getMessage();
        }finally{
            con.close();
            ps.close();
            
        }
        
        
        
        
        
        
    }
    
    /*<-----------------------METODO PARA INSERTAR CUENTA DE AHORRO-------------------->*/
    public void insertarCuentaM(CuentaMonetaria cuenta) throws SQLException{
        UsuarioDB usuarioDB = new UsuarioDB();
        con = Conexion.getInstancia().Conectar();
        PreparedStatement ps = null;
        
        usuarioDB.insertarUsuario(cuenta.getUser());
        
        try{
            ps = con.prepareStatement("INSERT INTO banco.cuenta (numero_cuenta, saldo, Usuario_dpi, tipo_cuenta_id, Chequera) VALUES(?,?,?,?,?) ");
            ps.setString(1, cuenta.getNumeroCuenta());
            ps.setDouble(2, cuenta.getSaldo());
            ps.setString(3, cuenta.getUser().getDPI());
            ps.setInt(4, cuenta.getId_tipoCuenta());
            ps.setString(5, cuenta.getNumeroChequera());
            ps.executeUpdate();
        }catch(SQLException e){
            System.out.println("No se pudo hacer la insersion");
            e.printStackTrace();
            e.getMessage();
        }finally{
            ps.close();
            con.close();
        }
        
        
        
        
        
        
    }
    
    
    public boolean existeUsuario(String dpi) throws SQLException{
        con = Conexion.getInstancia().Conectar();
        PreparedStatement ps = null;
            try{
                ps = con.prepareStatement("SELECT * FROM usuario WHERE dpi = ?");
                ps.setString(1, dpi);
                rs = ps.executeQuery();
                if(rs.next()){
                    return true;
                }else{
                    return false;
                }
            
            }catch(SQLException e){
                System.out.println("El error esta en existeUsuario");
                e.printStackTrace();
                e.getMessage();
            }finally{
                con.close();
                ps.close();
                
            }
        
        return false;
        
    }
    
    
    
    public Usuario buscarUsuario(String dpi) throws SQLException{
        PreparedStatement ps = null;
        con = Conexion.getInstancia().Conectar();
        Usuario usuario = new Usuario();
       try{
           ps = con.prepareStatement("SELECT * FROM banco.usuario where dpi = ?");
           ps.setString(1, dpi);
           rs = ps.executeQuery();
           if(rs.next()){
           
           usuario.setDPI(rs.getString(1));
           usuario.setNombre(rs.getString(2));
           usuario.setApellido(rs.getString(3));
           usuario.setTelefono(rs.getString(4));
           usuario.setGenero(rs.getString(5).charAt(0));
           
           return usuario;
           }
       }catch(SQLException e){
           
           e.printStackTrace();
           e.getMessage();
       }finally{
           con.close();
           ps.close();
       }
        
        return usuario;
        
    }
    
    
    public int numerUsuarios() throws SQLException{
        
        con = Conexion.getInstancia().Conectar();
        PreparedStatement ps = null;
        
        try{
             ps = con.prepareStatement("SELECT COUNT(*) AS num from usuario");
             rs = ps.executeQuery();
             
             if(rs.next()){
                 return rs.getInt("num");   
             }else{
                 return 0;
             }
             
        }catch(SQLException e){
            System.out.println("No se pudo obtener el total de usuarios");
            e.getMessage();
            e.printStackTrace();
            return 0;
        }finally{
            con.close();
            ps.close();
            
        }
    }
    
    
    public boolean actualizarUsuario(Usuario usuario)throws SQLException{
        con = Conexion.getInstancia().Conectar();
        PreparedStatement ps = null;
        
        try{
            ps = con.prepareStatement("UPDATE usuario " +  
                     "SET nombre = ?" + 
                     ",apellido = ?"+ 
                     ",telefono = ?" + 
                     ", genero = ? " + 
                     "WHERE dpi = ?");
            
            ps.setString(1, usuario.getNombre());
            ps.setString(2, usuario.getApellido());
            ps.setString(3, usuario.getTelefono());
            ps.setString(4, String.valueOf(usuario.getGenero()));
            ps.setString(5, usuario.getDPI());
            ps.executeUpdate();
            
            
        }catch(SQLException e){
            System.out.println("No se pudo modificar al usuario: "+ usuario.getNombre() +" "+ usuario.getApellido());
            e.getMessage();
            e.printStackTrace();
            return false;
        }finally{
           con.close();
           ps.close();
        }
        
        
        return true;
        
    }
    
    public Cuenta buscarCuenta(String cuenta) throws SQLException {
        UsuarioDB usuariodb = new UsuarioDB();

        PreparedStatement ps = null;
        con = Conexion.getInstancia().Conectar();
        Cuenta Cuenta;

        try {
            ps = con.prepareStatement("SELECT * from banco.cuenta where numero_cuenta = ?");
            ps.setString(1, cuenta);
            rs = ps.executeQuery();

            if (rs.next()) {

                String dpi = rs.getString(3);
                int tipoCuenta = rs.getInt(4);

                if (tipoCuenta == 1) {
                    Cuenta = new CuentaAhorro();

                    Cuenta.setUser(usuariodb.buscarUsuario(dpi));
                    Cuenta.setNumeroCuenta(rs.getString(1));
                    Cuenta.setSaldo(rs.getDouble(2));
                    Cuenta.setId_tipoCuenta(rs.getInt(4));

                    return Cuenta;

                } else if (tipoCuenta == 2) {
                    Cuenta = new CuentaMonetaria();

                    Cuenta.setUser(usuariodb.buscarUsuario(dpi));
                    Cuenta.setNumeroCuenta(rs.getString(1));
                    Cuenta.setSaldo(rs.getDouble(2));
                    Cuenta.setId_tipoCuenta(rs.getInt(4));
                    Cuenta.setNumeroCuenta(rs.getString(5));

                    return Cuenta;
                }

            }
        } catch (SQLException e) {
            System.out.println("Error al Encontrar la cuenta");
            e.getMessage();
            e.printStackTrace();
        } finally {
            con.close();
            ps.close();
        }
        return Cuenta = new CuentaAhorro();
    }

    public boolean existeCuenta(String numCuenta) throws SQLException {
        PreparedStatement ps = null;
        con = Conexion.getInstancia().Conectar();
        Cuenta Cuenta;

        try {
            ps = con.prepareStatement("SELECT * from banco.cuenta, banco.usuario where numero_cuenta = ?");
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

            ps = con.prepareStatement("UPDATE banco.cuenta SET saldo = saldo + " + monto + "WHERE numero_cuenta = ?");
            ps.setString(1, numeroCuenta);
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
        con = Conexion.getInstancia().Conectar();

        try {

            ps = con.prepareStatement("UPDATE banco.cuenta SET saldo = saldo - " + monto + "WHERE numero_cuenta = ?");
            ps.setString(1, numeroCuenta);
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
     
    public double getSaldo(String numeroCuenta) throws SQLException{
        con = Conexion.getInstancia().Conectar();
        PreparedStatement ps = null;
        double saldo = 0;
        
        try {
            ps = con.prepareStatement("SELECT cuenta.saldo from banco.cuenta WHERE numero_cuenta = ?");
            ps.setString(1, numeroCuenta);
            rs = ps.executeQuery();

            if(rs.next()){
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
    
    public DefaultTableModel getCuentas(String dpi) throws SQLException{
        PreparedStatement ps = null;
        DefaultTableModel modelo = new DefaultTableModel();
        
        modelo.addColumn("Numero de Cuenta");
        modelo.addColumn("Tipo de Cuenta");
        modelo.addColumn("Saldo");
        
        try{
        con = Conexion.getInstancia().Conectar();
        ps = con.prepareStatement("SELECT C.numero_cuenta, T.tipo_Cuenta, C.saldo FROM banco.cuenta C, banco.usuario U, banco.tipo_cuenta T WHERE T.id = C.tipo_cuenta_id AND C.Usuario_dpi = U.dpi AND U.dpi = ?");
        ps.setString(1, dpi);
        
        rs = ps.executeQuery();
        
        ResultSetMetaData rsMD = rs.getMetaData();
        int cantidadColumnas = rsMD.getColumnCount();
        
            while(rs.next()){
                Object[] cuentas = new Object[cantidadColumnas];
                    
                    for(int i = 0; i < cantidadColumnas; i++){
                        cuentas[i] = rs.getObject(i+1);
                    }
                modelo.addRow(cuentas);
                
            }
        }catch(SQLException e){
            e.printStackTrace();
        }finally{
            con.close();
            ps.close();
            rs.close();
        }
       
        return modelo;
        
        
    }
    
    public DefaultTableModel getCuentasT(String dpi) throws SQLException{
        PreparedStatement ps = null;
        DefaultTableModel modelo = new DefaultTableModel();
        
        
        modelo.addColumn("Tipo de Cuenta");
        modelo.addColumn("Numero de Cuenta");
        
        try{
        con = Conexion.getInstancia().Conectar();
        ps = con.prepareStatement("SELECT T.tipo_Cuenta, C.numero_cuenta FROM banco.cuenta C, banco.usuario U, banco.tipo_cuenta T WHERE T.id = C.tipo_cuenta_id AND C.Usuario_dpi = U.dpi AND U.dpi = ?");
        ps.setString(1, dpi);
        
        rs = ps.executeQuery();
        
        ResultSetMetaData rsMD = rs.getMetaData();
        int cantidadColumnas = rsMD.getColumnCount();
        
            while(rs.next()){
                Object[] cuentas = new Object[cantidadColumnas];
                    
                    for(int i = 0; i < cantidadColumnas; i++){
                        cuentas[i] = rs.getObject(i+1);
                    }
                modelo.addRow(cuentas);
                
            }
        }catch(SQLException e){
            e.printStackTrace();
        }finally{
            con.close();
            ps.close();
            rs.close();
        }
       
        return modelo;
        
        
    }
    
    public void insertarCuentaA1(CuentaAhorro cuenta) throws SQLException{
        con = Conexion.getInstancia().Conectar();
        PreparedStatement ps = null;
        
        
        
        try{
            ps = con.prepareStatement("INSERT INTO banco.cuenta (numero_cuenta, saldo, Usuario_dpi, tipo_cuenta_id) VALUES(?,?,?,?) ");
            ps.setString(1, cuenta.getNumeroCuenta());
            ps.setDouble(2, cuenta.getSaldo());
            ps.setString(3, cuenta.getUser().getDPI());
            ps.setInt(4, cuenta.getId_tipoCuenta());
            ps.executeUpdate();
        }catch(SQLException e){
            System.out.println("No se pudo hacer la consulta");
            e.printStackTrace();
            e.getMessage();
        }finally{
            con.close();
            ps.close();
            
        }    
    }
    
    /*<-----------------------METODO PARA INSERTAR CUENTA DE AHORRO-------------------->*/
    public void insertarCuentaM1(CuentaMonetaria cuenta) throws SQLException{
        con = Conexion.getInstancia().Conectar();
        PreparedStatement ps = null;
        
        
        try{
            ps = con.prepareStatement("INSERT INTO banco.cuenta (numero_cuenta, saldo, Usuario_dpi, tipo_cuenta_id, Chequera) VALUES(?,?,?,?,?) ");
            ps.setString(1, cuenta.getNumeroCuenta());
            ps.setDouble(2, cuenta.getSaldo());
            ps.setString(3, cuenta.getUser().getDPI());
            ps.setInt(4, cuenta.getId_tipoCuenta());
            ps.setString(5, cuenta.getNumeroChequera());
            ps.executeUpdate();
        }catch(SQLException e){
            System.out.println("No se pudo hacer la insersion");
            e.printStackTrace();
            e.getMessage();
        }finally{
            ps.close();
            con.close();
        }
    }
    
    
    
}
