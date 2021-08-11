package ejercicio2practica3;

public class Trabajador extends Persona{
    private String tarea;

    public Trabajador(String nombre, int edad, int dni, String tarea){
        super(nombre, edad, dni);
        this.setTarea(tarea);
    }
    
    public Trabajador(){
        super();
    }
    
    public String getTarea() {
        return tarea;
    }

    public void setTarea(String tarea) {
        this.tarea = tarea;
    }
    
    @Override
    public String toString(){
        String aux = super.toString() + " Soy " + this.getTarea();
        return aux;
    }
}
