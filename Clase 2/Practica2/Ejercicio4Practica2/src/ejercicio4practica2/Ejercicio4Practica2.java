/*
Realice un programa que cargue un vector con 10 strings leídos desde teclado.
El vector generado tiene un mensaje escondido que se forma a partir de la primera letra de cada string.
Muestre el mensaje escondido en consola.
NOTA: La primera letra de un string se obtiene enviándole el mensaje charAt(0) al objeto string.
Probar con: humo oso lejos ala menos usado nene de ocho ! Debería imprimir: holamundo!
 */
package ejercicio4practica2;

import PaqueteLectura.Lector;

public class Ejercicio4Practica2 {

    public static void main(String[] args) {
        //Declaración del vector de 10 strings;
        String [] vector =  new String [10];
        
        //Carga del vector;
        int i;
        for(i=0; i<10; i++)
            vector[i] = Lector.leerString();
        
        //Imprime la primera letra de cada string del vector;
        int j;
        for(j=0; j<10; j++){
            System.out.print(vector[j].charAt(0));
        }
    }
    
}
