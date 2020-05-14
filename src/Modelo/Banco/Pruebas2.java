package Modelo.Banco;

import ControladorDB.TransaccionDB;
import ControladorDB.UsuarioDB;
import Utilidades.Utilidades;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Iterator;

public class Pruebas2 {

    public static void main(String[] args) throws SQLException {

        UsuarioDB userdb = new UsuarioDB();
        Utilidades utilidad = new Utilidades();
        Cuenta cuenta;
        //System.out.println(trans.transferirFondos("02196937", "01423423", 1000000.00));

        ArrayList<Cuenta> cuentas = userdb.buscarUsuario("01423423", null, null);
        Iterator<Cuenta> iterador = cuentas.iterator();
        int i = 0;
        while(iterador.hasNext()){
            System.out.println("Resultado : " + (i+1));
            cuenta = iterador.next();
            System.out.println(cuenta.toString());
            System.out.println(cuenta.getUser().toString());
            i =+ 1;
        }
        double monto = 500;
        System.out.println(utilidad.validarMonto(String.valueOf(monto)));
    }

}


