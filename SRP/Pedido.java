package srp;

public class Pedido {
    private final int id;
    private final String cliente;
    private final String item;
    private final double valorTotal;

    public Pedido(int id, String cliente, String item, double valorTotal) {
        this.id = id;
        this.cliente = cliente;
        this.item = item;
        this.valorTotal = valorTotal;
    }

    public int getId() {
        return id;
    }

    public String getCliente() {
        return cliente;
    }

    public String getItem() {
        return item;
    }

    public double getValorTotal() {
        return valorTotal;
    }
}
