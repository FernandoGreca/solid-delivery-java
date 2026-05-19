package LSP;

public class Bebida extends ProdutoRestaurante {
    public Bebida(String nome, double preco) {
        super(nome, preco);
    }

    @Override
    public void preparar() {
        System.out.println("Separando bebida e adicionando gelo.");
    }
}
