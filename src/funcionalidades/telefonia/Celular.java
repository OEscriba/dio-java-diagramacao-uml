package funcionalidades.telefonia;
public class Celular implements AparelhoTelefonico {
    public void ligar(String numero) {
        System.out.println("Ligando para o número " + numero + " no celular");
    }

    public void atender() {
        System.out.println("Atendendo ligação no celular");
    }

    public void iniciarCorreioVoz() {
        System.out.println("Iniciando Correio de Voz no celular");
    }
}
