import model.Cliente;
import service.ClienteComumService;
import service.ClienteVIPService;

public class Main {

    public static void main(String[] args) {

        ClienteComumService comum = new ClienteComumService();
        comum.cadastrarCliente(new Cliente("João", "joao@email.com"));

        ClienteVIPService vip = new ClienteVIPService();
        vip.cadastrarCliente(new Cliente("Maria", "maria@email.com"));
        vip.enviarNotificacao("maria@email.com", "Promoção VIP");
        vip.aplicarDescontoVIP("maria@email.com", 20);

    }

}