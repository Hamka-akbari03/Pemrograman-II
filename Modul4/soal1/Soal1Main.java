package soal1;

import java.util.Scanner;

public class Soal1Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nama Hewan Peliharaan: ");
        String petName = scanner.nextLine();

        System.out.print("Ras: ");
        String petBreed = scanner.nextLine();

        Pet myPet = new Pet(petBreed, petName);

        myPet.display();

        scanner.close();
    }
}