package fowler;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CustomerTest {

    private Rental testRental;
    private Customer testCustomer;
    private Movie testMovie;

    @BeforeEach
    void setUp() {
        testCustomer = new Customer("Max Mustermann");
        testMovie = new Movie("Test", Movie.NEW_RELEASE);
        testRental = new Rental(testMovie, 5);
    }

    @Test
    void addRental() {
        testCustomer.addRental(testRental);
    }

    @Test
    void getName() {
        assertEquals("Max Mustermann", testCustomer.getName());
    }

    @Test
    void statement() {
        testCustomer.addRental(new Rental(new Movie("Test", Movie.NEW_RELEASE), 5));
        String expectedResult = "Rental Record for " + testCustomer.getName() + "\n";
        expectedResult += "\t" + "Title" + "\t" + "\t" + "Days" + "\t" + "Amount" + "\n";
        expectedResult += "\t" + "Test" + "\t" + "\t" + 5 + "\t" + 15.0 + "\n";
        expectedResult += "Amount owed is " + 15.0 + "\n";
        expectedResult += "You earned " + 2 + " frequent renter points";
        assertEquals(expectedResult, testCustomer.statement());
    }

    @Test
    void statementEmpty() {
        String expectedResult = "Rental Record for " + testCustomer.getName() + "\n";
        expectedResult += "\t" + "Title" + "\t" + "\t" + "Days" + "\t" + "Amount" + "\n";
        expectedResult += "";
        expectedResult += "Amount owed is " + 0.0 + "\n";
        expectedResult += "You earned " + 0 + " frequent renter points";
        assertEquals(expectedResult, testCustomer.statement());
    }
}