// Q5 — Ticket Booking Challenge
// ============================================================
//
// Create a TicketBooking class that stores the available tickets.
//
// Requirements:
// - Create a method to book a given number of tickets.
// - Use throw if the requested number is less than or equal to 0.
// - Use throw if the requested number exceeds available tickets.
// - Update the available ticket count only after valid booking.
// - Handle exceptions using try-catch.
//
// Goal:
// Apply exception handling to a real-life booking scenario.

class TicketBookingSystem {
    int availableTickets = 100;

    public int bookTicket(int ticket) {
        if (ticket <= 0) {
            // Throw an exception if the requested tickets are invalid.
            throw new IllegalArgumentException(
                "Please enter a ticket quantity greater than 0"
            );
        } else if (ticket > availableTickets) {
            // Throw an exception if tickets are insufficient.
            throw new IllegalArgumentException("Not enough tickets available");
        } else {
            // Reduce available tickets only after a valid booking.
            availableTickets -= ticket;
            System.out.println("Ticket Booked Successfully: " + ticket);
            System.out.println("Remaining Available Tickets: " + availableTickets);
            return availableTickets;
        }
    }
}

public class TicketBooking {
    public static void main(String[] args) {
        TicketBookingSystem t1 = new TicketBookingSystem();

        try {
            t1.bookTicket(101);
        } catch (IllegalArgumentException e) {
            // Catch the exception and print its message.
            System.out.println(e.getMessage());
        }
    }
}

/*
o/p- when input is 10
Ticket Booked Successfully: 10
Remaining Available Tickets: 90 


o/p- when input is 101
Not enough tickets available
*/