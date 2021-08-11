package ejercicio0practica3;

import PaqueteLectura.Lector;

public class Ejercicio0Practica3 {

    public static void main(String[] args) {
        String colorLinea = Lector.leerString();
        String colorRelleno = Lector.leerString();
        double lado1 = Lector.leerDouble();
        double lado2 = Lector.leerDouble();
        double lado3 = Lector.leerDouble();
        Triangulo t = new Triangulo(colorRelleno, colorLinea);
        t.setLado1(lado1); t.setLado2(lado2); t.setLado3(lado3);
        
        Cuadrado c = new Cuadrado(lado1, colorRelleno, colorLinea);
        
        System.out.println(t.calcularArea());
        System.out.println(t.calcularPerimetro());
        System.out.println(t.toString());
        
        System.out.println(c.calcularArea());
        System.out.println(c.calcularPerimetro());
        System.out.println(c.toString());
    }
    
}
