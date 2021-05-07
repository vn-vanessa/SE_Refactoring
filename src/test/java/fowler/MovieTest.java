package fowler;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MovieTest {

    private Movie testMovie;

    @BeforeEach
    void setUp() {
        testMovie = new Movie("Test", PriceCode.NEW_RELEASE);
    }

    @Test
    void getPriceCode() {
        assertEquals(testMovie.getPriceCode().getIntOfPriceCode(), 1);
    }

    @Test
    void getTitle() {
        assertEquals("Test", testMovie.getTitle());
    }
}