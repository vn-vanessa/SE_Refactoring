package fowler;

public class Regular extends Movie {
    public Regular(String newtitle) {
        super(newtitle);
    }

    @Override
    public double getMoviePrice(int daysRented) {
        if (daysRented < 2) {
            return 2;
        } else {
            return ((daysRented - 2) * 1.5 + 2);
        }
    }
}
