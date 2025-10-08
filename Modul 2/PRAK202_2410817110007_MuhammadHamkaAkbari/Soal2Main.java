package PRAK202_2410817110007_MuhammadHamkaAkbari;

public class Soal2Main {
    public static void main(String[] args) {
        Coffee coffee1 = new Coffee();

        coffee1.setCoffeeName("Espresso");
        coffee1.setSize("Medium");
        coffee1.setPrice(25000);

        coffee1.info();

        coffee1.setCustomer("Alice");
        System.out.println("Coffee Customer: " + coffee1.getCustomer());
        System.out.println("Coffee Tax: Rp. " + coffee1.getTax());
    }
}
