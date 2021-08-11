package ejercicio2;

public class Ejercicio2 {

    public static void main(String[] args) {
        int j; int Factorial = 1;
        for(j=1; j<10; j++){
            Factorial = Factorial * j;
            if((j % 2) != 0)
                System.out.println("El ! de " + j + " es " + Factorial);
    
        }
    }
}
