package DIP;

public class NotificacaoWhatsApp implements CanalNotificacao {
    @Override
    public void enviar(String mensagem) {
        System.out.println("WhatsApp enviado: " + mensagem);
    }
}
