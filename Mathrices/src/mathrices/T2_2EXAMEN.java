/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mathrices;

import javax.swing.JOptionPane;

/**
 *
 * @author arman
 */
public class T2_2EXAMEN extends javax.swing.JFrame {

    /**
     * Creates new form T2_2EXAMEN
     */
    public T2_2EXAMEN() {
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        A1 = new javax.swing.JRadioButton();
        A2 = new javax.swing.JRadioButton();
        A3 = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();
        A4 = new javax.swing.JRadioButton();
        A5 = new javax.swing.JRadioButton();
        A6 = new javax.swing.JRadioButton();
        jLabel3 = new javax.swing.JLabel();
        A7 = new javax.swing.JRadioButton();
        A8 = new javax.swing.JRadioButton();
        A9 = new javax.swing.JRadioButton();
        jButton2 = new javax.swing.JButton();
        s1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setFocusable(false);

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel2.setText("¿Qué regla se debe seguir para sumar dos matrices?");

        jButton1.setBackground(new java.awt.Color(0, 0, 153));
        jButton1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Regresar");
        jButton1.setFocusable(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        buttonGroup1.add(A1);
        A1.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        A1.setText("La matriz A debe ser diferente a la matriz B");
        A1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                A1ActionPerformed(evt);
            }
        });

        buttonGroup1.add(A2);
        A2.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        A2.setText("Las matrices tienen que tener el mismo signo");
        A2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                A2ActionPerformed(evt);
            }
        });

        buttonGroup1.add(A3);
        A3.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        A3.setText("La matriz A debe tener el mismo orden que la matriz B");
        A3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                A3ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setText("Al decir, la matriz C es el resultado de la diferencia de la matriz A y la matriz B ¿Qué operación es?");

        buttonGroup2.add(A4);
        A4.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        A4.setText("Multiplicación");
        A4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                A4ActionPerformed(evt);
            }
        });

        buttonGroup2.add(A5);
        A5.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        A5.setText("Resta");

        buttonGroup2.add(A6);
        A6.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        A6.setText("Suma");
        A6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                A6ActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel3.setText("¿Qué sucede al multiplicar una matriz por un número real?");

        buttonGroup3.add(A7);
        A7.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        A7.setText("Cambia el orden");

        buttonGroup3.add(A8);
        A8.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        A8.setText("No sucede nada");

        buttonGroup3.add(A9);
        A9.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        A9.setText("Se conserva el orden");
        A9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                A9ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(0, 0, 153));
        jButton2.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Verificar");
        jButton2.setFocusable(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        s1.setBackground(new java.awt.Color(0, 0, 153));
        s1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        s1.setForeground(new java.awt.Color(255, 255, 255));
        s1.setText("Siguiente");
        s1.setFocusable(false);
        s1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                s1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(78, 78, 78)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(A1)
                            .addComponent(A2)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 605, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(A3)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1122, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(A4)
                            .addComponent(A5)
                            .addComponent(A6)
                            .addComponent(jLabel3))
                        .addGap(10, 10, 10)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(87, 87, 87)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(A8)
                            .addComponent(A7)
                            .addComponent(A9))))
                .addGap(119, 160, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(s1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(160, 160, 160))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(s1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(A1)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(A2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(A3)
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addGap(26, 26, 26)
                .addComponent(A4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(A5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(A6)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(A7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(A8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(A9)
                .addContainerGap(102, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1460, 790));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
    if(A1.isSelected()){
            JOptionPane.showMessageDialog(null, "INCORRECTO");
        }
    if(A2.isSelected()){
            JOptionPane.showMessageDialog(null, "INCORRECTO");
        }
    if(A3.isSelected()){
            JOptionPane.showMessageDialog(null, "CORRECTO");
        }
    if(A4.isSelected()){
            JOptionPane.showMessageDialog(null, "INCORRECTO");
        }
    if(A5.isSelected()){
            JOptionPane.showMessageDialog(null, "CORRECTO");
        }
    if(A6.isSelected()){
            JOptionPane.showMessageDialog(null, "INCORRECTO");
        }
    if(A7.isSelected()){
            JOptionPane.showMessageDialog(null, "INCORRECTO");
        }
    if(A8.isSelected()){
            JOptionPane.showMessageDialog(null, "INCORRECTO");
        }
    if(A9.isSelected()){
            JOptionPane.showMessageDialog(null, "CORRECTO");
        }
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void A6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_A6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_A6ActionPerformed

    private void A4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_A4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_A4ActionPerformed

    private void A3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_A3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_A3ActionPerformed

    private void A2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_A2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_A2ActionPerformed

    private void A1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_A1ActionPerformed
     
        // TODO add your handling code here:
    }//GEN-LAST:event_A1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        T2_2MENU_1 c=new T2_2MENU_1();
        c.setVisible(true);
        this.dispose();
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void A9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_A9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_A9ActionPerformed

    private void s1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_s1ActionPerformed
        // TODO add your handling code here:
        T2_3EXAMEN c=new T2_3EXAMEN();
        c.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_s1ActionPerformed

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
            java.util.logging.Logger.getLogger(T2_2EXAMEN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(T2_2EXAMEN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(T2_2EXAMEN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(T2_2EXAMEN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new T2_2EXAMEN().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton A1;
    private javax.swing.JRadioButton A2;
    private javax.swing.JRadioButton A3;
    private javax.swing.JRadioButton A4;
    private javax.swing.JRadioButton A5;
    private javax.swing.JRadioButton A6;
    private javax.swing.JRadioButton A7;
    private javax.swing.JRadioButton A8;
    private javax.swing.JRadioButton A9;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton s1;
    // End of variables declaration//GEN-END:variables
}
