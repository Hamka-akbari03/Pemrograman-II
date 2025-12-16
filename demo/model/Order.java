package demo.model;

public class Order {
    private String customerName;
    private String menu;
    private int quantity;

    public Order(String customerName, String menu, int quantity) {
        this.customerName = customerName;
        this.menu = menu;
        this.quantity = quantity;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getMenu() {
        return menu;
    }

    public void setMenu(String menu) {
        this.menu = menu;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
