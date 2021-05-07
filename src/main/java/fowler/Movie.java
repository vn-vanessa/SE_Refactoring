package fowler;

public abstract class Movie {
    private String movieTitle;

    public Movie(String newtitle) {
        movieTitle = newtitle;
    }

    public String getTitle() {
        return movieTitle;
    }

    public double getMoviePrice(int daysRented) {
        return 0.0;
    }
}