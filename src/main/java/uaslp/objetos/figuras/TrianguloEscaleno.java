package uaslp.objetos.figuras;

import uaslp.objetos.figuras.Triangulo;

public class TrianguloEscaleno extends Triangulo {
    private String description;
    private String name;

    public String getDescription(){
        return description = "Lados diferentes";
    }

    @Override
    public String getName() {
        return name = "Triangulo Escaleno";
    }
}
