package edu.nyu.cs.effectivejava.chapter3.item09;

import java.util.HashMap;
import java.util.Map;

/**
 * @author shenli
 * <p>
 * Shows the need for overriding hashcode when you override equals.
 */
public final class PhoneNumber {
    private final short areaCode;
    private final short prefix;
    private final short lineNumber;
    // Lazily initialized, cached hashCode
    private volatile int hashCode;
    
    public PhoneNumber(int areaCode, int prefix, int lineNumber) {
        rangeCheck(areaCode,    999, "area code");
        rangeCheck(prefix,      999, "prefix");
        rangeCheck(lineNumber, 9999, "line number");
        
        this.areaCode = (short) areaCode;
        this.prefix = (short) prefix;
        this.lineNumber = (short) lineNumber;
    }
    
    private static void rangeCheck(int arg, int max, String name) {
        if (arg < 0 || arg > max) {
            throw new IllegalArgumentException(name + ": " + arg);
        }
    }
    
    @Override 
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof PhoneNumber)) {
            return false;
        }
        PhoneNumber pn = (PhoneNumber) o;
        return pn.lineNumber == lineNumber
                && pn.prefix == prefix
                && pn.areaCode == areaCode;
    }
    
    // Broken -- no hashCode method
    
    // The worst possible legal hash function -- never use!
//  @Override public int hashCode() {   return 42;  }
    
//  @Override public int hashCode() {
//      int result = 17;
//      result = 31 * result + areaCode;
//      result = 31 * result + prefix;
//      result = 31 * result + lineNumber;
//      return result;
//  }
    
    @Override 
    public int hashCode() {
        int result = hashCode;
        if (result == 0) {
            result = 17;
            result = 31 * result + areaCode;
            result = 31 * result + prefix;
            result = 31 * result + lineNumber;
            hashCode = result;
        }
        return result;
    }
    
    // Remainder omitted
    
    public static void main(String[] args) {
        Map<PhoneNumber, String> m = 
                new HashMap<PhoneNumber, String>();
        m.put(new PhoneNumber(707, 867, 5309), "Jenny");
        System.out.println(m.get(new PhoneNumber(707, 867, 5309)));
    }

}
