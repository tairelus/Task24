package bjs.task24;

/**
 * Created by YM on 20.12.2015.
 */
public class MessageLoop implements Runnable{
    /**Array of the messages*/
    private String[] messagesArray;
    /**Interval between messages in ms*/
    private int messagesInterval;

    /**Current thread*/
    private Thread thread;

    /**
     * Constructs MessageLoop with several messages
     * @param messagesNum Number of the messages
     * @param messagesInterval Interval between messages in ms
     */
    public MessageLoop(int messagesNum, int messagesInterval) {
        this.messagesInterval = messagesInterval;
        thread = new Thread(this);
        messagesArray = new String[messagesNum];

        for (int i = 0; i < messagesArray.length; i++) {
            StringBuilder message = new StringBuilder(messagesNum);

            message.append("\t");
            message.append(thread.getName());
            message.append(": ");
            message.append("Array message #");
            message.append(i + 1);

            messagesArray[i] = message.toString();
        }
    }

    @Override
    public void run() {
        for (int i = 0; i < messagesArray.length; i++) {
            System.out.println(messagesArray[i]);

            try{
                //Sleep thread for messagesInterval milliseconds
                Thread.sleep(this.messagesInterval);
            }
            catch(InterruptedException e) {
                System.out.println(thread.getName() + ": thread interrupted. " + e.getMessage());
            }
        }
    }

    /**
     * Gets current thread
     * @return
     */
    public Thread getThread() {
        return thread;
    }

    /**
     * Thread name
     * @param threadName Name of the current thread
     */
    public void start(String threadName) {
        thread.start();

        //setName works only for started treads
        if (!threadName.isEmpty())
           thread.setName(threadName);
    }

    /**
     * Wrapper for Thread.join
     */
    public void join() {
        try{
            thread.join();
        }
        catch(InterruptedException e) {
            System.out.println(thread.getName() + ": thread interrupted. " + e.getMessage());
        }
    }
}
