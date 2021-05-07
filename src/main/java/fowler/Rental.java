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

    public int calcPoints() {
        if ((this.movie instanceof NewRelease) && this.daysRented > 1) {
            return 2;
        } else {
            return 1;
        }
    }
}