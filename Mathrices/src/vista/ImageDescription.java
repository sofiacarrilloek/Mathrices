/*    */ package vista;
/*    */ 
/*    */ import javax.swing.ImageIcon;
 
/*    */ 
/*    */ public class ImageDescription
/*    */ {
/* 25 */   public ImageIcon imageIcon = null;
/* 26 */   public ImageIcon imageIcon_scaled = null;
/* 27 */   public String name = null;
/*    */   
/*    */ 
/*    */ 
/*    */ /*    */   
/*    */ 
/*    */ 
/*    */ 
/*    */   public ImageDescription(ImageIcon paramImageIcon1, ImageIcon paramImageIcon2, String paramString)
/*    */   {
/* 34 */     this.imageIcon = paramImageIcon1;
/* 35 */     this.imageIcon_scaled = paramImageIcon2;
/* 36 */     this.name = paramString;
/*    */   }
/*    */   
/*    */   public String toString()
/*    */   {
/* 41 */     return this.name;
/*    */   }
/*    */ }
