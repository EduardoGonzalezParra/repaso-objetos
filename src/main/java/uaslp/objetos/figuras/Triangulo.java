package uaslp.objetos.figuras;

import uaslp.objetos.figuras.AlturaNoProvistaException;
import uaslp.objetos.figuras.BaseNoProvistaException;
import uaslp.objetos.figuras.DatoFaltanteException;
import uaslp.objetos.figuras.Figura;

public class Triangulo implements Figura {
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

    public double getArea()throws DatoFaltanteException {
        double area;

        if(base == 0){
            throw new BaseNoProvistaException();
        }
        if(altura <= 0){
            throw new AlturaNoProvistaException();
        }

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
