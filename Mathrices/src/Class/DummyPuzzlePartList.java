package Class;

import java.awt.Point;
import java.awt.Rectangle;

public class DummyPuzzlePartList
        implements IPuzzlePartList {

    public int getPartsCount() {
        return -1;
    }

    public int getSolvedPartsCount() {
        return -1;
    }

    public PuzzlePartList.PuzzlePart getFirstNode() {
        return null;
    }

    public PuzzlePartList.PuzzlePart[] getPartArray() {
        return null;
    }

    public boolean isSelectedPart(PuzzlePartList.PuzzlePart paramPuzzlePart) {
        return false;
    }

    public boolean selectPart(Point paramPoint) {
        return false;
    }

    public void deselectPart() {
    }

    public void setRedrawRect(Rectangle paramRectangle) {
    }

    public void moveLocation(int paramInt1, int paramInt2) {
    }

    public void updatePart() {
    }
}
