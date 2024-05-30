package entities;

public class Iphone implements Cellphone, InternetBrowser, MusicPlayer{

    @Override
    public void call() {
        System.out.println("Ligando...");
    }

    @Override
    public void meet() {
        System.out.println("Atendendo...");
    }

    @Override
    public void startVoicemail() {
        System.out.println("Iniciando Correio de Voz!");
    }

    @Override
    public void showPage() {
        System.out.println("Exibindo Página!");
    }

    @Override
    public void addNewPage() {
        System.out.println("Adicionando Página!");
    }

    @Override
    public void updatePage() {
        System.out.println("Atualizando Página!");
    }

    @Override
    public void play() {
        System.out.println("Tocando...");
    }

    @Override
    public void pause() {
        System.out.println("Pausa...");
    }

    @Override
    public void selectMusic() {
        System.out.println("Selecionando Música!");
    }
}
