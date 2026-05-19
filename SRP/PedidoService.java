package srp;

public class PedidoService {
    public Pedido criarPedido(int id, String cliente, String item, double valorTotal) {
        return new Pedido(id, cliente, item, valorTotal);
    }
}
