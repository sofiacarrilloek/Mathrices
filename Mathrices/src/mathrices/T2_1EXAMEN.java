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
public class T2_1EXAMEN extends javax.swing.JFrame {

    /**
     * Creates new form T2_1EXAMEN
     */
    public T2_1EXAMEN() {
        initComponents();
        this.setExtendedState(MAXIMIZED_BOTH);
    }
    int puntos;
    int puntos2;
    int calificacionT1=puntos+puntos2;
    public static double puntos1=0;


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        rb1 = new javax.swing.JRadioButton();
        rb2 = new javax.swing.JRadioButton();
        rb3 = new javax.swing.JRadioButton();
        jLabel3 = new javax.swing.JLabel();
        rb4 = new javax.swing.JRadioButton();
        rb5 = new javax.swing.JRadioButton();
        rb6 = new javax.swing.JRadioButton();
        jLabel4 = new javax.swing.JLabel();
        s1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        v1 = new javax.swing.JButton();
        v2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img_2_1/EXAMEN_1.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 40, 800, 120));

        buttonGroup1.add(rb1);
        rb1.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        rb1.setText("   a) 3 x 3");
        rb1.setFocusable(false);
        getContentPane().add(rb1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 250, -1, -1));

        buttonGroup1.add(rb2);
        rb2.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        rb2.setText("   b) 2 x 3");
        rb2.setFocusable(false);
        rb2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rb2ActionPerformed(evt);
            }
        });
        getContentPane().add(rb2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 310, -1, -1));

        buttonGroup1.add(rb3);
        rb3.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        rb3.setText("   c) 3 x 2");
        rb3.setFocusable(false);
        getContentPane().add(rb3, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 370, -1, -1));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel3.setText("¿De que orden es la matriz A?");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 200, -1, 44));

        buttonGroup2.add(rb4);
        rb4.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        rb4.setText("   a) a12= 4, b23= 6, c22= 3 ");
        rb4.setFocusable(false);
        rb4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rb4ActionPerformed(evt);
            }
        });
        getContentPane().add(rb4, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 510, -1, -1));

        buttonGroup2.add(rb5);
        rb5.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        rb5.setText("   b) a12= 2, b23= 8, c22= 3 ");
        rb5.setFocusable(false);
        rb5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rb5ActionPerformed(evt);
            }
        });
        getContentPane().add(rb5, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 570, -1, -1));

        buttonGroup2.add(rb6);
        rb6.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        rb6.setText("   c) a12= 2, b23= 6, c22= 3 ");
        rb6.setFocusable(false);
        rb6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rb6ActionPerformed(evt);
            }
        });
        getContentPane().add(rb6, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 630, -1, -1));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel4.setText("¿Selecciona la respuesta correcta?");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 460, -1, 44));

        s1.setBackground(new java.awt.Color(0, 0, 153));
        s1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        s1.setForeground(new java.awt.Color(255, 255, 255));
        s1.setText("Siguiente");
        s1.setEnabled(false);
        s1.setFocusable(false);
        s1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                s1ActionPerformed(evt);
            }
        });
        getContentPane().add(s1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1230, 590, 90, 60));

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
        jPanel1.add(v1, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 200, 90, 60));

        v2.setBackground(new java.awt.Color(0, 0, 153));
        v2.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        v2.setForeground(new java.awt.Color(255, 255, 255));
        v2.setText("Verificar");
        v2.setEnabled(false);
        v2.setFocusable(false);
        v2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                v2ActionPerformed(evt);
            }
        });
        jPanel1.add(v2, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 470, 90, 60));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1410, 790));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rb2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rb2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rb2ActionPerformed

    private void rb5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rb5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rb5ActionPerformed

    private void rb4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rb4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rb4ActionPerformed

    private void v1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_v1ActionPerformed
        // Verifica si las respuestas son correctas
        if(rb1.isSelected()){
            JOptionPane.showMessageDialog(null, "INCORRECTO");
            rb1.setEnabled(false);
            rb2.setEnabled(false);
            rb3.setEnabled(false);
            v1.setEnabled(false);
            v2.setEnabled(true);
            calificacionT1=0;
            puntos1=puntos1+calificacionT1;
        }
        if(rb2.isSelected()){
            JOptionPane.showMessageDialog(null, "CORRECTO");
            rb1.setEnabled(false);
            rb2.setEnabled(false);
            rb3.setEnabled(false);
            v1.setEnabled(false);
            v2.setEnabled(true);
            calificacionT1=50;
            puntos1=puntos1+calificacionT1;
        }
        if(rb3.isSelected()){
            JOptionPane.showMessageDialog(null, "INCORRECTO");
            rb1.setEnabled(false);
            rb2.setEnabled(false);
            rb3.setEnabled(false);
            v1.setEnabled(false);
            v2.setEnabled(true);
            calificacionT1=0;
            puntos1=puntos1+calificacionT1;

        }
        
       
        
        
    }//GEN-LAST:event_v1ActionPerformed

    private void s1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_s1ActionPerformed
        // TODO add your handling code here:
        
        T2_2EXAMEN c=new T2_2EXAMEN();
        c.setVisible(true);
        this.dispose();
        
        
    }//GEN-LAST:event_s1ActionPerformed

    private void v2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_v2ActionPerformed
        // TODO add your handling code here:
        if(rb4.isSelected()){
            JOptionPane.showMessageDialog(null, "INCORRECTO");
            rb4.setEnabled(false);
            rb5.setEnabled(false);
            rb6.setEnabled(false);
            v2.setEnabled(false);
            s1.setEnabled(true);
            calificacionT1=0;
            puntos1=puntos1+calificacionT1;

        }
        if(rb5.isSelected()){
            JOptionPane.showMessageDialog(null, "INCORRECTO");
            rb4.setEnabled(false);
            rb5.setEnabled(false);
            rb6.setEnabled(false);
            v2.setEnabled(false);
            s1.setEnabled(true);
            calificacionT1=0;
            puntos1=puntos1+calificacionT1;

        }
        if(rb6.isSelected()){
            JOptionPane.showMessageDialog(null, "CORRECTO");
            rb4.setEnabled(false);
            rb5.setEnabled(false);
            rb6.setEnabled(false);
            v2.setEnabled(false);
            s1.setEnabled(true);
            calificacionT1=50;
            puntos1=puntos1+calificacionT1;
        }

        
    }//GEN-LAST:event_v2ActionPerformed

    private void rb6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rb6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rb6ActionPerformed

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
            java.util.logging.Logger.getLogger(T2_1EXAMEN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(T2_1EXAMEN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(T2_1EXAMEN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(T2_1EXAMEN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new T2_1EXAMEN().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton rb1;
    private javax.swing.JRadioButton rb2;
    private javax.swing.JRadioButton rb3;
    private javax.swing.JRadioButton rb4;
    private javax.swing.JRadioButton rb5;
    private javax.swing.JRadioButton rb6;
    private javax.swing.JButton s1;
    private javax.swing.JButton v1;
    private javax.swing.JButton v2;
    // End of variables declaration//GEN-END:variables
}
