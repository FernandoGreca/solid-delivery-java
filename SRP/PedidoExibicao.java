package SRP;

public class PedidoExibicao {
    public void exibir(Pedido pedido) {
        System.out.println("Pedido #" + pedido.getId());
        System.out.println("Cliente: " + pedido.getCliente());
        System.out.println("Item: " + pedido.getItem());
        System.out.println("Valor total: R$" + String.format("%.2f", pedido.getValorTotal()));
    }
}
