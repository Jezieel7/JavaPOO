package ejercicio0practica3;

public class Triangulo extends Figura{
    private double lado1;
    private double lado2;
    private double lado3;
    
    public Triangulo(String unCR, String unCL){
        super(unCR, unCL);
    }
    
    public double getLado1(){
        return lado1;
    }
    
    public double getLado2(){
        return lado2;
    }
    
    public double getLado3(){
        return lado3;
    }
    
    public void setLado1(double unLado1){
        this.lado1 = unLado1;
    }
    
    public void setLado2(double unLado2){
        this.lado2 = unLado2;
    }
    
    public void setLado3(double unLado3){
        this.lado3 = unLado3;
    }
    
    @Override
    public String toString(){
        String aux = "Area: " + this.calcularArea() +
                     " CR: "  + getColorRelleno() + 
                     " CL: " + getColorLinea() +
                     " Lado1 : " + getLado1() +
                     " Lado2 : " + getLado3() +
                     " Lado3 : " + getLado3();
             return aux;
       }
    
    @Override
    public double calcularPerimetro(){
        return (this.lado1 + this.lado2 + this.lado3);
    }
     
    @Override
    public double calcularArea(){
        double s = calcularPerimetro() / 2;
        double area = Math.sqrt(s*(s - this.lado1)*(s - this.lado2)*(s - this.lado3));
        return area;
    }
}