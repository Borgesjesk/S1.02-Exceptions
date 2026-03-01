package cat.itacademy.s1_02.n1.ex1;

import java.util.ArrayList;

public class Sale {
    private ArrayList<Product> products = new ArrayList<>();
    private double totalPrice;

    public void addProduct(Product product) {
        products.add(product);
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void calculateTotal() throws EmptySaleException {
        if (products.isEmpty()) {
            throw new EmptySaleException();
        }

        totalPrice = 0;
        for (Product p : products) {
            totalPrice += p.getPrice();
        }
    }
}