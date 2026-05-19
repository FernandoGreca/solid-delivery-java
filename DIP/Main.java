package DIP;

public class Main {
    public static void main(String[] args) {
        NotificadorPedido notificadorEmail = new NotificadorPedido(new NotificacaoEmail());
        NotificadorPedido notificadorSms = new NotificadorPedido(new NotificacaoSms());
        NotificadorPedido notificadorWhatsApp = new NotificadorPedido(new NotificacaoWhatsApp());

        notificadorEmail.notificarCliente("Pedido #200 confirmado!");
        notificadorSms.notificarCliente("Pedido #201 saiu para entrega!");
        notificadorWhatsApp.notificarCliente("Pedido #202 foi entregue!");
    }
}
