package fowler;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MovieTest {

    private Movie testMovie;
    private Rental testRental;

    @BeforeEach
    void setUp() {
        testMovie = new Regular("Test");
        testRental = new Rental(testMovie, 10);
    }

    @Test
    void getTitle() {
        assertEquals("Test", testMovie.getTitle());
    }

    @Test
    void getMoviePrice() {
        assertEquals(testMovie.getMoviePrice(testRental.getDaysRented()), 14);
    }
}