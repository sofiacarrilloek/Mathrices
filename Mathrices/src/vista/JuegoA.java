package vista;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Graphics2D;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Point;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.awt.image.CropImageFilter;
import java.awt.image.FilteredImageSource;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import javax.imageio.ImageIO;
import javax.swing.BorderFactory;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.Timer;
import mathrices.T7_7MENU;

/**
 *
 * @author angel
 */
public final class JuegoA extends javax.swing.JFrame {

    private BufferedImage source;
    private ArrayList<MyButton> buttons;
    private ArrayList<MyButton> arrayBotones;
    private Image image;
    private int width, height;
    private final int DESIRED_WIDTH = 300;
    private BufferedImage resized;
    private final String ruta;
    private ImageIcon h;
    private ImageIcon img;
    private int puntos = 0;
    private int errores = 0;
    audio audio;
    private int contador;

    public JuegoA(String ruta) {
        this.contador = 1;
        this.ruta = ruta;
        audio = new audio();
        initComponents();
        cursor();
        setLocationRelativeTo(null);
        jPanelPiesas.setLayout(new GridLayout(3, 3, 5, 5));
        jPanelPiesas.setBorder(BorderFactory.createLineBorder(Color.gray));
        Inicio();
        found();
    }

    public void Inicio() {
        buttons = new ArrayList();
        arrayBotones = new ArrayList<>();
        try {
            source = loadImage();
            int val = getNewHeight(source.getWidth(), source.getHeight());
            resized = resizeImage(source, DESIRED_WIDTH, val,
                    BufferedImage.TYPE_INT_ARGB);

        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
        width = resized.getWidth(null);
        height = resized.getHeight(null);
        int rows = 3;
        int colums = 3;
        for (int i = 0; i < rows; i++) {

            for (int j = 0; j < colums; j++) {

                image = createImage(new FilteredImageSource(resized.getSource(),
                        new CropImageFilter(j * width / colums, i * height / rows,
                                (width / colums), height / rows)));
                MyButton button = new MyButton(image);
                buttons.add(button);
                arrayBotones.add(button);
            }
        }
        for (int i = 0; i < 9; i++) {
            img = (ImageIcon) buttons.get(i).getIcon();

        }
        Collections.shuffle(buttons);

        for (int i = 0; i < 9; i++) {

            MyButton btn = buttons.get(i);
            buttons.get(i).addActionListener(listener);
            jPanelPiesas.add(btn);
            btn.setBorder(BorderFactory.createLineBorder(Color.red));
            btn.setBackground(java.awt.Color.GRAY);
        }
        pack();
    }

    private int getNewHeight(int w, int h) {

        double ratio = DESIRED_WIDTH / (double) w;
        int newHeight = (int) (h * ratio);
        return newHeight;
    }

    private BufferedImage loadImage() throws IOException {
        BufferedImage bimg = ImageIO.read(new File(ruta));

        return bimg;
    }

    private BufferedImage resizeImage(BufferedImage originalImage, int width,
            int height, int type) throws IOException {

        BufferedImage resizedImage = new BufferedImage(width, height, type);
        Graphics2D g = resizedImage.createGraphics();
        g.drawImage(originalImage, 0, 0, width, height, null);
        g.dispose();

        return resizedImage;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelPiesas = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        unoUno = new javax.swing.JLabel();
        tresTres = new javax.swing.JLabel();
        dosTres = new javax.swing.JLabel();
        unoTres = new javax.swing.JLabel();
        dosUno = new javax.swing.JLabel();
        dosDos = new javax.swing.JLabel();
        tresUno = new javax.swing.JLabel();
        tresDos = new javax.swing.JLabel();
        unoDos = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        puntos9 = new javax.swing.JLabel();
        puntos3 = new javax.swing.JLabel();
        puntos4 = new javax.swing.JLabel();
        puntos1 = new javax.swing.JLabel();
        puntos2 = new javax.swing.JLabel();
        puntos6 = new javax.swing.JLabel();
        puntos5 = new javax.swing.JLabel();
        puntos8 = new javax.swing.JLabel();
        puntos7 = new javax.swing.JLabel();
        jpanelErrores68 = new javax.swing.JPanel();
        jLabelNumErrores = new javax.swing.JLabel();
        jLabelErrores = new javax.swing.JLabel();
        btnReiniciar = new javax.swing.JButton();
        btnRegresar = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        jLabelFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setExtendedState(6);
        setUndecorated(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanelPiesas.setBackground(new java.awt.Color(204, 204, 255));
        jPanelPiesas.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jPanelPiesas, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 120, 340, 380));

        jPanel1.setBackground(new java.awt.Color(153, 153, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Imagen", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 8))); // NOI18N
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        unoUno.setBackground(new java.awt.Color(204, 255, 0));
        unoUno.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        unoUno.setAlignmentY(0.0F);
        unoUno.setName("unoUno"); // NOI18N
        unoUno.setOpaque(true);
        unoUno.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                unoUnoMouseDragged(evt);
            }
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                unoUnoMouseMoved(evt);
            }
        });
        unoUno.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                unoUnoMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                unoUnoMouseExited(evt);
            }
        });
        jPanel1.add(unoUno, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 140, 170));

        tresTres.setBackground(new java.awt.Color(204, 255, 0));
        tresTres.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        tresTres.setName("unouno"); // NOI18N
        tresTres.setOpaque(true);
        tresTres.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tresTresMouseClicked(evt);
            }
        });
        jPanel1.add(tresTres, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 360, 140, 170));

        dosTres.setBackground(new java.awt.Color(102, 102, 255));
        dosTres.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        dosTres.setName("unouno"); // NOI18N
        dosTres.setOpaque(true);
        dosTres.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dosTresMouseClicked(evt);
            }
        });
        jPanel1.add(dosTres, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 190, 140, 170));

        unoTres.setBackground(new java.awt.Color(204, 255, 0));
        unoTres.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        unoTres.setAlignmentY(0.0F);
        unoTres.setName("unouno"); // NOI18N
        unoTres.setOpaque(true);
        unoTres.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                unoTresMouseClicked(evt);
            }
        });
        jPanel1.add(unoTres, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 20, 140, 170));

        dosUno.setBackground(new java.awt.Color(102, 102, 255));
        dosUno.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        dosUno.setName("unouno"); // NOI18N
        dosUno.setOpaque(true);
        dosUno.setVerifyInputWhenFocusTarget(false);
        dosUno.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dosUnoMouseClicked(evt);
            }
        });
        jPanel1.add(dosUno, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, 140, 170));

        dosDos.setBackground(new java.awt.Color(204, 255, 0));
        dosDos.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        dosDos.setName("unouno"); // NOI18N
        dosDos.setOpaque(true);
        dosDos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dosDosMouseClicked(evt);
            }
        });
        jPanel1.add(dosDos, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 190, 140, 170));

        tresUno.setBackground(new java.awt.Color(204, 255, 0));
        tresUno.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        tresUno.setName("unouno"); // NOI18N
        tresUno.setOpaque(true);
        tresUno.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tresUnoMouseClicked(evt);
            }
        });
        jPanel1.add(tresUno, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 360, 140, 170));

        tresDos.setBackground(new java.awt.Color(102, 102, 255));
        tresDos.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        tresDos.setName("unouno"); // NOI18N
        tresDos.setOpaque(true);
        tresDos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tresDosMouseClicked(evt);
            }
        });
        jPanel1.add(tresDos, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 360, 140, 170));

        unoDos.setBackground(new java.awt.Color(102, 102, 255));
        unoDos.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        unoDos.setAlignmentY(0.0F);
        unoDos.setName("unouno"); // NOI18N
        unoDos.setOpaque(true);
        unoDos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                unoDosMouseClicked(evt);
            }
        });
        jPanel1.add(unoDos, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 20, 140, 170));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 120, 440, 550));

        jPanel2.setBackground(new java.awt.Color(0, 153, 153));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "ACIERTOS", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));

        puntos9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        puntos9.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        puntos3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        puntos3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        puntos4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        puntos4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        puntos1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        puntos1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        puntos2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        puntos2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        puntos6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        puntos6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        puntos5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        puntos5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        puntos8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        puntos8.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        puntos7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        puntos7.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addComponent(puntos1, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(puntos2, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(puntos3, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(puntos4, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(puntos5, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(puntos6, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(puntos7, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(puntos8, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(puntos9, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(puntos4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 66, Short.MAX_VALUE)
                    .addComponent(puntos3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(puntos2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(puntos9, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(puntos8, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(puntos7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(puntos6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(puntos5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(puntos1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 10, 760, 100));

        jpanelErrores68.setBackground(new java.awt.Color(102, 102, 255));
        jpanelErrores68.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Errores", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 8))); // NOI18N

        jLabelNumErrores.setFont(new java.awt.Font("Verdana", 1, 48)); // NOI18N
        jLabelNumErrores.setForeground(new java.awt.Color(0, 0, 204));
        jLabelNumErrores.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jLabelErrores.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelErrores.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jpanelErrores68Layout = new javax.swing.GroupLayout(jpanelErrores68);
        jpanelErrores68.setLayout(jpanelErrores68Layout);
        jpanelErrores68Layout.setHorizontalGroup(
            jpanelErrores68Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpanelErrores68Layout.createSequentialGroup()
                .addComponent(jLabelNumErrores, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(jLabelErrores, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE)
                .addContainerGap())
        );
        jpanelErrores68Layout.setVerticalGroup(
            jpanelErrores68Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpanelErrores68Layout.createSequentialGroup()
                .addGroup(jpanelErrores68Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabelNumErrores, javax.swing.GroupLayout.DEFAULT_SIZE, 82, Short.MAX_VALUE)
                    .addComponent(jLabelErrores, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jpanelErrores68, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 530, -1, 110));

        btnReiniciar.setBackground(new java.awt.Color(0, 204, 0));
        btnReiniciar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnReiniciar.setForeground(new java.awt.Color(51, 0, 0));
        btnReiniciar.setText("REINICIAR JUEGO");
        btnReiniciar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnReiniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReiniciarActionPerformed(evt);
            }
        });
        getContentPane().add(btnReiniciar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1180, 180, -1, 50));

        btnRegresar.setBackground(new java.awt.Color(0, 102, 0));
        btnRegresar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnRegresar.setText("REGRESAR");
        btnRegresar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnRegresar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarActionPerformed(evt);
            }
        });
        getContentPane().add(btnRegresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1180, 270, 140, 50));

        btnSalir.setBackground(new java.awt.Color(0, 102, 0));
        btnSalir.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnSalir.setText("SALIR");
        btnSalir.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnSalir.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        getContentPane().add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(1180, 360, 140, 50));

        jLabelFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImgFondos/Escritorio1X.png"))); // NOI18N
        getContentPane().add(jLabelFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1400, 780));

        pack();
    }// </editor-fold>//GEN-END:initComponents
int co = 0;
    private void tresTresMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tresTresMouseClicked
        if (co != 0) {
            Icon icono = new ImageIcon(h.getImage().getScaledInstance(tresTres.getWidth(), tresTres.getHeight(), Image.SCALE_DEFAULT));
            if (arrayBotones.get(8).getIcon().equals(h) && tresTres.getIcon() == null) {
                tresTres.setIcon(icono);
                puntos++;
                progreso();
            } else {
                errores++;
                mostrarErrores();
            }
        } else {
            JOptionPane.showMessageDialog(null, "Debe seleccionar una Pieza");
        }
    }//GEN-LAST:event_tresTresMouseClicked

    private void dosTresMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dosTresMouseClicked
        if (co != 0) {
            Icon icono = new ImageIcon(h.getImage().getScaledInstance(dosTres.getWidth(), dosTres.getHeight(), Image.SCALE_DEFAULT));
            if (arrayBotones.get(5).getIcon().equals(h) && dosTres.getIcon() == null) {
                dosTres.setIcon(icono);
                puntos++;
                progreso();
            } else {
                errores++;
                mostrarErrores();
            }
        } else {
            JOptionPane.showMessageDialog(null, "Debe seleccionar una Pieza");
        }
    }//GEN-LAST:event_dosTresMouseClicked

    private void unoTresMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_unoTresMouseClicked
        if (co != 0) {
            Icon icono = new ImageIcon(h.getImage().getScaledInstance(unoTres.getWidth(), unoTres.getHeight(), Image.SCALE_DEFAULT));
            if (arrayBotones.get(2).getIcon().equals(h) && unoTres.getIcon() == null) {
                unoTres.setIcon(icono);
                puntos++;
                progreso();
            } else {
                errores++;
                mostrarErrores();
            }
        } else {
            JOptionPane.showMessageDialog(null, "Debe seleccionar una Pieza");
        }
    }//GEN-LAST:event_unoTresMouseClicked

    private void dosUnoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dosUnoMouseClicked
        if (co != 0) {
            Icon icono = new ImageIcon(h.getImage().getScaledInstance(dosUno.getWidth(), dosUno.getHeight(), Image.SCALE_DEFAULT));
            if (arrayBotones.get(3).getIcon().equals(h) && dosUno.getIcon() == null) {
                dosUno.setIcon(icono);
                puntos++;
                progreso();
            } else {
                errores++;
                mostrarErrores();
            }
        } else {
            JOptionPane.showMessageDialog(null, "Debe seleccionar una Pieza");
        }
    }//GEN-LAST:event_dosUnoMouseClicked

    private void dosDosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dosDosMouseClicked
        if (co != 0) {
            Icon icono = new ImageIcon(h.getImage().getScaledInstance(dosDos.getWidth(), dosDos.getHeight(), Image.SCALE_DEFAULT));
            if (arrayBotones.get(4).getIcon().equals(h) && dosDos.getIcon() == null) {
                dosDos.setIcon(icono);
                puntos++;
                progreso();
            } else {
                errores++;
                mostrarErrores();
            }
        } else {
            JOptionPane.showMessageDialog(null, "Debe seleccionar una Pieza");
        }
    }//GEN-LAST:event_dosDosMouseClicked

    private void tresUnoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tresUnoMouseClicked
        if (co != 0) {
            Icon icono = new ImageIcon(h.getImage().getScaledInstance(tresUno.getWidth(), tresUno.getHeight(), Image.SCALE_DEFAULT));
            if (arrayBotones.get(6).getIcon().equals(h) && tresUno.getIcon() == null) {
                tresUno.setIcon(icono);
                puntos++;
                progreso();
            } else {
                errores++;
                mostrarErrores();
            }
        } else {
            JOptionPane.showMessageDialog(null, "Debe seleccionar una Pieza");
        }
    }//GEN-LAST:event_tresUnoMouseClicked

    private void tresDosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tresDosMouseClicked
        if (co != 0) {
            Icon icono = new ImageIcon(h.getImage().getScaledInstance(tresDos.getWidth(), tresDos.getHeight(), Image.SCALE_DEFAULT));
            if (arrayBotones.get(7).getIcon().equals(h) && tresDos.getIcon() == null) {
                tresDos.setIcon(icono);
                puntos++;
                progreso();
            } else {
                errores++;
                mostrarErrores();
            }
        } else {
            JOptionPane.showMessageDialog(null, "Debe seleccionar una Pieza");
        }
    }//GEN-LAST:event_tresDosMouseClicked

    private void unoDosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_unoDosMouseClicked
        if (co != 0) {
            Icon icono = new ImageIcon(h.getImage().getScaledInstance(unoDos.getWidth(), unoDos.getHeight(), Image.SCALE_DEFAULT));
            if (arrayBotones.get(1).getIcon().equals(h) && unoDos.getIcon() == null) {
                unoDos.setIcon(icono);
                puntos++;
                progreso();
            } else {
                errores++;
                mostrarErrores();
            }
        } else {
            JOptionPane.showMessageDialog(null, "Debe seleccionar una Pieza");
        }
    }//GEN-LAST:event_unoDosMouseClicked

    private void btnReiniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReiniciarActionPerformed
        restart();
    }//GEN-LAST:event_btnReiniciarActionPerformed
    JLabel jniv = new JLabel();

    public void progreso() {
//        String hh = "src\\imagenes\\like.png";
        jniv.setBounds(60, 60, 60, 60);;
        ImageIcon icon = new ImageIcon(getClass().getResource("/imagenes/like.png"));
        Icon icono = new ImageIcon(icon.getImage().getScaledInstance(jniv.getWidth(), jniv.getHeight(), Image.SCALE_DEFAULT));
        switch (puntos) {
            case 1:
                puntos1.setIcon(icono);
                s.intro();
                break;
            case 2:
                puntos2.setIcon(icono);
                s.intro();
                break;
            case 3:
                puntos3.setIcon(icono);
                s.intro();
                break;
            case 4:
                puntos4.setIcon(icono);
                s.intro();
                break;
            case 5:
                puntos5.setIcon(icono);
                s.intro();
                break;
            case 6:
                puntos6.setIcon(icono);
                s.intro();
                break;
            case 7:
                puntos7.setIcon(icono);
                s.intro();
                break;
            case 8:
                puntos8.setIcon(icono);
                s.intro();
                break;
            case 9:
                puntos9.setIcon(icono);
                s.Bien();
                break;
            default:
                break;
        }
    }
    private void unoUnoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_unoUnoMouseClicked
        if (co != 0) {
            Icon icono = new ImageIcon(h.getImage().getScaledInstance(unoUno.getWidth(), unoUno.getHeight(), Image.SCALE_DEFAULT));
            if (arrayBotones.get(0).getIcon().equals(h) && unoUno.getIcon() == null) {
                unoUno.setIcon(icono);
                puntos++;
                progreso();
            } else {
                errores++;
                mostrarErrores();
            }

        } else {
            JOptionPane.showMessageDialog(null, "Debe seleccionar una Pieza");
        }
    }//GEN-LAST:event_unoUnoMouseClicked

    private void unoUnoMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_unoUnoMouseMoved

    }//GEN-LAST:event_unoUnoMouseMoved

    private void unoUnoMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_unoUnoMouseDragged

    }//GEN-LAST:event_unoUnoMouseDragged

    private void unoUnoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_unoUnoMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_unoUnoMouseExited

    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
        this.dispose();
        restart();
    }//GEN-LAST:event_btnRegresarActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
      T7_7MENU c=new  T7_7MENU();
        c.setVisible(true);
        this.dispose(); 
    }//GEN-LAST:event_btnSalirActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        cursor();
    }//GEN-LAST:event_formWindowOpened
    ActionListener listener = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            if (e.getSource() instanceof JButton) {
                h = (ImageIcon) ((JButton) e.getSource()).getIcon();
                co = 1;
                s.mal();
//                System.out.println(h);
            }

        }

    };

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRegresar;
    private javax.swing.JButton btnReiniciar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel dosDos;
    private javax.swing.JLabel dosTres;
    private javax.swing.JLabel dosUno;
    private javax.swing.JLabel jLabelErrores;
    private javax.swing.JLabel jLabelFondo;
    private javax.swing.JLabel jLabelNumErrores;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanelPiesas;
    private javax.swing.JPanel jpanelErrores68;
    private javax.swing.JLabel puntos1;
    private javax.swing.JLabel puntos2;
    private javax.swing.JLabel puntos3;
    private javax.swing.JLabel puntos4;
    private javax.swing.JLabel puntos5;
    private javax.swing.JLabel puntos6;
    private javax.swing.JLabel puntos7;
    private javax.swing.JLabel puntos8;
    private javax.swing.JLabel puntos9;
    private javax.swing.JLabel tresDos;
    private javax.swing.JLabel tresTres;
    private javax.swing.JLabel tresUno;
    private javax.swing.JLabel unoDos;
    private javax.swing.JLabel unoTres;
    private javax.swing.JLabel unoUno;
    // End of variables declaration//GEN-END:variables
 ActionListener action = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent evt) {
            jLabelErrores.setIcon(null);
            t.stop();

        }
    }; // Fin de la declaración del ActionListener.
    Timer t = new Timer(1100, action);
    Sonido s = new Sonido();

    public void mostrarErrores() {
        ImageIcon icon = new ImageIcon(getClass().getResource("/imagenes/dislike.png"));
        Icon icono = new ImageIcon(icon.getImage().getScaledInstance(jLabelErrores.getWidth(), jLabelErrores.getHeight(), Image.SCALE_DEFAULT));
        if (errores != 0 && jLabelErrores.getIcon() == null) {
            jLabelErrores.setIcon(icono);
            jLabelNumErrores.setText("" + errores);
            s.mal();
            t.start();

        }

    }

    public void found() {
        ImageIcon icon = new ImageIcon(getClass().getResource("/imagenes/fondo3.png"));
        Icon icono = new ImageIcon(icon.getImage().getScaledInstance(jLabelFondo.getWidth(), jLabelFondo.getHeight(), Image.SCALE_DEFAULT));
        jLabelFondo.setIcon(icono);
    }

    public void restart() {
        //        jButton1.setContentAreaFilled(false);
        unoUno.setIcon(null);
        unoDos.setIcon(null);
        unoTres.setIcon(null);
        dosUno.setIcon(null);
        dosDos.setIcon(null);
        dosTres.setIcon(null);
        tresUno.setIcon(null);
        tresDos.setIcon(null);
        tresTres.setIcon(null);
        puntos1.setIcon(null);
        puntos2.setIcon(null);
        puntos3.setIcon(null);
        puntos4.setIcon(null);
        puntos5.setIcon(null);
        puntos6.setIcon(null);
        puntos7.setIcon(null);
        puntos8.setIcon(null);
        puntos9.setIcon(null);
        jPanelPiesas.removeAll();
        jLabelNumErrores.setText("");
        puntos = 0;
        errores = 0;
        Collections.shuffle(buttons);
        Inicio();
    }

    public void cursor() {
        Toolkit tool = Toolkit.getDefaultToolkit();
        Image imga = tool.getImage(getClass().getResource("/imagenes/clic.png"));
        Point p = new Point(0, 0);
        Cursor c = tool.createCustomCursor(imga.getScaledInstance(20, 20, Image.SCALE_DEFAULT), p, "c");
        setCursor(c);
    }
}
