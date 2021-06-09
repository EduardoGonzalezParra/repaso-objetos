package uaslp.objetos.escuela;

public class SalaDeJuntasFactory {
    public static SalaDeJuntas get(String nombre) {
        switch (nombre) {
            case "Sala A":
                return SalaA.getInstance();
            case "Sala B":
                return SalaB.getInstance();
            case "Sala C":
                return SalaC.getInstance();
            default:
                return null;

        }
    }
}
