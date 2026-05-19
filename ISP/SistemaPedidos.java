package ISP;

public class SistemaPedidos implements GerenciadorPedidos {
    @Override
    public void criarPedido(String cliente) {
        System.out.println("Pedido criado para: " + cliente);
    }

    @Override
    public void atualizarStatusPedido(int pedidoId, String status) {
        System.out.println("Pedido #" + pedidoId + " atualizado para: " + status);
    }
}
