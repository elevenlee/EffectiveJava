package edu.nyu.cs.effectivejava.chapter10.item66.fixedstopthread1;

import java.util.concurrent.TimeUnit;

/**
 * @author shenli
 * <p>
 * Properly synchronized cooperative thread termination.
 */
public class StopThread {
    private static boolean stopRequested;
    
    private static synchronized void requestStop() {
        stopRequested = true;
    }
    
    private static synchronized boolean stopRequested() {
        return stopRequested;
    }
    
    public static void main(String[] args)
            throws InterruptedException {
        Thread backgroundThread = new Thread(new Runnable() {

            @Override
            public void run() {
                @SuppressWarnings("unused")
                int i = 0;
                while (!stopRequested()) {
                    i++;
                }
            }
            
        });
        backgroundThread.start();
        
        TimeUnit.SECONDS.sleep(1);
        requestStop();
    }

}
