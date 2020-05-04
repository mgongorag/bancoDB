package Modelo.Banco;

import Utilidades.Utilidades;


public class CuentaAhorro extends Cuenta{
    

    public CuentaAhorro() {
        setTipoCuenta();
        generarNumCuenta();  
    }
    
    public CuentaAhorro(Usuario user) {
        this.saldo = 0;
        this.user = user;
        setTipoCuenta();
        generarNumCuenta();  
    }
    
    
    @Override
    protected void setTipoCuenta(){
        id_tipoCuenta = 1;
    }
    
    
    

    
    private void generarNumCuenta() {
        Utilidades utilidad = new Utilidades();
          this.numeroCuenta = utilidad.generarNumeroCuenta(this.id_tipoCuenta);
    }

    @Override
    public void retirar(double monto) {
        if(monto > saldo){
            saldo = saldo;
        }else{
            this.saldo -= monto;
        }
    }

    
    
    
    
     
}
