package co.edu.uptc.view;

import co.edu.uptc.pojo.Product;

public class ProductPrinter {

    public void printList(Product[] products, String title) {
        System.out.println("\n" + title + ":");
        if (products == null || products.length == 0) {
            System.out.println("No hay registro de productos.");
            return;
        }
        for (int i = 0; i < products.length; i++) {
            System.out.println((i + 1) + ". " + products[i]);
        }
    }
}