package ejercicio3;

import PaqueteLectura.Lector;

public class Ejercicio3 {

    public static void main(String[] args) {
        double [] alturas = new double[15];
        int i; double suma = 0;
        for(i=0; i<15; i++){
            alturas[i] = Lector.leerDouble();
            suma += alturas[i];
        }
        
        double prom;
        prom = (suma / 15);
        System.out.println("Promedio de las alturas " + prom);
        
        int j; int cantidad = 0;
        for (j=0; j<15; j++){
            if(alturas[j] > prom){
                cantidad = cantidad + 1;
            }
        }
        System.out.println("la cantidad de jugadores que superan el promedio: " + cantidad);
    }
}
