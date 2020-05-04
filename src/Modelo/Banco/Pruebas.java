
package Modelo.Banco;


import ControladorDB.Conexion;
import ControladorDB.EmpleadoDB;
import ControladorDB.UsuarioDB;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import Utilidades.Utilidades;

public class Pruebas {

    public static void main(String[] args) throws SQLException {
        
       Utilidades utilidad = new Utilidades();
       Tarjeta mitarjeta = new Tarjeta();
        System.out.println(mitarjeta.getNumeroTarjeta());
        System.out.println(utilidad.getSpaceNumTarjeta(mitarjeta.getNumeroTarjeta()));
        
        /*
        for(int i = 0; i < 16; i++){
            
            System.out.println(i%4);
            
            
        }*/
    }
    
}
