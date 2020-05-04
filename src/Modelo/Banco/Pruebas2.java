
package Modelo.Banco;

import ControladorDB.TarjetaDB;
import Utilidades.Utilidades;
import java.sql.Date;
import java.sql.SQLException;
import java.util.Calendar;
import java.util.GregorianCalendar;


public class Pruebas2 {

    public static void main(String[] args) throws SQLException {
        
        String numCuenta = "01715255";
        
        Tarjeta tarjeta = new Tarjeta();
        
        Cuenta cuenta = new CuentaAhorro();
        cuenta.setNumeroCuenta(numCuenta);
        
        tarjeta.setCuenta(cuenta);
        
        TarjetaDB tarjetadb = new TarjetaDB();
        
        //if(tarjetadb.insertar(tarjeta, numCuenta) == true){
        //    System.out.println("registro satisfactorio");
        //}
        
    }
    

    
}
