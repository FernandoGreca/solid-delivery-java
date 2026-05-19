package LSP;

public class Pizza extends ProdutoRestaurante {
    public Pizza(String nome, double preco) {
        super(nome, preco);
    }

    @Override
    public void preparar() {
        System.out.println("Assando pizza no forno.");
    }
}
