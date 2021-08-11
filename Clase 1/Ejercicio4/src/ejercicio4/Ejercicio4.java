package ejercicio4;

import PaqueteLectura.GeneradorAleatorio;
import PaqueteLectura.Lector;

public class Ejercicio4 {

    public static void main(String[] args) {
        GeneradorAleatorio.iniciar();
        int matriz[][] = new int [10][10];
        int i; int j;
        for (i=0; i<10; i++){
            for(j=0; j<10; j++){
                matriz[i][j] =  GeneradorAleatorio.generarInt(201); //genera la matriz;
            }
        }
        int suma = 0; int [] vector = new int [10];
        int num = Lector.leerInt(); boolean bool = false;
        for (i=0; i<10; i++){
            for(j=0; j<10; j++){
                System.out.println(matriz[i][j]); //imprime elementos de la matriz;
                if(num == matriz[i][j]){
                    bool = true;
                    System.out.println("Encontre el elemento que pedías en la matriz, está en la fila: " + i + " y columna: " + j);
                }
                if(((i > 1) && (i < 10)) && (j < 4)){ //suma los elementos pedidos;
                    suma += matriz[i][j];
                }
                vector[i] += matriz[j][i]; //genera un vector que tiene la suma de los elementos de la columna i de la matriz;
            }
        }
        System.out.println("La suma de los elementos pedidos " + suma);
        if(! bool){
            System.out.println("El elemento no estaba en la matriz u.u");
        }
    }
    
}
