package LSP;

public class ProdutoRestaurante {
    private final String nome;
    private final double preco;

    public ProdutoRestaurante(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public void preparar() {
        System.out.println("Preparando produto: " + nome);
    }

    public String descricao() {
        return nome + " - R$" + String.format("%.2f", preco);
    }
}
