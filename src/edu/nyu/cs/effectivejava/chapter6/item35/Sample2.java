package edu.nyu.cs.effectivejava.chapter6.item35;

import java.util.ArrayList;
import java.util.List;

/**
 * @author shenli
 * <p>
 * Program containing annotations with a parameter.
 */
public class Sample2 {
    @ExceptionTest(ArithmeticException.class)
    public static void m1() {   // Test should pass
        int i = 0;
        i = i / i;
    }
    
    @ExceptionTest(ArithmeticException.class)
    public static void m2() {   // Should fail (wrong exception)
        int[] a = new int[0];
        @SuppressWarnings("unused")
        int i = a[1];
    }
    
    @ExceptionTest(ArithmeticException.class)
    public static void m3() {}  // Should fail (no exception)
    
    // Code containing an annotation with an array parameter
    @ExceptionTest({IndexOutOfBoundsException.class,
                    NullPointerException.class})
    public static void doublyBad() {
        List<String> list = new ArrayList<String>();
        
        // The spec permits this method to throw either
        // IndexOutOfBoundsException or NullPointerException
        list.addAll(5, null);
    }
    
}