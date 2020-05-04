package Utilidades;


import java.text.SimpleDateFormat;
import java.util.Date;

public class Utilidades {
    
    public static final int LONGITUD_DE_CUENTA = 6;
    public static final int LONGITUD_DE_CHEQUERA = 6;
    public static final int LONGITUD_NUMERO_TARJETA = 12;
    public static final int LONGITUD_CCV = 3;
    public static final int LONGITUD_PIN = 4;
    
    /*CONSTANTES DE LAS COLUMNAS DE LA DEL ESTADO DE CUENTA*/
    public static final int TRANSACCION = 0;
    public static final int FECHA = 1;
    public static final int DEBITO = 2;
    public static final int CREDITO = 3;
    public static final int SALDO = 4;
    
    //CONSTANTES DE LAS COLUMNAS PARA LA TABLA DE LAS TARJETAS
    public static final int NUMERO_TARJETA = 0;
    public static final int NUMERO_CUENTA = 1;
    public static final int VALIDA_DESDE = 2;
    public static final int VALIDA_HASTA = 3;
    
    //CONSTANTES DE LAS COLUMNAS PARA LA TABLA DE LAS CUENTAS DE TARJETASFRM
    public static final int TIPO_CUENTA = 0;
    
    
    public Utilidades(){
        
    }
    /*------------GENERAR NUMERO DE CUENTA -------------*/
    
    public String generarNumeroCuenta(int tipoCuenta){
        String numeroCuenta = "";
        
        if(tipoCuenta == 1){
            numeroCuenta += "01";
        }else if(tipoCuenta == 2) {
            numeroCuenta += "02";
        }
        
        for(int i = 0; i < LONGITUD_DE_CUENTA; i++){
            int numero = ((int)Math.floor(Math.random()*9+1));
            String dato = Integer.toString(numero);
            numeroCuenta += dato;
        }
        
        return numeroCuenta;
    }
    
    
    /*<---------- GENERA NUMERO DE CHEQUERA ---------------*/
    
    public String generarNumeroChequera(){
        String numeroChequera = "";
        
        for(int i = 0; i < LONGITUD_DE_CHEQUERA; i++){
            int numero = ((int)Math.floor(Math.random()*9+1));
            String dato = Integer.toString(numero);
            numeroChequera += dato;
        }
        
        return numeroChequera;
    }
    
    /*<------------GENERA NUMERO TARJETA ------------------>*/
    
    public String generarNumeroTarjeta(){
        String numeroTarjeta ="4824";
        
        for(int i = 0; i < LONGITUD_NUMERO_TARJETA; i++){
            int numero = ((int)Math.floor(Math.random()*9+1));
            String dato = Integer.toString(numero);
            numeroTarjeta += dato;
        }
        
        return numeroTarjeta;
    }
    
    /*<-------------GENERA NUMERO DE CCV ----------------->*/
    
       public String generarCCV() {
        String numeroCCV = "";

            for (int i = 0; i < LONGITUD_CCV; i++) {
                int numero = (int) (Math.floor(Math.random() * 9 + 1));
                String dato = Integer.toString(numero);
                numeroCCV += dato;

            }
        return numeroCCV;
    }

    public String generarPIN(){
        String pin = "";
        
            for (int i = 0; i < LONGITUD_PIN; i++) {
                int numero = (int) (Math.floor(Math.random() * 9 + 1));
                String dato = Integer.toString(numero);
                pin += dato;
            }
        return pin;
    }
    public String setDateTime(){
        
        Date fecha = new Date();
        String formatoFecha;
        String formato = "yyyy/MM/dd HH:mm:ss";
        SimpleDateFormat dateSDF = new SimpleDateFormat(formato);
        formatoFecha = dateSDF.format(fecha);
        
        return formatoFecha;
        
    }
    
    public String setFechaCreacion(){
        
        Date fecha = new Date();
        String formatoFecha;
        String formato = "MM/yy";
        SimpleDateFormat dateSDF = new SimpleDateFormat(formato);
        formatoFecha = dateSDF.format(fecha);
        
        return formatoFecha;
        
    }
    
     public String setFechaExpiracion(){
        
        Date fecha = new Date();
        String formatoFecha;
        fecha.setYear(fecha.getYear()+1900+3);
        fecha.setMonth(fecha.getMonth()+1);
        String formato = "MM/yy";
        SimpleDateFormat dateSDF = new SimpleDateFormat(formato);
        formatoFecha = dateSDF.format(fecha);
        
        return formatoFecha;
        
    }
     
    public String getSpaceNumTarjeta(String tarjeta){
        String numTarjeta = "";
        String espacio = "   ";
        
        numTarjeta += tarjeta.charAt(0);
        numTarjeta += tarjeta.charAt(1);
        numTarjeta += tarjeta.charAt(2);
        numTarjeta += tarjeta.charAt(3);
        numTarjeta += espacio;
        numTarjeta += tarjeta.charAt(4);
        numTarjeta += tarjeta.charAt(5);
        numTarjeta += tarjeta.charAt(6);
        numTarjeta += tarjeta.charAt(7);
        numTarjeta += espacio;
        numTarjeta += tarjeta.charAt(8);
        numTarjeta += tarjeta.charAt(9);
        numTarjeta += tarjeta.charAt(10);
        numTarjeta += tarjeta.charAt(11);
        numTarjeta += espacio;
        numTarjeta += tarjeta.charAt(12);
        numTarjeta += tarjeta.charAt(13);
        numTarjeta += tarjeta.charAt(14);
        numTarjeta += tarjeta.charAt(15);
        
        return numTarjeta;
        
        
    }
     
}
