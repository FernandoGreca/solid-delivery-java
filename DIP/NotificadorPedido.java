package DIP;

public class NotificadorPedido {
    private final CanalNotificacao canalNotificacao;

    public NotificadorPedido(CanalNotificacao canalNotificacao) {
        this.canalNotificacao = canalNotificacao;
    }

    public void notificarCliente(String mensagem) {
        canalNotificacao.enviar(mensagem);
    }
}
