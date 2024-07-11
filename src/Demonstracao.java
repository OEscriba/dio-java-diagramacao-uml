import funcionalidades.internet.NavegadorInternet;
import funcionalidades.musica.ReprodutorMusical;
import funcionalidades.telefonia.AparelhoTelefonico;

public class Demonstracao {
    public static void main(String[] args) {
        ReprodutorMusical reprodutor = new Iphone();
        reprodutor.selecionarMusica("One - Metallica");
        reprodutor.tocar();
        reprodutor.pausar();

        AparelhoTelefonico aparelho = new Iphone();
        aparelho.ligar("(11)99737-1111");
        aparelho.atender();
        aparelho.iniciarCorreioVoz();

        NavegadorInternet navegador = new Iphone();
        navegador.exibirPagina("google.com");
        navegador.atualizarPagina();
        navegador.adicionarNovaAba();
    }
}
