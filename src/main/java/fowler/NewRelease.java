package fowler;

public class NewRelease extends Movie{
    public NewRelease(String newtitle) {
        super(newtitle);
    }

    @Override
    public double getMoviePrice(int daysRented) {
        return daysRented * 3;
    }
}
