package Modelo.Banco;

public class Persona {
    
    private String nombre;
    private String apellido;
    private String DPI;
    private String telefono;
    private char genero;
    
    public Persona(){
        
    }

    public Persona(String nombre, String apellido, String DPI, char genero) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.DPI = DPI;
        this.genero = genero;
    }

    public Persona(String nombre, String apellido, String DPI, String telefono, char genero) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.DPI = DPI;
        this.telefono = telefono;
        this.genero = genero;
    }

    

    public char getGenero() {
        return genero;
    }

    public void setGenero(char genero) {
        this.genero = genero;
    }
    
    
    

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    
    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDPI() {
        return DPI;
    }

    public void setDPI(String DPI) {
        this.DPI = DPI;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", apellido=" + apellido + ", DPI=" + DPI + ", Genero= " +genero + '}';
    }
    
    
    
    
    
}
