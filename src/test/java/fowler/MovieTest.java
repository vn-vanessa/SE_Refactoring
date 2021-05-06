package fowler;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MovieTest {

    private Movie testMovie;

    @BeforeEach
    void setUp() {
        testMovie = new Movie("Test", Movie.NEW_RELEASE);
    }

    @Test
    void getPriceCode() {
        assertEquals(testMovie.getPriceCode(), 1);
    }

    @Test
    void setPriceCode() {
        testMovie.setPriceCode(Movie.CHILDRENS);
        assertEquals(testMovie.getPriceCode(), 2);
    }

    @Test
    void getTitle() {
        assertEquals("Test", testMovie.getTitle());
    }
}