package edu.nyu.cs.effectivejava.chapter5.item27;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * @author shenli
 * <p>
 * Generic union method and program to exercise it.
 */
public class Union {
    
    // Uses raw types -- unacceptable!
//  public static Set union(Set s1, Set s2) {
//      Set result = new HashSet(s1);
//      result.addAll(s2);
//      return result;
//  }
    
    // Generic method
    public static <E> Set<E> union(Set<E> s1, Set<E> s2) {
        Set<E> result = new HashSet<E>(s1);
        result.addAll(s2);
        return result;
    }
    
    public static void main(String[] args) {
        Set<String> guys = new HashSet<String>(
                Arrays.asList("Tom", "Dick", "Harry"));
        Set<String> stooges = new HashSet<String>(
                Arrays.asList("Larry", "Moe", "Curly"));
        Set<String> aflCio = union(guys, stooges);
        System.out.println(aflCio);
    }

}
