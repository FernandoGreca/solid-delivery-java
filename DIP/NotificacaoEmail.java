package DIP;

public class NotificacaoEmail implements CanalNotificacao {
    @Override
    public void enviar(String mensagem) {
        System.out.println("Email enviado: " + mensagem);
    }
}
