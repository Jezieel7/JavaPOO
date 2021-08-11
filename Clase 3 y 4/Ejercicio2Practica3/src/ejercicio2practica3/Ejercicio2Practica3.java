package ejercicio2practica3;

import PaqueteLectura.Lector;

public class Ejercicio2Practica3 {

    public static void main(String[] args) {
        String nombre = Lector.leerString();
        int edad = Lector.leerInt();
        int dni = Lector.leerInt();
        String tarea = Lector.leerString();
        
        Persona p  = new Persona(nombre, edad, dni);
        
        Trabajador t = new Trabajador(nombre, edad, dni, tarea);
        
        System.out.println(p.toString());
        System.out.println(t.toString());
    }
    
}
