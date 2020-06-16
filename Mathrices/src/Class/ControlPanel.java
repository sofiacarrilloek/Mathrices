/*     */ package Class;
/*     */ // RELACIONADO CON EL MENU PRINCIPAL
/*     */ public class ControlPanel
///*     */   extends JPanel
  {
///*  29 */   protected static final Color textBackground = new Color(128, 0, 0);
///*  30 */   protected static final Color textForeground = new Color(255, 255, 0);
///*     */   
///*     */   protected static final int imageSize = 200;
///*  33 */   protected JLabel imagePanel = null;
///*  34 */   protected JLabel piecesLabel = null;
///*  35 */   protected JLabel solvedLabel = null;
///*  36 */   protected JLabel timeLabel = null;
///*     */   
///*  38 */   protected int gameTime = 0;
///*  39 */   protected Timer gameTimeCounter = new Timer(1000, new TimeCounterListener());
///*     */   protected int sec;
///*     */   protected int min;
///*     */   protected int hour;
///*     */   protected int time;
///*     */   protected String ssec;
///*     */   protected String smin;
///*     */   /*     */   
///*     */   public ControlPanel() {
///*  48 */     super(new BorderLayout());
///*     */     
///*  50 */     this.imagePanel = new JLabel();
///*  51 */     this.imagePanel.setHorizontalAlignment(0);
//
///*     */     //MENU
///*  58 */     JPanel localJPanel1 = new JPanel(new GridLayout(1, 1));
///*  59 */     localJPanel1.setPreferredSize(new Dimension(220, 220));
///*  60 */     CompoundBorder localCompoundBorder = new CompoundBorder(new EmptyBorder(5, 5, 5, 5), new EtchedBorder());
///*  61 */     localJPanel1.setBorder(new CompoundBorder(localCompoundBorder, new EmptyBorder(5, 5, 5, 5)));
///*  62 */     localJPanel1.add(this.imagePanel);
///*     */     
////            RESULTADO DE JMENU
///*  64 */     JPanel localJPanel2 = new JPanel(new GridBagLayout());
///*  65 */     localJPanel2.setBorder(new CompoundBorder(new EmptyBorder(10, 10, 10, 10), new BevelBorder(1)));
///*     */     
///*  67 */     GridBagConstraints localGridBagConstraints = new GridBagConstraints();
///*     */     
///*  69 */     localGridBagConstraints.gridx = 0;localGridBagConstraints.gridy = 0;
///*  70 */     localGridBagConstraints.fill = 1;
///*  71 */     localJPanel2.add(createLabel("Pieces:", 4), localGridBagConstraints);
///*     */     
///*  73 */     localGridBagConstraints.gridx = 0;localGridBagConstraints.gridy = 1;
///*  74 */     localGridBagConstraints.fill = 1;
///*  75 */     localJPanel2.add(createLabel("Solved:", 4), localGridBagConstraints);
///*     */     
///*  77 */     localGridBagConstraints.gridx = 0;localGridBagConstraints.gridy = 2;
///*  78 */     localGridBagConstraints.fill = 1;
///*  79 */     localJPanel2.add(createLabel("Time:", 4), localGridBagConstraints);
///*     */     
///*  81 */     localGridBagConstraints.gridx = 1;localGridBagConstraints.gridy = 0;
///*  82 */     localGridBagConstraints.fill = 1;
///*  83 */     localGridBagConstraints.weightx = 1.0D;
///*  84 */     localJPanel2.add(this.piecesLabel = createLabel("", 2), localGridBagConstraints);
///*     */     
///*  86 */     localGridBagConstraints.gridx = 1;localGridBagConstraints.gridy = 1;
///*  87 */     localGridBagConstraints.fill = 1;
///*  88 */     localGridBagConstraints.weightx = 1.0D;
///*  89 */     localJPanel2.add(this.solvedLabel = createLabel("", 2), localGridBagConstraints);
///*     */     
///*  91 */     localGridBagConstraints.gridx = 1;localGridBagConstraints.gridy = 2;
///*  92 */     localGridBagConstraints.fill = 1;
///*  93 */     localGridBagConstraints.weightx = 1.0D;
///*  94 */     localJPanel2.add(this.timeLabel = createLabel("", 2), localGridBagConstraints);
///*     */     
///*  96 */     add("Center", localJPanel1);
///*  97 */     add("South", localJPanel2);
///*     */   }
///*     */   
///*     */   public void setImage(Image paramImage)
///*     */   {
///* 102 */     int i = paramImage.getWidth(null);
///* 103 */     int j = paramImage.getHeight(null);
///*     */     
///* 105 */     int k = 0;
///* 106 */     int m = 0;
///*     */     
///* 108 */     if (i >= j)
///*     */     {
///* 110 */       k = 200;
///* 111 */       m = (int)(j * (200.0D / i));
///*     */     }
///*     */     else
///*     */     {
///* 115 */       k = (int)(i * (200.0D / j));
///* 116 */       m = 200;
///*     */     }
///*     */     
///* 119 */     Image localImage = paramImage.getScaledInstance(k, m, 2);
///* 120 */     this.imagePanel.setIcon(new ImageIcon(localImage));
///*     */   }
///*     */   
///*     */   protected JLabel createLabel(String paramString, int paramInt)
///*     */   {
///* 125 */     JLabel localJLabel = new JLabel(paramString, paramInt);
///* 126 */     localJLabel.setBorder(new EmptyBorder(0, 5, 0, 2));
///* 127 */     localJLabel.setOpaque(true);
///* 128 */     localJLabel.setBackground(textBackground);
///* 129 */     localJLabel.setForeground(textForeground);
///* 130 */     localJLabel.setFont(new Font("SansSerif", 0, 11));
///* 131 */     return localJLabel;
///*     */   }
///*     */   
///*     */   public void startCounter()
///*     */   {
///* 136 */     this.gameTime = 0;
///* 137 */     printTime("00:00");
///* 138 */     if (this.gameTimeCounter.isRunning()) {
///* 139 */       this.gameTimeCounter.restart();
///*     */     } else {
///* 141 */       this.gameTimeCounter.start();
///*     */     }
///*     */   }
///*     */   
///*     */   public void stopCounter() {
///* 146 */     this.gameTimeCounter.stop();
///*     */   }
///*     */   
///*     */   public String getGameTime()
///*     */   {
///* 151 */     this.time = this.gameTime;
///*     */     
///* 153 */     this.sec = (this.time % 60);
///* 154 */     this.ssec = ("" + this.sec);
///* 155 */     this.time /= 60;
///* 156 */     if (this.time < 1) { return "00:" + this.ssec;
///*     */     }
///* 158 */     this.min = (this.time % 60);
///* 159 */     this.smin = ("" + this.min);
///* 160 */     this.time /= 60;
///* 161 */     if (this.time < 1) { return this.smin + ":" + this.ssec;
///*     */     }
///* 163 */     this.hour = this.time;
///* 164 */     return this.hour + ":" + this.smin + ":" + this.ssec;
///*     */   }
///*     */   
///*     */   public void printPieces(String paramString)
///*     */   {
///* 169 */     if (this.piecesLabel != null) {
///* 170 */       this.piecesLabel.setText(paramString);
///*     */     }
///*     */   }
///*     */   
///*     */   public void printSolved(String paramString) {
///* 175 */     if (this.solvedLabel != null) {
///* 176 */       this.solvedLabel.setText(paramString);
///*     */     }
///*     */   }
///*     */   
///*     */   public void printTime(String paramString) {
///* 181 */     if (this.timeLabel != null)
///* 182 */       this.timeLabel.setText(paramString);
///*     */   }
///*     */   /*     */   
///*     */   protected class TimeCounterListener implements ActionListener {
///*     */     protected TimeCounterListener() {}
///*     */     /*     */     
///*     */     public void actionPerformed(ActionEvent paramActionEvent) {
///* 189 */       ControlPanel.this.gameTime += 1;
///* 190 */       ControlPanel.this.printTime(ControlPanel.this.getGameTime());
///*     */     }
///*     */   }
/*     */ }
