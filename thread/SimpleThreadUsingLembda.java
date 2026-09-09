class SimpleThreadUsingLembda {
    public static void main(String args[]) {

        // Runnable ek functional interface hai.
        // Isliye hum Lambda use kar sakte hain.
        Runnable task = () -> {
            System.out.println("Task is running...");
            System.out.println("Thread Name " + Thread.currentThread().getName());
        };
        // Runnable ko Thread ke andar pass kiya.
        Thread th1 = new Thread(task);

        // start() -> new thread create karta hai
        // aur internally run() execute hota hai.
        th1.start();

        System.out.println("Main Thread running");

    }
}

// Note: Output ka order fixed nahi hai because main thread aur th1 concurrently
// run kar sakte hain.