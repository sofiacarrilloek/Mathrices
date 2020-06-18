package mathrices;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JOptionPane;

/*
 * Hecho en la Faculad de Estudios Superiores Cuautitlan
 * Autores:
 * Pablo Alberto Cigarrero Lopez
 * Luis Ghadiel Quintana Levario
 * Carlos Alexis Angeles Gil
 */
public class T2_2Ahorcado extends javax.swing.JFrame {

  
    public ImageIcon imgs[];
    public JButton btns[];
    public String msgs[];
    public int ran;
    public int err;
    public String res[];

    public T2_2Ahorcado() {
        initComponents();
        this.setExtendedState(MAXIMIZED_BOTH);
        imgs = new ImageIcon[6];
        btns = new JButton[27];
        msgs = new String[20];

        //imagenes del joven ahorcado lol
        imgs[0] = new ImageIcon(getClass().getResource("/MexicanHangedPerson/im1.jpg"));
        imgs[1] = new ImageIcon(getClass().getResource("/MexicanHangedPerson/im2.jpg"));
        imgs[2] = new ImageIcon(getClass().getResource("/MexicanHangedPerson/im3.jpg"));
        imgs[3] = new ImageIcon(getClass().getResource("/MexicanHangedPerson/im4.jpg"));
        imgs[4] = new ImageIcon(getClass().getResource("/MexicanHangedPerson/im5.jpg"));
        imgs[5] = new ImageIcon(getClass().getResource("/MexicanHangedPerson/im6.jpg"));

        //botones para las letras
        btns[1] = jButton2;
        btns[2] = jButton3;
        btns[3] = jButton4;
        btns[4] = jButton5;
        btns[5] = jButton6;
        btns[6] = jButton7;
        btns[7] = jButton8;
        btns[8] = jButton9;
        btns[9] = jButton10;
        btns[10] = jButton11;
        btns[11] = jButton12;
        btns[12] = jButton13;
        btns[13] = jButton14;
        btns[14] = jButton15;
        btns[15] = jButton16;
        btns[16] = jButton17;
        btns[17] = jButton18;
        btns[18] = jButton19;
        btns[19] = jButton20;
        btns[20] = jButton21;
        btns[21] = jButton22;
        btns[22] = jButton23;
        btns[23] = jButton24;
        btns[24] = jButton25;
        btns[25] = jButton26;
        btns[26] = jButton27;

        //palabras por advinar, para agregar una nueva palabra sera necesario declararla al inicio
        msgs[0] = "MATRICES".toUpperCase();
        msgs[1] = "ORDEN".toUpperCase();
        msgs[2] = "SIGNO".toUpperCase();
        msgs[3] = "SUMA".toUpperCase();
        msgs[4] = "RESTA".toUpperCase();
        msgs[5] = "MULTIPLICACION".toUpperCase();
        msgs[6] = "ELEMENTOS".toUpperCase();
        msgs[7] = "OPUESTA".toUpperCase();
        msgs[8] = "REDUCCION".toUpperCase();
        msgs[9] = "DIFERENTES".toUpperCase();
        msgs[10] = "REAL".toUpperCase();
        msgs[11] = "COLUMNA".toUpperCase();
        msgs[12] = "TIPO".toUpperCase();
        msgs[13] = "FILAS".toUpperCase();
        msgs[14] = "RESULTADO".toUpperCase();
        msgs[15] = "PRODUCTOS".toUpperCase();
        msgs[16] = "OPERACIONES".toUpperCase();
        msgs[17] = "DISTINTO".toUpperCase();
        msgs[18] = "SUMAR".toUpperCase();
        msgs[19] = "OBTENER".toUpperCase();
        

        //se asigna un evento a cada letra para comprobar que exista en la palabra a adivinar
        for (int i = 1; i < 27; i++) {
            btns[i].addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    checarLetra(e);
                }
            });
        }
        iniciar();
    }

    //funcion para comenzar los parametros del juego o iniciar una nueva partida
    public void iniciar() {
        //ERRORES EN 0
        err = 0;
        jButton1.setIcon(imgs[0]);
        jTextPane1.setText("");
        //para activar las letras del tablero
        for (int i = 1; i < 27; i++) {
            btns[i].setEnabled(true);
        }
        //para generar una palabra aleatoriamente xD
        ran = (int) 0 + (int) (Math.random() * ((msgs.length - 1) + 1));
        //SEPARA EL MENSAJE POR PALABRAS
        String pal[] = msgs[ran].split(" ");
        res = new String[msgs[ran].length() + 1];
        int j = 0;
        // seran los guiones que van debajo de las letras como una separacion_
        for (String pal1 : pal) {
            for (int i = 0; i < pal1.length(); i++) {
                jTextPane1.setText(jTextPane1.getText() + "_ ");
                res[j++] = "_";
            }
            jTextPane1.setText(jTextPane1.getText() + "\n");
            res[j++] = " ";
        }
    }

    //al presionar una letra, esta se buscara si pertenece a la palabra, de lo contrario la marcara como error 
    public void checarLetra(ActionEvent e) {
        JButton bt = (JButton) e.getSource();
        char c[];
        //busca la letra en la palabra despues de haber sido presionada
        for (int i = 1; i < 27; i++) {
            if (bt == btns[i]) {
                //la tecla es inicializada
                c = Character.toChars(64 + i);
                //busca si la letra esta en la frase
                boolean esta = false;
                for (int j = 0; j < msgs[ran].length(); j++) {
                    if (c[0] == msgs[ran].charAt(j)) {
                        res[j] = c[0] + "";
                        esta = true;
                    }
                }
                //SI LA LETRA ESTA EN EL MENSAJE SE MUESTRA EN EL TEXTPANEL
                if (esta) {
                    jTextPane1.setText("");
                    for (String re : res) {
                        if (" ".equals(re)) {
                            jTextPane1.setText(jTextPane1.getText() + "\n");
                        } else {
                            jTextPane1.setText(jTextPane1.getText() + re + " ");
                        }
                    }
                    //hace una comprobacion de las letras restantes y faltantes, en caso de que ya no haya letras sera ganador :D
                    boolean gano = true;
                    for (String re : res) {
                        if (re.equals("_")) {
                            gano = false;
                            break;
                        }
                    }
                    //al ser correcta se muestra un mensaje y se reinicia el juego
                    if (gano) {
                        JOptionPane.showMessageDialog(this, "Ganaste!!!");
                        iniciar();
                        return;
                    }
                    //SI LA LETRA NO ESTA EN EL MENSAGE, SE INCREMENTA EL ERROR Y SE CAMBIA LA IMAGEN
                } else {
                    jButton1.setIcon(imgs[++err]);
                    //SI SE LLEGA A LOS 5 ERRORES ENTONCES SE PIERDE EL JUEGO Y SE MANDA EL MENSAGE DE:
                    if (err == 5) {
                        JOptionPane.showMessageDialog(this, "Intenta con otra palabra la respuesta es: \n" + msgs[ran]);
                        iniciar();
                        return;
                    }
                }
                //esta es la linea que desactiva las letras despues de ser usadas :3
                bt.setEnabled(false);
                break;
            }
        }

    }


    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextPane1 = new javax.swing.JTextPane();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();
        jButton15 = new javax.swing.JButton();
        jButton16 = new javax.swing.JButton();
        jButton17 = new javax.swing.JButton();
        jButton18 = new javax.swing.JButton();
        jButton19 = new javax.swing.JButton();
        jButton20 = new javax.swing.JButton();
        jButton21 = new javax.swing.JButton();
        jButton22 = new javax.swing.JButton();
        jButton23 = new javax.swing.JButton();
        jButton24 = new javax.swing.JButton();
        jButton25 = new javax.swing.JButton();
        jButton26 = new javax.swing.JButton();
        jButton27 = new javax.swing.JButton();
        jButton28 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jButton30 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("MexicanHangedPerson By Pear Soft&Games");
        setFocusable(false);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setForeground(new java.awt.Color(0, 0, 204));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MexicanHangedPerson/im1.jpg"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jTextPane1.setEditable(false);
        jTextPane1.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        jScrollPane1.setViewportView(jTextPane1);

        jButton2.setBackground(new java.awt.Color(51, 102, 255));
        jButton2.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        jButton2.setText("A");
        jButton2.setFocusPainted(false);
        jButton2.setFocusable(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(51, 102, 255));
        jButton3.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        jButton3.setText("B");
        jButton3.setFocusPainted(false);
        jButton3.setFocusable(false);

        jButton4.setBackground(new java.awt.Color(51, 102, 255));
        jButton4.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        jButton4.setText("C");
        jButton4.setFocusPainted(false);
        jButton4.setFocusable(false);

        jButton5.setBackground(new java.awt.Color(51, 102, 255));
        jButton5.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        jButton5.setText("D");
        jButton5.setFocusPainted(false);
        jButton5.setFocusable(false);

        jButton6.setBackground(new java.awt.Color(51, 102, 255));
        jButton6.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        jButton6.setText("E");
        jButton6.setFocusPainted(false);
        jButton6.setFocusable(false);

        jButton7.setBackground(new java.awt.Color(51, 102, 255));
        jButton7.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        jButton7.setText("F");
        jButton7.setFocusPainted(false);
        jButton7.setFocusable(false);

        jButton8.setBackground(new java.awt.Color(51, 102, 255));
        jButton8.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        jButton8.setText("G");
        jButton8.setFocusPainted(false);
        jButton8.setFocusable(false);

        jButton9.setBackground(new java.awt.Color(51, 102, 255));
        jButton9.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        jButton9.setText("H");
        jButton9.setFocusPainted(false);
        jButton9.setFocusable(false);

        jButton10.setBackground(new java.awt.Color(51, 102, 255));
        jButton10.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        jButton10.setText("I");
        jButton10.setFocusPainted(false);
        jButton10.setFocusable(false);
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        jButton11.setBackground(new java.awt.Color(51, 102, 255));
        jButton11.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        jButton11.setText("J");
        jButton11.setFocusPainted(false);
        jButton11.setFocusable(false);

        jButton12.setBackground(new java.awt.Color(51, 102, 255));
        jButton12.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        jButton12.setText("K");
        jButton12.setFocusPainted(false);
        jButton12.setFocusable(false);

        jButton13.setBackground(new java.awt.Color(51, 102, 255));
        jButton13.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        jButton13.setText("L");
        jButton13.setFocusPainted(false);
        jButton13.setFocusable(false);

        jButton14.setBackground(new java.awt.Color(51, 102, 255));
        jButton14.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        jButton14.setText("M");
        jButton14.setFocusPainted(false);
        jButton14.setFocusable(false);

        jButton15.setBackground(new java.awt.Color(51, 102, 255));
        jButton15.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        jButton15.setText("N");
        jButton15.setFocusPainted(false);
        jButton15.setFocusable(false);

        jButton16.setBackground(new java.awt.Color(51, 102, 255));
        jButton16.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        jButton16.setText("O");
        jButton16.setFocusPainted(false);
        jButton16.setFocusable(false);

        jButton17.setBackground(new java.awt.Color(51, 102, 255));
        jButton17.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        jButton17.setText("P");
        jButton17.setFocusPainted(false);
        jButton17.setFocusable(false);

        jButton18.setBackground(new java.awt.Color(51, 102, 255));
        jButton18.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        jButton18.setText("Q");
        jButton18.setFocusPainted(false);
        jButton18.setFocusable(false);

        jButton19.setBackground(new java.awt.Color(51, 102, 255));
        jButton19.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        jButton19.setText("R");
        jButton19.setFocusPainted(false);
        jButton19.setFocusable(false);

        jButton20.setBackground(new java.awt.Color(51, 102, 255));
        jButton20.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        jButton20.setText("S");
        jButton20.setFocusPainted(false);
        jButton20.setFocusable(false);

        jButton21.setBackground(new java.awt.Color(51, 102, 255));
        jButton21.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        jButton21.setText("T");
        jButton21.setFocusPainted(false);
        jButton21.setFocusable(false);

        jButton22.setBackground(new java.awt.Color(51, 102, 255));
        jButton22.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        jButton22.setText("U");
        jButton22.setFocusPainted(false);
        jButton22.setFocusable(false);

        jButton23.setBackground(new java.awt.Color(51, 102, 255));
        jButton23.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        jButton23.setText("V");
        jButton23.setFocusPainted(false);
        jButton23.setFocusable(false);

        jButton24.setBackground(new java.awt.Color(51, 102, 255));
        jButton24.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        jButton24.setText("W");
        jButton24.setFocusPainted(false);
        jButton24.setFocusable(false);

        jButton25.setBackground(new java.awt.Color(51, 102, 255));
        jButton25.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        jButton25.setText("X");
        jButton25.setFocusPainted(false);
        jButton25.setFocusable(false);

        jButton26.setBackground(new java.awt.Color(51, 102, 255));
        jButton26.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        jButton26.setText("Y");
        jButton26.setFocusPainted(false);
        jButton26.setFocusable(false);

        jButton27.setBackground(new java.awt.Color(51, 102, 255));
        jButton27.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        jButton27.setText("Z");
        jButton27.setFocusPainted(false);
        jButton27.setFocusable(false);

        jButton28.setBackground(new java.awt.Color(255, 0, 0));
        jButton28.setFont(new java.awt.Font("Bell MT", 1, 18)); // NOI18N
        jButton28.setForeground(new java.awt.Color(255, 255, 255));
        jButton28.setText("Reiniciar");
        jButton28.setFocusPainted(false);
        jButton28.setFocusable(false);
        jButton28.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton28ActionPerformed(evt);
            }
        });

        jLabel3.setText(" ");

        jButton30.setBackground(new java.awt.Color(0, 0, 153));
        jButton30.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jButton30.setForeground(new java.awt.Color(255, 255, 255));
        jButton30.setText("Regresar");
        jButton30.setFocusable(false);
        jButton30.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton30ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(756, 756, 756)
                        .addComponent(jLabel3))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jButton30, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(143, 143, 143)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(185, 185, 185)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 341, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(202, 202, 202)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jButton9)
                                .addGap(18, 18, 18)
                                .addComponent(jButton10))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jButton2)
                                .addGap(18, 18, 18)
                                .addComponent(jButton3))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jButton16)
                                .addGap(18, 18, 18)
                                .addComponent(jButton17))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jButton23)
                                .addGap(18, 18, 18)
                                .addComponent(jButton24)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton25)
                        .addGap(18, 18, 18)
                        .addComponent(jButton26)
                        .addGap(18, 18, 18)
                        .addComponent(jButton27))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jButton4)
                            .addGap(18, 18, 18)
                            .addComponent(jButton5)
                            .addGap(18, 18, 18)
                            .addComponent(jButton6)
                            .addGap(18, 18, 18)
                            .addComponent(jButton7)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton8))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jButton11)
                            .addGap(18, 18, 18)
                            .addComponent(jButton12)
                            .addGap(18, 18, 18)
                            .addComponent(jButton13)
                            .addGap(18, 18, 18)
                            .addComponent(jButton14)
                            .addGap(18, 18, 18)
                            .addComponent(jButton15)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton18)
                        .addGap(18, 18, 18)
                        .addComponent(jButton19)
                        .addGap(18, 18, 18)
                        .addComponent(jButton20)
                        .addGap(18, 18, 18)
                        .addComponent(jButton21)
                        .addGap(18, 18, 18)
                        .addComponent(jButton22)))
                .addGap(264, 264, 264))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(267, 267, 267)
                .addComponent(jButton28, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(192, 192, 192)
                        .addComponent(jLabel3)
                        .addGap(42, 42, 42)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton2)
                            .addComponent(jButton3)
                            .addComponent(jButton4)
                            .addComponent(jButton5)
                            .addComponent(jButton6)
                            .addComponent(jButton7)
                            .addComponent(jButton8))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton9)
                            .addComponent(jButton10)
                            .addComponent(jButton11)
                            .addComponent(jButton12)
                            .addComponent(jButton13)
                            .addComponent(jButton14)
                            .addComponent(jButton15))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton16)
                            .addComponent(jButton17)
                            .addComponent(jButton18)
                            .addComponent(jButton19)
                            .addComponent(jButton20)
                            .addComponent(jButton21)
                            .addComponent(jButton22))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton23)
                            .addComponent(jButton24)
                            .addComponent(jButton25)
                            .addComponent(jButton26)
                            .addComponent(jButton27)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(37, 37, 37)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addComponent(jButton30, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(79, 79, 79)
                .addComponent(jButton28, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(217, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 39, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton28ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton28ActionPerformed
        iniciar();        // TODO add your handling code here:
    }//GEN-LAST:event_jButton28ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton30ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton30ActionPerformed
T2_3INSTRUCCIONES c=new T2_3INSTRUCCIONES();
c.setVisible(true);
this.dispose();
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton30ActionPerformed

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
            java.util.logging.Logger.getLogger(T2_2Ahorcado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(T2_2Ahorcado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(T2_2Ahorcado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(T2_2Ahorcado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new T2_2Ahorcado().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton17;
    private javax.swing.JButton jButton18;
    private javax.swing.JButton jButton19;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton20;
    private javax.swing.JButton jButton21;
    private javax.swing.JButton jButton22;
    private javax.swing.JButton jButton23;
    private javax.swing.JButton jButton24;
    private javax.swing.JButton jButton25;
    private javax.swing.JButton jButton26;
    private javax.swing.JButton jButton27;
    private javax.swing.JButton jButton28;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton30;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextPane jTextPane1;
    // End of variables declaration//GEN-END:variables
}
