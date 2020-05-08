package ControladorDB;

import Modelo.Banco.Transaccion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author mikesb
 */
public class TransaccionDB {

    private Connection con = null;
    private ResultSet rs = null;

    private static TransaccionDB instancia;

    public static TransaccionDB getInstancia() {
        if (instancia == null) {
            instancia = new TransaccionDB();
        }
        return instancia;
    }

    public void insertTransaccion(Transaccion transaccion) throws SQLException {
        UsuarioDB usuariodb = new UsuarioDB();                                                 //SE INSTANCIA ESTE OBJETO PARA POSTERIORMENTE PODER HACER LA CONSULTA DEL SALDO DE LA CUENTA DEL USUARIO
        double saldo = usuariodb.getSaldo(transaccion.getCuenta().getNumeroCuenta());           // SE OBTIENE EL SALDO 
        con = Conexion.getInstancia().Conectar();
        PreparedStatement ps = null;

        int tipoTrans = transaccion.getTipo_trans();

        try {
            if (tipoTrans == 1) {

                ps = con.prepareStatement("INSERT INTO banco.transaccion (deposito, fecha, tipoTrans_id, cuenta, saldo) VALUES (?,?,?,?,?)");
                ps.setDouble(1, transaccion.getMonto());
                ps.setString(2, transaccion.getFechaTransaccion());
                ps.setInt(3, tipoTrans);
                ps.setString(4, transaccion.getCuenta().getNumeroCuenta());
                ps.setDouble(5, saldo);
                ps.executeUpdate();
            } else if (tipoTrans == 2) {
                ps = con.prepareStatement("INSERT INTO banco.transaccion (retiro, fecha, tipoTrans_id, cuenta, saldo) VALUES (?,?,?,?,?)");
                ps.setDouble(1, transaccion.getMonto());
                ps.setString(2, transaccion.getFechaTransaccion());
                ps.setInt(3, tipoTrans);
                ps.setString(4, transaccion.getCuenta().getNumeroCuenta());
                ps.setDouble(5, saldo);
                ps.executeUpdate();
            }
        } catch (SQLException e) {
            e.getMessage();
            e.printStackTrace();
        } finally {
            con.close();
            ps.close();
        }
    }

    public DefaultTableModel getEstadoCuenta(String cuenta) throws SQLException {
        PreparedStatement ps = null;
        DefaultTableModel modelo = new DefaultTableModel();

        modelo.addColumn("Transaccion");
        modelo.addColumn("Fecha-Hora");
        modelo.addColumn("Debito");
        modelo.addColumn("Credito");
        modelo.addColumn("Saldo");

        try {
            con = Conexion.getInstancia().Conectar();
            ps = con.prepareStatement("SELECT  id_transaccion, fecha, retiro, deposito, saldo "
                    + "FROM transaccion "
                    + "WHERE cuenta = ?");
            ps.setString(1, cuenta);

            rs = ps.executeQuery();

            ResultSetMetaData rsMD = rs.getMetaData();
            int cantidadColumnas = rsMD.getColumnCount();

            while (rs.next()) {
                Object[] transacciones = new Object[cantidadColumnas];

                for (int i = 0; i < cantidadColumnas; i++) {
                    transacciones[i] = rs.getObject(i + 1);
                }
                modelo.addRow(transacciones);

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

}
