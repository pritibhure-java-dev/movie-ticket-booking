
public class Movie {
    private String name;
    private int totalSeats;
    private int availableSeats;

    public Movie(String name, int totalSeats) {
        this.name = name;
        this.totalSeats = totalSeats;
        this.availableSeats = totalSeats;
    }

    public String getName() { return name; }
    public int getAvailableSeats() { return availableSeats; }

    public boolean bookSeats(int seats) {
        if(seats <= availableSeats) {
            availableSeats -= seats;
            return true;
        }
        return false;
    }

    public void displayMovie() {
        System.out.println("Movie: " + name + " | Available Seats: " + availableSeats);
    }
}

