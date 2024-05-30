package application;

import entities.Cellphone;
import entities.InternetBrowser;
import entities.Iphone;
import entities.MusicPlayer;

public class Program {
    public static void main(String[] args) {
       Cellphone cellphone = new Iphone();
       InternetBrowser internetBrowser = new Iphone();
       MusicPlayer musicPlayer = new Iphone();

       cellphone.call();
       cellphone.meet();
       cellphone.startVoicemail();

       internetBrowser.addNewPage();
       internetBrowser.showPage();
       internetBrowser.showPage();

       musicPlayer.play();
       musicPlayer.pause();
       musicPlayer.selectMusic();
    }
}
