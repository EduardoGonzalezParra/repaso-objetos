package uaslp.objetos.figuras;

public class PoligonoRegular implements Figura{
    public double lado;
    public int numeroDeLados;

    PoligonoRegular(int numeroDeLados) throws DatoFaltanteException{
        if(lado < 5){
            throw new NumeroInvalidoDeLados("Número de lados válido a partir de 5");
        }
        this.numeroDeLados = numeroDeLados;
    }

    PoligonoRegular(int numeroDeLados, double lado){
        this.numeroDeLados = numeroDeLados;
        this.lado = lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    public double getArea(){
        double area;
        double perimetro;
        double apotema;

        perimetro=numeroDeLados*lado;
        apotema=(lado/2)/Math.tan(Math.toRadians((double)360/numeroDeLados)/2);
        area=perimetro*apotema/2;
        return area;
    }

    public double getLado(){
        return lado;
    }

    @Override
    public String getName() {
        String name;
        return name = "Triangulo";
    }
}
