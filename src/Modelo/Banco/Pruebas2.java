
package Modelo.Banco;

import ControladorDB.TarjetaDB;
import ControladorDB.UsuarioDB;
import Utilidades.Utilidades;
import Vista.Banco.InicioCaja;
import java.sql.Date;
import java.sql.SQLException;
import java.util.Calendar;
import java.util.GregorianCalendar;


public class Pruebas2 {

    public static void main(String[] args) throws SQLException {
        
        UsuarioDB userDb = new UsuarioDB();
        Usuario usuario;
        Cuenta cuenta;
        

        
        usuario = userDb.buscarUsuario("321456");
        //System.out.println(usuario.toString());
        
        cuenta = userDb.buscarCuenta("02196937");
        System.out.println(cuenta.toString());
        
        
        
        
    }
    

    
}
