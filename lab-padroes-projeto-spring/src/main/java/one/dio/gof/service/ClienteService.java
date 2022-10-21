package one.dio.gof.service;


import one.dio.gof.model.Cliente;


/**
 * Interface que define o padão strategy no domínio de cliente.
 * Com isso, se necessário, podemos ter multiplas implementações dess mesma interface
 * @author MarceloMoraes
 */

public interface ClienteService {
    Iterable<Cliente> buscarTodos();
    Cliente buscarPorId(Long id);
    void inserir(Cliente cliente);
    void atualizar(Long id, Cliente cliente);
    void deletar(Long id);
}
