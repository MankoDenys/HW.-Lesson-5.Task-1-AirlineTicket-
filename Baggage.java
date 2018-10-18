public class Baggage {
    private int numberBag;
    private long priceBag;

    public Baggage(int numberBag, long priceBag) {
        this.numberBag = numberBag;
        this.priceBag = priceBag;
    }

    public int getNumberBag() {
        return numberBag;
    }

    public long getPriceBag() {
        return priceBag;
    }

    public long summBag() {
        return numberBag*priceBag;
    }

    @Override
    public String toString() {
        return "Baggage{" +
                "numberBag=" + numberBag +
                ", priceBag=" + priceBag +
                '}';
    }
}
