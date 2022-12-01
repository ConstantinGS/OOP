package seminar1;

import java.util.ArrayList;
import java.util.List;

// Создать новый продукт на основе Product,
// сделать ему хотя бы одно свойство
// включить в список продуктов вендинг машины
// переопределить toString для вывода нового поля

public class Main {

    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();
        products.add(new Milk("Moloko", 80.0, 3));
        products.add(new Product("Bulochka", 20.0));
        products.add(new Snack("Lays", 70.0, 100));
        products.add(new Soda("Sprite", 40.0, "Газированная", "Apple"));
        VendingMachine vm1 = new VendingMachine(products);
        System.out.println(vm1);
        System.out.println(vm1.getProductBy("Sprite"));
     


        
    }
   
}
