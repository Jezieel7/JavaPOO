package ejercicio2practica2;
/*
Utilizando la clase Persona (ya implementada). Realice un programa que almacene en un vector 15 personas.
La información de cada persona debe leerse de teclado. Luego de almacenar la información:
- Informe la cantidad de personas mayores de 65 años.
- Muestre la representación de la persona con menor DNI.
*/
import PaqueteLectura.Lector;

public class Ejercicio2Practica2 {

    public static void main(String[] args) {
        Persona [] personas = new Persona[3];
        int i; int menorDNI = 9999; int cantMayores = 0; int pos = -1;
        for(i=0; i<3; i++){
            String nombre = Lector.leerString();
            int dni = Lector.leerInt();
            int edad = Lector.leerInt();
            Persona unaPersona = new Persona();
            unaPersona.setNombre(nombre);
            unaPersona.setDNI(dni);
            unaPersona.setEdad(edad);
            if(dni < menorDNI){
                menorDNI = dni;
                pos = i;
            }
            if(edad > 65)
                cantMayores++;
            
            personas[i] = unaPersona;
        }
        
        System.out.println("La cantidad de personas mayores de 65 años es de " + cantMayores);
        
        System.out.println("La persona con el menor dni es " + personas[pos]);
    }
    
}
