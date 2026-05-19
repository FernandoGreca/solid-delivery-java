package ISP;

public class SistemaEntregas implements GerenciadorEntregas {
    @Override
    public void iniciarEntrega(int pedidoId) {
        System.out.println("Entrega do pedido #" + pedidoId + " iniciada.");
    }

    @Override
    public void finalizarEntrega(int pedidoId) {
        System.out.println("Entrega do pedido #" + pedidoId + " finalizada.");
    }
}
