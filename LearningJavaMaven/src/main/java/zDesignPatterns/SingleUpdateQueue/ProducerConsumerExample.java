


/*
    --the producer consumer pathern is a workload distritubtion pattern where the number of work executing threads is decoupled from the number of tasks these worker threads are to execute

    --the producer consumer pattern consists of one or more threads detect what work is to be executed and one or more threads that execute their work
    --the detected work is typically enqueued as tasks objects inside a queue and the worker threads can take take these these task object from the queue one by one and exete them
    --as an example imagine a situation where a work detecting thread is scanning a directory in a file system for files to process, for instance it could be images that have been uploaded to a server
    --now image too that the server is running on here has multiple cpus and so if you simply process the files one by one directly inside the work detectingm then you are not actually taking advantage of the many cpus sitting in the serve
    --instead  you would like to have multiple threads contribute to the processing of the files


    --however if you started one thread by file thread, you would be starting many threads

    --every thread take resources as memory
    --that means if you start up  1000 threads at the same time you will be using a lot of unnecessary sytem resources for these treads

    --then instead to detect thread here, we can create one task object per image file and enqueue it in a file the you can have one or more worker threads here taking these tasks objects out of the queue and executing them one by one
    --this way you can set the number of worker threads here to match the number of CPUS that you have in the server, that way you get a better utilization if the CPUS 
    --with that you void the overloading with unneessary threads that cannot be executed at the same time anywys
    --whe I  say at the same time I mean at the exact same time meaning in parallel, of course a cpu is able to make progress on the work of multiple threads
    --seemingly(aparentemente) at the same time by spliting its cpu time between multiple threds
    --however if you want to utilizate the cpus to the max it's better to have just one thread executing on each cpu and so matching the number of worker threads

    --there are many situation where you can  benefit  from using the producer comsumer pattern
    --a common use cases are to reduce foreground (primer plano) thread latency to load balance between worker threads or for back pressure managament



    //undestood by me
    --if the ui thread is busy, we cannot make other process in this thread, therefore we cannot response to the first request
    --it is better fot the ui thread simply to detect the work(request) and create an object that represents this work and put it in a queue, then we have a background thread 
    --a worker thread execute that work in the background, once the workter thread has finished, it can reponse with a message back the ui
    --in this way the ui thread is available to respond the user interface or request  in the user interface
    --in this particular case I refer to latency as meaning the time from the user click the buttom and selects the file until the ui become responsive again, not until the file has been fully processed. So the latency between  telling the desktop application the ui here to process the file and the time the ui is able to take the next command from the user
    --by offloading big tasks from the ui threads to background worker threads this latency can be drastically reduced

    //other example
    --imagine that you have a single thread here acception incommning connections from remote clients
    --instead to process directly the data that comes in from these connections, the connection accepting thread here will simply enqueue the connection and have background processing threads here


    -the server can accept inomming connections at same time depending of course on number of CPUS


    //OTHER EXAMPLE
    --other example to reduce the foreground thread latency by latency is meant that time from an incomming connection
    --the use case of load balancing beetwen worker threads is what i have explained you in the first example with a thread scans a directory for image files
    --and you also have load balancing between worker threads in the example of incomming connections
    --in fact the ability to load balance between workert threads is build directly into the producer consumer patthern
    --even if thatis not the main reason in your specific case that you use the producer consumer patthern you still get the ability to load balance between the worker threads for free

    --you can use the producer consumer pattern to implmements some level of back pressure managament and by back presusre 
    --I mean  that in case the system the front here is putting too much pressure on the workers threads here in their back, then what happends in this queue here will fill up and eventually depending on what type of queue you're using eventually will be full saying okey we can only have 1000 connect incomming connections queued up, we don't have space for anymore, then once that happends you start have back pressure that goes from the back of the system to the front of the system
    --then you must to stop accepting incomming connections for a while

    --the foreground is putting pressure in the backgroudn threads
    --the the background queue cannot with the pressure, then the pressure build up inside the queue and results in back pressure that goes back of the system here towards to the front of the system, so they are pressing  back and saying hey  we cannot keep up  slow down up here in the front so that is what back pressure management is and depending on how you implement the queue here and the behavior in the connection accepting threat 
    --you can use this producer consumer pathern to implement some level of  back pressure managament
    --for instance if this is a blocking queue then the connection accepting thread would simply be blocked at the time and it's tryin to insert a new connection into the queue and saying the queue is full, this is a way to block a foreground threads
    --you can implement back pressure managament without using a blocking queue, in this case the connection accepting thread would have to check if the queue is full before trying to insert a new incoming connection and in case the queue is full then the connection accepting threads should accepting incomming connections for a while  and maybe do something else here and wait until the queue is empty. 
    --the no blocking queue is a litle bit more work to implement than simply using a blocking queue but you can then implement more advanced behavior in case your situation requires that




*/

/*
    --userfull terms
        foreground threads
        background threads
*/

package zDesignPatterns.SingleUpdateQueue;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;


public class ProducerConsumerExample {
    public static void main(String[] args) {
        
        //blocking queue
        //this is the queue which the producer will insert object task and from which the two consumers here will take the task objects 
        BlockingQueue<String> blockingQueue =  new ArrayBlockingQueue<>(3);
        
        //the producer and the consumer implements the runnable interface so they can be executed by a thread
        
        Producer producer = new Producer(blockingQueue);
        Consumer consumer1 = new Consumer(blockingQueue);
        Consumer consumer2 = new Consumer(blockingQueue);
        
        
        //the producer is given to a thread
        Thread producerThread = new Thread(producer);
        Thread consumerThread1 = new Thread(consumer1);
        Thread consumerThread2 = new Thread(consumer2);
        
        
        //all these threads are started
        producerThread.start();
        consumerThread1.start(); // start to consumer
        consumerThread2.start();
        
        //the result the two consumer objects are getting objects
        //I would not have guaratee that each of the thread would perfectly alternated between  getting an object
    }
}
