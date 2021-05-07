package fowler;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MovieTest {

    private Movie testMovie;

    @BeforeEach
    void setUp() {
        testMovie = new Regular("Test");
    }

    @Test
    void getTitle() {
        assertEquals("Test", testMovie.getTitle());
    }
}