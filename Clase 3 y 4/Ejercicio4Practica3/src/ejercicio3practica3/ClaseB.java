package ejercicio3practica3;

public class ClaseB extends ClaseA{
    public int dos(){
        return 5;
    }
    public int cuatro(){
        return this.dos() + super.tres();
    }
    public int seis(){
        return this.dos();
    }
}
