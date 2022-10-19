package one.dio.gof.singleton;

/**
 * singleton "apressado
 * @author Marcelo Moraes
 *
 */
public class SingletonEager {

    private static SingletonEager instancia = new SingletonEager(); //instancia prematuramente o objeto

    public SingletonEager() {
        super();
    }

    public static SingletonEager getInstancia(){
        return instancia;
    }
}
