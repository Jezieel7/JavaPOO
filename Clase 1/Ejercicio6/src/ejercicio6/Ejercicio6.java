package ejercicio6;

import PaqueteLectura.Lector;

public class Ejercicio6 {

    public static void main(String[] args) {
        int i; int [] vector = new int [4];
        for(i=0; i<4; i++)
            vector[i]= 0;
        
        int op = 0; 
        while(op != 5){
            op = Lector.leerInt();
            vector[op] += 1;
        }
        
        int max = 0;
        for(i=0; i<4; i++){
            if(vector[i] > max)
                max = i;
            System.out.println("La cantidad de personas atendidas por la operación " + i + "es de " + vector[i]);
            System.out.println("La operación más solicitada fue la " + max);
        }
    }
    
}
