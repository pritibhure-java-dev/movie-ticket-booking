
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Movie> movies = new ArrayList<>();
        ArrayList<Booking> bookings = new ArrayList<>();

        // Sample movies
        movies.add(new Movie("Avengers", 50));
        movies.add(new Movie("Inception", 40));
        movies.add(new Movie("Interstellar", 30));

        int choice;
        do {
            System.out.println("\n=== Movie Ticket Booking ===");
            System.out.println("1. View Movies");
            System.out.println("2. Book Tickets");
            System.out.println("3. View All Bookings");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();
            sc.nextLine(); // consume newline

            switch(choice) {
                case 1 -> {
                    System.out.println("\nAvailable Movies:");
                    for(Movie m : movies) m.displayMovie();
                }
                case 2 -> {
                    System.out.print("Enter your name: ");
                    String name = sc.nextLine();
                    System.out.println("Select movie by number:");
                    for(int i=0; i<movies.size(); i++) {
                        System.out.print((i+1) + ". ");
                        movies.get(i).displayMovie();
                    }
                    int mChoice = sc.nextInt() - 1;
                    System.out.print("Enter number of seats: ");
                    int seats = sc.nextInt();
                    Movie selectedMovie = movies.get(mChoice);
                    if(selectedMovie.bookSeats(seats)) {
                        bookings.add(new Booking(name, selectedMovie, seats));
                        System.out.println("Booking successful!");
                    } else {
                        System.out.println("Not enough seats available.");
                    }
                }
                case 3 -> {
                    System.out.println("\nAll Bookings:");
                    for(Booking b : bookings) b.displayBooking();
                }
                case 4 -> System.out.println("Exiting...");
                default -> System.out.println("Invalid choice!");
            }
        } while(choice != 4);
    }
}

