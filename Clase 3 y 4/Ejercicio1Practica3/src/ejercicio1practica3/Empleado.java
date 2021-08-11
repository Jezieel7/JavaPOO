package ejercicio1practica3;

public abstract class Empleado {
    private String nombre;
    private double sueldoBasico;

    Empleado(String nombre, double sueldoBasico){
        this.setNombre(nombre);
        this.setSueldoBasico(sueldoBasico);
    }
    
    Empleado(){
        
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSueldoBasico() {
        return sueldoBasico;
    }

    public void setSueldoBasico(double sueldoBasico) {
        this.sueldoBasico = sueldoBasico;
    }
    
    public abstract double calcularSueldoCobrar();
    
    @Override
    public String toString(){
        String aux;
        aux = "nombre : " + this.getNombre() +
              "sueldoBasico : " + this.getSueldoBasico();
        return aux;
    }
}
