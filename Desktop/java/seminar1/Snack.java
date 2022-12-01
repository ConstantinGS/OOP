package seminar1;

public class Snack extends Product {
    private Integer weight;
    public Snack(String name) {
        super(name);
        
    }

    public Snack(String name, Double price) {
        super(name, price);
        
    }

    public Snack(String name, Double price, Integer weight) {
        super(name, price);
        this.weight = weight;
        
    }

    public Integer getWeight() {
        return this.weight;
    }

    @Override
    public String toString() {

        return String.format("%s  %d грамм", super.toString(), getWeight());
    }
    
}
