package uaslp.objetos.escuela;

public class SalaA extends SalaDeJuntas {
    private static SalaA uniqueInstance;

    public String getNombre() {
        return "Sala A";
    }

    static public SalaA getInstance(){
        if(uniqueInstance == null){
            uniqueInstance = new SalaA();
        }
        return uniqueInstance;
    }
}
