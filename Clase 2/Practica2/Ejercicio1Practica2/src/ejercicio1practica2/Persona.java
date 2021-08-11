package ejercicio1practica2;

public class Persona {
    private String nombre;
    private int dni;
    private int edad;
    
    public String getNombre(){
        return nombre;
    }
    
    public void setNombre(String unNombre){
        nombre = unNombre;
    }
    
    public int getDni(){
        return dni;
    }
    
    public void setDni(int unDni){
        dni = unDni;
    }
    
    public int getEdad(){
        return edad;
    }
    
    public void setEdad(int unaEdad){
        edad = unaEdad;
    }
    
    @Override
    public String toString(){
        String aux;
        aux= "Mi nombre es " + nombre + ", mi DNI es " + dni + " y tengo " + edad + " años";
        return aux;
    }
    
}
