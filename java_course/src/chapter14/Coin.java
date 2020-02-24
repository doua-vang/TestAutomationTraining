package chapter14;

import java.util.Random;

public class Coin {
    private String side;
    protected static final String HEADS = "heads";
    protected static final String TAILS = "tails";

    public String getSide() {
        return side;
    }

    private void setSide(String side) {
        this.side = side;
    }

    public void flip() {
        Random r = new Random();
        setSide(r.nextInt(2) == 1 ? HEADS : TAILS);
    }


}
