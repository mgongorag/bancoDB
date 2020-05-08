package ControladorDB;

import Modelo.Banco.Cuenta;
import Modelo.Banco.CuentaAhorro;
import Modelo.Banco.CuentaMonetaria;
import Modelo.Banco.Tarjeta;
import Modelo.Banco.Usuario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import javax.swing.table.DefaultTableModel;

public class TarjetaDB {
    private Connection con;
    private ResultSet rs;
    
    private static TarjetaDB instancia = null;
    
    public static TarjetaDB getInstancia(){
        if(instancia == null)
            instancia = new TarjetaDB();
            return instancia;
        
    }
    
    public boolean insertar(Tarjeta tarjeta) throws SQLException{
        con = Conexion.getInstancia().Conectar();
        PreparedStatement ps = null;
        try{
        ps = con.prepareStatement("INSERT INTO tarjeta (numeroTarjeta, numero_cuenta, CCV, pin, fechaCreacion, fechaVencimiento) VALUES(?,?,?,?,?,?)");
        ps.setString(1, tarjeta.getNumeroTarjeta());
        ps.setString(2, tarjeta.getCuenta().getNumeroCuenta());
        ps.setInt(3, tarjeta.getCCV());
        ps.setInt(4, tarjeta.getPin());
        ps.setString(5, tarjeta.getFechaCreacion());
        ps.setString(6, tarjeta.getFechaExpiracion());
        
         ps.executeUpdate();
        
        }catch(SQLException e){
            e.printStackTrace();
            return false;
        }finally{
        con.close();
        ps.close();
        }
        return true;
        
    }
    
    public DefaultTableModel getTarjetas(String cuenta) throws SQLException {
        PreparedStatement ps = null;
        DefaultTableModel modelo = new DefaultTableModel();
        

        modelo.addColumn("Numero Tarjeta");
        modelo.addColumn("Numero Cuenta");
        modelo.addColumn("Válida desde");
        modelo.addColumn("Válida Hasta");
        

        try {
            con = Conexion.getInstancia().Conectar();
            ps = con.prepareStatement("SELECT numeroTarjeta, numero_cuenta, fechaCreacion, fechaVencimiento "+
                                      "FROM tarjeta "+
                                      "WHERE numero_cuenta = ?");
            ps.setString(1, cuenta);

            rs = ps.executeQuery();

            ResultSetMetaData rsMD = rs.getMetaData();
            int cantidadColumnas = rsMD.getColumnCount();

            while (rs.next()) {
                Object[] tarjetas = new Object[cantidadColumnas];

                for (int i = 0; i < cantidadColumnas; i++) {
                    tarjetas[i] = rs.getObject(i + 1);
                }
                modelo.addRow(tarjetas);

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
    
    public boolean existeTarjeta(String numTarjeta) throws SQLException{
    con = Conexion.getInstancia().Conectar();
    PreparedStatement ps = null;
    rs = null;
    try{
    ps = con.prepareStatement("SELECT * FROM tarjeta WHERE numeroTarjeta = ?");
    ps.setString(1, numTarjeta);
    
    rs = ps.executeQuery();
    
    if(rs.next()){
        return true;
    }else{
        return false;
    }    
    }catch(SQLException e){
        e.getMessage();
        e.printStackTrace();
        return false;
    }finally{
        con.close();
        ps.close();
        
    }    
    }
    
    public boolean loginCajero(String numeroTarjeta, int PIN) throws SQLException{
        con = Conexion.getInstancia().Conectar();
        PreparedStatement ps = null;
        rs = null;
        
        try{
        ps = con.prepareStatement("SELECT numeroTarjeta, pin FROM tarjeta WHERE numeroTarjeta = ?");
        ps.setString(1, numeroTarjeta);
        
        rs = ps.executeQuery();
        if(rs.next()){
        String numeroTaretaDB = rs.getString(1);
        int PINDB = rs.getInt(2);
        
        
        if(numeroTarjeta.equals(numeroTaretaDB) && PIN == PINDB){
            return true;
        }else{
            return false;
        }
        }
        return false;
        }catch(SQLException e){
            e.getMessage();
            e.printStackTrace();
            return false;
        }finally{
            con.close();
            ps.close();
            
        }
    }
    
    
    public Tarjeta selectTarjeta(String numeroTarjeta) throws SQLException{
        con = Conexion.getInstancia().Conectar();
        PreparedStatement ps = null;
        
        try{
        ps = con.prepareStatement("SELECT t.numeroTarjeta, c.numero_cuenta, c.tipo_cuenta_id, c.saldo, u.nombre, u.apellido FROM cuenta c, usuario u, tarjeta t WHERE c.Usuario_dpi = u.dpi AND c.numero_cuenta = t.numero_cuenta AND t.numeroTarjeta = ?");
        ps.setString(1, numeroTarjeta);
        
        rs = ps.executeQuery();
        
        if(rs.next()){
            Cuenta cuenta;
            Tarjeta tarjeta = new Tarjeta();
            Usuario usuario = new Usuario();
            
            int tipoCuenta = rs.getInt(3);
            if(tipoCuenta == 1){
                cuenta = new CuentaAhorro();
            }else{
                cuenta = new CuentaMonetaria();
            }
           
            tarjeta.setNumeroTarjeta(rs.getString(1));
            cuenta.setNumeroCuenta(rs.getString(2));
            cuenta.setId_tipoCuenta(rs.getInt(3));
            cuenta.setSaldo(rs.getDouble(4));
            usuario.setNombre(rs.getString(5));
            usuario.setApellido(rs.getString(6));
            cuenta.setUser(usuario);
            tarjeta.setCuenta(cuenta);
            return tarjeta;
        }
        return null;
        }catch(SQLException e){
            e.printStackTrace();
            e.getMessage();
            return null;
        }finally{
            con.close();
            ps.close();
        }
        
        
    }
    
}
