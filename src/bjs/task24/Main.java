package bjs.task24;

public class Main {
    public static void main(String[] args) {
        MessageLoop messageLoop = new MessageLoop(3, 4000);
        System.out.println("Start " + MessageLoop.class.getSimpleName() + " thread");

        messageLoop.start("MessageLoop"); //Thread.getName() returns default thread name, not user defined. Why?
        System.out.println("Waiting until " + MessageLoop.class.getSimpleName() + " will be finished\n");

        while (messageLoop.getThread().isAlive()) {
            try{
                System.out.println(Thread.currentThread().getName() + ": Waiting...");
                //Sleep main thread
                Thread.sleep(1000);
            }
            catch(InterruptedException e) {
                System.out.println(Thread.currentThread().getName() + ": thread interrupted. " + e.getMessage());
            }
        }

        messageLoop.join();
        System.out.println("\n" + Thread.currentThread().getName() + ": Finished!");
    }
}

/*
Start MessageLoop thread
Waiting until MessageLoop will be finished

main: Waiting...
	Thread-0: Array message #1
main: Waiting...
main: Waiting...
main: Waiting...
main: Waiting...
	Thread-0: Array message #2
main: Waiting...
main: Waiting...
main: Waiting...
	Thread-0: Array message #3
main: Waiting...
main: Waiting...
main: Waiting...
main: Waiting...
main: Waiting...

main: Finished!
 */