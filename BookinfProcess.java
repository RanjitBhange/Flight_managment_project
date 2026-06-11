package projects;


import java.util.InputMismatchException;
import java.util.Scanner;

public class BookinfProcess extends FlightBooking {
    Scanner sc = new Scanner(System.in);
    @Override
    void booking() {
        System.out.println("Available Flights : ");
        System.out.println("1.pune");
        System.out.println("2.mumbai");
        System.out.println("3.benguluru");
        System.out.println("4.delhi");
        System.out.println("Enter your choice : ");
        try {
            choice = sc.nextInt();
        }
        catch (InputMismatchException e) {
            System.out.println("Please enter a valid choice");
            System.exit(0);
        }


        if (choice == 1 ) {
            bookingprocess();
        }
        else if (choice == 2 ) {
            bookingprocess();
        }
        else if (choice == 3 ) {
            bookingprocess();
        }
        else if (choice == 4 ) {
            bookingprocess();
        }
        else {
            System.out.println("Invalid choice");
        }
    }
    void bookingprocess(){

        System.out.println("Enter Your Name:");
         Name = sc.next();
//         sc.nextLine();
        System.out.println("Enter Your City:");
        city = sc.next();
//        System.out.println("your flight Number : ");
//        System.out.println("your seat number : ");
    }
}
