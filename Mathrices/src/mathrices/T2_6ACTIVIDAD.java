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
import javax.swing.JOptionPane;
public class T2_6ACTIVIDAD extends javax.swing.JFrame {

    /**
     * Creates new form T2_4TEORIA
     */
    public T2_6ACTIVIDAD() {
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
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        pregunta2 = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        pregunta1 = new javax.swing.JTextArea();
        btn_p2 = new javax.swing.JButton();
        btn_p1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jLabel4.setText("ACTIVIDAD 6");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 40, 750, 70));

        jButton1.setBackground(new java.awt.Color(0, 0, 153));
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Regresar");
        jButton1.setFocusPainted(false);
        jButton1.setFocusable(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 90, 60));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img_2_6/Determinante_21.png"))); // NOI18N
        jLabel3.setText("jLabel1");
        jLabel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 490, 300, 300));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img_2_6/Determinante_1.png"))); // NOI18N
        jLabel5.setText("jLabel1");
        jLabel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 180, 300, 300));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel1.setText("Encuentra la determinante de ambas matrices.");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 110, 850, 50));

        pregunta2.setColumns(20);
        pregunta2.setFont(new java.awt.Font("Monospaced", 0, 48)); // NOI18N
        pregunta2.setRows(5);
        jScrollPane1.setViewportView(pregunta2);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 490, 240, 160));

        pregunta1.setColumns(20);
        pregunta1.setFont(new java.awt.Font("Monospaced", 0, 48)); // NOI18N
        pregunta1.setRows(5);
        jScrollPane2.setViewportView(pregunta1);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 180, 240, 160));

        btn_p2.setBackground(new java.awt.Color(0, 0, 153));
        btn_p2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btn_p2.setForeground(new java.awt.Color(255, 255, 255));
        btn_p2.setText("Verificar");
        btn_p2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_p2ActionPerformed(evt);
            }
        });
        jPanel1.add(btn_p2, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 490, 140, 50));

        btn_p1.setBackground(new java.awt.Color(0, 0, 153));
        btn_p1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btn_p1.setForeground(new java.awt.Color(255, 255, 255));
        btn_p1.setText("Verificar");
        btn_p1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_p1ActionPerformed(evt);
            }
        });
        jPanel1.add(btn_p1, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 180, 140, 50));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img_2_4/matriz_ no_escalonada.png"))); // NOI18N
        jLabel2.setText("jLabel1");
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1320, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel2)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        T2_6MENU c=new T2_6MENU();
        c.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel2MouseClicked

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jLabel3MouseClicked

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel5MouseClicked

    private void btn_p1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_p1ActionPerformed
        // TODO add your handling code here:
        String respuesta = pregunta1.getText();
        if(respuesta.equals("6"))
        {
            JOptionPane.showMessageDialog(null, "RESPUESTA CORRECTA");
        }else
        {
            JOptionPane.showMessageDialog(null, "RESPUESTA INCORRECTA");
        }
        btn_p1.setEnabled(false);

        
    }//GEN-LAST:event_btn_p1ActionPerformed

    private void btn_p2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_p2ActionPerformed
        // TODO add your handling code here:
       
        String respuesta = pregunta2.getText();
        if(respuesta.equals("-7"))
        {
            JOptionPane.showMessageDialog(null, "RESPUESTA CORRECTA");
        }else
        {
            JOptionPane.showMessageDialog(null, "RESPUESTA INCORRECTA");
        }
        btn_p2.setEnabled(false);
        
    }//GEN-LAST:event_btn_p2ActionPerformed

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
            java.util.logging.Logger.getLogger(T2_6ACTIVIDAD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(T2_6ACTIVIDAD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(T2_6ACTIVIDAD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(T2_6ACTIVIDAD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new T2_6ACTIVIDAD().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_p1;
    private javax.swing.JButton btn_p2;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea pregunta1;
    private javax.swing.JTextArea pregunta2;
    // End of variables declaration//GEN-END:variables
}
