package edu.nyu.cs.effectivejava.chapter8.item49;

import java.util.Comparator;

/**
 * @author shenli
 * <p>
 * Broken comparator - can you spot the flaw?
 */
public class BrokenComparator {

    public static void main(String[] args) {
        Comparator<Integer> naturalOrder = new Comparator<Integer>() {

            @Override
            public int compare(Integer first, Integer second) {
                return first < second ? -1 : (first == second ? 0 : 1);
            }
            
        };
        
        // Fixed Comparator
//      Comparator<Integer> naturalOrder = new Comparator<Integer>() {
//
//          @Override
//          public int compare(Integer first, Integer second) {
//              int f = first;  // Auto-unboxing
//              int s = second; // Auto-unboxing
//              return f < s ? -1 : (f == s ? 0 : 1);   // No unboxing
//          }
//          
//      };
        
        int result = naturalOrder.compare(new Integer(42), new Integer(42));
        System.out.println(result);
    }

}
