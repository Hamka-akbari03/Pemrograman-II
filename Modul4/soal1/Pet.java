package soal1;

public class Pet {
    private final String name;
    private final String breed;

    public Pet(String breed, String name) {
        this.breed = breed;
        this.name = name;
    }

    public void display() {
        System.out.println("\nDetail Hewan Peliharaan:");
        System.out.println("Nama Hewan Peliharaanku Adalah : " + this.name);
        System.out.println("Dengan Ras : " + this.breed);
    }
}
