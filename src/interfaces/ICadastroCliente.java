package interfaces;

import model.Cliente;

public interface ICadastroCliente {

    void cadastrarCliente(Cliente cliente);

    Cliente buscarClientePorEmail(String email);

}