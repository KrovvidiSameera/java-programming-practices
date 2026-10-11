package javacore;
class Reservation {

    // Initially, 100 seats are available
    private int availableSeats = 100;

    // Only one thread can execute this method at a time
    public synchronized void reserve(String person, int seats) {

        System.out.println(person + " entered.");
        System.out.println("Available seats: " + availableSeats
                + " Requested seats: " + seats);

        // Check whether the requested seats are available
        if (seats <= availableSeats) {
            System.out.println("Seat Available. Reserve now :-)");

            availableSeats -= seats;

            System.out.println(seats + " seats reserved.");
        } else {
            System.out.println("Requested seats not available :-)");
        }

        System.out.println(person + " leaving.");
        System.out.println("--------------------------------------");
    }
}

class PersonThread extends Thread {

    private Reservation reservation;
    private int requestedSeats;

    // Initialize the reservation object and requested seats
    public PersonThread(Reservation reservation,
                        String name, int requestedSeats) {
        super(name);
        this.reservation = reservation;
        this.requestedSeats = requestedSeats;
    }

    // Thread execution starts here
    public void run() {
        reservation.reserve(getName(), requestedSeats);
    }
}

public class ReservationDemo {

    public static void main(String[] args) {

        // Create one shared reservation system
        Reservation reservation = new Reservation();

        // Create person threads
        PersonThread p1 =
                new PersonThread(reservation, "Person-1", 5);

        PersonThread p2 =
                new PersonThread(reservation, "Person-2", 2);

        PersonThread p3 =
                new PersonThread(reservation, "Person-3", 4);

        // Start all threads
        p1.start();
        p2.start();
        p3.start();
    }
}

