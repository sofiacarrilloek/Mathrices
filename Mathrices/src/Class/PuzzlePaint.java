/*    */ package Class;
/*    */ 
/*    */ import java.awt.Paint;
/*    */ import java.awt.PaintContext;
/*    */ import java.awt.Rectangle;
/*    */ import java.awt.RenderingHints;
/*    */ import java.awt.geom.AffineTransform;
/*    */ import java.awt.geom.Rectangle2D;
/*    */ import java.awt.image.BufferedImage;
/*    */ import java.awt.image.ColorModel;
/*    */ import java.awt.image.Raster;

/*    */ public class PuzzlePaint
/*    */   implements Paint, PaintContext
/*    */ {
/* 27 */   protected BufferedImage bimage = null;
/* 28 */   protected Rectangle viewRect = new Rectangle();
/* 29 */   protected Rectangle userBounds = new Rectangle();

/*    */   public PuzzlePaint(BufferedImage paramBufferedImage, Rectangle paramRectangle)
/*    */   {
/* 36 */     this.bimage = paramBufferedImage;
/* 37 */     this.viewRect.setRect(paramRectangle);
/*    */   }
/*    */   
/*    */   public void setViewRect(Rectangle paramRectangle)
/*    */   {
/* 42 */     this.viewRect.setRect(paramRectangle);
/*    */   }
/*    */   

/*    */   public PaintContext createContext(ColorModel paramColorModel, Rectangle paramRectangle, Rectangle2D paramRectangle2D, AffineTransform paramAffineTransform, RenderingHints paramRenderingHints)
/*    */   {
/* 56 */     this.userBounds.setRect(paramRectangle);
/* 57 */     return this;
/*    */   }
/*    */   
/*    */   public int getTransparency()
/*    */   {
/* 62 */     return 1;
/*    */   }
/*    */   
/*    */   public void dispose() {}
/*    */   
/*    */   public ColorModel getColorModel()
/*    */   {
/* 69 */     return this.bimage.getColorModel();
/*    */   }
/*    */   
/*    */   public Raster getRaster(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
/*    */   {
/* 74 */     int i = paramInt1 - this.userBounds.x + this.viewRect.x;
/* 75 */     int j = paramInt2 - this.userBounds.y + this.viewRect.y;
/*    */ 
/*    */ 
/*    */ 
/* 80 */     return this.bimage.getRaster().createChild(i, j, paramInt3, paramInt4, 0, 0, null);
/*    */   }
/*    */ }
