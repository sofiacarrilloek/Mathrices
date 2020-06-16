          package Class;
/*     */ import java.awt.Dimension;
/*     */ import java.util.Vector;
/*     */ import javax.swing.JList;
 
/*     */   public class StartDialog {
/*  33 */   protected JList list = null;  
/*  38 */   protected Vector imagesList = null;
/*     */   
/*     */   public void addToImageList(ImageDescription paramImageDescription)
/*     */   {
/*  78 */     this.imagesList.addElement(paramImageDescription);
/*  79 */     this.list.setListData(this.imagesList);
/*     */   }  
/*     */   public Dimension getSelectedDivision(int val)
/*     */   {
/* 102 */     int i = 2;
/* 103 */     int j = 2;
/*     */     try
/*     */     {
/* 106 */       i =val; //Integer.parseInt(this.x_div.getText());
/* 107 */       j =val; //Integer.parseInt(this.x_div.getText());
/*     */       
/* 109 */       if (i < 2) i = 2;
/* 110 */       if (j < 2) { j = 2;
/*     */       }
/*     */     }
/*     */     catch (Exception e) {e.getMessage();}
/* 114 */     return new Dimension(i, j);
/*     */   }   
/*     */ }
