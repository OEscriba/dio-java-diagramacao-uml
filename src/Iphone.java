import funcionalidades.internet.NavegadorInternet;
import funcionalidades.musica.ReprodutorMusical;
import funcionalidades.telefonia.AparelhoTelefonico;

public class Iphone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {
// Métodos do Reprodutor Musical
    public void tocar() {
        System.out.println("Tocando música no iPhone");
    }

    public void pausar() {
        System.out.println(("Pausando música no iPhone"));
    }

    public void selecionarMusica(String musica) {
        System.out.println("Selecionando música " + musica + " no iPhone");
    }

// Métodos do Aparelho Telefônico
    public void ligar(String numero) {
        System.out.println("Ligando para o número " + numero + " no iPhone");
    }

    public void atender() {
        System.out.println("Atendendo ligação no iPhone");
    }

    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz no iPhone");
    }

// Métodos do Navegador da Internet
    public void exibirPagina(String url) {
        System.out.println("Exibindo página " + url + " no iPhone");
    }

    public void adicionarNovaAba() {
        System.out.println("Adicionando nova aba no iPhone");
    }

    public void atualizarPagina() {
        System.out.println("Atualizando página no iPhone");
    }

}
