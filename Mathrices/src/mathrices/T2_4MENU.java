/*SOFIA CARRILLO
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mathrices;

/**
 *
 * @author Sofia Carrillo
 */
public class T2_4MENU extends javax.swing.JFrame {

    /**
     * Creates new form T2_4TEORIA
     */
    public T2_4MENU() {
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

        jPanel1 = new javax.swing.JPanel();
        btn_T4Actividades = new javax.swing.JButton();
        btn_T4Teoria = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        btn_T4Actividades1 = new javax.swing.JButton();
        labelFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setOpaque(false);

        btn_T4Actividades.setBackground(new java.awt.Color(0, 0, 153));
        btn_T4Actividades.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btn_T4Actividades.setForeground(new java.awt.Color(240, 240, 240));
        btn_T4Actividades.setText("ACTIVIDADES");
        btn_T4Actividades.setFocusPainted(false);
        btn_T4Actividades.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_T4ActividadesActionPerformed(evt);
            }
        });

        btn_T4Teoria.setBackground(new java.awt.Color(0, 0, 153));
        btn_T4Teoria.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btn_T4Teoria.setForeground(new java.awt.Color(240, 240, 240));
        btn_T4Teoria.setText("TEORIA");
        btn_T4Teoria.setFocusPainted(false);
        btn_T4Teoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_T4TeoriaActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(0, 0, 153));
        jButton1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(240, 240, 240));
        jButton1.setText("MENÚ");
        jButton1.setFocusPainted(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        btn_T4Actividades1.setBackground(new java.awt.Color(0, 0, 153));
        btn_T4Actividades1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btn_T4Actividades1.setForeground(new java.awt.Color(240, 240, 240));
        btn_T4Actividades1.setText("VIDEOS");
        btn_T4Actividades1.setFocusPainted(false);
        btn_T4Actividades1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_T4Actividades1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(82, 82, 82)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_T4Actividades1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_T4Actividades, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(198, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(82, 82, 82)
                    .addComponent(btn_T4Teoria, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(198, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 222, Short.MAX_VALUE)
                .addComponent(btn_T4Actividades1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(63, 63, 63)
                .addComponent(btn_T4Actividades, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(130, 130, 130)
                    .addComponent(btn_T4Teoria, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(350, Short.MAX_VALUE)))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 480, 560));

        labelFondo.setBackground(new java.awt.Color(255, 255, 255));
        labelFondo.setForeground(new java.awt.Color(255, 255, 255));
        labelFondo.setOpaque(true);
        getContentPane().add(labelFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1400, 800));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_T4ActividadesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_T4ActividadesActionPerformed
        // TODO add your handling code here:
        T2_4Actividad a = new T2_4Actividad();
        a.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_T4ActividadesActionPerformed

    private void btn_T4TeoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_T4TeoriaActionPerformed
        // TODO add your handling code here:
        T2_4TEORIA a = new T2_4TEORIA();
        a.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_T4TeoriaActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        Menu a = new Menu();
        a.setVisible(true);
        this.dispose();
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btn_T4Actividades1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_T4Actividades1ActionPerformed
        // TODO add your handling code here:
        T2_4TVIDEOS a = new T2_4TVIDEOS();
        a.setVisible(true);
        this.dispose();
        
    }//GEN-LAST:event_btn_T4Actividades1ActionPerformed

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
            java.util.logging.Logger.getLogger(T2_4MENU.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(T2_4MENU.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(T2_4MENU.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(T2_4MENU.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new T2_4MENU().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_T4Actividades;
    private javax.swing.JButton btn_T4Actividades1;
    private javax.swing.JButton btn_T4Teoria;
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel labelFondo;
    // End of variables declaration//GEN-END:variables
}
