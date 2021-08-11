package ejercicio1practica3;

public class Entrenador extends Empleado{
    private int cantCampeonatosGanados;
    
    public Entrenador(String nombre, double sueldoBasico, int cant){
        super(nombre, sueldoBasico);
        this.setCantCampeonatosGanados(cant);
    }
    
    public Entrenador(){
        super();
    }
    
    public int getCantCampeonatosGanados(){
        return this.cantCampeonatosGanados;
    }
    
    public void setCantCampeonatosGanados(int cant){
        this.cantCampeonatosGanados = cant;
    }
    
    @Override
    public double calcularSueldoCobrar(){
        int cant = this.getCantCampeonatosGanados();
        switch (cant){
            case 0:
                return this.getSueldoBasico();
            case 1: case 2: case 3: case 4:
                return (this.getSueldoBasico() + 5000);
            case 5: case 6: case 7: case 8: case 9: case 10:
                return (this.getSueldoBasico() + 30000);
            default:
                return (this.getSueldoBasico() + 50000);
        }
    }
    
    @Override
    public String toString(){
        String aux;
        aux = "nombre : " + this.getNombre() +
              "sueldoBasico : " + this.getSueldoBasico();
        return aux;
    }
    
}
