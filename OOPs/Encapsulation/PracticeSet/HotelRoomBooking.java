// Design a simple Hotel Room Booking system.
// A room can be booked only if it is currently available. 
// A room that has already been booked should not be booked again. 
// Once a booking is cancelled, the room should become available again.

class Room { // create class
    private String roomNumber; // private variables
    private boolean isAvailableRoom;

    public Room(String roomNumber) { // parameterized constructor
        this.roomNumber = roomNumber;
        this.isAvailableRoom = true;
    }

    public String getRoom() { // fetch room no.
        return roomNumber;
    }

    public void roomBooking() { // method to book room with validation
        if (isAvailableRoom) {
            isAvailableRoom = false;
            System.out.println("Room booked successfully.");
        } else {
            System.out.println("Sorry!, Room is already booked.");
        }
    }

    public void returnedRoom() { // method to return room with validation
        if (!isAvailableRoom) {
            isAvailableRoom = true;
            System.out.println("Room returned successfully and is available.");
        } else {
            System.out.println("Room is already available.");
        }
    }
}

public class HotelRoomBooking { // main class
    public static void main(String[] args) { // main method
        Room r1 = new Room("room no: 1"); // create class object r1
        System.out.println(r1.getRoom()); // display room no.
        r1.roomBooking(); //call method to book room
        r1.roomBooking();
        System.out.println();

        r1.returnedRoom(); // call method to return room
        r1.returnedRoom();

    }

}
/*output:
room no: 1
Room booked successfully.
Sorry!, Room is already booked.

Room returned successfully and is available.
Room is already available.
 */