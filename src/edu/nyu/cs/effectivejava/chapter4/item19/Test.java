package edu.nyu.cs.effectivejava.chapter4.item19;

import static edu.nyu.cs.effectivejava.chapter4.item19.PhysicalConstants.*;

/**
 * @author shenli
 * <p>
 * Use of static import to avoid qualifying constants.
 */
public class Test {
    
    double atome(double mols) {
        return AVOGADROS_NUMBER * mols;
    }
    
    // Many more uses of PhysicalConstants justify static import
    
}
