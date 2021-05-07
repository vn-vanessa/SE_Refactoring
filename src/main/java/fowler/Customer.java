package fowler;

import java.util.Enumeration;
import java.util.Vector;

class Customer {
    private String customerName;
    private Vector rentals = new Vector();

    public Customer(String name) {
        customerName = name;
    }

    public void addRental(Rental arg) {
        rentals.addElement(arg);
    }

    public String getName() {
        return customerName;
    }

    public String statement() {
        Enumeration enum_rentals = rentals.elements();
        double totalAmount = 0;
        int frequentRenterPoints = 0;
        StringBuilder statement = new StringBuilder();
        statement.append("Rental Record for " + this.getName() + "\n");
        statement.append("\t" + "Title" + "\t" + "\t" + "Days" + "\t" + "Amount" + "\n");
        while (enum_rentals.hasMoreElements()) {
            Rental rental = (Rental) enum_rentals.nextElement();
            totalAmount += getTotalAmount(rental);
            frequentRenterPoints += getFrequentRenterPoints(rental);
            statement.append("\t" + rental.getMovie().getTitle() + "\t" + "\t" + rental.getDaysRented() + "\t" + String.valueOf(rental.getMovie().getMoviePrice(rental.getDaysRented())) + "\n");
        }
        statement.append("Amount owed is " + totalAmount + "\n");
        statement.append("You earned " + frequentRenterPoints + " frequent renter points");
        return statement.toString();
    }

    private double getTotalAmount(Rental rental) {
        return rental.getMovie().getMoviePrice(rental.getDaysRented());
    }

    private int getFrequentRenterPoints(Rental rental) {
        return rental.calcPoints();
    }
}
