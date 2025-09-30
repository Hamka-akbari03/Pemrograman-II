import java.util.Scanner;

public class PRAK102_2410817110007_MuhammadHamkaAkbari {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int angkaAwal = scanner.nextInt();
        scanner.close();

        int i = 0;
        while (i <= 10) {
            int tampilkanAngka;
            if (angkaAwal % 5 == 0) {
                tampilkanAngka = (angkaAwal / 5) - 1;
            } else {
                tampilkanAngka = angkaAwal;
            }

            System.out.print(tampilkanAngka);

            if (i < 10) {
                System.out.print(", ");
            }

            angkaAwal++;
            i++;
        }
        System.out.println();
    }
}