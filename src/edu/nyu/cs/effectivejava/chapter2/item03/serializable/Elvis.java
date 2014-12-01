package edu.nyu.cs.effectivejava.chapter2.item03.serializable;

/**
 * @author shenli
 * <p>
 * Serializable singleton with public final field.
 */
public class Elvis {
    public static final Elvis INSTANCE = new Elvis();
    
    private Elvis() {}
    
    public void leaveTheBuilding() {
        System.out.println("Whoa baby, I'm outta here!");
    }
    
    // readResolve method to preserve singleton property
    private Object readResolve() {
        // Returns the one true Elvis and let the garbage collector
        // take care of the Elvis impresonator
        return INSTANCE;
    }
    
    public static void main(String[] args) {
        Elvis elvis = Elvis.INSTANCE;
        elvis.leaveTheBuilding();
    }

}
