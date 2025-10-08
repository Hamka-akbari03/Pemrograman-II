package PRAK201_2410817110007_MuhammadHamkaAkbari;

public class Main {
    public static void main(String[] args) {

        Fruit apple = new Fruit("Apple", 0.4, 7000.0, 40.0);
        Fruit mango = new Fruit("Mango", 0.2, 3500.0, 15.0);
        Fruit avocado = new Fruit("Avocado", 0.25, 10000.0, 12.0);

        apple.displayInfo();
        mango.displayInfo();
        avocado.displayInfo();
    }
}
