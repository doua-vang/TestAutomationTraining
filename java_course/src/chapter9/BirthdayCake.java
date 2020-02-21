package chapter9;

public class BirthdayCake extends Cake {

    public BirthdayCake() {
        super("banana");
    }

    public int getCandles() {
        return candles;
    }

    public void setCandles(int candles) {
        this.candles = candles;
    }

    private int candles;

}
