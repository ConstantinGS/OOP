package seminar1;

public class Soda extends Product {
    private String carbonation;
    private String taste;

    public Soda(String name) {
        super(name);
        
    }

    public Soda(String name, Double price) {
        super(name, price);
        
    }

    public Soda(String name, Double price, String carbonation, String taste) {
        super(name, price);
        this.carbonation = carbonation;
        this.taste = taste;
        
    }

    public String getCarbonation() {
        return this.carbonation;
    }

    public String getTaste() {
        return this.taste;
    }

    @Override
    public String toString() {

        return String.format("%s %s со вкусом %s", getCarbonation(),  super.toString(), getTaste());
    }
    
}
