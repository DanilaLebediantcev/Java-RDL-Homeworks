import java.util.Queue;

public class MyThread<T extends Order> extends Thread {
    public Queue<T> order;
    public final int sleepTime;
    public final String threadName;

    public MyThread(Queue<T> order, int sleepTime, String threadName) {
        this.order = order;
        this.sleepTime = sleepTime;
        this.threadName = threadName;
    }

    @Override
    public void run() {
        while (!order.isEmpty())
            //System.out.println("Processor with " + sleepTime + " timeout is starting. .Order:" + order.poll());
            System.out.println("Thread name: " + threadName + ".Order:" + order.poll());
        try {
            Thread.sleep(sleepTime);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
