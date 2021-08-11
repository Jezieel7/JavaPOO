/*
Se dispone de la clase Partido (ya implementada).
Un objeto partido representa un encuentro entre dos equipos (local y visitante).
Un objeto partido puede crearse sin valores iniciales o enviando en el mensaje de creación el nombre del equipo local,
el nombre del visitante, la cantidad de goles del local y del visitante (en ese orden).
Un objeto partido sabe responder a los siguientes mensajes:
getLocal() retorna el nombre (String) del equipo local
getVisitante() retorna el nombre (String) del equipo visitante
getGolesLocal() retorna la cantidad de goles (int) del equipo local
getGolesVisitante() retorna la cantidad de goles (int) del equipo visitante
setLocal(X) modifica el nombre del equipo local al “String” pasado por parámetro (X)
setVisitante(X) modifica el nombre del equipo visitante al “String” pasado por parámetro (X)
setGolesLocal(X) modifica la cantidad de goles del equipo local “int” pasado por parámetro (X)
setGolesVisitante(X) modifica la cantidad de goles del equipo visitante “int” pasado por parámetro (X)
hayGanador() retorna un boolean que indica si hubo (true) o no hubo (false) ganador
getGanador() retorna el nombre (String) del ganador del partido (si no hubo retorna un String vacío).
hayEmpate() retorna un boolean que indica si hubo (true) o no hubo (false) empate
Implemente un programa que cargue un vector con a lo sumo 20 partidos disputados en el
campeonato. La información de cada partido se lee desde teclado hasta ingresar uno con
nombre de visitante “ZZZ” o alcanzar los 20 partidos. Luego de la carga informar:
- La cantidad de partidos que ganó River.
- El total de goles que realizó Boca jugando de local.
- El porcentaje de partidos finalizados con empate.
 */
package ejercicio5practica2;

import PaqueteLectura.Lector;

public class Ejercicio5Practica2 {

    public static void main(String[] args) {
        Partido [] vector = new Partido [20];
        int dimL = 0;
        String visitante = Lector.leerString();
        if(visitante.equals("ZZZ")){
            String local = Lector.leerString();
            int golLocal = Lector.leerInt();
            int golVisitante = Lector.leerInt();
            while((visitante.equals("ZZZ")) && (dimL < 20)){
                vector[dimL] = new Partido(local, visitante, golLocal, golVisitante);
                dimL += 1;
                visitante = Lector.leerString();
                if(visitante.equals("ZZZ")){
                    local = Lector.leerString();
                    golLocal = Lector.leerInt();
                    golVisitante = Lector.leerInt();
                }
            }
        }
        
        int i; int cantRiver = 0; int cantGolesBoca = 0; int cantEmpates = 0;
        for(i=0; i<dimL; i++){
            if(vector[i].hayGanador()){
                if(vector[i].getGanador().equals("River")){
                    cantRiver++;
                }
            }else{
                cantEmpates++;
            }
            if(vector[i].getLocal().equals("Boca")){
                cantGolesBoca = cantGolesBoca + vector[i].getGolesLocal();
            }
        }
        
        System.out.println("La cantidad de partidos que ganó River " + cantRiver);
        System.out.println("El total de goles que realizó Boca jugando de local" + cantGolesBoca);
        System.out.println("El porcentaje de partidos finalizados con empate " + ((cantEmpates / dimL)*100));
    }
    
}
