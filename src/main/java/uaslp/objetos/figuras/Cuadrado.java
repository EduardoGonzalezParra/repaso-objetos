package uaslp.objetos.figuras;

public class Cuadrado implements Figura{
    private double lado;

    Cuadrado(){
    }

    Cuadrado(double lado){
        this.lado = lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    public double getArea(){
        double area;
        return area = lado * lado;
    }

    public double getLado(){
        return lado;
    }

    @Override
    public String getName() {
        String name;
        return name = "Cuadrado";
    }
}
