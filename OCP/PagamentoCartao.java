package OCP;

public class PagamentoCartao implements FormaPagamento {
    @Override
    public void pagar(double valor) {
        System.out.println("Pagamento via Cartao aprovado: R$" + String.format("%.2f", valor));
    }
}
