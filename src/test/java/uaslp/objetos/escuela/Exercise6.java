package uaslp.objetos.escuela;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class Exercise6 {

     /*
    INSTRUCCIONES EJERCICIO 6:

    PARA ESTE EJERCICIO DEBERÁS:
    -> Crear Elementos necesarios para que el programa compile
    -> Lograr un 100% de coverage de la clase AlgoritmoX

    En este ejercicio los tests que crees deberán estar en esta clase, es el UNICO
    ejercicio en el que se te permite modificar el Unit Test, PERO está prohibido
    modificar el test existente "validarInterfacesCreadas"

     */

    @Test
    public void validarInterfacesCreadas(){
        assertThat(Dependencia1.class).isInterface();
        assertThat(Dependencia2.class).isInterface();
        assertThat(Dependencia3.class).isInterface();
    }

    @Test
    public void validarAEqualsB(){
        //Given
        int a = 5;
        int b = 5;
        String c = "Guardado";

        Dependencia1 dependencia1 = Mockito.mock(Dependencia1.class);
        Dependencia2 dependencia2 = Mockito.mock(Dependencia2.class);
        Dependencia3 dependencia3 = Mockito.mock(Dependencia3.class);

        AlgoritmoX algoritmoX = new AlgoritmoX(dependencia1, dependencia2, dependencia3);

        //When
        algoritmoX.algoritmoACubrir(5, 5, "Guardado");

        //Then
        Mockito.verify(dependencia1).save(c);
        Mockito.verify(dependencia3).recover();
        Mockito.verifyNoMoreInteractions(dependencia1, dependencia2, dependencia3);
    }

    @Test
    public void validarALowerThanB(){
        //Given
        int a = 3;
        int b = 5;
        String c = "Impreso";

        Dependencia1 dependencia1 = Mockito.mock(Dependencia1.class);
        Dependencia2 dependencia2 = Mockito.mock(Dependencia2.class);
        Dependencia3 dependencia3 = Mockito.mock(Dependencia3.class);

        AlgoritmoX algoritmoX = new AlgoritmoX(dependencia1, dependencia2, dependencia3);

        //When
        algoritmoX.algoritmoACubrir(3, 5, "Impreso");

        //Then
        Mockito.verify(dependencia2).print(a, c);
        Mockito.verify(dependencia3).recover();
        Mockito.verifyNoMoreInteractions(dependencia1, dependencia2, dependencia3);
    }

    @Test
    public void validarAHigherThanB(){
        //Given
        int a = 5;
        int b = 3;
        String c = "Enviado";

        Dependencia1 dependencia1 = Mockito.mock(Dependencia1.class);
        Dependencia2 dependencia2 = Mockito.mock(Dependencia2.class);
        Dependencia3 dependencia3 = Mockito.mock(Dependencia3.class);

        AlgoritmoX algoritmoX = new AlgoritmoX(dependencia1, dependencia2, dependencia3);

        //When
        algoritmoX.algoritmoACubrir(5, 3, "Enviado");

        //Then
        Mockito.verify(dependencia3).send(a, b);
        Mockito.verify(dependencia3).recover();
        Mockito.verifyNoMoreInteractions(dependencia1, dependencia2, dependencia3);
    }
}
