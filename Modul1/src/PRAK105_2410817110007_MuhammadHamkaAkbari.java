import java.util.Scanner;
import java.util.Locale;

public class PRAK105_2410817110007_MuhammadHamkaAkbari {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        final double PI = 3.14;

        System.out.print("Masukkan jari-jari: ");
        double jariJari = scanner.nextDouble();

        System.out.print("Masukkan Tinggi: ");
        double tinggi = scanner.nextDouble();

        double volume = PI * jariJari * jariJari * tinggi;

        System.out.printf("\nVolume tabung dengan jari-jari %.1f cm dan tinggi %.1f  adalah %.3f m3\n", jariJari, tinggi, volume);

        scanner.close();
    }
}