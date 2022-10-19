package one.dio.gof.singleton;

/**
 * Singleton "preguiçoso"
 * @author MarceloMoraes
 * gera uma instância única do objeto
 */
public class SingletonLazy {
    private static SingletonLazy instancia;

    private SingletonLazy() { // garantia de que ninguém irá instanciar esse objeto
        super();
    }

    public static SingletonLazy getInstancia(){
        if(instancia == null){
            instancia = new SingletonLazy();
        }
        return instancia;
    } // essse método expõe uma instância de maneira pública para quem for utilizar
}
