package Modelo.Banco;

import Utilidades.Utilidades;

public class CuentaMonetaria extends Cuenta{
      
        private String numChequera;

    public CuentaMonetaria() {
        
        setTipoCuenta();
        generarNumCuenta();
        generarNumChequera();
    }
    
    public CuentaMonetaria(Usuario user) {
        this.user = user;
        setTipoCuenta();
        generarNumCuenta();
        generarNumChequera();
    }
    
    
    
    public String getNumeroChequera(){
        return this.numChequera;
    }
        
    @Override
    protected void setTipoCuenta() {
         this.id_tipoCuenta = 2;
    }

    @Override
    public void retirar(double monto) {
        if(monto > saldo){
            saldo = saldo;
        }else{
            this.saldo -= monto;
        }
    }
      
    private void generarNumCuenta() {
        Utilidades utilidad = new Utilidades();
          this.numeroCuenta = utilidad.generarNumeroCuenta(this.id_tipoCuenta);
    }
    
    private void generarNumChequera(){
        Utilidades utilidad = new Utilidades();
        this.numChequera = utilidad.generarNumeroChequera();
    }
    
}
