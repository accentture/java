
package zDesignPatterns.SingleUpdateQueue;

import java.util.concurrent.BlockingQueue;

                                // Runnable interface
public class Consumer implements Runnable{
 BlockingQueue<String> blockingQueue = null;
    public Consumer(BlockingQueue<String> queue){
        this.blockingQueue = queue;
    }
    
    @Override
    public void run(){
        
        //repeating while loop forever
        while(true){
            try{
                
                //the consumer tries to take the element from the blocking queue, then creates a new string which consist in the name of the thread that is currently executing in this runnable
                String element = this.blockingQueue.take();
                String text = Thread.currentThread().getName() + " consumed " + element;
                System.out.println(text);
            }
            catch(InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}
