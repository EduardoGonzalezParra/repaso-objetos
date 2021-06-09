package uaslp.objetos.figuras;

public class TrianguloEscaleno extends Triangulo{
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
