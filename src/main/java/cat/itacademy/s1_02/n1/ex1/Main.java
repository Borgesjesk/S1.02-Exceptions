package cat.itacademy.s1_02.n1.ex1;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        // --- Test 1: Empty sale → should throw EmptySaleException ---
        Sale emptySale = new Sale();
        try {
            emptySale.calculateTotal();
        } catch (EmptySaleException e) {
            System.out.println("Caught: " + e.getMessage());
        }

        // --- Test 2: Sale with products → should calculate correctly ---
        Sale sale = new Sale();
        sale.addProduct(new Product("Laptop", 999.99));
        sale.addProduct(new Product("Mouse", 25.50));
        sale.addProduct(new Product("Keyboard", 75.00));

        try {
            sale.calculateTotal();
            System.out.println("Total: " + sale.getTotalPrice());
        } catch (EmptySaleException e) {
            System.out.println(e.getMessage());
        }

        // --- Test 3: IndexOutOfBoundsException ---
        ArrayList<String> list = new ArrayList<>();
        list.add("only one item");
        try {
            System.out.println(list.get(5));
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Caught IndexOutOfBoundsException: " + e.getMessage());
        }
    }
}