package ControladorDB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author WENDY GONGORA
 */
public class Conexion {

    private static Conexion instancia;

    public Conexion() {

    }

    public static Conexion getInstancia() {

        if (instancia == null) {
            instancia = new Conexion();
        }
        return instancia;

    }

    public Connection Conectar() throws SQLException {

        Connection con = null;

        try {
            //Class.forName("com.mysql.cj.jdbc.Driver");
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException ex) {
            System.out.println("No se encontro el Driver");
            ex.getMessage();
            ex.printStackTrace();
        }

        try {
            /*String url="jdbc:mysql://localhost:3306/Banco?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
            String user = "root";
            String pass = "marcon55";
            */
            
            
           String url = "jdbc:mysql://localhost:3306/Banco?useSSL=false";
            String user = "root";           //En esta linea debe ser el usuario que tienen en su mysql workbench
            String pass = "123456789";      //La contraseña que crearon al momento de instalar el workbech*/
            con = DriverManager.getConnection(url, user, pass);
        } catch (SQLException e) {
            System.out.println("No se pudo conectar a la Base de Datos");
            e.getMessage();
            e.printStackTrace();
        }

        return con;
    }

}
