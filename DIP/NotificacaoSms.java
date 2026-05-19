package DIP;

public class NotificacaoSms implements CanalNotificacao {
    @Override
    public void enviar(String mensagem) {
        System.out.println("SMS enviado: " + mensagem);
    }
}
