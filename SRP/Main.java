package SRP;

public class Main {
    public static void main(String[] args) {
        PedidoService pedidoService = new PedidoService();
        PedidoRepository pedidoRepository = new PedidoRepository();
        PedidoExibicao pedidoExibicao = new PedidoExibicao();

        Pedido pedido = pedidoService.criarPedido(101, "Ana", "Pizza Grande", 59.90);
        pedidoRepository.salvar(pedido);
        pedidoExibicao.exibir(pedido);
    }
}
