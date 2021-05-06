package fowler;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RentalTest {

    private Rental testRental;
    private Movie testMovie;

    @BeforeEach
    void setUp() {
        testRental = new Rental(testMovie = new Movie("Test", Movie.NEW_RELEASE), 5);
    }

    @Test
    void getDaysRented() {
        assertEquals(testRental.getDaysRented(), 5);
    }

    @Test
    void getMovie() {
        assertEquals(testRental.getMovie(), testMovie);
    }
}