package edu.nyu.cs.effectivejava.chapter2.item03.method;

/**
 * @author shenli
 * <p>
 * Singleton with static factory.
 */
public class Elvis {
    private static final Elvis INSTANCE = new Elvis();
    
    private Elvis() {}
    
    public static Elvis getInstance() {
        return INSTANCE;
    }
    
    public void leaveTheBuilding() {
        System.out.println("Whoa baby, I'm outta here!");
    }
    
    public static void main(String[] args) {
        Elvis elvis = Elvis.getInstance();
        elvis.leaveTheBuilding();
    }

}
