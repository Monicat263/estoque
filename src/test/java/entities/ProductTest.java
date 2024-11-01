package entities;


import exceptions.InvalidProductQuantityException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.testng.AssertJUnit.assertEquals;

class ProductTest {
    private Product product;

    @BeforeEach
    void setUp(){
        product = new Product();
        product.name = "TV";
        product.price = 500.00;
        product.quantity = 2;
    }

    @Test
    @DisplayName("Total value in stock")
    void totalValueInStock(){
        double expectedTotalValue = 1000;
        assertEquals(expectedTotalValue,product.totalValueInStock());
    }

    @Test
    @DisplayName("Add products in Stock")
    void addProducts(){
        product.addProducts(5);
        assertEquals(7,product.quantity);
    }
    @Test
    @DisplayName("Not add products in Stock when value to zero")
    void notAddProductsWhenValueEqualZero(){
        product.addProducts(0);
        assertEquals(2,product.quantity);
    }
    @Test
    @DisplayName("Should throw exception when adding negative quantity")
    void shouldThrowExceptionWhenAddingNegativeQuantity() {
        // Armazenar a quantidade inicial antes da chamada do método
        int initialQuantity = product.quantity;

        Exception exception = assertThrows(InvalidProductQuantityException.class, () -> {
            product.addProducts(-1);
        });

        // Verifica se a mensagem da exceção é a esperada
        assertEquals("Valor inválido", exception.getMessage());

        // Verifica se a quantidade permanece inalterada
        assertEquals(initialQuantity, product.quantity); // Verifica se a quantidade permanece inalterada
    }

    @Test
    @DisplayName("Remove Products in Stock ")
    void removeProducts(){
        product.removeProducts(1);
        assertEquals(1,product.quantity);
    }
}