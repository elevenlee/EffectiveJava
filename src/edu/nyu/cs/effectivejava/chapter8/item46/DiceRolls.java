package edu.nyu.cs.effectivejava.chapter8.item46;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

enum Face {
    ONE, TWO, THREE, FOUR, FIVE, SIX
}

/**
 * @author shenli
 * <p>
 * Same bug as NestIteration.java (but different symptom)!!
 */
public class DiceRolls {

    public static void main(String[] args) {
        Collection<Face> faces = Arrays.asList(Face.values());
        
        for (Iterator<Face> i = faces.iterator(); i.hasNext(); )
            for (Iterator<Face> j = faces.iterator(); j.hasNext(); )
                System.out.println(i.next() + " " + j.next());
        
        // Preferred idiom for nested iteration on collections and arrays
        for (Face faceFirst : faces)
            for (Face faceSecond : faces)
                System.out.println(faceFirst + " " + faceSecond);
    }

}
