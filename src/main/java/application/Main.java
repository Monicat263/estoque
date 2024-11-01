package application;

import entities.Product;

import java.util.Locale;
import java.util.Scanner;

/*
    Faça um programa para ler os dados de um produto em estoque (nome, preço e quantidade no estoque) Em seguida:
        - Mostrar os dados do produto(nome, preço, quantidade no estoque, valor total no estoque)
        - Realiar um entrada no estoque e mostrar novamente os dados do produto
        - Realizar uma saída no estoque e mostrar novamente os dados do produto
 */
public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Product product = new Product();
        System.out.println("Enter product data: ");
        System.out.print("Name: ");
        product.name = sc.nextLine();
        System.out.print("Price: ");
        product.price = sc.nextDouble();
        System.out.print("Quantity:  ");
        product.quantity = sc.nextInt();
        // Utilizaçaão do método toString com a  formatação da saída do objeto product
        System.out.println("Product data: "+ product);
        System.out.printf("");

        System.out.printf("Entre the number of products to be added in stock: ");
        int quantity = sc.nextInt();
        product.addProducts(quantity);

        System.out.printf("");
        System.out.println("Updated data : "+ product);

        System.out.printf("");

        System.out.printf("Entre the number of products to be removed from stock: ");
        quantity = sc.nextInt();
        product.removeProducts(quantity);

        System.out.printf("");
        System.out.println("Product data: "+ product);

        sc.close();
    }
}