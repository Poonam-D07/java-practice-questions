/*isAlive() → "Kya ye thread abhi zinda/running state mein hai?"
Ye method Thread class ka method hai. return type ---> boolean

True ----→ Thread abhi alive hai
false ----→ Thread terminate ho chuka hai / abhi start nahi hua
*/
public class IsAliveMethod {
    public static void main(String[] args) {

        Thread thread1 = new Thread(() -> {
            for (int i = 1; i <= 10; i++) {
                System.out.println("Thread running " + Thread.currentThread().getName() + i);
            }

            try {
                Thread.sleep(3000);
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
        thread1.setName("thread-1: ");
        System.out.println("Before start " + thread1.isAlive());
        thread1.start();
        System.out.println("After start : " + thread1.isAlive());

        try {
            Thread.sleep(2500);

        } catch (Exception e) {
            e.printStackTrace();
        }

        // 2.5 seconds baad
        System.out.println("After 2.5 sec: " + thread1.isAlive());
        try {
            thread1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("After completion : " + thread1.isAlive());
    }
}

/*
 * Thread NEW → false
 * Thread RUNNABLE → true
 * Thread RUNNING → true
 * Thread WAITING → true
 * Thread TIMED_WAITING → true
 * Thread BLOCKED → true
 * Thread TERMINATED → false
 */