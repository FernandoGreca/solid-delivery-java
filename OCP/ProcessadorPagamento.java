package OCP;

public class ProcessadorPagamento {
    public void processar(FormaPagamento formaPagamento, double valor) {
        formaPagamento.pagar(valor);
    }
}
