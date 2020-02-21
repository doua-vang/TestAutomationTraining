package chapter9;

public class Cake {
    public String getFlavor() {
        return flavor;
    }

    public void setFlavor(String flavor) {
        this.flavor = flavor;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Cake (String flavor) {
        setFlavor(flavor);
        setPrice(10.31);
    }

    protected String flavor;
    protected double price;
}
