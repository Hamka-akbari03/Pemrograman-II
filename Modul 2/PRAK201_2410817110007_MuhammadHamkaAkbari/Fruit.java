package PRAK201_2410817110007_MuhammadHamkaAkbari;

import java.text.DecimalFormat;

public class Fruit {

    private String fruitName;
    private double weight;
    private double price;
    private double quantityPurchased;

    public Fruit(String name, double weight, double price, double quantity) {
        this.setFruitName(name);
        this.setWeight(weight);
        this.setPrice(price);
        this.setQuantityPurchased(quantity);
    }

    public void setFruitName(String fruitName) {
        this.fruitName = fruitName;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setQuantityPurchased(double quantityPurchased) {
        this.quantityPurchased = quantityPurchased;
    }

    public String getFruitName() {
        return this.fruitName;
    }

    public double getWeight() {
        return this.weight;
    }

    public double getPrice() {
        return this.price;
    }

    public double getQuantityPurchased() {
        return this.quantityPurchased;
    }

    public double calculatePriceBeforeDiscount() {
        return (this.getQuantityPurchased() / this.getWeight()) * this.getPrice();
    }

    public double calculateTotalDiscount() {
        double numberOfDiscountMultiples = Math.floor(this.getQuantityPurchased() / 4);
        double discountPerFourKg = this.getPrice() * 0.08;
        return numberOfDiscountMultiples * discountPerFourKg;
    }

    public double calculatePriceAfterDiscount() {
        return calculatePriceBeforeDiscount() - calculateTotalDiscount();
    }

    public void displayInfo() {
        DecimalFormat currencyFormatter = new DecimalFormat("0.00");

        System.out.println("Fruit Name: " + this.getFruitName());
        System.out.println("Weight: " + this.getWeight());
        System.out.println("Price: " + this.getPrice());
        System.out.println("Amount Purchased: " + this.getQuantityPurchased() + "kg");
        System.out.println("Price Before Discount: Rp" + currencyFormatter.format(this.calculatePriceBeforeDiscount()));
        System.out.println("Total Discount: Rp" + currencyFormatter.format(this.calculateTotalDiscount()));
        System.out.println("Price After Discount: Rp" + currencyFormatter.format(this.calculatePriceAfterDiscount()));
        System.out.println();
    }
}
