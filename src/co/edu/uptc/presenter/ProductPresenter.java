package co.edu.uptc.presenter;

import co.edu.uptc.interfaces.IOrderModel;
import co.edu.uptc.interfaces.IProductView;
import co.edu.uptc.pojo.Product;

public class ProductPresenter {
    private final IOrderModel model;
    private final IProductView view;

    public ProductPresenter(IOrderModel model, IProductView view) {
        this.model = model;
        this.view = view;
    }

    public void start() {
        boolean isRunning = true;
        while (isRunning) {
            int option = view.displayMenu();
            switch (option) {
                case 1 -> addProduct();
                case 2 -> showAllProducts();
                case 3 -> showSortedProducts();
                case 4 -> deleteProducts();
                case 0 -> isRunning = false;
                default -> view.displayMessage("Opción inválida.");
            }
        }
    }

    private void addProduct() {
        Product product = view.requestProduct();
        model.addProduct(product);
        view.displayMessage("Producto añadido.");
    }

    private void showAllProducts() {
        view.displayProducts(model.getProducts(), "Lista de productos");
    }

    private void showSortedProducts() {
        view.displayProducts(model.getProductsSortedByName(), "Lista ordenada por nombre");
    }

    private void deleteProducts() {
        String text = view.requestText("Digite el nombre del producto a eliminar: ");
        int deleted = model.removeByPartialName(text);
        view.displayMessage("Productos eliminados: " + deleted);
    }
}