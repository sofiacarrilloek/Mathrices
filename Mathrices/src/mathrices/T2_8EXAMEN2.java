/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mathrices;

import javax.swing.JOptionPane;

/**
 *
 * @author Adrián Muñoz
 */
public class T2_8EXAMEN2 extends javax.swing.JFrame {

    /**
     * Creates new form T2_8EXAMEN2
     */
    public static double puntos8_2=0;
    public static double puntos8=0;
    public static double FINAL=0;

    public T2_8EXAMEN2() {
        initComponents();
        this.setExtendedState(MAXIMIZED_BOTH);
        System.out.println("Calificación 8 parte 1: "+T2_8EXAMEN.puntos8_1);
    }

    int puntos2;
        //int puntos1 = Integer.parseInt(puntosT8);
       // int calificacionT8=puntos1+puntos2;
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel5 = new javax.swing.JLabel();
        rb1 = new javax.swing.JRadioButton();
        rb2 = new javax.swing.JRadioButton();
        rb3 = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        v1 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        PromedioFinal = new javax.swing.JTextField();
        menu = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel5.setText("Dada la siguiente matriz:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 70, -1, 44));

        buttonGroup1.add(rb1);
        rb1.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        rb1.setText("   a)");
        rb1.setFocusable(false);
        getContentPane().add(rb1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 300, -1, -1));

        buttonGroup1.add(rb2);
        rb2.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        rb2.setText("   b)");
        rb2.setFocusable(false);
        rb2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rb2ActionPerformed(evt);
            }
        });
        getContentPane().add(rb2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 480, -1, -1));

        buttonGroup1.add(rb3);
        rb3.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        rb3.setText("   c)");
        rb3.setFocusable(false);
        getContentPane().add(rb3, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 640, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img_2_8/exa_incorrecto2.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 600, 220, 140));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img_2_8/exa_matriz.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 40, 150, 110));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img_2_8/exa_incorrecto.png"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 430, 220, 140));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img_2_8/exa_correcto.png"))); // NOI18N
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 260, 220, 140));

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel6.setText("¿Cuál es la determinante de la siguiente matriz?");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 180, -1, 44));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        v1.setBackground(new java.awt.Color(0, 0, 153));
        v1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        v1.setForeground(new java.awt.Color(255, 255, 255));
        v1.setText("Verificar");
        v1.setFocusable(false);
        v1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                v1ActionPerformed(evt);
            }
        });
        jPanel1.add(v1, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 200, 90, 60));

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 153));
        jLabel7.setText("Felicidades , has concluido con este curso");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 390, 470, 70));

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 153));
        jLabel8.setText("tu calificación final es:");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 450, -1, 44));

        PromedioFinal.setEditable(false);
        PromedioFinal.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
        PromedioFinal.setBorder(new javax.swing.border.MatteBorder(null));
        PromedioFinal.setFocusable(false);
        jPanel1.add(PromedioFinal, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 510, 180, 160));

        menu.setBackground(new java.awt.Color(0, 0, 153));
        menu.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        menu.setForeground(new java.awt.Color(255, 255, 255));
        menu.setText("MENÚ");
        menu.setEnabled(false);
        menu.setFocusable(false);
        menu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuActionPerformed(evt);
            }
        });
        jPanel1.add(menu, new org.netbeans.lib.awtextra.AbsoluteConstraints(1230, 30, 90, 60));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -10, 1410, 800));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rb2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rb2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rb2ActionPerformed

    private void v1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_v1ActionPerformed
        // Verifica si las respuestas son correctas
        if(rb1.isSelected()){
            JOptionPane.showMessageDialog(null, "CORRECTO");
            rb1.setEnabled(false);
            rb2.setEnabled(false);
            rb3.setEnabled(false);
            v1.setEnabled(false);
            puntos2=60;
            puntos8_2=puntos8_2+puntos2;
            menu.setEnabled(true);
        }
        if(rb2.isSelected()){
            JOptionPane.showMessageDialog(null, "INCORRECTO");
            rb1.setEnabled(false);
            rb2.setEnabled(false);
            rb3.setEnabled(false);
            v1.setEnabled(false);
            puntos2=0;
            puntos8_2=puntos8_2+puntos2;
            menu.setEnabled(true);
        }
        if(rb3.isSelected()){
            JOptionPane.showMessageDialog(null, "INCORRECTO");
            rb1.setEnabled(false);
            rb2.setEnabled(false);
            rb3.setEnabled(false);
            v1.setEnabled(false);
            puntos2=0;
            puntos8_2=puntos8_2+puntos2;
            menu.setEnabled(true);
        }
        FINAL=(T2_1EXAMEN.puntos1+T2_2EXAMEN.puntos2+T2_3EXAMEN_1.puntos3+T2_4EXAMEN.puntos4+T2_5Examen.puntos5+T2_6EXAMEN.puntos6+T2_7EXAMEN.puntos7+puntos8)/8;
        System.out.println("Calificación 8 parte 2: "+puntos8_2);
        puntos8=(T2_8EXAMEN.puntos8_1+puntos8_2)/2;
        System.out.println("Calificación 8: "+puntos8);
        System.out.println("Calificación FINAL: "+FINAL);
        String cadena = String.valueOf(FINAL);
        PromedioFinal.setText(cadena);


    }//GEN-LAST:event_v1ActionPerformed

    private void menuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuActionPerformed
        // TODO add your handling code here:
        Menu c=new Menu();
        c.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_menuActionPerformed

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
            java.util.logging.Logger.getLogger(T2_8EXAMEN2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(T2_8EXAMEN2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(T2_8EXAMEN2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(T2_8EXAMEN2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new T2_8EXAMEN2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField PromedioFinal;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton menu;
    private javax.swing.JRadioButton rb1;
    private javax.swing.JRadioButton rb2;
    private javax.swing.JRadioButton rb3;
    private javax.swing.JButton v1;
    // End of variables declaration//GEN-END:variables
}
