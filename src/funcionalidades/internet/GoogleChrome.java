package funcionalidades.internet;
public class GoogleChrome implements NavegadorInternet {
    public void exibirPagina(String url) {
        System.out.println("Exibindo página " + url + " no Google Chrome");
    }

    public void adicionarNovaAba() {
        System.out.println("Adicionando nova aba no Google Chrome");
    }

    public void atualizarPagina() {
        System.out.println("Atualizando página no Google Chrome");
    }    
}
