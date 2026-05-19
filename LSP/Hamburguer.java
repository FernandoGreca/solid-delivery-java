package LSP;

public class Hamburguer extends ProdutoRestaurante {
    public Hamburguer(String nome, double preco) {
        super(nome, preco);
    }

    @Override
    public void preparar() {
        System.out.println("Montando hamburguer na chapa.");
    }
}
