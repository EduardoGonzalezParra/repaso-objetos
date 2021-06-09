package uaslp.objetos.figuras;

import uaslp.objetos.figuras.Triangulo;

public class TrianguloEquilatero extends Triangulo {

    private String description;
    private String name;

    public String getDescription(){
        return description = "Lados iguales";
    }

    @Override
    public String getName() {
        return name = "Triangulo Equilatero";
    }
}
