package co.edu.uptc.view;

import co.edu.uptc.interfaces.IProductView;
import co.edu.uptc.pojo.Product;

public class ConsoleProductView implements IProductView {

    private final MenuCli menu;
    private final InputHandler inputHandler;
    private final ProductPrinter productPrinter;

    public ConsoleProductView() {
        this.menu = new MenuCli();
        this.inputHandler = new InputHandler();
        this.productPrinter = new ProductPrinter();
    }

    @Override
    public int displayMenu() {
        return menu.start();
    }

    @Override
    public Product requestProduct() {
        System.out.println("\n--- Nuevo Producto ---");
        String description = inputHandler.readText("Descripción: ");
        double price = inputHandler.readDouble("Precio: ");
        String unit = inputHandler.readText("Unidad de medida: ");
        
        return new Product(description, price, unit);
    }

    @Override
    public void displayProducts(Product[] products, String title) {
        productPrinter.printList(products, title);
    }

    @Override
    public void displayMessage(String message) {
        System.out.println(">> " + message);
    }

    @Override
    public String requestText(String message) {
        return inputHandler.readText(message);
    }
}