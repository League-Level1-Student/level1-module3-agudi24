
public class MovieRunner {
public static void main(String[] args) {
	Movie m = new Movie("Twilight", 5);
	System.out.println(m.getTitle());
	System.out.println(m.getRating());
	System.out.println(m.toString());
	System.out.println(m.getTicketPrice());
}
}
