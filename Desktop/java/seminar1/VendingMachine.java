package seminar1;

import java.util.ArrayList;
import java.util.List;

public class VendingMachine {

    private List<Product> products;
    private final static List<Product> initProduct = new ArrayList<>();
    static {
        initProduct.add(new Product("Twix", 50.0));
    }
    public VendingMachine() {
        this(initProduct);
        
    }
    public VendingMachine(List<Product> prods) {
        this.products = prods;
    }

    public VendingMachine(String name, Double price) {
        this.products = new ArrayList<>();
        products.add(new Product(name, price));

    }

    public Product getProductBy (String byName) {
        for (Product product : products) {
            if (product.getName().contains(byName)) {
                return product;
            }
        }
        return null;
    }

    public Product getProductBy(Double byPrice) {
        for (Product product : products) {
            if (product.getPrice().equals(byPrice)) {
                return product;
            }
        }
        return null;
    }   


    @Override
    public String toString() {
        
        String result = " ";
        for (Product product : products) {
            result = result.concat(product.toString()+ "\n");
            
        }
        return result;
    }


    
}
