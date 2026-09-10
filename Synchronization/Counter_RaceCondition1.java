class Counter {
    int count = 0;

    // This method increases the shared variable.
    // Multiple threads will call this same method.
    void increment() {
        for (int i = 0; i <= 1000; i++) {

            // count++ is NOT actually one indivisible operation.
            // It involves: && 1. [Read count] && 2.[ Add 1 ] && 3.[ Write count]
            count++;
        }
    }
}

class RaceCondition {
    public static void main(String[] args) {

        // Both threads will share the SAME Counter object.
        Counter counter = new Counter();

        Thread t1 = new Thread(() -> {
            // Thread-1 increases the shared counter.
            counter.increment();
        }, "Thread-1");

        Thread t2 = new Thread(() -> {
            counter.increment();
        }, "Thread-2");

        // Start both threads.
        t1.start();
        t2.start();

        try {
            t1.join(); // main thread waits until Thread-1 finishes.

            t2.join(); // main thread waits until Thread-2 finishes.

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Final count = " + counter.count);
    }
}

/*
 * Expected: 1000 + 1000 = 2000
 * 
 * But because both threads access count simultaneously,
 * the result may be less than or greater then 2000
 */

/*
 * Critical section = code ka woh chhota part jahan multiple threads same shared
 * data ko access/modify kar rahe hain.
 * 
 * Hamare program mein: count++;
 */