package LSP;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<ProdutoRestaurante> produtos = new ArrayList<>();
        produtos.add(new Pizza("Pizza Calabresa", 49.90));
        produtos.add(new Hamburguer("Hamburguer Artesanal", 34.90));
        produtos.add(new Bebida("Refrigerante", 7.50));

        for (ProdutoRestaurante produto : produtos) {
            produto.preparar();
            System.out.println(produto.descricao());
        }
    }
}
