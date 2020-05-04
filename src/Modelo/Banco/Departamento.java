package Modelo.Banco;

 public class Departamento {
   
    private String nombreDepartamento;
    private int id_departamento;
    private int numeroEmpleados;

    public Departamento(String nombreDepartamento, int id_departamento, int numeroEmpleados) {
        this.nombreDepartamento = nombreDepartamento;
        this.id_departamento = id_departamento;
        this.numeroEmpleados = numeroEmpleados;
    }
    
    public Departamento(){
        
    }

    public String getNombreDepartamento() {
        return nombreDepartamento;
    }

    public void setNombreDepartamento(String nombreDepartamento) {
        this.nombreDepartamento = nombreDepartamento;
    }

    public int getId_departamento() {
        return id_departamento;
    }

    public void setId_departamento(int id_departamento) {
        this.id_departamento = id_departamento;
    }

    public int getNumeroEmpleados() {
        return numeroEmpleados;
    }

    public void setNumeroEmpleados(int numeroEmpleados) {
        this.numeroEmpleados = numeroEmpleados;
    }

    @Override
    public String toString() {
        return "Departamento{" + "nombreDepartamento=" + nombreDepartamento + ", id_departamento=" + id_departamento + ", numeroEmpleados=" + numeroEmpleados + '}';
    }
    
    
    
    
    
    
}
