package OCP;

public class PagamentoPix implements FormaPagamento {
    @Override
    public void pagar(double valor) {
        System.out.println("Pagamento via PIX confirmado: R$" + String.format("%.2f", valor));
    }
}
