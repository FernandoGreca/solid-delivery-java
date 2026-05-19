package OCP;

public class PagamentoDinheiro implements FormaPagamento {
    @Override
    public void pagar(double valor) {
        System.out.println("Pagamento em Dinheiro recebido: R$" + String.format("%.2f", valor));
    }
}
