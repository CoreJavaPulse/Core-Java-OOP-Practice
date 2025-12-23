package SynchronizedThreading;

public class Counter {
    private int count = 0;

    // Synchronized method: locks the entire method
    public synchronized void increment() {
        count++;  // Thread-safe operation
    }

    public int getCount() {
        return count;
    }

    public static void main(String[] args) throws InterruptedException {
        Counter counter = new Counter();

        // Two threads incrementing 1000 times each
        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                counter.increment();
            }
        });

        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                counter.increment();
            }
        });

        t1.start();
        t2.start();
        t1.join();
        t2.join();

        System.out.println("Final count: " + counter.getCount());  // Always prints 2000
    }
}
