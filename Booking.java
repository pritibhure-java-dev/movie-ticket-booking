
public class Booking {
    private String customerName;
    private Movie movie;
    private int seatsBooked;

    public Booking(String customerName, Movie movie, int seatsBooked) {
        this.customerName = customerName;
        this.movie = movie;
        this.seatsBooked = seatsBooked;
    }

    public void displayBooking() {
        System.out.println("Customer: " + customerName);
        System.out.println("Movie: " + movie.getName());
        System.out.println("Seats Booked: " + seatsBooked);
        System.out.println("----------------------");
    }
}

