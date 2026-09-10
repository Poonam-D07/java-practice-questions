
class TicketBooking {

    // SHARED RESOURCE:
    // Only ONE ticket is available.
    int availableTickets = 1;

    // synchronized ensures that two threads
    // cannot book the same last ticket simultaneously.
    synchronized void bookTicket() {

        System.out.println(
                Thread.currentThread().getName()
                        + " is trying to book a ticket.");

        // CHECK:
        // Is a ticket available?
        if (availableTickets > 0) {

            System.out.println(
                    Thread.currentThread().getName()
                            + " → Ticket available.");

            // Simulate booking processing.
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            // UPDATE:
            // One ticket has now been booked.
            availableTickets--;

            System.out.println(
                    Thread.currentThread().getName()
                            + " → Ticket booked successfully.");

        } else {

            System.out.println(
                    Thread.currentThread().getName()
                            + " → No ticket available.");
        }
    }
}

public class TicketBookingWithSynchronization {

    public static void main(String[] args) {

        // ONE booking object shared by both users.
        TicketBooking booking = new TicketBooking();

        Thread t1 = new Thread(() -> {

            booking.bookTicket();

        }, "User-1");

        Thread t2 = new Thread(() -> {

            booking.bookTicket();

        }, "User-2");

        t1.start();
        t2.start();

        try {

            t1.join();
            t2.join();

        } catch (InterruptedException e) {

            e.printStackTrace();
        }

        System.out.println(
                "Remaining Tickets = "
                        + booking.availableTickets);
    }
}