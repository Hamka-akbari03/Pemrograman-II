package soal2;

import java.util.Scanner;

public class Soal2Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Pilih jenis hewan yang ingin diinputkan:");
        System.out.println("1 = Kucing");
        System.out.println("2 = Anjing");
        System.out.print("Masukkan pilihan: ");
        int choice = scanner.nextInt();
        scanner.nextLine();

        switch (choice) {
            case 1:
                System.out.print("Nama hewan peliharaan: ");
                String catName = scanner.nextLine();
                System.out.print("Ras: ");
                String catBreed = scanner.nextLine();
                System.out.print("Warna Bulu: ");
                String catFurColor = scanner.nextLine();

                Cat myCat = new Cat(catBreed, catName, catFurColor);
                myCat.displayCatDetails();
                break;

            case 2:
                System.out.print("Nama hewan peliharaan: ");
                String dogName = scanner.nextLine();
                System.out.print("Ras: ");
                String dogBreed = scanner.nextLine();
                System.out.print("Warna Bulu: ");
                String dogFurColor = scanner.nextLine();
                System.out.print("Kemampuan : ");
                String abilitiesStr = scanner.nextLine();
                String[] abilities = abilitiesStr.split(", ");

                Dog myDog = new Dog(dogName, dogBreed, dogFurColor, abilities);
                myDog.displayDogDetails();
                break;

            default:
                System.out.println("Pilihan tidak tersedia.");
                break;
        }

        scanner.close();
    }
}
