package ejercicio2practica3;

public class Persona {
    private String nombre;
    private int edad;
    private int dni;

    
    public Persona(String nombre, int edad, int dni){
        this.setNombre(nombre);
        this.setEdad(edad);
        this.setDni(dni);
    }
    
    public Persona(){
        
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }
    
    @Override
    public String toString(){
        String aux;
        aux = "Mi nombre es " +  this.getNombre() +
              " , mi DNI es " + this.getDni() +
              " y tengo " + this.getEdad() + " años.";
        return aux;
    }
    
    
}
