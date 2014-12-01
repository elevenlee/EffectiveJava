package edu.nyu.cs.effectivejava.chapter2.item05.slow;

import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

/**
 * @author shenli
 * <p>
 * Creates lots of unnecessary duplicate objects.
 */
public class Person {
    private final Date birthDate;
    
    public Person(Date birthDate) {
        // Defensive copy
        this.birthDate = new Date(birthDate.getTime());
    }
    
    // Other fields, methods omitted
    
    // DON'T DO THIS!
    public boolean isBabyBoomer() {
        // Unnecessary allocation of expensive object
        Calendar gmtCal = Calendar.getInstance(TimeZone.getTimeZone("GMT"));
        gmtCal.set(1946, Calendar.JANUARY, 1, 0, 0, 0);
        Date boomStart = gmtCal.getTime();
        gmtCal.set(1965, Calendar.JANUARY, 1, 0, 0, 0);
        Date boomEnd = gmtCal.getTime();
        return birthDate.compareTo(boomStart) >= 0 &&
                birthDate.compareTo(boomEnd) < 0;
    }
    
}
