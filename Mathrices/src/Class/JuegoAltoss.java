package Class;

import java.awt.Dimension;
import java.awt.Image;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.io.File;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLayeredPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.filechooser.FileFilter;
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.Toolkit;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.image.BufferedImage;
import mathrices.T7_7MENU;
import vista.Sonido;
import vista.audio;

/**
 *
 * @author angel
 */
public final class JuegoAltoss extends javax.swing.JFrame {

    protected JScrollPane pzp_jsp = null;
    protected PuzzlePanel puzzlePane = null;
    protected StartDialog startDialog = null;
    protected ControlPanel controlPanel = null;
    protected static final int PAINT_EXTEND = 2;
    protected static final int PAINT_SHADOW = 10;
    protected static final Cursor CURSOR_HAND = new Cursor(12);
    protected static final Cursor CURSOR_DEFAULT = new Cursor(0);
    protected static final Color outlineColor = new Color(0, 0, 0, 128);
    protected static final Color shadowColor = new Color(0, 0, 0, 128);
    int h = 1;
    private final audio audio;
    private int contador;

    public JuegoAltoss() {
        initComponents();
        ImageIcon ImageIcon = new ImageIcon(getClass().getResource("/imagenes/puzzle.png"));
        Image Image = ImageIcon.getImage();
        this.setIconImage(Image);
        this.audio = new audio();
        this.contador = 1;
        this.startDialog = new StartDialog();
        setLocationRelativeTo(null);
        setResizable(false);
        this.controlPanel = new ControlPanel();
        this.puzzlePane = new PuzzlePanel(this.controlPanel);
        this.pzp_jsp = new JScrollPane(this.puzzlePane);
        add(this.pzp_jsp, JLayeredPane.DEFAULT_LAYER);
        addComponentListener(new JuzzlePanelResizer());
        cursor();

    }

    public void JuegoAltoss(String hd) {
        jLabelPuntos.setText(hd);
    }

    public void startGame(String ruta, int num) {
        Dimension localDimension = this.startDialog.getSelectedDivision(num);
        ImageIcon localImageIcon = new ImageIcon(ruta);
        Image localImage = localImageIcon.getImage();
        BufferedImage localBufferedImage = new BufferedImage(localImageIcon.getIconWidth(), localImageIcon.getIconHeight(), 1);
        localBufferedImage.getGraphics().drawImage(localImage, 0, 0, null);
        this.puzzlePane.setGame(localBufferedImage, localDimension.width, localDimension.height);
        this.puzzlePane.repaint();
        jPanelPiezas.add(puzzlePane);
        found();
    }

    public class JuzzlePanelResizer extends ComponentAdapter /*     */ {

        @Override
        public void componentResized(ComponentEvent paramComponentEvent) /*     */ {
            pzp_jsp.setSize(jPanelPiezas.getSize());
        }
    }

    public class ImageFileFilter extends FileFilter {

        public ImageFileFilter() {
        }

        @Override
        public boolean accept(File paramFile) {
            return (paramFile.getName().endsWith(".jpg")) || (paramFile.getName().endsWith(".jpeg")) || (paramFile.getName().endsWith(".gif")) || (paramFile.isDirectory());
        }

        @Override
        public String getDescription() {
            return "Images (*.jpg;*.jpeg;*.gif)";
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelPiezas = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabelPuntos = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabelGanador = new javax.swing.JLabel();
        btnRegresar = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        btnReiniciar = new javax.swing.JButton();
        jLabelFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setExtendedState(6);
        setResizable(false);

        jPanelPiezas.setBackground(new java.awt.Color(255, 204, 102));
        jPanelPiezas.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "IMAGEN", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Tahoma", 1, 11))); // NOI18N
        jPanelPiezas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanelPiezasMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanelPiezasMousePressed(evt);
            }
        });

        javax.swing.GroupLayout jPanelPiezasLayout = new javax.swing.GroupLayout(jPanelPiezas);
        jPanelPiezas.setLayout(jPanelPiezasLayout);
        jPanelPiezasLayout.setHorizontalGroup(
            jPanelPiezasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1078, Short.MAX_VALUE)
        );
        jPanelPiezasLayout.setVerticalGroup(
            jPanelPiezasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 597, Short.MAX_VALUE)
        );

        jPanel1.setBackground(new java.awt.Color(153, 153, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "MOVIMIENTOS", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14), new java.awt.Color(0, 0, 153))); // NOI18N

        jLabelPuntos.setFont(new java.awt.Font("Tahoma", 1, 140)); // NOI18N
        jLabelPuntos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelPuntos.setText("0");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelPuntos, javax.swing.GroupLayout.DEFAULT_SIZE, 218, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelPuntos, javax.swing.GroupLayout.DEFAULT_SIZE, 272, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel2.setBackground(new java.awt.Color(153, 153, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "GANADOR", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14), new java.awt.Color(0, 0, 204))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelGanador, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 238, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelGanador, javax.swing.GroupLayout.DEFAULT_SIZE, 274, Short.MAX_VALUE)
        );

        btnRegresar.setBackground(new java.awt.Color(255, 255, 51));
        btnRegresar.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btnRegresar.setForeground(new java.awt.Color(255, 0, 51));
        btnRegresar.setText("REGRESAR");
        btnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarActionPerformed(evt);
            }
        });

        btnSalir.setBackground(new java.awt.Color(255, 255, 51));
        btnSalir.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btnSalir.setForeground(new java.awt.Color(255, 0, 0));
        btnSalir.setText("SALIR");
        btnSalir.setBorderPainted(false);
        btnSalir.setDoubleBuffered(true);
        btnSalir.setInheritsPopupMenu(true);
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        btnReiniciar.setBackground(new java.awt.Color(255, 255, 0));
        btnReiniciar.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btnReiniciar.setForeground(new java.awt.Color(255, 0, 0));
        btnReiniciar.setText("REINICIAR");
        btnReiniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReiniciarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(1090, 1090, 1090)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(1, 1, 1)
                .addComponent(jPanelPiezas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(1090, 1090, 1090)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(240, 240, 240)
                .addComponent(btnReiniciar, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(119, 119, 119)
                .addComponent(btnRegresar, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(111, 111, 111)
                        .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabelFondo, javax.swing.GroupLayout.PREFERRED_SIZE, 1392, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(640, 640, 640)
                .addComponent(btnReiniciar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanelPiezas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnRegresar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(320, 320, 320)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(640, 640, 640)
                .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(jLabelFondo, javax.swing.GroupLayout.PREFERRED_SIZE, 747, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
        this.dispose();
        puzzlePane.resetGame();
    }//GEN-LAST:event_btnRegresarActionPerformed

    private void jPanelPiezasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelPiezasMouseClicked

    }//GEN-LAST:event_jPanelPiezasMouseClicked

    private void jPanelPiezasMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelPiezasMousePressed

    }//GEN-LAST:event_jPanelPiezasMousePressed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        T7_7MENU c=new  T7_7MENU();
        c.setVisible(true);
        this.dispose(); 
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnReiniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReiniciarActionPerformed
        this.puzzlePane.resetGame();
    }//GEN-LAST:event_btnReiniciarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRegresar;
    private javax.swing.JButton btnReiniciar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel jLabelFondo;
    private javax.swing.JLabel jLabelGanador;
    private javax.swing.JLabel jLabelPuntos;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanelPiezas;
    // End of variables declaration//GEN-END:variables
    public void found() {
//        String hh = "src\\imagenes\\fondo3.png";
        ImageIcon icon = new ImageIcon(getClass().getResource("/imagenes/fondo3.png"));
        Icon icono = new ImageIcon(icon.getImage().getScaledInstance(jLabelFondo.getWidth(), jLabelFondo.getHeight(), Image.SCALE_DEFAULT));
        jLabelFondo.setIcon(icono);
    }

    public void cursor() {
        Toolkit tool = Toolkit.getDefaultToolkit();
        Image imga = tool.getImage(getClass().getResource("/imagenes/clic.png"));
        Point p = new Point(0, 0);
        Cursor c = tool.createCustomCursor(imga.getScaledInstance(20, 20, Image.SCALE_DEFAULT), p, "c");
        setCursor(c);
    }

    class PuzzlePanel extends JPanel implements MouseListener, MouseMotionListener {

        /*  39 */ protected BufferedImage bimage = null;
        /*  40 */        protected int x_parts = 0;
        /*  41 */        protected int y_parts = 0;
        /*  43 */        protected ControlPanel controlPanel = null;
        /*     */        protected boolean dragModus1;
        /*  45 */        protected boolean dragModus2 = false;
        /*  46 */        protected Point lastDragLocation = new Point();
        /*  47 */        protected Rectangle repaintRect1 = new Rectangle();
        /*  48 */        protected Rectangle repaintRect2 = new Rectangle();
        /*  49 */        protected boolean endMessagePrinted = false;
        /*  51 */        protected IPuzzlePartList puzzlePartList = null;
        /*  53 */        protected boolean antialiasing = true;
        /*  54 */        protected boolean outline = true;
        /*  55 */        protected boolean shadow = true;

        /*     */ public PuzzlePanel(ControlPanel paramControlPanel) /*     */ {
            /*  62 */ super(null);
            /*  64 */ this.controlPanel = paramControlPanel;
            /*  66 */ setOpaque(false);
            /*  68 */ addMouseListener(this);
            addMouseMotionListener(this);
            emptyGame();
        }

        /*     */ public void resetGame() /*     */ {
            /*  78 */ if (this.bimage != null) /*     */ {
                /*  80 */ emptyGame();
                /*  81 */ this.puzzlePartList = new PuzzlePartList(this.bimage, this.x_parts, this.y_parts, getSize());
                /*  85 */ repaint();
                h = 1;
                jLabelPuntos.setText("0");
                jLabelGanador.setIcon(null);
                /*     */            }
            /*     */        }

        /*     */ public void emptyGame() /*     */ {
            /*  91 */ dragModus1 = dragModus2 = false;
            /*  92 */ this.lastDragLocation = new Point();
            /*  93 */ this.repaintRect1 = new Rectangle();
            /*  94 */ this.repaintRect2 = new Rectangle();
            /*  95 */ this.puzzlePartList = new DummyPuzzlePartList();
            /*  96 */ this.endMessagePrinted = false;
            repaint();
        }

        /*     */ public void setGame(BufferedImage paramBufferedImage, int paramInt1, int paramInt2) /*     */ {
            /* 107 */ emptyGame();
            /* 109 */ this.bimage = paramBufferedImage;
            /* 110 */ this.x_parts = paramInt1;
            /* 111 */ this.y_parts = paramInt2;
            /* 113 */ this.puzzlePartList = new PuzzlePartList(paramBufferedImage, paramInt1, paramInt2, getSize());
            /* 118 */ repaint();

            /*     */        }

        /*     */ public void setAntialiasing(boolean paramBoolean) /*     */ {
            /* 123 */ this.antialiasing = paramBoolean;
            /* 124 */ repaint();
            /*     */        }

        /*     */ public void setOutline(boolean paramBoolean) {
            /* 128 */ this.outline = paramBoolean;
            /* 129 */ repaint();
        }

        /*     */ public void setShadow(boolean paramBoolean) {
            /* 133 */ this.shadow = paramBoolean;
            /* 134 */ repaint();
        }

        /*     */
        @Override
        public void paintComponent(Graphics paramGraphics) /*     */ {
            /* 139 */ super.paintComponent(paramGraphics);
            /* 141 */ Graphics2D localGraphics2D = (Graphics2D) paramGraphics;
            /* 146 */ PuzzlePartList.PuzzlePart localPuzzlePart = this.puzzlePartList.getFirstNode();
            /* 150 */ localGraphics2D.setStroke(new BasicStroke(3.0F));
            /* 152 */ while (localPuzzlePart != null) /*     */ {
                /* 159 */ int i = localPuzzlePart.locationIn.x - localPuzzlePart.boundsIn.x;
                /* 160 */ int j = localPuzzlePart.locationIn.y - localPuzzlePart.boundsIn.y;
                /* 162 */ localGraphics2D.translate(i, j);
                /* 166 */ if ((this.shadow) && (this.puzzlePartList.isSelectedPart(localPuzzlePart))) /*     */ {
                    /* 168 */ localGraphics2D.translate(10, 10);
                    /* 169 */ localGraphics2D.setPaint(shadowColor);
                    /* 170 */ localGraphics2D.fill(localPuzzlePart.generalPath);
                    /* 171 */ localGraphics2D.translate(-10, -10);
                }
                localGraphics2D.setPaint(localPuzzlePart.puzzlePaint);
                localGraphics2D.fill(localPuzzlePart.generalPath);

                if (this.outline) /*     */ {
                    /* 180 */ localGraphics2D.setColor(outlineColor);
                    /* 181 */ localGraphics2D.draw(localPuzzlePart.generalPath);
                }

                localGraphics2D.translate(-i, -j);
                /* 194 */ localPuzzlePart = localPuzzlePart.next;
            }

        }

        /*     */ protected void startDragging(MouseEvent paramMouseEvent) /*     */ {
            /* 206 */ if (this.puzzlePartList.selectPart(paramMouseEvent.getPoint())) /*     */ {
//                /* 208 */ setCursor(CURSOR_HAND);
                Toolkit tool = Toolkit.getDefaultToolkit();
                Image imga = tool.getImage(getClass().getResource("/imagenes/clic.png"));
                Point p = new Point(0, 0);
                Cursor c = tool.createCustomCursor(imga.getScaledInstance(20, 20, Image.SCALE_DEFAULT), p, "c");
                setCursor(c);
                /* 209 */ this.lastDragLocation.setLocation(paramMouseEvent.getPoint());
                /* 210 */ this.dragModus1 = true;
                /* 211 */ mouseMoved(paramMouseEvent);
            }
        }

        protected void stopDragging(MouseEvent paramMouseEvent) /*     */ {
            this.puzzlePartList.setRedrawRect(this.repaintRect1);
            this.puzzlePartList.updatePart();
            this.puzzlePartList.setRedrawRect(this.repaintRect2);
            this.puzzlePartList.deselectPart();
            if (this.repaintRect1.intersects(this.repaintRect2)) /*     */ {
                this.repaintRect1.add(this.repaintRect2);
                repaint(this.repaintRect1.x - 2, this.repaintRect1.y - 2, this.repaintRect1.width + 10 + 2 + 2, this.repaintRect1.height + 10 + 2 + 2);
            } else {
                repaint(this.repaintRect1.x - 2, this.repaintRect1.y - 2, this.repaintRect1.width + 10 + 2 + 2, this.repaintRect1.height + 10 + 2 + 2);
                repaint(this.repaintRect2.x - 2, this.repaintRect2.y - 2, this.repaintRect2.width + 10 + 2 + 2, this.repaintRect2.height + 10 + 2 + 2);
            }
            Sonido s = new Sonido();
            this.dragModus1 = false;
//            setCursor(CURSOR_DEFAULT);
            Toolkit tool = Toolkit.getDefaultToolkit();
            Image imga = tool.getImage(getClass().getResource("/imagenes/clic.png"));
            Point p = new Point(0, 0);
            Cursor c = tool.createCustomCursor(imga.getScaledInstance(20, 20, Image.SCALE_DEFAULT), p, "c");
            setCursor(c);
            if ((!this.endMessagePrinted) && (this.puzzlePartList.getSolvedPartsCount() >= this.puzzlePartList.getPartsCount())) {
                this.endMessagePrinted = true;
                s.Bien();
                h++;
                jLabelPuntos.setText("" + h);
                ganador();
            } else {
                s.mal();
                h++;
                jLabelPuntos.setText("" + h);
            }
        }

        @Override
        public void mouseClicked(MouseEvent paramMouseEvent) {
            if (!this.dragModus1) {
                startDragging(paramMouseEvent);
            } else {
                stopDragging(paramMouseEvent);
            }
        }

        @Override
        public void mouseEntered(MouseEvent paramMouseEvent) {
        }

        @Override
        public void mouseExited(MouseEvent paramMouseEvent) {
        }

        @Override
        public void mousePressed(MouseEvent paramMouseEvent) {
            if ((!this.dragModus2) && (!this.dragModus1)) {
                this.dragModus2 = true;
            }
        }

        @Override
        public void mouseReleased(MouseEvent paramMouseEvent) {
            if ((this.dragModus2) && (!this.dragModus1)) /*     */ {
                this.dragModus2 = false;
            } else if ((this.dragModus2) && (this.dragModus1)) /*     */ {
                this.dragModus2 = false;
                stopDragging(paramMouseEvent);
            }
        }

        @Override
        public void mouseDragged(MouseEvent paramMouseEvent) /*     */ {
            if ((this.dragModus2) && (!this.dragModus1)) /*     */ {
                this.dragModus1 = true;
                startDragging(paramMouseEvent);
            }
            /* 302 */ mouseMoved(paramMouseEvent);
        }

        /*     */
        @Override
        public void mouseMoved(MouseEvent paramMouseEvent) {
            if (this.dragModus1) /*     */ {
                Point localPoint = paramMouseEvent.getPoint();
                /* 310 */ int i = localPoint.x - this.lastDragLocation.x;
                int j = localPoint.y - this.lastDragLocation.y;
                /* 313 */ this.puzzlePartList.setRedrawRect(this.repaintRect1);
                this.puzzlePartList.moveLocation(i, j);
                this.puzzlePartList.setRedrawRect(this.repaintRect2);
                /* 319 */ if (this.repaintRect1.intersects(this.repaintRect2)) /*     */ {
                    this.repaintRect1.add(this.repaintRect2);
                    repaint(this.repaintRect1.x - 2, this.repaintRect1.y - 2, this.repaintRect1.width + 10 + 2 + 2, this.repaintRect1.height + 10 + 2 + 2);
                    /*     */
                } else {

                    repaint(this.repaintRect1.x - 2, this.repaintRect1.y - 2, this.repaintRect1.width + 10 + 2 + 2, this.repaintRect1.height + 10 + 2 + 2);

                    repaint(this.repaintRect2.x - 2, this.repaintRect2.y - 2, this.repaintRect2.width + 10 + 2 + 2, this.repaintRect2.height + 10 + 2 + 2);
                }

                this.lastDragLocation.setLocation(localPoint);
            }
        }
    }

    public void ganador() {
//        String hh = "src\\imagenes\\ganador.gif";
        ImageIcon icon = new ImageIcon(getClass().getResource("/imagenes/ganador.gif"));
        Icon icono = new ImageIcon(icon.getImage().getScaledInstance(jLabelGanador.getWidth(), jLabelGanador.getHeight(), Image.SCALE_DEFAULT));
        jLabelGanador.setIcon(icono);
    }
}
