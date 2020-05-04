package Vista.Banco;

import Modelo.Banco.Empleado;


public class Main {
    
    public static Login frmLogin;
    
    public static void main(String[] args) {
        
        
        
        frmLogin = new Login();
        frmLogin.setTitle("Inicio de Sesion");
        frmLogin.setLocationRelativeTo(null);
        frmLogin.setVisible(true);
        
        
    }


    
}
