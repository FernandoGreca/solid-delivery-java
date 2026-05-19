package OCP;

public class Main {
    public static void main(String[] args) {
        ProcessadorPagamento processador = new ProcessadorPagamento();
        double valorPedido = 89.90;

        processador.processar(new PagamentoCartao(), valorPedido);
        processador.processar(new PagamentoPix(), valorPedido);
        processador.processar(new PagamentoDinheiro(), valorPedido);
    }
}
