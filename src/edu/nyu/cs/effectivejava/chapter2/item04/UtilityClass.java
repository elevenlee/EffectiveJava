package edu.nyu.cs.effectivejava.chapter2.item04;

/**
 * @author shenli
 * <p>
 * Noninstantiable utility class.
 */
public class UtilityClass {
    
    // Suppress default constructor for noninstantiability
    private UtilityClass() {
        throw new AssertionError();
    }
    
    // Remainder omitted
}
