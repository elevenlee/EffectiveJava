package edu.nyu.cs.effectivejava.chapter10.item71;

/**
 * @author shenli
 * <p>
 * Initialization styles.
 */
public class Initialization {
    // Normal initialization of an instance field
    @SuppressWarnings("unused")
    private final FieldType field1 = computeFieldValue();
    
    // Lazy initialization of instance field -- synchronized accessor
    private FieldType field2;
    
    synchronized FieldType getField2() {
        if (field2 == null) {
            field2 = computeFieldValue();
        }
        return field2;
    }
    
    // Lazy initialization holder class idiom for static fields
    private static class FieldHolder {
        static final FieldType field = computeFieldValue();
    }
    static FieldType getField3() {
        return FieldHolder.field;
    }
    
    // Double-check idiom for lazy initialization of instance fields
    private volatile FieldType field4;
    
    FieldType getField4() {
        FieldType result = field4;
        if (result == null) {   // First check (no locking)
            synchronized(this) {
                result = field4;
                if (result == null)  {// Second check (with locking)
                    field4 = result = computeFieldValue();
                }
            }
        }
        return result;
    }
    
    // Single-check idiom - can cause repeated initialization!
    private volatile FieldType field5;
    
    @SuppressWarnings("unused")
    private FieldType getField5() {
        FieldType result = field5;
        if (result == null) {
            field5 = result = computeFieldValue();
        }
        return result;
    }
    
    private static FieldType computeFieldValue() {
        return new FieldType();
    }
}

class FieldType {}