package uaslp.objetos.escuela;

public class SalaB extends SalaDeJuntas{
    private static SalaB uniqueInstance;

    public String getNombre() {
        return "Sala B";
    }

    static public SalaB getInstance(){
        if(uniqueInstance == null){
            uniqueInstance = new SalaB();
        }
        return uniqueInstance;
    }
}
