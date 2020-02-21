package chapter9;

public class WeddingCake extends Cake {
    public WeddingCake() {
        super("butterscotch");
    }

    public int getTiers() {
        return tiers;
    }

    public void setTiers(int tiers) {
        this.tiers = tiers;
    }

    private int tiers;
}
