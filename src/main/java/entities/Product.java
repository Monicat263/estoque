package entities;

import exceptions.InvalidProductQuantityException;

public class Product {
    public String name;
    public double price;
    public int quantity;

    public Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public double totalValueInStock(){
        return price * quantity;

    }

    public void addProducts(int quantity){
        if (quantity > 0) {
            this.quantity += quantity;
        } else {
            throw new InvalidProductQuantityException("Valor inválido");
        }
    }

    public void removeProducts(int quantity){
        this.quantity -= quantity;
    }

    // Utilização do método toString para subscrever o objeto de object
    @Override
    public String toString(){
        return name
               + ", $ "
               + String.format("%.2f",price)
               + ", "
               + quantity
               + " units, Total: $ "
               + String.format("%.2f",totalValueInStock());
    }
}
