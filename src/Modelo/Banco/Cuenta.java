package Modelo.Banco;

public abstract class Cuenta {
      
    protected String numeroCuenta;
    protected double saldo;
    protected int id_tipoCuenta;
    protected Usuario user;
    
    
    
    
    public Cuenta() {
        
    }
    

    public Usuario getUser() {
        return user;
    }

    public void setUser(Usuario user) {
        this.user = user;
    }
    
    public void setNumeroCuenta(String numeroCuenta){
        this.numeroCuenta = numeroCuenta;
    }
    
    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void setId_tipoCuenta(int id_tipoCuenta) {
        this.id_tipoCuenta = id_tipoCuenta;
    }
    
    protected abstract void setTipoCuenta();

    public int getId_tipoCuenta() {
        return id_tipoCuenta;
    }
    
    
    
    public void depositar(double monto){
        this.saldo += monto;
    }
    
    public abstract void retirar(double monto);
    
    public double getSaldo() {
        return saldo;
    }
    

    @Override
    public String toString() {
        return "Cuenta{" + "numeroCuenta=" + numeroCuenta + ", saldo=" + saldo + ", id_tipoCuenta=" + id_tipoCuenta + 
                this.user.toString() + '}';
    }

    
    
    
    
}

    








