/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mathrices;

import java.util.Random;

/**
 *
 * @author AAMC
 */
public class T2_1Actividad extends javax.swing.JFrame {

    /**
     * Creates new form T2_1
     */
    public T2_1Actividad() {
        initComponents();
        this.setExtendedState(MAXIMIZED_BOTH);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        Panel = new javax.swing.JTextArea();
        Largo = new javax.swing.JTextField();
        Ancho = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 102, 102));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Largo");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 200, 68, 26));

        jLabel2.setText("Ancho");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 240, -1, -1));

        jButton1.setText("Mostrar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 360, 80, 40));

        Panel.setColumns(20);
        Panel.setRows(5);
        jScrollPane1.setViewportView(Panel);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 180, 370, 200));

        Largo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LargoActionPerformed(evt);
            }
        });
        getContentPane().add(Largo, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 210, 82, -1));

        Ancho.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AnchoActionPerformed(evt);
            }
        });
        getContentPane().add(Ancho, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 240, 82, -1));

        jLabel3.setText("Ejemplo matrices");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 40, 410, 60));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void LargoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LargoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_LargoActionPerformed

    private void AnchoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AnchoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AnchoActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        int ancho, largo;
        String respuesta=" ";
        Random randon = new Random();
        ancho=Integer.parseInt(Ancho.getText());
        largo=Integer.parseInt(Largo.getText());
        int [][] matriz = new int [ancho][largo];
        for (int i = 0; i < ancho; i++) {
            respuesta= respuesta + "[ ";
			for (int j = 0; j < largo; j++) {
				//asignacion de numero aleatorio
				matriz[i][j] = randon.nextInt(5)+ randon.nextInt(5);
                                respuesta = respuesta +"   "+ matriz[i][j];
			}
                        respuesta= respuesta + "  ]\n ";
		}
		//imprimir respuesta
		
        Panel.setText(respuesta);
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(T2_1Actividad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(T2_1Actividad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(T2_1Actividad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(T2_1Actividad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new T2_1Actividad().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Ancho;
    private javax.swing.JTextField Largo;
    private javax.swing.JTextArea Panel;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
