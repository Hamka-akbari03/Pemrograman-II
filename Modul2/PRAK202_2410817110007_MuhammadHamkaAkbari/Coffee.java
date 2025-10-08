package PRAK202_2410817110007_MuhammadHamkaAkbari;

public class Coffee {
    private String coffeeName;
    private String size;
    private double price;
    private String customer;

    public void setCoffeeName(String coffeeName) {
        this.coffeeName = coffeeName;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setCustomer(String customer) {
        this.customer = customer;
    }

    public String getCoffeeName() {
        return this.coffeeName;
    }

    public String getSize() {
        return this.size;
    }

    public double getPrice() {
        return this.price;
    }

    public String getCustomer() {
        return this.customer;
    }

    public void info() {
        System.out.println("Nama Kopi: " + this.getCoffeeName());
        System.out.println("Ukuran: " + this.getSize());
        System.out.println("Harga: Rp. " + this.getPrice());
    }

    public double getTax() {
        return this.getPrice() * 0.11;
    }
}
