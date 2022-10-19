package one.dio.gof.singleton;


/**
 * Singleton "lazy holder"
 * @author MarceloMoraes
 * @see <a href="https://stackoverflow.com/a/24018148">Refencia sobre Lazy Holder</a>
 * gera uma instância única do objeto
 */

public class SingletonLazyHolder {

    private static class InstanceHolder {
        public static SingletonLazyHolder instancia = new SingletonLazyHolder();
    } // classe para instanciar um objeto

    private SingletonLazyHolder() { // garantia de que ninguém irá instanciar esse objeto
        super();
    }

    public static SingletonLazyHolder getInstancia(){
        return InstanceHolder.instancia;
    } // essse método expõe uma instância de maneira pública para quem for utilizar

}
