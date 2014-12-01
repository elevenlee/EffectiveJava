package edu.nyu.cs.effectivejava.chapter5.item27;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author shenli
 * <p>
 * Generic static factory method.
 */
public class GenericStaticFactory {

    // Generic static factory method
    public static <K, V> HashMap<K, V> newHashMap() {
        return new HashMap<K, V>();
    }
    
    public static void main(String[] args) {
        // Parameterized type instance creation with static factory
        @SuppressWarnings("unused")
        Map<String, List<String>> anagrams = GenericStaticFactory.newHashMap();
    }

}
