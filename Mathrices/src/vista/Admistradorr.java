/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import Class.JuegoAltoss;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

public class Admistradorr extends javax.swing.JFrame {

    File fichero;
    MedioB mb;
    JuegoB v;
    JuegoA jugador;
    private static final int IMG_WIDTH = 399;
    private static final int IMG_HEIGHT = 533;
    JuegoAltoss juego;

    public Admistradorr() {
        initComponents();
        ImageIcon ImageIcon = new ImageIcon(getClass().getResource("/ImgFondos/Logo.jpg"));
        Image Image = ImageIcon.getImage();
        this.setIconImage(Image);
        setLocationRelativeTo(null);
        mb = new MedioB();
        found();
        juego = new JuegoAltoss();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        radioBotones = new javax.swing.ButtonGroup();
        lblFondo = new javax.swing.JLabel();
        imagen = new javax.swing.JPanel();
        lblFoto = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jComboBoxNiveles = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jRadio9 = new javax.swing.JRadioButton();
        jRadio4 = new javax.swing.JRadioButton();
        btnAdministrador2 = new javax.swing.JButton();
        btnAceptar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        imagen.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout imagenLayout = new javax.swing.GroupLayout(imagen);
        imagen.setLayout(imagenLayout);
        imagenLayout.setHorizontalGroup(
            imagenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblFoto, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        imagenLayout.setVerticalGroup(
            imagenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblFoto, javax.swing.GroupLayout.DEFAULT_SIZE, 380, Short.MAX_VALUE)
        );

        jPanel1.setBackground(new java.awt.Color(205, 232, 205));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "OPCIONES", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));

        jComboBoxNiveles.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jComboBoxNiveles.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "NIVELES", "Básico", "Medio", "Alto" }));

        jLabel1.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 204));
        jLabel1.setText("N°  DE PIEZAS");

        jRadio9.setBackground(new java.awt.Color(204, 255, 102));
        radioBotones.add(jRadio9);
        jRadio9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jRadio9.setForeground(new java.awt.Color(0, 0, 153));
        jRadio9.setText("9");

        jRadio4.setBackground(new java.awt.Color(204, 255, 102));
        radioBotones.add(jRadio4);
        jRadio4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jRadio4.setForeground(new java.awt.Color(0, 0, 153));
        jRadio4.setText("4");
        jRadio4.setName(""); // NOI18N

        btnAdministrador2.setBackground(new java.awt.Color(102, 102, 102));
        btnAdministrador2.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        btnAdministrador2.setForeground(new java.awt.Color(0, 0, 255));
        btnAdministrador2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/buscar.png"))); // NOI18N
        btnAdministrador2.setText("ELEGIR IMAGEN");
        btnAdministrador2.setBorder(null);
        btnAdministrador2.setBorderPainted(false);
        btnAdministrador2.setContentAreaFilled(false);
        btnAdministrador2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAdministrador2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnAdministrador2.setIconTextGap(-1);
        btnAdministrador2.setRequestFocusEnabled(false);
        btnAdministrador2.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnAdministrador2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdministrador2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addComponent(jRadio4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(44, 44, 44)
                        .addComponent(jRadio9, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnAdministrador2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jComboBoxNiveles, 0, 190, Short.MAX_VALUE))))
                .addContainerGap(40, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadio4)
                    .addComponent(jRadio9))
                .addGap(44, 44, 44)
                .addComponent(jComboBoxNiveles, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnAdministrador2, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        btnAceptar.setBackground(new java.awt.Color(102, 102, 102));
        btnAceptar.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        btnAceptar.setForeground(new java.awt.Color(0, 0, 255));
        btnAceptar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/play2.png"))); // NOI18N
        btnAceptar.setText("ACEPTAR");
        btnAceptar.setBorder(null);
        btnAceptar.setBorderPainted(false);
        btnAceptar.setContentAreaFilled(false);
        btnAceptar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAceptar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnAceptar.setIconTextGap(-1);
        btnAceptar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/play1.png"))); // NOI18N
        btnAceptar.setRequestFocusEnabled(false);
        btnAceptar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/play3.png"))); // NOI18N
        btnAceptar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(690, 690, 690)
                .addComponent(btnAceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(imagen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(350, 350, 350)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(lblFondo, javax.swing.GroupLayout.PREFERRED_SIZE, 830, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(330, 330, 330)
                .addComponent(btnAceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(imagen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(lblFondo, javax.swing.GroupLayout.PREFERRED_SIZE, 530, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarActionPerformed
        try {
            String basico = (String) jComboBoxNiveles.getSelectedItem();
            if (basico.equalsIgnoreCase("Básico") && jRadio4.isSelected()) {
                v = new JuegoB(getFichero().toString());
                v.setVisible(true);
            } else if (basico.equalsIgnoreCase("Básico") && jRadio9.isSelected()) {
                jugador = new JuegoA(getFichero().toString());
                jugador.setVisible(true);
            } else if (basico.equalsIgnoreCase("Medio") && jRadio4.isSelected()) {
                mb.startGame(getFichero().toString(), 2);
                mb.setVisible(true);
            } else if (basico.equalsIgnoreCase("Medio") && jRadio9.isSelected()) {
                mb.startGame(getFichero().toString(), 3);
                mb.setVisible(true);
            } else if (basico.equalsIgnoreCase("Alto") && jRadio4.isSelected()) {
                juego.startGame(getFichero().toString(), 2);
                juego.setVisible(true);
            } else if (basico.equalsIgnoreCase("Alto") && jRadio9.isSelected()) {
                juego.startGame(getFichero().toString(), 3);
                juego.setVisible(true);
            } else {
                JOptionPane.showMessageDialog(null, "Seleccione una Opción ");

            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
            JOptionPane.showMessageDialog(null, "SEECCIONE TODAS LAS OPCIONES PORFAVOR");
        }
    }//GEN-LAST:event_btnAceptarActionPerformed

    private void btnAdministrador2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdministrador2ActionPerformed
        JOptionPane.showMessageDialog(null, "Para su correcto funcionamiento las imagenes deben ser\n mayor o igual a 400 Pixeles Hancho y 533 Pixeles Alto");
        int resultado;
        CargarFoto ventana = new CargarFoto();
        FileNameExtensionFilter filtro = new FileNameExtensionFilter("JPG y PNG", "jpg", "png");
        ventana.jFileChooser1.setFileFilter(filtro);
        resultado = ventana.jFileChooser1.showOpenDialog(null);
        if (JFileChooser.APPROVE_OPTION == resultado) {
            fichero = ventana.jFileChooser1.getSelectedFile();
            cambiarTamañoImagen(fichero);

            try {
                ImageIcon icon = new ImageIcon(fichero.toString());

                Icon icono = new ImageIcon(icon.getImage().getScaledInstance(lblFoto.getWidth(), lblFoto.getHeight(), Image.SCALE_DEFAULT));

                lblFoto.setText(null);
                lblFoto.setIcon(icono);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Error" + e);
            }

        }
    }//GEN-LAST:event_btnAdministrador2ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAceptar;
    private javax.swing.JButton btnAdministrador2;
    private javax.swing.JPanel imagen;
    private javax.swing.JComboBox<String> jComboBoxNiveles;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRadio4;
    private javax.swing.JRadioButton jRadio9;
    private javax.swing.JLabel lblFondo;
    private javax.swing.JLabel lblFoto;
    private javax.swing.ButtonGroup radioBotones;
    // End of variables declaration//GEN-END:variables
    public File getFichero() {
        return fichero;
    }

    public void cambiarTamañoImagen(File img) {
        try {

            BufferedImage originalImage = ImageIO.read(new File(img.toString()));
            int type = originalImage.getType() == 0 ? BufferedImage.TYPE_INT_ARGB : originalImage.getType();

            BufferedImage resizeImageJpg = resizeImage(originalImage, type);
            ImageIO.write(resizeImageJpg, "jpg", new File(img.toString()));

            BufferedImage resizeImagePng = resizeImage(originalImage, type);
            ImageIO.write(resizeImagePng, "png", new File(img.toString()));

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }

    public void found() {
//        String hh = "src\\imagenes\\Administrador.png";
        ImageIcon icon = new ImageIcon(getClass().getResource("/imagenes/Administrador.png"));
        Icon icono = new ImageIcon(icon.getImage().getScaledInstance(lblFondo.getWidth(), lblFondo.getHeight(), Image.SCALE_DEFAULT));
        lblFondo.setIcon(icono);
    }

    private static BufferedImage resizeImage(BufferedImage originalImage, int type) {
        BufferedImage resizedImage = new BufferedImage(IMG_WIDTH, IMG_HEIGHT, type);
        Graphics2D g = resizedImage.createGraphics();
        g.drawImage(originalImage, 0, 0, IMG_WIDTH, IMG_HEIGHT, null);
        g.dispose();

        return resizedImage;
    }
}
