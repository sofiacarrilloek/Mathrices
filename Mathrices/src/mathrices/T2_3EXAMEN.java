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
public class T2_3EXAMEN extends javax.swing.JFrame {

    /**
     * Creates new form T2_3EXAMEN
     */
    public static double puntos3_1=0;
    
    public T2_3EXAMEN() {
        System.out.println("Calificación 2:"+T2_2EXAMEN.puntos2);
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
        jLabel1 = new javax.swing.JLabel();
        B1 = new javax.swing.JRadioButton();
        B2 = new javax.swing.JRadioButton();
        B3 = new javax.swing.JRadioButton();
        jLabel2 = new javax.swing.JLabel();
        B4 = new javax.swing.JRadioButton();
        B5 = new javax.swing.JRadioButton();
        B6 = new javax.swing.JRadioButton();
        jLabel3 = new javax.swing.JLabel();
        B7 = new javax.swing.JRadioButton();
        B8 = new javax.swing.JRadioButton();
        B9 = new javax.swing.JRadioButton();
        v1 = new javax.swing.JButton();
        s1 = new javax.swing.JButton();
        v3 = new javax.swing.JButton();
        v2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1410, 790));
        setUndecorated(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setText("Es una matriz con igual cantidad de filas que de columnas.");

        buttonGroup1.add(B1);
        B1.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        B1.setText(" a) Matriz Escalar");
        B1.setFocusable(false);
        B1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B1ActionPerformed(evt);
            }
        });

        buttonGroup1.add(B2);
        B2.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        B2.setText(" b) Matriz Triangular");
        B2.setFocusable(false);

        buttonGroup1.add(B3);
        B3.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        B3.setText(" c) Matriz Cuadrada");
        B3.setFocusable(false);

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel2.setText("Es una matriz de orden mxn en la cual todos los elementos son cero ");

        buttonGroup2.add(B4);
        B4.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        B4.setText(" a) Matriz Nula");
        B4.setFocusable(false);

        buttonGroup2.add(B5);
        B5.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        B5.setText(" b) Matriz Cero");
        B5.setFocusable(false);

        buttonGroup2.add(B6);
        B6.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        B6.setText(" c) Matriz Diagonal");
        B6.setFocusable(false);

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel3.setText("Es una matriz escalar en la cual la constante es uno. ");

        buttonGroup3.add(B7);
        B7.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        B7.setText(" a) Matriz Diagonal");
        B7.setFocusable(false);

        buttonGroup3.add(B8);
        B8.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        B8.setText(" b) Matriz Idéntica");
        B8.setFocusable(false);

        buttonGroup3.add(B9);
        B9.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        B9.setText(" c) Matriz Escalar");
        B9.setFocusable(false);

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

        v3.setBackground(new java.awt.Color(0, 0, 153));
        v3.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        v3.setForeground(new java.awt.Color(255, 255, 255));
        v3.setText("Verificar");
        v3.setEnabled(false);
        v3.setFocusable(false);
        v3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                v3ActionPerformed(evt);
            }
        });

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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(157, 157, 157)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(B3)
                    .addComponent(jLabel1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(B5)
                            .addComponent(B4)
                            .addComponent(B6)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(B9)
                                    .addComponent(B7)
                                    .addComponent(B8))
                                .addGap(812, 812, 812)
                                .addComponent(s1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(240, 240, 240)
                                .addComponent(v3, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(B1)
                            .addComponent(jLabel2)
                            .addComponent(B2))
                        .addGap(86, 86, 86)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(v1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(v2, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(857, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(s1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(9, 9, 9)
                                .addComponent(v1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(B1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 6, Short.MAX_VALUE)
                                .addComponent(B2)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(B3)
                        .addGap(33, 33, 33)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(v2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(B4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(B5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(B6)
                        .addGap(45, 45, 45)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(v3, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(B7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(B8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(B9)
                        .addGap(16, 16, 16)))
                .addContainerGap(405, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void B1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_B1ActionPerformed

    private void v1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_v1ActionPerformed
    if(B1.isSelected()){
            JOptionPane.showMessageDialog(null, "INCORRECTO");
            B1.setEnabled(false);
            B2.setEnabled(false);
            B3.setEnabled(false);
            v1.setEnabled(false);
            v2.setEnabled(true);
            puntos3_1=puntos3_1+0;
    }
    if(B2.isSelected()){
            JOptionPane.showMessageDialog(null, "INCORRECTO");
            B1.setEnabled(false);
            B2.setEnabled(false);
            B3.setEnabled(false);
            v1.setEnabled(false);
            v2.setEnabled(true);
            puntos3_1=puntos3_1+0;
    }
    if(B3.isSelected()){
            JOptionPane.showMessageDialog(null, "CORRECTO");
            B1.setEnabled(false);
            B2.setEnabled(false);
            B3.setEnabled(false);
            v1.setEnabled(false);
            v2.setEnabled(true);
            puntos3_1=puntos3_1+20;
    }
        
        // TODO add your handling code here:
    }//GEN-LAST:event_v1ActionPerformed

    private void s1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_s1ActionPerformed
    T2_3EXAMEN_1 c=new T2_3EXAMEN_1();
    c.setVisible(true);
    this.dispose();
        // TODO add your handling code here:
    }//GEN-LAST:event_s1ActionPerformed

    private void v3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_v3ActionPerformed
        // AAMC
         if(B7.isSelected()){
            JOptionPane.showMessageDialog(null, "INCORRECTO");
            B7.setEnabled(false);
            B8.setEnabled(false);
            B9.setEnabled(false);
            v3.setEnabled(false);
            s1.setEnabled(true);
            puntos3_1=puntos3_1+0;
    }
    if(B8.isSelected()){
            JOptionPane.showMessageDialog(null, "CORRECTO");
            B7.setEnabled(false);
            B8.setEnabled(false);
            B9.setEnabled(false);
            v3.setEnabled(false);
            s1.setEnabled(true);
            puntos3_1=puntos3_1+15;
    }
    if(B9.isSelected()){
            JOptionPane.showMessageDialog(null, "INCORRECTO");
            B7.setEnabled(false);
            B8.setEnabled(false);
            B9.setEnabled(false);
            v3.setEnabled(false);
            s1.setEnabled(true);
            puntos3_1=puntos3_1+0;
    }
    }//GEN-LAST:event_v3ActionPerformed

    private void v2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_v2ActionPerformed
        // TODO add your handling code here:
        if(B4.isSelected()){
            JOptionPane.showMessageDialog(null, "CORRECTO");
            B4.setEnabled(false);
            B5.setEnabled(false);
            B6.setEnabled(false);
            v2.setEnabled(false);
            v3.setEnabled(true);
            puntos3_1=puntos3_1+15;
    }
    if(B5.isSelected()){
            JOptionPane.showMessageDialog(null, "INCORRECTO");
            B4.setEnabled(false);
            B5.setEnabled(false);
            B6.setEnabled(false);
            v2.setEnabled(false);
            v3.setEnabled(true);
            puntos3_1=puntos3_1+0;
    }
    
    if(B6.isSelected()){
            JOptionPane.showMessageDialog(null, "INCORRECTO");
            B4.setEnabled(false);
            B5.setEnabled(false);
            B6.setEnabled(false);
            v2.setEnabled(false);
            v3.setEnabled(true);
            puntos3_1=puntos3_1+0;
    }
    }//GEN-LAST:event_v2ActionPerformed

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
            java.util.logging.Logger.getLogger(T2_3EXAMEN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(T2_3EXAMEN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(T2_3EXAMEN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(T2_3EXAMEN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new T2_3EXAMEN().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton B1;
    private javax.swing.JRadioButton B2;
    private javax.swing.JRadioButton B3;
    private javax.swing.JRadioButton B4;
    private javax.swing.JRadioButton B5;
    private javax.swing.JRadioButton B6;
    private javax.swing.JRadioButton B7;
    private javax.swing.JRadioButton B8;
    private javax.swing.JRadioButton B9;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton s1;
    private javax.swing.JButton v1;
    private javax.swing.JButton v2;
    private javax.swing.JButton v3;
    // End of variables declaration//GEN-END:variables
}
