package edu.nyu.cs.effectivejava.chapter5.item23;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/**
 * @author shenli
 * <p>
 * Uses raw type (List) -- fails at runtime!
 */
public class Raw {
    
    @SuppressWarnings({ "rawtypes", "unchecked" })
    private static void unsafeAdd(List list, Object o) {
        list.add(o);
    }
    
//  private static void unsafeAdd(List<Object> list, Object o) {
//      list.add(o);
//  }
    
    // Use of raw type for unknown element type -- don't do this!
    @SuppressWarnings({ "unused", "rawtypes" })
    private static int numElementsInCommon(Set s1, Set s2) {
        int result = 0;
        for (Object o1 : s1) {
            if (s2.contains(o1)) {
                    result++;
            }
        }
        return result;
    }
    
    // Unbounded wildcard type -- typesafe and flexible
//  private static int numElementsInCommon(Set<?> s1, Set<?> s2) {
//      int result = 0;
//      for (Object o1 : s1)
//          if (s2.contains(o1))
//              result++;
//      return result;
//  }
    
    public static void main(String[] args) {
        List<String> strings = new ArrayList<String>();
        unsafeAdd(strings, new Integer(42));
        @SuppressWarnings("unused")
        String s = strings.get(0);  // Compiler-generated cast
    }

}
