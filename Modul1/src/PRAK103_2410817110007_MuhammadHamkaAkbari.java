import java.util.Scanner;

public class PRAK103_2410817110007_MuhammadHamkaAkbari {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int angkaAwal = scanner.nextInt();
        scanner.close();

        int counter = 0;
        do {
            if (angkaAwal % 2 != 0) {
                System.out.print(angkaAwal);
                counter++;
                if (counter < N) {
                    System.out.print(", ");
                }
            }
            angkaAwal++;
        } while (counter < N);
        System.out.println();
    }
}