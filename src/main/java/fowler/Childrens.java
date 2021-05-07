package fowler;

public class Childrens extends Movie {
    public Childrens(String newtitle) {
        super(newtitle);
    }

    @Override
    public double getMoviePrice(int daysRented) {
        if (daysRented < 3) {
            return 1.5;
        } else {
            return ((daysRented - 3) * 1.5 + 1.5);
        }
    }
}
