package service;

import estrategias.DescontoVIPStrategy;
import interfaces.ICadastroCliente;
import interfaces.IGerenciadorFidelidade;
import interfaces.INotificador;
import model.Cliente;

public class ClienteVIPService implements ICadastroCliente, INotificador, IGerenciadorFidelidade {

    private DescontoVIPStrategy estrategia = new DescontoVIPStrategy();

    public void cadastrarCliente(Cliente cliente) {
        System.out.println("VIP: Cadastrando " + cliente.getNome());
    }

    public Cliente buscarClientePorEmail(String email) {
        System.out.println("VIP: Buscando cliente");
        return new Cliente("Cliente VIP", email);
    }

    public void enviarNotificacao(String email, String mensagem) {
        System.out.println("VIP: Notificação enviada para " + email);
    }

    public void aplicarDescontoVIP(String email, double percentual) {
        double valorFinal = estrategia.aplicar(100, percentual);
        System.out.println("VIP: Valor final com desconto = " + valorFinal);
    }

}