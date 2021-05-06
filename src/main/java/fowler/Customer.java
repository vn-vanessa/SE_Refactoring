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
        String result = "Rental Record for " + this.getName() + "\n";
        result += "\t" + "Title" + "\t" + "\t" + "Days" + "\t" + "Amount" + "\n";
        result += getStatementForAllRentals();
        result += "Amount owed is " + getTotalAmount() + "\n";
        result += "You earned " + getFrequentRenterPoints() + " frequent renter points";
        return result;
    }

    private String getStatementForAllRentals() {
        Enumeration enum_rentals = rentals.elements();
        StringBuilder statementForAllRentals = new StringBuilder();
        while (enum_rentals.hasMoreElements()) {
            Rental rental = (Rental) enum_rentals.nextElement();
            statementForAllRentals.append("\t" + rental.getMovie().getTitle() + "\t" + "\t" + rental.getDaysRented() + "\t" + amountFor(rental) + "\n");
        }
        return statementForAllRentals.toString();
    }

    private double getTotalAmount() {
        Enumeration enum_rentals = rentals.elements();
        double totalAmount = 0;

        while (enum_rentals.hasMoreElements()) {
            Rental rental = (Rental) enum_rentals.nextElement();
            totalAmount += amountFor(rental);
        }

        return totalAmount;
    }

    private int getFrequentRenterPoints() {
        int frequentRenterPoints = 0;
        Enumeration enum_rentals = rentals.elements();

        while (enum_rentals.hasMoreElements()) {
            Rental rental = (Rental) enum_rentals.nextElement();
            frequentRenterPoints++;
            if ((rental.getMovie().getPriceCode() == Movie.NEW_RELEASE) && rental.getDaysRented() > 1)
                frequentRenterPoints++;
        }
        return frequentRenterPoints;
    }

    private double amountFor(Rental rental) {
        double thisAmount = 0;
        switch (rental.getMovie().getPriceCode()) {
            case Movie.REGULAR:
                thisAmount += 2;
                if (rental.getDaysRented() > 2)
                    thisAmount += (rental.getDaysRented() - 2) * 1.5;
                break;
            case Movie.NEW_RELEASE:
                thisAmount += rental.getDaysRented() * 3;
                break;
            case Movie.CHILDRENS:
                thisAmount += 1.5;
                if (rental.getDaysRented() > 3)
                    thisAmount += (rental.getDaysRented() - 3) * 1.5;
                break;
        }
        return thisAmount;
    }

}
