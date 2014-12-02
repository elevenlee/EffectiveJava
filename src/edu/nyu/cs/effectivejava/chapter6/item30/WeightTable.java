package edu.nyu.cs.effectivejava.chapter6.item30;

/**
 * @author shenli
 * <p>
 * Takes earth-weight and prints table of weights on all planets.
 */
public class WeightTable {

    public static void main(String[] args) {
        double earthWeight = Double.parseDouble("175");
        double mass = earthWeight / Planet.EARTH.surfaceGravity();
        for (Planet p : Planet.values())
            System.out.printf("Weight on %s is %f%n", p, p.surfaceWeight(mass));
    }

}
