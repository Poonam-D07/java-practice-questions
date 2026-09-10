class TicketBooking {
    int availableTickets = 1;

    void bookTicket() {
        // Check : thread ticket available or not
        if (availableTickets > 0) {

            // Delay create kar rahe hain taaki doosra thread bhi
            // same ticket ko available samajh sake.
            try {
                Thread.sleep(200);
            } catch (Exception e) {
                e.printStackTrace();
            }
            availableTickets--;
            System.out.println(Thread.currentThread().getName() + "booked the ticket.");
        } else {
            System.out.println(Thread.currentThread().getName() + "-> No ticket available.");
        }
    }
}

public class TicketBooking_RaceCondition {
    public static void main(String[] args) {

        // ONE booking system : -> Both threads use the SAME object.
        TicketBooking booking = new TicketBooking();
        Thread t1 = new Thread(() -> {
            booking.bookTicket();
        }, "User-1 ");

        Thread t2 = new Thread(() -> {
            booking.bookTicket();
        }, "User-2 ");

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println("Remaining Tickets = " + booking.availableTickets);
    }
}
