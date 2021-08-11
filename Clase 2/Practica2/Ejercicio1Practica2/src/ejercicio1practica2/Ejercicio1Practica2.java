/*
Luego muestre en consola la representación de ese objeto en formato String.
 */
package ejercicio1practica2;

import PaqueteLectura.Lector;

public class Ejercicio1Practica2 {

    public static void main(String[] args) {
        Persona unaPersona = new Persona();
        String nombre = Lector.leerString();
        int dni = Lector.leerInt();
        int edad = Lector.leerInt();
        unaPersona.setNombre(nombre);
        unaPersona.setEdad(edad);
        unaPersona.setDni(dni);
        System.out.println(unaPersona.toString());
    }
    
}
