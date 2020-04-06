package multithreading_homework;

import java.util.concurrent.BlockingDeque;
import java.util.concurrent.LinkedBlockingDeque;

public class BlockingDequeue {

    public static void main(String[] args) {
        BlockingDeque<String> blockingDeque = new LinkedBlockingDeque<>(5);

        new Thread(new Consumer(blockingDeque)).start();
        new Thread(new Producer(blockingDeque)).start();
    }
}

class Producer implements Runnable {
    private BlockingDeque<String> blockingDeque;

    public Producer(BlockingDeque<String> blockingDeque) {
        this.blockingDeque = blockingDeque;
    }

    @Override
    public void run() {
        try {
            System.out.println("Producer wants to add in a blocking dequeue (BD) some elements");
            for (int i = 0; i < 50; i++) {
                blockingDeque.putLast("Element #" + i);
                System.out.println("[Producer] Element #" + i + " was added in BD. BD size: " + blockingDeque.size());
                Thread.sleep(100);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

class Consumer implements Runnable {
    private BlockingDeque<String> blockingDeque;

    public Consumer(BlockingDeque<String> blockingDeque) {
        this.blockingDeque = blockingDeque;
    }

    @Override
    public void run() {
        while (!Thread.currentThread().isInterrupted()) {
            try {
                System.out.println("Consumer want take some element from the BD. ");
                System.out.println("[Consumer] Consumer wants to take the " + blockingDeque.takeFirst() + ". BD size: " + blockingDeque.size());
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}