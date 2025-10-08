package PRAK202_2410817110007_MuhammadHamkaAkbari;

public class Soal2Main {
    public static void main(String[] args) {
        Coffee coffee1 = new Coffee();

        coffee1.setCoffeeName("Espresso");
        coffee1.setSize("Medium");
        coffee1.setPrice(25000);

        coffee1.info();

        coffee1.setCustomer("Alice");
        System.out.println("Pembeli Kopi: " + coffee1.getCustomer());
        System.out.println("Pajak Kopi: Rp. " + coffee1.getTax());
    }
}
