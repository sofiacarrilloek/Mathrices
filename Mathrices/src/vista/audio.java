/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import java.applet.Applet;
import java.applet.AudioClip;

/**
 *
 * @author angel
 */
public class audio {

    public void quienEs() {
        AudioClip sonidoFondo = Applet.newAudioClip(getClass().getResource("/audio/comosesiente.wav"));
        sonidoFondo.play();
    }
    public void comoSeSiente() {
        AudioClip sonidoFondo = Applet.newAudioClip(getClass().getResource("/audio/quienes.wav"));
        sonidoFondo.play();
    }
    public void queHaces() {
        AudioClip sonidoFondo = Applet.newAudioClip(getClass().getResource("/audio/quehace.wav"));
        sonidoFondo.play();
    }

}
