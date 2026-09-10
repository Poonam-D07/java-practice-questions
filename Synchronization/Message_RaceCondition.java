
class Message {

    String text = "";

    void addMessage(String message) {

        // Read current text
        String oldText = text;

        // Delay so another thread may modify text.
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Write updated text.
        text = oldText + message;
    }
}

public class Message_RaceCondition {

    public static void main(String[] args) {

        // SAME Message object shared by both threads.
        Message message = new Message();

        Thread t1 = new Thread(() -> {

            message.addMessage("Hello ");

        }, "Thread-1");

        Thread t2 = new Thread(() -> {

            message.addMessage("Java");

        }, "Thread-2");

        t1.start();
        t2.start();

        try {

            t1.join();
            t2.join();

        } catch (InterruptedException e) {

            e.printStackTrace();
        }

        System.out.println(message.text);
    }
}