package soal2;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Scanner;

public class Soal2Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        LinkedList<Country> countryList = new LinkedList<>();

        HashMap<Integer, String> monthMap = new HashMap<>();
        monthMap.put(1, "Januari");
        monthMap.put(2, "Februari");
        monthMap.put(3, "Maret");
        monthMap.put(4, "April");
        monthMap.put(5, "Mei");
        monthMap.put(6, "Juni");
        monthMap.put(7, "Juli");
        monthMap.put(8, "Agustus");
        monthMap.put(9, "September");
        monthMap.put(10, "Oktober");
        monthMap.put(11, "November");
        monthMap.put(12, "Desember");

        int numberOfCountries = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < numberOfCountries; i++) {
            String name = scanner.nextLine();
            String leadershipType = scanner.nextLine();
            String leaderName = scanner.nextLine();

            if (leadershipType.equalsIgnoreCase("monarki")) {
                countryList.add(new Country(name, leadershipType, leaderName));
            } else {
                int day = Integer.parseInt(scanner.nextLine());
                int month = Integer.parseInt(scanner.nextLine());
                int year = Integer.parseInt(scanner.nextLine());
                countryList.add(new Country(name, leadershipType, leaderName, day, month, year));
            }
        }

        for (Country country : countryList) {
            String displayLeadership = country.getDisplayLeadership();

            System.out.print("\nNegara " + country.getName() + " mempunyai " + displayLeadership + " bernama " + country.getLeaderName());

            if (country.getIndependenceMonth() > 0) {
                String monthName = monthMap.get(country.getIndependenceMonth());
                System.out.println("\nDeklarasi Kemerdekaan pada Tanggal " + country.getIndependenceDay() + " " + monthName + " " + country.getIndependenceYear());
            } else {
                System.out.println();
            }
        }

        scanner.close();
    }
}