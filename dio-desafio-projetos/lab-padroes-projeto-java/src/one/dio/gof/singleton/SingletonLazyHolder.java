package one.dio.gof.singleton;


/**
 * Singleton "lazy holder"
 * @author MarceloMoraes
 * @see <a href="https://stackoverflow.com/a/24018148">Refencia sobre Lazy Holder</a>
 * gera uma inst�ncia �nica do objeto
 */

public class SingletonLazyHolder {

    private static class InstanceHolder {
        public static SingletonLazyHolder instancia = new SingletonLazyHolder();
    } // classe para instanciar um objeto

    private SingletonLazyHolder() { // garantia de que ningu�m ir� instanciar esse objeto
        super();
    }

    public static SingletonLazyHolder getInstancia(){
        return InstanceHolder.instancia;
    } // essse m�todo exp�e uma inst�ncia de maneira p�blica para quem for utilizar

}
