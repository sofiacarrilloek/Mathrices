/*SOFIA CARRILLO
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mathrices;

import javax.swing.JOptionPane;

/**
 *
 * @author Sofia Carrillo
 */
public class T2_4EXAMEN extends javax.swing.JFrame {

    /**
     * Creates new form T2_4TEORIA
     */
    public T2_4EXAMEN() {
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

        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jl1 = new javax.swing.JLabel();
        jl2 = new javax.swing.JLabel();
        jl3 = new javax.swing.JLabel();
        btn_6 = new javax.swing.JButton();
        btn_1 = new javax.swing.JButton();
        btn_2 = new javax.swing.JButton();
        btn_3 = new javax.swing.JButton();
        btn_4 = new javax.swing.JButton();
        btn_5 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        labelFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jLabel4.setText("EXAMEN");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 10, 190, 70));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel1.setText("Selecciona todas las matrices que son escalonadas.");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 70, 850, 50));

        jl1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img_2_4/examen3.png"))); // NOI18N
        jl1.setText("jLabel1");
        jl1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jl1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jl1MouseClicked(evt);
            }
        });
        getContentPane().add(jl1, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 190, 300, 300));

        jl2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img_2_4/examen2.png"))); // NOI18N
        jl2.setText("jLabel1");
        jl2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jl2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jl2MouseClicked(evt);
            }
        });
        getContentPane().add(jl2, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 190, 300, 300));

        jl3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img_2_4/examen1.png"))); // NOI18N
        jl3.setText("jLabel1");
        jl3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jl3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jl3MouseClicked(evt);
            }
        });
        getContentPane().add(jl3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 190, 300, 300));

        btn_6.setBackground(new java.awt.Color(0, 0, 153));
        btn_6.setForeground(new java.awt.Color(255, 255, 255));
        btn_6.setText("NINGUNA");
        btn_6.setFocusPainted(false);
        btn_6.setFocusable(false);
        btn_6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_6ActionPerformed(evt);
            }
        });
        getContentPane().add(btn_6, new org.netbeans.lib.awtextra.AbsoluteConstraints(1070, 510, 140, 60));

        btn_1.setBackground(new java.awt.Color(0, 0, 153));
        btn_1.setForeground(new java.awt.Color(255, 255, 255));
        btn_1.setText("A. B Y C ");
        btn_1.setFocusPainted(false);
        btn_1.setFocusable(false);
        btn_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_1ActionPerformed(evt);
            }
        });
        getContentPane().add(btn_1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1070, 110, 140, 60));

        btn_2.setBackground(new java.awt.Color(0, 0, 153));
        btn_2.setForeground(new java.awt.Color(255, 255, 255));
        btn_2.setText("A Y C");
        btn_2.setFocusPainted(false);
        btn_2.setFocusable(false);
        btn_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_2ActionPerformed(evt);
            }
        });
        getContentPane().add(btn_2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1070, 190, 140, 60));

        btn_3.setBackground(new java.awt.Color(0, 0, 153));
        btn_3.setForeground(new java.awt.Color(255, 255, 255));
        btn_3.setText("A Y B");
        btn_3.setFocusPainted(false);
        btn_3.setFocusable(false);
        btn_3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_3ActionPerformed(evt);
            }
        });
        getContentPane().add(btn_3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1070, 270, 140, 60));

        btn_4.setBackground(new java.awt.Color(0, 0, 153));
        btn_4.setForeground(new java.awt.Color(255, 255, 255));
        btn_4.setText("B Y C");
        btn_4.setFocusPainted(false);
        btn_4.setFocusable(false);
        btn_4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_4ActionPerformed(evt);
            }
        });
        getContentPane().add(btn_4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1070, 350, 140, 60));

        btn_5.setBackground(new java.awt.Color(0, 0, 153));
        btn_5.setForeground(new java.awt.Color(255, 255, 255));
        btn_5.setText("B Y A");
        btn_5.setFocusPainted(false);
        btn_5.setFocusable(false);
        btn_5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_5ActionPerformed(evt);
            }
        });
        getContentPane().add(btn_5, new org.netbeans.lib.awtextra.AbsoluteConstraints(1070, 430, 140, 60));

        jButton1.setBackground(new java.awt.Color(0, 0, 153));
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Siguiente");
        jButton1.setFocusPainted(false);
        jButton1.setFocusable(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1220, 10, 90, 60));

        labelFondo.setBackground(new java.awt.Color(255, 255, 255));
        labelFondo.setForeground(new java.awt.Color(255, 255, 255));
        labelFondo.setOpaque(true);
        getContentPane().add(labelFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1400, 800));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jl1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jl1MouseClicked
        // TODO add your handling code here:
       
    }//GEN-LAST:event_jl1MouseClicked

    private void jl2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jl2MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jl2MouseClicked

    private void jl3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jl3MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jl3MouseClicked

    private void btn_6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_6ActionPerformed
        // TODO add your handling code here:
        T2_4MENU c=new T2_4MENU();
        c.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_6ActionPerformed

    private void btn_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_1ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(null, "INCORRECTO");
        btn_1.setEnabled(false);
        btn_2.setEnabled(false);
        btn_3.setEnabled(false);
        btn_4.setEnabled(false);
        btn_5.setEnabled(false);
        btn_6.setEnabled(false);

    }//GEN-LAST:event_btn_1ActionPerformed

    private void btn_2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_2ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(null, "INCORRECTO");
        btn_1.setEnabled(false);
        btn_2.setEnabled(false);
        btn_3.setEnabled(false);
        btn_4.setEnabled(false);
        btn_5.setEnabled(false);
        btn_6.setEnabled(false);
    }//GEN-LAST:event_btn_2ActionPerformed

    private void btn_3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_3ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(null, "INCORRECTO");
        btn_1.setEnabled(false);
        btn_2.setEnabled(false);
        btn_3.setEnabled(false);
        btn_4.setEnabled(false);
        btn_5.setEnabled(false);
        btn_6.setEnabled(false);
    }//GEN-LAST:event_btn_3ActionPerformed

    private void btn_4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_4ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(null, "CORRECTO");
        btn_1.setEnabled(false);
        btn_2.setEnabled(false);
        btn_3.setEnabled(false);
        btn_4.setEnabled(false);
        btn_5.setEnabled(false);
        btn_6.setEnabled(false);
    }//GEN-LAST:event_btn_4ActionPerformed

    private void btn_5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_5ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(null, "INCORRECTO");
        btn_1.setEnabled(false);
        btn_2.setEnabled(false);
        btn_3.setEnabled(false);
        btn_4.setEnabled(false);
        btn_5.setEnabled(false);
        btn_6.setEnabled(false);
    }//GEN-LAST:event_btn_5ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        /* T2_6MENU c=new T2_6MENU();
        c.setVisible(true);
        this.dispose();*/
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
            java.util.logging.Logger.getLogger(T2_4EXAMEN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(T2_4EXAMEN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(T2_4EXAMEN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(T2_4EXAMEN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new T2_4EXAMEN().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_1;
    private javax.swing.JButton btn_2;
    private javax.swing.JButton btn_3;
    private javax.swing.JButton btn_4;
    private javax.swing.JButton btn_5;
    private javax.swing.JButton btn_6;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jl1;
    private javax.swing.JLabel jl2;
    private javax.swing.JLabel jl3;
    private javax.swing.JLabel labelFondo;
    // End of variables declaration//GEN-END:variables
}