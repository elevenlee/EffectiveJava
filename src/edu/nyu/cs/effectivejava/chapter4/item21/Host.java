package edu.nyu.cs.effectivejava.chapter4.item21;

import java.io.Serializable;

/**
 * @author shenli
 * <p>
 * Exporting a concrete strategy.
 */
class Host {
    
    @SuppressWarnings("serial")
    private static class StrLenCmp implements Comparator<String>, Serializable {

        @Override
        public int compare(String t1, String t2) {
            return t1.length() - t2.length();
        }
        
    }
    
    // Returned comparator is serializable
    public static final Comparator<String> STRING_LENGTH_COMPARATOR = new StrLenCmp();
    
    // Bulk of class omitted
    
}
