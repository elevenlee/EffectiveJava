package edu.nyu.cs.effectivejava.chapter7.item39;

import java.util.Date;

public class Attack {

    @SuppressWarnings("deprecation")
    public static void main(String[] args) {
        // Attack the internals of a Period instance
        Date start = new Date();
        Date end = new Date();
        Period p = new Period(start, end);
        end.setYear(78);    // Modifies internals of p!
        
        // Second attack on the internals of a Period instance
        start = new Date();
        end = new Date();
        p = new Period(start, end);
        p.end().setYear(78);    // Modifies internals of p!
    }

}
