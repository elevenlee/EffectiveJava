package edu.nyu.cs.effectivejava.chapter6.item30;

import java.util.HashMap;
import java.util.Map;

/**
 * @author shenli
 * <p>
 * Enum type with constant-specific class bodies and data.
 */
public enum Operation {
    PLUS("+") {
        @Override 
        double apply(double x, double y) { return x + y; }
    },
    MINUS("-") {
        @Override 
        double apply(double x, double y) { return x - y; }
    },
    TIMES("*") {
        @Override 
        double apply(double x, double y) { return x * y; }
    },
    DEVIDE("/") {
        @Override 
        double apply(double x, double y) { return x / y; }
    };
    
    private final String symbol;
    // Implementing a fromString method on an enum type
    private static final Map<String, Operation> stringToEnum
         = new HashMap<String, Operation>();
    
    static {    // Initialize map from constant name to enum constant
        for (Operation op : values())
            stringToEnum.put(op.toString(), op);
    }
    
    Operation(String symbol) { this.symbol = symbol; }
    
    // Returns Operation for string, or null if string is invalid
    public static Operation fromString(String symbol) {
        return stringToEnum.get(symbol);
    }
    
    @Override 
    public String toString() { return symbol; }
    
    abstract double apply(double x, double y);
    
    public static void main(String[] args) {
        double x = Double.parseDouble(args[0]);
        double y = Double.parseDouble(args[1]);
        for (Operation op : Operation.values())
            System.out.printf("%f %s %f = %f%n",
                    x, op, y, op.apply(x, y));
    }
    
}
