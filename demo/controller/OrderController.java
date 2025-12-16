package demo.controller;

import demo.model.Order;
import demo.service.OrderService;
import demo.ui.AlertHelper;
import javafx.fxml.FXML;
import javafx.scene.control.*;

public class OrderController {

    @FXML private TextField tfName;
    @FXML private TextField tfMenu;
    @FXML private TextField tfQty;
    @FXML private TableView<Order> table;
    @FXML private TableColumn<Order, String> colName;
    @FXML private TableColumn<Order, String> colMenu;
    @FXML private TableColumn<Order, Integer> colQty;

    private final OrderService service = new OrderService();

    @FXML
    public void initialize() {
        colName.setCellValueFactory(data -> new javafx.beans.property.SimpleStringProperty(data.getValue().getCustomerName()));
        colMenu.setCellValueFactory(data -> new javafx.beans.property.SimpleStringProperty(data.getValue().getMenu()));
        colQty.setCellValueFactory(data -> new javafx.beans.property.SimpleIntegerProperty(data.getValue().getQuantity()).asObject());
        table.setItems(service.getOrders());
    }

    @FXML
    private void handleAdd() {
        if (tfName.getText().isEmpty() || tfMenu.getText().isEmpty() || tfQty.getText().isEmpty()) {
            AlertHelper.showError("Semua field wajib diisi");
            return;
        }

        Order order = new Order(tfName.getText(), tfMenu.getText(), Integer.parseInt(tfQty.getText()));
        service.add(order);

        tfName.clear();
        tfMenu.clear();
        tfQty.clear();
    }

    @FXML
    private void handleDelete() {
        Order selected = table.getSelectionModel().getSelectedItem();
        if (selected == null) {
            AlertHelper.showError("Pilih data terlebih dahulu");
            return;
        }
        service.remove(selected);
    }
}
