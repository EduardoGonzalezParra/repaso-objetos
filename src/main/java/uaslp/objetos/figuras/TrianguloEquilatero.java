package uaslp.objetos.figuras;

public class TrianguloEquilatero extends Triangulo{

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
