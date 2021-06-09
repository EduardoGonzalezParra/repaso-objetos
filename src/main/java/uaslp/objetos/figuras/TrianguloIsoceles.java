package uaslp.objetos.figuras;

public class TrianguloIsoceles extends  Triangulo{

    public String getDescription(){
        String description;
        return description = "2 Lados iguales y 1 diferente";
    }

    @Override
    public String getName() {
        String name;
        return name = "Triangulo Isoceles";
    }
}
