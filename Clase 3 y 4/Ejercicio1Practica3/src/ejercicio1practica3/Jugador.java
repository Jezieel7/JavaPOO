package ejercicio1practica3;

public class Jugador extends Empleado {
    private int numPartidosJugados;
    private int numGoles;
    
    public Jugador(String nombre, double sueldoBasico, int numPartidosJugados, int numGoles){
        super(nombre, sueldoBasico);
        this.setNumPartidosJugados(numPartidosJugados);
        this.setNumGoles(numGoles);
    }
    
    public Jugador(){
        super();
    }
    
    public int getNumPartidosJugados() {
        return numPartidosJugados;
    }

    public void setNumPartidosJugados(int numPartidosJugados) {
        this.numPartidosJugados = numPartidosJugados;
    }
    
    public int getNumGoles(){
        return this.numGoles;
    }
    
    public void setNumGoles(int numGoles){
        this.numGoles = numGoles;
    }
    
    @Override
    public double calcularSueldoCobrar(){
        if((this.getNumGoles() / this.getNumPartidosJugados()) > 0.5)
            return (this.getSueldoBasico() + this.getSueldoBasico());
        else
            return this.getSueldoBasico();
    }
}
