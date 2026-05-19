package ISP;

public class Main {
    public static void main(String[] args) {
        GerenciadorPedidos gerentePedidos = new SistemaPedidos();
        GerenciadorEntregas gerenteEntregas = new SistemaEntregas();
        GeradorRelatorios geradorRelatorios = new SistemaRelatorios();
        EnviadorNotificacoes enviadorNotificacoes = new SistemaNotificacoes();

        gerentePedidos.criarPedido("Carlos");
        gerentePedidos.atualizarStatusPedido(12, "Em preparo");

        gerenteEntregas.iniciarEntrega(12);
        gerenteEntregas.finalizarEntrega(12);

        geradorRelatorios.gerarRelatorioDiario();
        enviadorNotificacoes.enviar("Pedido #12 saiu para entrega.");
    }
}
