import java.util.Scanner;

public class PRAK104_2410817110007_MuhammadHamkaAkbari {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int skorAbu = 0;
        int skorBagas = 0;

        System.out.print("Tangan Abu: ");
        String abuRonde1 = scanner.next();
        String abuRonde2 = scanner.next();
        String abuRonde3 = scanner.next();


        System.out.print("Tangan Bagas: ");
        String bagasRonde1 = scanner.next();
        String bagasRonde2 = scanner.next();
        String bagasRonde3 = scanner.next();

        scanner.close();

        if (!abuRonde1.equals(bagasRonde1)) {
            if ((abuRonde1.equals("B") && bagasRonde1.equals("G")) ||
                    (abuRonde1.equals("G") && bagasRonde1.equals("K")) ||
                    (abuRonde1.equals("K") && bagasRonde1.equals("B"))) {
                skorAbu++;
            } else {
                skorBagas++;
            }
        }

        if (!abuRonde2.equals(bagasRonde2)) {
            if ((abuRonde2.equals("B") && bagasRonde2.equals("G")) ||
                    (abuRonde2.equals("G") && bagasRonde2.equals("K")) ||
                    (abuRonde2.equals("K") && bagasRonde2.equals("B"))) {
                skorAbu++;
            } else {
                skorBagas++;
            }
        }

        if (!abuRonde3.equals(bagasRonde3)) {
            if ((abuRonde3.equals("B") && bagasRonde3.equals("G")) ||
                    (abuRonde3.equals("G") && bagasRonde3.equals("K")) ||
                    (abuRonde3.equals("K") && bagasRonde3.equals("B"))) {
                skorAbu++;
            } else {
                skorBagas++;
            }
        }

        if (skorAbu > skorBagas) {
            System.out.println("\nAbu");
        } else if (skorBagas > skorAbu) {
            System.out.println("\nBagas");
        } else {
            System.out.println("\nSeri");
        }
    }
}
