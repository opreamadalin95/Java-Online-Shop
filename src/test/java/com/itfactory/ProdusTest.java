package com.itfactory;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class ProdusTest {
    private Produs produs;

    @Test
    public void testCalculateFinalPrice(){
        produs = new Produs("Pantaloni",15.0,20,1);
        double pret = produs.getFinalPrice();
        Assertions.assertEquals(pret, 12.0);

    }

    @Test
    public void testDiscountPrice() {
        Produs produs = new Produs("Produs 1", 100.0, 20, 1);
        double expectedDiscountedPrice = 80.0;
        double actualDiscountedPrice = produs.DiscountPrice();
        Assertions.assertEquals(expectedDiscountedPrice, actualDiscountedPrice);
    }

    @Test
    public void testFinalPriceWithMultipleQuantity() {
        produs = new Produs("Produs 2", 50.0, 10, 3);
        double expectedFinalPrice = 135.0;
        double actualFinalPrice = produs.getFinalPrice();
        Assertions.assertEquals(expectedFinalPrice, actualFinalPrice);
    }

    @Test
    public void testFinalPriceWithZeroQuantity() {
        produs = new Produs("Produs 3", 30.0, 5, 0);
        double expectedFinalPrice = 0.0;
        double actualFinalPrice = produs.getFinalPrice();
        Assertions.assertEquals(expectedFinalPrice, actualFinalPrice);
    }
}



