public class Main {
    public static void main(String[] args) {
        // Membuat objek Movie
        Movie movie1 = new Movie("Movie 1", Movie.REGULAR);
        Movie movie2 = new Movie("Movie 2", Movie.NEW_RELEASE);

        // Membuat objek Rental
        Rental rental1 = new Rental(movie1, 3);
        Rental rental2 = new Rental(movie2, 2);

        // Membuat objek Customer
        Customer customer = new Customer("John Doe");

        // Menambahkan Rental ke Customer
        customer.addRental(rental1);
        customer.addRental(rental2);

        // Menampilkan statement
        System.out.println(customer.statement());
    }
}
