package Modelo.Banco;

public class Empleado extends Persona{

    private String username;
    private String password;
    private Departamento departamento;
    private String last_session;

    public Empleado(String nombre, String apellido, String DPI, char genero, String password) {
        super(nombre, apellido, DPI, genero);
        this.password = password;
    }

    public Empleado() {
       
    }

    public String getLast_session() {
        return last_session;
    }

    public void setLast_session(String last_session) {
        this.last_session = last_session;
    }
    
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Departamento getDepartamento() {
        return departamento;
    }

    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }

    @Override
    public String toString() {
        return "Empleado{" + "username=" + username + ", password=" + password + ", departamento=" + departamento + '}';
    }
    
    
    
    
    
    
    
    
}
