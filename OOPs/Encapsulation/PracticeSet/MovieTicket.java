// Movie Ticket Booking System – Keep the number of available seats private. 
// If a seat is available, allow the user to book it.

class MovieBooking { // create movie booking class
    private int totalSeats = 15; // private variable
    private int bookedTicket = 0;

    public int getTotalSeats() { // fetch total seats available
        return totalSeats;
    }

    public int getBookedTicket() { // fetch booked ticket count
        return bookedTicket;
    }

    public void bookTicket(int seats) { // book tickets and update available and booked seat counts
        if (seats <= totalSeats) {
            totalSeats -= seats;
            bookedTicket += seats;
            System.out.println("Booked Tickets: " + seats);
        } else {
            System.out.println("Seats are not available, housefull");
        }
    }

}

public class MovieTicket { // main class
    public static void main(String[] args) { // main method
        MovieBooking b1 = new MovieBooking(); // create class object b1
        System.out.println("Available Seats: " + b1.getTotalSeats()); // display seats available

        b1.bookTicket(10); // book seats

        System.out.println("Available Seats: " + b1.getTotalSeats()); // display avaialble seats
        System.out.println("Booked Tickets: " + b1.getBookedTicket()); // display booked seats numbers

    }

}
/* output:
Available Seats: 15
Booked Tickets: 10
Available Seats: 5
Booked Tickets: 10
 */