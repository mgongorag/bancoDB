/*
    Clase que contiene toda informacion acerca de las diferentes transacciones que se realizan 
    en el programa
*/
package Modelo.Banco;

public class Transaccion {

    private Cuenta cuenta;
    private double monto;
    private String id_transaccion;
    private String fechaTransaccion;
    private int tipo_trans;

    public Transaccion(Cuenta cuenta, double monto, String fechaTransaccion) {
        this.cuenta = cuenta;
        this.monto = monto;
        this.fechaTransaccion = fechaTransaccion;
    }

    public Transaccion() {

    }

    public int getTipo_trans() {
        return tipo_trans;
    }

    public void setTipo_trans(int tipo_trans) {
        this.tipo_trans = tipo_trans;
    }

    public Cuenta getCuenta() {
        return cuenta;
    }

    public void setCuenta(Cuenta cuenta) {
        this.cuenta = cuenta;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    public String getFechaTransaccion() {
        return fechaTransaccion;
    }

    public void setFechaTransaccion(String fechaTransaccion) {
        this.fechaTransaccion = fechaTransaccion;
    }

    public String getId_transaccion() {
        return id_transaccion;
    }

    public void setId_transaccion(String id_transaccion) {
        this.id_transaccion = id_transaccion;
    }

}
