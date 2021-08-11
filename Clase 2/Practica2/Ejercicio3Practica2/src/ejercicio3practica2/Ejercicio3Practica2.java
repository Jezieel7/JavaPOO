package ejercicio3practica2;
/*
Se realizará un casting para un programa de TV. El casting durará a lo sumo 5 días y en cada día se entrevistarán
a 8 personas en distinto turno.
a) Simular el proceso de inscripción de personas al casting. A cada persona se le pide nombre, DNI y edad
y se la debe asignar en un día y turno de la siguiente manera:
las personas primero completan el primer día en turnos sucesivos, luego el segundo día y así siguiendo.
La inscripción finaliza al llegar una persona con nombre “ZZZ” o al cubrirse los 40 cupos de casting.
Una vez finalizada la inscripción:
b) Informar para cada día y turno el nombre de la persona a entrevistar.
NOTA: utilizar la clase Persona y pensar en la estructura de datos a utilizar.

*/
import PaqueteLectura.Lector;

public class Ejercicio3Practica2 {

    public static void main(String[] args) {
        int cantParticipantes = 40; int inscriptos = 0;
        int dia = 0; int acuDia = 0; int turno = 0;
        Persona [][] diaTurno = new Persona [5][8];
        String nombre = "vacio"; int dni; int edad;
        
        while((inscriptos < cantParticipantes) && (nombre.equals("ZZZ"))){
            nombre = Lector.leerString();
            if (nombre.equals("ZZZ")){
                inscriptos += 1;
                dni = Lector.leerInt(); edad = Lector.leerInt();
                Persona unaPersona = new Persona();
                unaPersona.setNombre(nombre);
                unaPersona.setEdad(edad);
                unaPersona.setDNI(dni);
                diaTurno[dia][turno] = unaPersona;
                if(turno < 8){
                    turno+= 1;
                }else{
                    turno = 0;
                    dia += 1;
                }
            }
        }
        
        int i; int j;
        for(i=0; i<dia; i++)
            for(j=0; j<turno; j++)
                System.out.println(diaTurno[i][j].toString());
    }
    
}
