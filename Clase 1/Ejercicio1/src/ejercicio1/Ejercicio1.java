package ejercicio1;

import PaqueteLectura.Lector;
/*Escriba un programa que imprima en consola el factorial de un
número N (ingresado por teclado, N > 0). Ejemplo: para N=5
debería imprimir 5! = 120*/
public class Ejercicio1 {

    public static void main(String[] args) {
        int N = Lector.leerInt();
        int factorial = 1;
        if(N > 0){
            int i;
            for(i=1; i<=N; i++)
                factorial = factorial * i;
            System.out.println("El factorial de " + N + " es " + factorial);
        }else{
            System.out.println("No se puede realizar el factorial de un número que sea cero o menor a cero");
        }
    }
}
