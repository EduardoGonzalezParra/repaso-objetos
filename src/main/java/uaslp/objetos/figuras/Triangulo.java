package uaslp.objetos.figuras;

public class Triangulo implements Figura{
    private double base;
    private double altura;

    Triangulo(){
    }

    Triangulo(double base, double altura){
        this.base = base;
        this.altura = altura;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getArea(){
        double area;
        return area = base * altura / 2;
    }

    public double getBase(){
        return base;
    }

    public double getAltura(){
        return altura;
    }

    public String getDescription(){
        String description;
        return description = "Cualquier triangulo";
    }

    @Override
    public String getName() {
        String name;
        return name = "Triangulo";
    }
}
