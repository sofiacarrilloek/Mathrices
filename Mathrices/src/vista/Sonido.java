package vista;

import java.applet.Applet;
import java.applet.AudioClip;

public class Sonido {

    public void ClicStock() {
        AudioClip sonidoFondo = Applet.newAudioClip(getClass().getResource("/audio/clickstop.wav"));
        sonidoFondo.play();
    }

    public void intro() {
        AudioClip sonidoFondo = Applet.newAudioClip(getClass().getResource("/audio/intro.wav"));
        sonidoFondo.play();
    }

    public void apausos() {
        AudioClip sonidoFondo = Applet.newAudioClip(getClass().getResource("/audio/fin1.wav"));
        sonidoFondo.play();
    }

    public void Bien() {

        AudioClip sonidoFondo = Applet.newAudioClip(getClass().getResource("/audio/fin2.wav"));
        sonidoFondo.play();

    }

    public void mal() {

        AudioClip sonidoFondo = Applet.newAudioClip(getClass().getResource("/audio/pop.wav"));
        sonidoFondo.play();
    }
}
