import java.util.Scanner;

// Custom Exception
class SeatAlreadyBookedException extends Exception {
    SeatAlreadyBookedException(String message) {
        super(message);
    }
}

class Reservation {

    boolean seats[] = new boolean[5];

    void reserveSeat(int seatNumber)
            throws SeatAlreadyBookedException {

        if (seatNumber < 1 || seatNumber > 5) {
            throw new IllegalArgumentException("Invalid seat number!");
        }

        if (seats[seatNumber - 1]) {
            throw new SeatAlreadyBookedException(
                "Seat is already booked!"
            );
        }

        seats[seatNumber - 1] = true;

        System.out.println("Seat " + seatNumber +
                           " booked successfully!");
    }
}

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Reservation r = new Reservation();

        System.out.println("======================================");
        System.out.println(" RAILWAY RESERVATION MANAGEMENT SYSTEM");
        System.out.println("======================================");
        System.out.println("Name : Bhargav");
        System.out.println("USN  : 1BMCS26479-T");
        System.out.println("--------------------------------------");

        try {
            System.out.print("Enter seat number (1-5): ");
            int seat = sc.nextInt();

            r.reserveSeat(seat);
        }

        catch (SeatAlreadyBookedException e) {
            System.out.println("Booking Error: " + e.getMessage());
        }

        catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }

        catch (java.util.InputMismatchException e) {
            System.out.println("Error: Please enter a valid integer!");
        }

        finally {
            System.out.println("--------------------------------------");
            System.out.println("Transaction completed.");
            sc.close();
        }
    }
}