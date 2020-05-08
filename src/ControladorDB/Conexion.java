package ControladorDB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author mgongorag
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
            Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
        } catch (Exception e) {
            System.out.println("JAVA: Class.forName() error");
            e.printStackTrace();
        }

        try {
            //String user = "Furlandb";    //En esta linea debe ser el usuario que tienen en su mysql workbench
            //String pass = "tiger";      //La contraseña que crearon al momento de instalar el workbech*/

            String url = "jdbc:mysql://localhost:3306/Banco?useUnicode=true&characterEncoding=UTF-8&zeroDateTimeBehavior=convertToNull&serverTimezone=GMT&useSSL=false";
            String user = "root";           //En esta linea debe ser el usuario que tienen en su mysql workbench
            String pass = "admin";      //La contraseña que crearon al momento de instalar el workbech*/
            con = DriverManager.getConnection(url, user, pass);
        } catch (SQLException e) {
            System.out.println("No se pudo conectar a la Base de Datos");
            e.getMessage();
            e.printStackTrace();
        }

        return con;
    }

}
