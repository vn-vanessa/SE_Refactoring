package fowler;

public class Movie {
    private PriceCode priceCode;
    private String movieTitle;

    public Movie(String newtitle, PriceCode priceCode) {
        movieTitle = newtitle;
        this.priceCode = priceCode;
    }

    public PriceCode getPriceCode() {
        return priceCode;
    }

    public String getTitle() {
        return movieTitle;
    }
}