package Modelo.Banco;

import Utilidades.Utilidades;

public class Tarjeta {

        private Cuenta cuenta;
        private String numeroTarjeta;
        private int CCV;
        private int pin;
        private String fechaCreacion;
        private String fechaExpiracion;

    public String getFechaCreacion() {
        return fechaCreacion;
    }

    protected void setFechaCreacion() {
        Utilidades u = new Utilidades();
        this.fechaCreacion = u.setFechaCreacion();
    }

    public String getFechaExpiracion() {
        return fechaExpiracion;
    }

    protected void setFechaExpiracion() {
        Utilidades u = new Utilidades();
        this.fechaExpiracion = u.setFechaExpiracion();
    }
    
    public Tarjeta() {
        setNumeroTarjeta();
        setCCV();
        setPIN();
        setFechaCreacion();
        setFechaExpiracion();
        
    }

    public Tarjeta(Cuenta cuenta) {
        this.cuenta = cuenta;
        setNumeroTarjeta();
        setCCV();
        setPIN();
        setFechaCreacion();
        setFechaExpiracion();
        
    }

    public Cuenta getCuenta() {
        return cuenta;
    }

    public void setCuenta(Cuenta cuenta) {
        this.cuenta = cuenta;
    }

    

    public String getNumeroTarjeta() {
        return numeroTarjeta;
    }

    private void setNumeroTarjeta() {
        Utilidades utilidad = new Utilidades();
        this.numeroTarjeta = utilidad.generarNumeroTarjeta();
    }
    
    public void setNumeroTarjeta(String numeroTarjeta) {
        this.numeroTarjeta = numeroTarjeta;
    }

    public int getCCV() {
        return CCV;
    }

    private void setCCV() {
        Utilidades utilidad = new Utilidades();
        this.CCV = Integer.parseInt(utilidad.generarCCV());
    }

    public int getPin() {
        return pin;
    }

    private void setPIN() {
        Utilidades utilidad = new Utilidades();
        this.pin = Integer.parseInt(utilidad.generarPIN());
    }

    @Override
    public String toString() {
        return "Tarjeta{" + "cuenta=" + cuenta + ", numeroTarjeta=" + numeroTarjeta + ", CCV=" + CCV + ", pin=" + pin + ", fechaCreacion=" + fechaCreacion + ", fechaExpiracion=" + fechaExpiracion + '}';
    }

   
        
        
    

    
}
