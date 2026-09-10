class Counter {
    int count = 0;

    /*
     * synchronized method:
     * // Only one thread at a time can execute this method
     * // on the SAME Counter object.
     */
    synchronized void increment() {
        for (int i = 0; i < 10; i++) {

            /*
             * Without synchronization: multiple threads can perform count++ together.
             * With synchronization: only one thread can execute this method at a time.
             */
            count++; // This is the CRITICAL SECTION.
        }
    }
}

public class CounterUsingSynchronizedMethod {
    public static void main(String[] args) {

        Counter counter = new Counter();
        Thread t1 = new Thread(() -> {
            counter.increment();
        }, "Thread-1");

        Thread t2 = new Thread(() -> {
            counter.increment();
        }, "Thread-2");

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Final Count = " + counter.count);

    }
}
