/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

/**
 *
 * @author angel
 */
public class PanelPuntos extends JPanel{

    protected JLabel solvedLabel = null;

    public PanelPuntos() {
        JPanel localJPanel1 = new JPanel();
        localJPanel1.setPreferredSize(new Dimension(40, 40));
    }

    protected JLabel createLabel(int paramInt) {
        JLabel localJLabel = new JLabel(String.valueOf(paramInt));
        localJLabel.setBorder(new EmptyBorder(0, 5, 0, 2));
        localJLabel.setOpaque(true);
        localJLabel.setFont(new Font("SansSerif", 0, 11));
        return localJLabel;

    }

    public void printSolved(String paramString) {
        if (this.solvedLabel
                != null) {
            this.solvedLabel.setText(paramString);
        }
    }
}
