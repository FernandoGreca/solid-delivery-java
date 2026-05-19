package ISP;

public interface GerenciadorPedidos {
    void criarPedido(String cliente);
    void atualizarStatusPedido(int pedidoId, String status);
}
