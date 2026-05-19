package ISP;

public class SistemaNotificacoes implements EnviadorNotificacoes {
    @Override
    public void enviar(String mensagem) {
        System.out.println("Notificacao enviada: " + mensagem);
    }
}
