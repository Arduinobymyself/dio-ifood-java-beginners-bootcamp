package one.dio.gof.singleton;

/**
 * Singleton "pregui�oso"
 * @author MarceloMoraes
 * gera uma inst�ncia �nica do objeto
 */
public class SingletonLazy {
    private static SingletonLazy instancia;

    private SingletonLazy() { // garantia de que ningu�m ir� instanciar esse objeto
        super();
    }

    public static SingletonLazy getInstancia(){
        if(instancia == null){
            instancia = new SingletonLazy();
        }
        return instancia;
    } // essse m�todo exp�e uma inst�ncia de maneira p�blica para quem for utilizar
}
