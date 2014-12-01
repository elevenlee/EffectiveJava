package edu.nyu.cs.effectivejava.chapter2.item03.enums;

public enum Elvis {
    INSTANCE;
    
    public void leaveTheBuilding() {
        System.out.println("Whoa baby, I'm outta here!");
    }
    
    public static void main(String[] args) {
        Elvis elvis = Elvis.INSTANCE;
        elvis.leaveTheBuilding();
    }

}
