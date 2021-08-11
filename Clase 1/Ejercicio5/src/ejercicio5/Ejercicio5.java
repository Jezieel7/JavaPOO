package ejercicio5;

import PaqueteLectura.Lector;

public class Ejercicio5 {

    public static void main(String[] args) {
        int [][] matriz = new int [8][4];
        int i; int j;
        for(i=0; i<8; i++)
            for(j=0; j<4; j++)
                matriz[i][j] = 0;
        
        int nroPiso = Lector.leerInt();
        while(nroPiso != 9){
            int nroOficina = Lector.leerInt();
            matriz[nroPiso][nroOficina] += 1;
            nroPiso = Lector.leerInt();
        }
        
        for(i=0; i<8; i++)
            for(j=0; j<4; j++)
                System.out.println(matriz[i][j]);
    }
}
