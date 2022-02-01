package zDesignPatterns.SingleUpdateQueue;

import java.util.concurrent.BlockingQueue;
                                //Runnable interface
public class Producer implements Runnable{

    BlockingQueue<String> blockingQueue = null;

    public Producer(BlockingQueue<String> queue) {
        this.blockingQueue = queue;
    }

    
    //method of Runnable interface
    //running method here
    @Override
    public void run() {
        while (true) {
            long timeMillis = System.currentTimeMillis(); //current time in milliseconds
            try {
                
                //putting milliseconds representation onto the blocking queue
                                           //converting milliseconds to string
                this.blockingQueue.put("" + timeMillis); //the empty string has a time
            } catch (InterruptedException e) {
                System.out.println("Producer was interrumped");
            }
            sleep(1000);
        }
    }

    private void sleep(long timeMillis) {
        try {
            Thread.sleep(timeMillis);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
