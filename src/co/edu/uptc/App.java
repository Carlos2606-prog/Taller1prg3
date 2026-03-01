package co.edu.uptc;

import co.edu.uptc.interfaces.IOrderModel;
import co.edu.uptc.interfaces.IProductView;
import co.edu.uptc.model.Order;
import co.edu.uptc.model.OrderLinkedList;
import co.edu.uptc.presenter.ProductPresenter;
import co.edu.uptc.view.ConsoleProductView;

public class App {
    public static void main(String[] args) {
        IOrderModel model = new Order();
        
        IProductView view = new ConsoleProductView();
        ProductPresenter presenter = new ProductPresenter(model, view);
        presenter.start();
    }
}
