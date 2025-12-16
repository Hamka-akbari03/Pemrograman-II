package demo.service;

import demo.model.Order;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class OrderService {
    private final ObservableList<Order> orders = FXCollections.observableArrayList();

    public ObservableList<Order> getOrders() {
        return orders;
    }

    public void add(Order order) {
        orders.add(order);
    }

    public void remove(Order order) {
        orders.remove(order);
    }
}
