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
public final class JuegoB extends javax.swing.JFrame {

    private BufferedImage source;
    private ArrayList<MyButton> buttons;
    private ArrayList<MyButton> arrayBotones;
    private final JButton[][] jbtones;
    private Image image;
    private MyButton lastButton;
    private int width, height;
    private final int DESIRED_WIDTH = 300;
    private BufferedImage resized;
    private final JLabel[][] jlabel;
    private final String ruta;
    ImageIcon h;
    ImageIcon img;
    private int puntos = 0;
    private int errores = 0;
    private final audio audio;
    private int contador;

    public JuegoB(String ruta) {
        this.contador = 1;
        cursor();
        initComponents();
        this.setExtendedState(MAXIMIZED_BOTH);
        setResizable(false);
        audio = new audio();
        this.ruta = ruta;
        jlabel = new JLabel[2][2];
        jbtones = new JButton[2][2];
        setLocationRelativeTo(null);
        panel.setLayout(new GridLayout(2, 2, 5, 5));
        panel.setBorder(BorderFactory.createLineBorder(Color.gray));
        iniciarFigura();
        found();

    }

    public void iniciarFigura() {
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                jlabel[i][j] = new JLabel("");
            }
            jlabel[0][0] = unoUno;
            jlabel[0][1] = unoDos;
            jlabel[1][0] = dosUno;
            jlabel[1][1] = dosDos;
        }
        Inicio();
    }

    public void Inicio() {
        buttons = new ArrayList();
        arrayBotones = new ArrayList<>();
        try {
            source = loadImage();
            int fg = getNewHeight(source.getWidth(), source.getHeight());
            resized = resizeImage(source, DESIRED_WIDTH, fg,
                    BufferedImage.TYPE_INT_ARGB);
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
        width = resized.getWidth(null);
        height = resized.getHeight(null);
        int rows = 2;
        int colums = 2;
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
        for (int i = 0; i < 4; i++) {
            img = (ImageIcon) buttons.get(i).getIcon();
        }
        Collections.shuffle(buttons);
        for (int i = 0; i < 4; i++) {
            MyButton btn = buttons.get(i);
            buttons.get(i).addActionListener(listener);
            panel.add(btn);
            btn.setBorder(BorderFactory.createLineBorder(Color.red));
            btn.setBackground(java.awt.Color.GRAY);
        }
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
    ArrayList<Object> obj = new ArrayList<>();

    ActionListener listener = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            if (e.getSource() instanceof JButton) {
                h = (ImageIcon) ((JButton) e.getSource()).getIcon();
                co = 1;
                s.mal();
            }

        }

    };

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        unoUno = new javax.swing.JLabel();
        dosUno = new javax.swing.JLabel();
        dosDos = new javax.swing.JLabel();
        unoDos = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        puntos4 = new javax.swing.JLabel();
        puntos3 = new javax.swing.JLabel();
        puntos2 = new javax.swing.JLabel();
        puntos1 = new javax.swing.JLabel();
        jpanelErrores = new javax.swing.JPanel();
        jLabelNumErrores = new javax.swing.JLabel();
        jLabelErrores = new javax.swing.JLabel();
        btnReiniciar = new javax.swing.JButton();
        btnRegresar = new javax.swing.JButton();
        btnSalir1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setExtendedState(6);
        setUndecorated(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        panel.setBackground(new java.awt.Color(153, 153, 255));
        panel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        panel.setLayout(new java.awt.GridLayout(1, 0));

        jPanel1.setBackground(new java.awt.Color(153, 153, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Imagen", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 8))); // NOI18N
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        unoUno.setBackground(new java.awt.Color(0, 102, 102));
        unoUno.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        unoUno.setAlignmentY(0.0F);
        unoUno.setName("unoUno"); // NOI18N
        unoUno.setOpaque(true);
        unoUno.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
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
        jPanel1.add(unoUno, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 220, 260));

        dosUno.setBackground(new java.awt.Color(204, 102, 0));
        dosUno.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        dosUno.setName("unouno"); // NOI18N
        dosUno.setOpaque(true);
        dosUno.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                dosUnoMouseMoved(evt);
            }
        });
        dosUno.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dosUnoMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                dosUnoMouseExited(evt);
            }
        });
        jPanel1.add(dosUno, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 280, 220, 260));

        dosDos.setBackground(new java.awt.Color(0, 102, 102));
        dosDos.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        dosDos.setName("unouno"); // NOI18N
        dosDos.setOpaque(true);
        dosDos.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                dosDosMouseMoved(evt);
            }
        });
        dosDos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dosDosMouseClicked(evt);
            }
        });
        jPanel1.add(dosDos, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 280, 220, 260));

        unoDos.setBackground(new java.awt.Color(204, 102, 0));
        unoDos.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        unoDos.setAlignmentY(0.0F);
        unoDos.setName("unouno"); // NOI18N
        unoDos.setOpaque(true);
        unoDos.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                unoDosMouseMoved(evt);
            }
        });
        unoDos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                unoDosMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                unoDosMouseExited(evt);
            }
        });
        jPanel1.add(unoDos, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 20, 220, 260));

        jPanel2.setBackground(new java.awt.Color(153, 153, 255));

        puntos4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        puntos4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        puntos3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        puntos3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        puntos2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        puntos2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        puntos1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        puntos1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(puntos1, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(puntos2, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(puntos3, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addComponent(puntos4, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(puntos4, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(puntos3, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(puntos2, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(puntos1, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jpanelErrores.setBackground(new java.awt.Color(102, 102, 255));
        jpanelErrores.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Errores", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 8))); // NOI18N

        jLabelNumErrores.setFont(new java.awt.Font("Verdana", 1, 48)); // NOI18N
        jLabelNumErrores.setForeground(new java.awt.Color(0, 0, 204));
        jLabelNumErrores.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jLabelErrores.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelErrores.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jpanelErroresLayout = new javax.swing.GroupLayout(jpanelErrores);
        jpanelErrores.setLayout(jpanelErroresLayout);
        jpanelErroresLayout.setHorizontalGroup(
            jpanelErroresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpanelErroresLayout.createSequentialGroup()
                .addComponent(jLabelNumErrores, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(jLabelErrores, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE)
                .addContainerGap())
        );
        jpanelErroresLayout.setVerticalGroup(
            jpanelErroresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpanelErroresLayout.createSequentialGroup()
                .addGroup(jpanelErroresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabelNumErrores, javax.swing.GroupLayout.DEFAULT_SIZE, 82, Short.MAX_VALUE)
                    .addComponent(jLabelErrores, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnReiniciar.setBackground(new java.awt.Color(0, 102, 0));
        btnReiniciar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnReiniciar.setText("REINICIAR JUEGO");
        btnReiniciar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnReiniciar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnReiniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReiniciarActionPerformed(evt);
            }
        });

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

        btnSalir1.setBackground(new java.awt.Color(0, 102, 0));
        btnSalir1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnSalir1.setText("SALIR");
        btnSalir1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnSalir1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnSalir1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalir1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(200, 200, 200)
                        .addComponent(jpanelErrores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(560, 560, 560)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 460, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(80, 80, 80)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnRegresar, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnSalir1, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(432, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(140, 140, 140)
                        .addComponent(panel, javax.swing.GroupLayout.PREFERRED_SIZE, 322, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(638, 638, 638)
                        .addComponent(btnReiniciar, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(460, 460, 460)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(130, 130, 130)
                        .addComponent(panel, javax.swing.GroupLayout.PREFERRED_SIZE, 410, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(130, 130, 130)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 530, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(550, 550, 550)
                        .addComponent(jpanelErrores, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(190, 190, 190)
                        .addComponent(btnReiniciar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)
                        .addComponent(btnRegresar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(44, 44, 44)
                        .addComponent(btnSalir1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(100, 100, 100))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
     int co = 0;
    private void unoUnoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_unoUnoMouseClicked
        if (co != 0) {
            Icon icono = new ImageIcon(h.getImage().getScaledInstance(jlabel[0][0].getWidth(), jlabel[0][0].getHeight(), Image.SCALE_DEFAULT));
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

    private void unoDosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_unoDosMouseClicked
        if (co != 0) {
            Icon icono = new ImageIcon(h.getImage().getScaledInstance(jlabel[0][1].getWidth(), jlabel[0][1].getHeight(), Image.SCALE_DEFAULT));
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

    private void dosDosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dosDosMouseClicked
        if (co != 0) {
            Icon icono = new ImageIcon(h.getImage().getScaledInstance(jlabel[1][1].getWidth(), jlabel[1][1].getHeight(), Image.SCALE_DEFAULT));
            if (arrayBotones.get(3).getIcon().equals(h) && dosDos.getIcon() == null) {
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

    private void dosUnoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dosUnoMouseClicked
        if (co != 0) {
            Icon icono = new ImageIcon(h.getImage().getScaledInstance(jlabel[1][0].getWidth(), jlabel[1][0].getHeight(), Image.SCALE_DEFAULT));
            if (arrayBotones.get(2).getIcon().equals(h) && dosUno.getIcon() == null) {
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

    private void unoUnoMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_unoUnoMouseMoved
//        unoUno.setBorder(BorderFactory.createMatteBorder(5, 5, 5, 5, Color.white));
    }//GEN-LAST:event_unoUnoMouseMoved

    private void unoUnoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_unoUnoMouseExited
//        unoUno.setBorder(BorderFactory.createEmptyBorder());
    }//GEN-LAST:event_unoUnoMouseExited

    private void dosUnoMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dosUnoMouseMoved
//        dosUno.setBorder(BorderFactory.createMatteBorder(10, 10, 10, 10, Color.yellow));
    }//GEN-LAST:event_dosUnoMouseMoved

    private void dosUnoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dosUnoMouseExited
//        dosUno.setBorder(BorderFactory.createEmptyBorder());
    }//GEN-LAST:event_dosUnoMouseExited

    private void unoDosMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_unoDosMouseMoved
//        unoDos.setBorder(BorderFactory.createMatteBorder(10, 10, 10, 10, Color.yellow));
    }//GEN-LAST:event_unoDosMouseMoved

    private void unoDosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_unoDosMouseExited
//        unoDos.setBorder(BorderFactory.createEmptyBorder());
    }//GEN-LAST:event_unoDosMouseExited

    private void dosDosMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dosDosMouseMoved

    }//GEN-LAST:event_dosDosMouseMoved

    private void btnReiniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReiniciarActionPerformed
        reiniciar();
    }//GEN-LAST:event_btnReiniciarActionPerformed

    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
        this.dispose();
        reiniciar();
    }//GEN-LAST:event_btnRegresarActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
//     cursor();
    }//GEN-LAST:event_formWindowOpened

    private void btnSalir1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalir1ActionPerformed
        T7_7MENU c=new  T7_7MENU();
        c.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnSalir1ActionPerformed
    public void reiniciar() {
        unoUno.setIcon(null);
        unoDos.setIcon(null);
        dosUno.setIcon(null);
        dosDos.setIcon(null);
        puntos1.setIcon(null);
        puntos2.setIcon(null);
        puntos3.setIcon(null);
        puntos4.setIcon(null);
        panel.removeAll();
        jLabelNumErrores.setText("");
        puntos = 0;
        errores = 0;
        Collections.shuffle(buttons);
        buttons.add(lastButton);
        Inicio();
    }
    JLabel jniv = new JLabel();
    Sonido s = new Sonido();

    public void progreso() {
//        String hh = "src\\imagenes\\like.png";
        jniv.setBounds(50, 50, 50, 50);;
        ImageIcon icon = new ImageIcon(getClass().getResource("/imagenes/like.png"));
        Icon icono = new ImageIcon(icon.getImage().getScaledInstance(jniv.getWidth(), jniv.getHeight(), Image.SCALE_DEFAULT));
        if (puntos == 1) {
            puntos1.setIcon(icono);
            s.intro();
        }
        if (puntos == 2) {
            puntos2.setIcon(icono);
            s.intro();
        }
        if (puntos == 3) {
            puntos3.setIcon(icono);
            s.intro();
        }
        if (puntos == 4) {
            puntos4.setIcon(icono);
            s.apausos();
        }
    }
    /**
     * @param args the command line arguments
     */
//    public static String Ruta = "C:\\Users\\angel\\Desktop\\ProyectoArquitectura\\src\\imagenes\\img.jpg";
//
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(JuegoB.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(JuegoB.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(JuegoB.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(JuegoB.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new JuegoB(Ruta).setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRegresar;
    private javax.swing.JButton btnReiniciar;
    private javax.swing.JButton btnSalir1;
    private javax.swing.JLabel dosDos;
    private javax.swing.JLabel dosUno;
    private javax.swing.JLabel jLabelErrores;
    private javax.swing.JLabel jLabelNumErrores;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jpanelErrores;
    private javax.swing.JPanel panel;
    private javax.swing.JLabel puntos1;
    private javax.swing.JLabel puntos2;
    private javax.swing.JLabel puntos3;
    private javax.swing.JLabel puntos4;
    private javax.swing.JLabel unoDos;
    private javax.swing.JLabel unoUno;
    // End of variables declaration//GEN-END:variables

    ActionListener action = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent evt) {
            jLabelErrores.setIcon(null);
            t.stop();

        }
    }; 
    Timer t = new Timer(1500, action);
    public void mostrarErrores() {
//        String hh = "src\\imagenes\\dislike.png";
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
//        String hh = "src\\imagenes\\fondo3.png";
      
    }
      public void cursor(){
          Toolkit tool=Toolkit.getDefaultToolkit();
          Image imga=tool.getImage(getClass().getResource("/imagenes/clic.png"));
          Point p=new Point(0,0);
          Cursor c=tool.createCustomCursor(imga.getScaledInstance(20, 20, Image.SCALE_DEFAULT), p, "c");
          setCursor(c);
      }
}
