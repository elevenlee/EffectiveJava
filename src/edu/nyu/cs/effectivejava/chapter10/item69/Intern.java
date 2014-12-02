package edu.nyu.cs.effectivejava.chapter10.item69;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/**
 * @author shenli
 * <p>
 * Concurrent canonicalizing map atop ConcurrentMap.
 */
public class Intern {
    private static final ConcurrentMap<String, String> map = 
            new ConcurrentHashMap<String, String>();
    
    // Concurrent canonicalizing map atop ConcurrentMap - not optimal
//  public static String intern(String s) {
//      String previousValue = map.putIfAbsent(s, s);
//      return previousValue == null ? s : previousValue;
//  }
    
    // Concurrent canonicalizing map atop ConcurrentMap - faster!
    public static String intern(String s) {
        String result = map.get(s);
        if (result == null) {
            result = map.putIfAbsent(s, s);
            if (result == null) {
                result = s;
            }
        }
        return result;
    }
    
}
