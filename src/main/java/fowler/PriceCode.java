package fowler;

public enum PriceCode {
    REGULAR (0),
    NEW_RELEASE (1),
    CHILDRENS (2);

    private int priceCode;

    PriceCode(int priceCode) {
        this.priceCode = priceCode;
    }

    public int getIntOfPriceCode() {
        return priceCode;
    }
}
