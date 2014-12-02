package edu.nyu.cs.effectivejava.chapter10.item66.fixedstopthread2;

import java.util.concurrent.TimeUnit;

/**
 * @author shenli
 * <p>
 * Cooperative thread termination with a volatile field.
 */
public class StopThread {
    private static volatile boolean stopRequested;
    
    public static void main(String[] args)
            throws InterruptedException {
        Thread backgroundThread = new Thread(new Runnable() {

            @Override
            public void run() {
                @SuppressWarnings("unused")
                int i = 0;
                while (!stopRequested) {
                    i++;
                }
            }
            
        });
        backgroundThread.start();
        
        TimeUnit.SECONDS.sleep(1);
        stopRequested = true;
    }

}
