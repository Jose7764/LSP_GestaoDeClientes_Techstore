package service;

import interfaces.ICadastroCliente;
import model.Cliente;

public class ClienteComumService implements ICadastroCliente {

    public void cadastrarCliente(Cliente cliente) {
        System.out.println("COMUM: Cadastrando " + cliente.getNome());
    }

    public Cliente buscarClientePorEmail(String email) {
        System.out.println("COMUM: Buscando cliente");
        return new Cliente("Cliente Comum", email);
    }

}