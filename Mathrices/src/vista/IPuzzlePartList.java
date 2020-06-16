package vista;

import java.awt.Point;
import java.awt.Rectangle;

public abstract interface IPuzzlePartList
{
  public abstract int getPartsCount();
  
  public abstract int getSolvedPartsCount();
  
  public abstract PuzzlePartList.PuzzlePart getFirstNode();
  
  public abstract PuzzlePartList.PuzzlePart[] getPartArray();
  
  public abstract boolean isSelectedPart(PuzzlePartList.PuzzlePart paramPuzzlePart);
  
  public abstract boolean selectPart(Point paramPoint);
  
  public abstract void deselectPart();
  
  public abstract void setRedrawRect(Rectangle paramRectangle);
  
  public abstract void moveLocation(int paramInt1, int paramInt2);
  
  public abstract void updatePart();
}


/* Location:              C:\Users\angel\Desktop\PuzzleJAVA\Juzzle.jar!\org\game\Juzzle\IPuzzlePartList.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */