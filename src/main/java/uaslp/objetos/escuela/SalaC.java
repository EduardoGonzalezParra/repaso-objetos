package uaslp.objetos.escuela;

public class SalaC extends SalaDeJuntas{
    private static SalaC uniqueInstance;

    public String getNombre() {
        return "Sala C";
    }

    static public SalaC getInstance(){
        if(uniqueInstance == null){
            uniqueInstance = new SalaC();
        }
        return uniqueInstance;
    }
}
