package soal2;

public class Dog extends Pet {
    private String furColor;
    private String[] abilities;

    public Dog(String name, String breed, String furColor, String[] abilities) {
        super(breed, name);
        this.furColor = furColor;
        this.abilities = abilities;
    }

    public void displayDogDetails() {
        super.display();
        System.out.println("Memiliki warna bulu : " + this.furColor);
        System.out.print("Memiliki kemampuan : ");
        for (String skill : this.abilities) {
            System.out.print(skill + " ");
        }
        System.out.println();
    }
}