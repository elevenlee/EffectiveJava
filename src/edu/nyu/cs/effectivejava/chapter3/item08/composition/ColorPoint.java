package edu.nyu.cs.effectivejava.chapter3.item08.composition;

/**
 * @author shenli
 * <p>
 * Add a value component without violating the equals contract.
 */
public class ColorPoint {
    private final Point point;
    private final Color color;
    
    public ColorPoint(int x, int y, Color color) {
        if (color == null)
            throw new NullPointerException();
        this.point = new Point(x, y);
        this.color = color;
    }
    
    /**
     * Returns the point-view of this color point
     */
    public Point asPoint() {
        return point;
    }
    
    @Override 
    public boolean equals(Object o) {
        if (!( o instanceof ColorPoint)) {
            return false;
        }
        ColorPoint cp = (ColorPoint) o;
        return cp.point.equals(point) && cp.color.equals(color);
    }
    
    // Remainder omitted
    
}
