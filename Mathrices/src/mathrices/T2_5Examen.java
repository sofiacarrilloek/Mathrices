/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mathrices;

import javax.swing.JOptionPane;
/**
 *
 * @author PERSONAL
 */
public class T2_5Examen extends javax.swing.JFrame {

    

    /**
     * Creates new form T2_5Examen
     */
    public T2_5Examen() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Grupo1 = new javax.swing.ButtonGroup();
        Grupo2 = new javax.swing.ButtonGroup();
        Grupo3 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        C1 = new javax.swing.JRadioButton();
        C2 = new javax.swing.JRadioButton();
        C3 = new javax.swing.JRadioButton();
        C4 = new javax.swing.JRadioButton();
        C5 = new javax.swing.JRadioButton();
        C6 = new javax.swing.JRadioButton();
        C7 = new javax.swing.JRadioButton();
        C8 = new javax.swing.JRadioButton();
        C9 = new javax.swing.JRadioButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setFocusable(false);

        jButton1.setBackground(new java.awt.Color(0, 0, 153));
        jButton1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Regresar");
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.setFocusable(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Como se representa la matriz inversa de A");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Es una propiedad de la matriz inversa");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("¿Cual es el primer paso para resolver una matriz inversa?");

        C1.setBackground(new java.awt.Color(255, 255, 255));
        Grupo1.add(C1);
        C1.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        C1.setForeground(new java.awt.Color(0, 0, 0));
        C1.setText("A*");
        C1.setFocusable(false);
        C1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                C1ActionPerformed(evt);
            }
        });

        C2.setBackground(new java.awt.Color(255, 255, 255));
        Grupo1.add(C2);
        C2.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        C2.setForeground(new java.awt.Color(0, 0, 0));
        C2.setText("A-");
        C2.setFocusable(false);
        C2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                C2ActionPerformed(evt);
            }
        });

        C3.setBackground(new java.awt.Color(255, 255, 255));
        Grupo1.add(C3);
        C3.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        C3.setForeground(new java.awt.Color(0, 0, 0));
        C3.setText("A^-1");
        C3.setFocusable(false);
        C3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                C3ActionPerformed(evt);
            }
        });

        C4.setBackground(new java.awt.Color(255, 255, 255));
        Grupo2.add(C4);
        C4.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        C4.setForeground(new java.awt.Color(0, 0, 0));
        C4.setText("A*B = B*A");
        C4.setFocusable(false);
        C4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                C4ActionPerformed(evt);
            }
        });

        C5.setBackground(new java.awt.Color(255, 255, 255));
        Grupo2.add(C5);
        C5.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        C5.setForeground(new java.awt.Color(0, 0, 0));
        C5.setText("(A^t)^-1 = (A^-1)^t");
        C5.setFocusable(false);
        C5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                C5ActionPerformed(evt);
            }
        });

        C6.setBackground(new java.awt.Color(255, 255, 255));
        Grupo2.add(C6);
        C6.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        C6.setForeground(new java.awt.Color(0, 0, 0));
        C6.setText("(A*B)^-1 = B^1*A");
        C6.setFocusable(false);
        C6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                C6ActionPerformed(evt);
            }
        });

        C7.setBackground(new java.awt.Color(255, 255, 255));
        Grupo3.add(C7);
        C7.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        C7.setForeground(new java.awt.Color(0, 0, 0));
        C7.setText("Hallar la determinante");
        C7.setFocusable(false);

        C8.setBackground(new java.awt.Color(255, 255, 255));
        Grupo3.add(C8);
        C8.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        C8.setForeground(new java.awt.Color(0, 0, 0));
        C8.setText("Cambiar de signo la matriz");
        C8.setFocusable(false);
        C8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                C8ActionPerformed(evt);
            }
        });

        C9.setBackground(new java.awt.Color(255, 255, 255));
        Grupo3.add(C9);
        C9.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        C9.setForeground(new java.awt.Color(0, 0, 0));
        C9.setText("Calcular la matriz inversa");
        C9.setFocusable(false);
        C9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                C9ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(0, 0, 153));
        jButton2.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Verificar");
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.setFocusable(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(138, 138, 138)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(C9)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(C2)
                            .addComponent(C3))
                        .addGap(825, 825, 825)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(C1)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(C4)
                    .addComponent(C5)
                    .addComponent(C6)
                    .addComponent(jLabel3)
                    .addComponent(C7)
                    .addComponent(C8))
                .addContainerGap(1854, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(78, 78, 78)
                        .addComponent(jLabel1)))
                .addGap(12, 12, 12)
                .addComponent(C1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(C2)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(C3)
                .addGap(69, 69, 69)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(C4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(C5)
                .addGap(12, 12, 12)
                .addComponent(C6)
                .addGap(69, 69, 69)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(C7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(C8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(C9)
                .addContainerGap(604, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        T2_5Menu c =new T2_5Menu();
        c.setVisible(true);
        this.dispose();
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        /*if(C1.isSelected()){
            JOptionPane.showMessageDialog(null, "CORRECTO");
        }
        if(C2.isSelected()){
            JOptionPane.showMessageDialog(null, "INCORRECTO");
        }
        if(C3.isSelected()){
            JOptionPane.showMessageDialog(null, "INCORRECTO");
        }
        if(C4.isSelected()){
            JOptionPane.showMessageDialog(null, "CORRECTO");
        }
        if(C5.isSelected()){
            JOptionPane.showMessageDialog(null, "INCORRECTO");
        }
        if(C6.isSelected()){
            JOptionPane.showMessageDialog(null, "INCORRECTO");
        }
        if(C7.isSelected()){
            JOptionPane.showMessageDialog(null, "CORRECTO");
        }
        if(C8.isSelected()){
            JOptionPane.showMessageDialog(null, "INCORRECTO");
        }
        if(C9.isSelected()){
            JOptionPane.showMessageDialog(null, "INCORRECTO");
        }*/
        
        
        if(C3.isSelected() && C5.isSelected() && C7.isSelected()){
            JOptionPane.showMessageDialog(null,"FELICITACIONES!! usted respondio correctamente ");
        }else{
        
            if((C3.isSelected() && C5.isSelected()) || (C5.isSelected() && C7.isSelected()) || (C3.isSelected() && C7.isSelected())){
                JOptionPane.showMessageDialog(null,"2 de 3 preguntas correctas!! Felicidades");
            }else{

                if(C3.isSelected() || C5.isSelected() || C7.isSelected()){
                    JOptionPane.showMessageDialog(null,"1 de 3 preguntas correctas! Intente de nuevo");
                }else{
                    JOptionPane.showMessageDialog(null,"Incorrecto, intente de nuevo :(");
                }}}
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void C1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_C1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_C1ActionPerformed

    private void C2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_C2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_C2ActionPerformed

    private void C3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_C3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_C3ActionPerformed

    private void C4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_C4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_C4ActionPerformed

    private void C5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_C5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_C5ActionPerformed

    private void C6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_C6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_C6ActionPerformed

    private void C8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_C8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_C8ActionPerformed

    private void C9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_C9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_C9ActionPerformed

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
            java.util.logging.Logger.getLogger(T2_5Examen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(T2_5Examen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(T2_5Examen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(T2_5Examen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new T2_5Examen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton C1;
    private javax.swing.JRadioButton C2;
    private javax.swing.JRadioButton C3;
    private javax.swing.JRadioButton C4;
    private javax.swing.JRadioButton C5;
    private javax.swing.JRadioButton C6;
    private javax.swing.JRadioButton C7;
    private javax.swing.JRadioButton C8;
    private javax.swing.JRadioButton C9;
    private javax.swing.ButtonGroup Grupo1;
    private javax.swing.ButtonGroup Grupo2;
    private javax.swing.ButtonGroup Grupo3;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
