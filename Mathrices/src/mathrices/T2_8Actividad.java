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
public class T2_8Actividad extends javax.swing.JFrame {

    /**
     * Creates new form T2_8Actividad
     */
    int contador=0;
    int puntuacion;
    int malas=0;
    public T2_8Actividad() {
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

        jButton3 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        op3 = new javax.swing.JLabel();
        op2 = new javax.swing.JLabel();
        op1 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        cuadro3 = new javax.swing.JLabel();
        cuadro1 = new javax.swing.JLabel();
        cuadro2 = new javax.swing.JLabel();
        cortina1 = new javax.swing.JLabel();
        cortina3 = new javax.swing.JLabel();
        cortina4 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton3.setBackground(new java.awt.Color(0, 0, 153));
        jButton3.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Regresar");
        jButton3.setFocusPainted(false);
        jButton3.setFocusable(false);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 90, 60));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img_2_8/T8_M1.png"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 160, -1, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img_2_8/T8_M2.png"))); // NOI18N
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 160, 200, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img_2_8/T8_M3.png"))); // NOI18N
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 160, 200, -1));

        op3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img_2_8/T8_D3.png"))); // NOI18N
        op3.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                op3MouseDragged(evt);
            }
        });
        op3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                op3MouseReleased(evt);
            }
        });
        getContentPane().add(op3, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 600, -1, -1));

        op2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img_2_8/T8_D2.png"))); // NOI18N
        op2.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                op2MouseDragged(evt);
            }
        });
        op2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                op2MouseReleased(evt);
            }
        });
        getContentPane().add(op2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 600, -1, -1));

        op1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img_2_8/T8_D1.png"))); // NOI18N
        op1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                op1MouseDragged(evt);
            }
        });
        op1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                op1MouseReleased(evt);
            }
        });
        getContentPane().add(op1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 600, -1, -1));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel1.setText("Actividad 8");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 20, -1, 44));

        cuadro3.setBackground(new java.awt.Color(255, 255, 255));
        cuadro3.setForeground(new java.awt.Color(102, 153, 255));
        cuadro3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img_2_8/FondoAzul.jpg"))); // NOI18N
        cuadro3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 0, 255), 10));
        getContentPane().add(cuadro3, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 340, 300, 170));

        cuadro1.setBackground(new java.awt.Color(255, 255, 255));
        cuadro1.setForeground(new java.awt.Color(102, 153, 255));
        cuadro1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img_2_8/FondoAzul.jpg"))); // NOI18N
        cuadro1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 0, 255), 10));
        getContentPane().add(cuadro1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 340, 300, 170));

        cuadro2.setBackground(new java.awt.Color(255, 255, 255));
        cuadro2.setForeground(new java.awt.Color(102, 153, 255));
        cuadro2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img_2_8/FondoAzul.jpg"))); // NOI18N
        cuadro2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 0, 255), 10));
        getContentPane().add(cuadro2, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 340, 300, 170));

        cortina1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img_2_8/T8_Buena.png"))); // NOI18N
        getContentPane().add(cortina1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 340, 170, -1));

        cortina3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img_2_8/T8_Buena.png"))); // NOI18N
        getContentPane().add(cortina3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 340, 170, -1));

        cortina4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img_2_8/T8_Buena.png"))); // NOI18N
        getContentPane().add(cortina4, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 340, 170, -1));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1440, 810));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        T2_8Instrucciones c=new T2_8Instrucciones();
        c.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void op3MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_op3MouseReleased
        // mediante condiciones especificamos el lugar  donde tiene que ir la imagen
        int x1,x2,x3,x4;
        x1=cuadro3.getX();
        x2=cuadro3.getY();
        x3=cuadro3.getX()+100;
        x4=cuadro3.getY()+200;
        int xx = op3.getX();
        int yy = op3.getY();

        if (xx>x1&&yy>x2&&xx<x3&&yy<x4)
        {
            cuadro3.setVisible(false);
            op3.setVisible(false);
            cuadro3.setEnabled(false);
            op3.setEnabled(false);

            JOptionPane.showMessageDialog(null,"CORRECTO :)");
            contador++;
        }
        else
        {
            malas++;
            op3.setLocation(600,600);
            JOptionPane.showMessageDialog(null,"INCORRECTO :(");
        }
        if(contador==3)
        {
            puntuacion=10-malas;
            JOptionPane.showMessageDialog(null,"FELICIDADES, Juego completado, tu puntuación es: "+puntuacion+" de 10");
            
        }
    }//GEN-LAST:event_op3MouseReleased

    private void op3MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_op3MouseDragged
        // con esto se mueve la imagen
        op3.setLocation( op3.getLocation().x+ evt.getX()- op3.getWidth()/2, op3.getLocation().y+ evt.getY()- op3.getHeight()/2);
        int xx = op3.getX();
        int yy = op3.getY();
    }//GEN-LAST:event_op3MouseDragged

    private void op2MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_op2MouseReleased
        // TODO add your handling code here:
        // mediante condiciones especificamos el lugar  donde tiene que ir la imagen
        int x1,x2,x3,x4;
        x1=cuadro2.getX();
        x2=cuadro2.getY();
        x3=cuadro2.getX()+100;
        x4=cuadro2.getY()+60;
        int xx = op2.getX();
        int yy = op2.getY();

        if (xx>x1&&yy>x2&&xx<x3&&yy<x4)
        {
            cuadro2.setVisible(false);
            op2.setVisible(false);    
            cuadro2.setEnabled(false);
            op2.setEnabled(false);

            JOptionPane.showMessageDialog(null,"CORRECTO :)");
            contador++;
        }
        else
        {
            malas++;
            op2.setLocation(200,600);
            JOptionPane.showMessageDialog(null,"INCORRECTO :(");
        }
        if(contador==3)
        {
            puntuacion=10-malas;
            JOptionPane.showMessageDialog(null,"FELICIDADES, Juego completado, tu puntuación es: "+puntuacion+" de 10");
            
        }
    }//GEN-LAST:event_op2MouseReleased

    private void op2MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_op2MouseDragged
        // con esto se mueve la imagen
        op2.setLocation( op2.getLocation().x+ evt.getX()- op2.getWidth()/2, op2.getLocation().y+ evt.getY()- op2.getHeight()/2);
        int xx = op2.getX();
        int yy = op2.getY();
    }//GEN-LAST:event_op2MouseDragged

    private void op1MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_op1MouseReleased
        // mediante condiciones especificamos el lugar  donde tiene que ir la imagen
        int x1,x2,x3,x4;
        x1=cuadro1.getX();
        x2=cuadro1.getY();
        x3=cuadro1.getX()+100;
        x4=cuadro1.getY()+200;
        int xx = op1.getX();
        int yy = op1.getY();

        if (xx>x1&&yy>x2&&xx<x3&&yy<x4)
        {
            cuadro1.setVisible(false);
            op1.setVisible(false);
            cuadro1.setEnabled(false);
            op1.setEnabled(false);

            JOptionPane.showMessageDialog(null,"CORRECTO :)");
            contador++;
        }
        else
        {
            malas++;
            op1.setLocation(1000,600);
            JOptionPane.showMessageDialog(null,"INCORRECTO :(");
        }
        if(contador==3)
        {
            puntuacion=10-malas;
            JOptionPane.showMessageDialog(null,"FELICIDADES, Juego completado, tu puntuación es: "+puntuacion+" de 10");
            
        }
    }//GEN-LAST:event_op1MouseReleased

    private void op1MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_op1MouseDragged
        // con esto se mueve la imagen
        op1.setLocation( op1.getLocation().x+ evt.getX()- op1.getWidth()/2, op1.getLocation().y+ evt.getY()- op1.getHeight()/2);
        int xx = op1.getX();
        int yy = op1.getY();
    }//GEN-LAST:event_op1MouseDragged

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
            java.util.logging.Logger.getLogger(T2_8Actividad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(T2_8Actividad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(T2_8Actividad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(T2_8Actividad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new T2_8Actividad().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel cortina1;
    private javax.swing.JLabel cortina3;
    private javax.swing.JLabel cortina4;
    private javax.swing.JLabel cuadro1;
    private javax.swing.JLabel cuadro2;
    private javax.swing.JLabel cuadro3;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel op1;
    private javax.swing.JLabel op2;
    private javax.swing.JLabel op3;
    // End of variables declaration//GEN-END:variables
}
