package fowler;

class Rental {
    private Movie movie;
    private int daysRented;

    public Rental(Movie newmovie, int newdaysRented) {
        movie = newmovie;
        daysRented = newdaysRented;
    }

    public int getDaysRented() {
        return daysRented;
    }

    public Movie getMovie() {
        return movie;
    }

    public double getAmount() {
        double amount = 0;
        switch (this.getMovie().getPriceCode()) {
            case REGULAR:
                amount += 2;
                if (this.getDaysRented() > 2)
                    amount += (this.getDaysRented() - 2) * 1.5;
                break;
            case NEW_RELEASE:
                amount += this.getDaysRented() * 3;
                break;
            case CHILDRENS:
                amount += 1.5;
                if (this.getDaysRented() > 3)
                    amount += (this.getDaysRented() - 3) * 1.5;
                break;
            default:
                break;
        }
        return amount;
    }
}