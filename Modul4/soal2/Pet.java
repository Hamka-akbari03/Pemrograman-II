package soal2;

public class Pet {
    protected String name;
    protected String breed;

    public Pet(String breed, String name) {
        this.breed = breed;
        this.name = name;
    }

    public void display() {
        System.out.println("\nDetail Hewan Peliharaan:");
        System.out.println("Nama hewan peliharaanku adalah : " + this.name);
        System.out.println("Dengan ras : " + this.breed);
    }
}
