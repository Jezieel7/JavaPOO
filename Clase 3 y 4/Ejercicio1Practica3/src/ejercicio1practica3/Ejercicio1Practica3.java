package ejercicio1practica3;

import PaqueteLectura.Lector;

public class Ejercicio1Practica3 {

    public static void main(String[] args) {
        String nombre = Lector.leerString();
        double sueldoBasico = Lector.leerDouble();
        int cant = Lector.leerInt();
        int goles = Lector.leerInt();
        int partidos = Lector.leerInt();
        
        Entrenador e = new Entrenador(nombre, sueldoBasico, cant);
        
        Jugador j = new Jugador(nombre, sueldoBasico, partidos, goles);
        
        System.out.println(e.toString());
        System.out.println(e.calcularSueldoCobrar());
        System.out.println(j.toString());
        System.out.println(j.calcularSueldoCobrar());
        
    }
    
}
