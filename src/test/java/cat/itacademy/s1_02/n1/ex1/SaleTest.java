package cat.itacademy.s1_02.n1.ex1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SaleTest {

    @Test
    void calculateTotal_emptySale_throwsEmptySaleException() {
        Sale sale = new Sale();
        assertThrows(EmptySaleException.class, sale::calculateTotal);
    }

    @Test
    void calculateTotal_withProducts_returnsCorrectTotal() {
        Sale sale = new Sale();
        sale.addProduct(new Product("Apple", 1.50));
        sale.addProduct(new Product("Bread", 2.00));
        sale.addProduct(new Product("Milk", 0.99));

        assertEquals(4.49, sale.calculateTotal(), 0.001);
    }

    @Test
    void addProduct_increasesTotalByProductPrice() {
        Sale sale = new Sale();
        sale.addProduct(new Product("Widget", 5.00));

        assertEquals(5.00, sale.calculateTotal(), 0.001);
    }
}
