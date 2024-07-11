package funcionalidades.musica;
public class Ipod implements ReprodutorMusical {
    public void tocar(){
        System.out.println("Tocando música no iPod");
    }

    public void pausar(){
        System.out.println("Pausando música no iPod");
    }

    public void selecionarMusica(String musica) {
        System.out.println("Selecionando música " + musica + " no iPod");
    }
}
