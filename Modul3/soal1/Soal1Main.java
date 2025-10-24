package soal1;

import java.util.LinkedList;
import java.util.Scanner;

public class Soal1Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        LinkedList<Dice> diceList = new LinkedList<>();

        int numberOfDice = scanner.nextInt();

        for (int i = 0; i < numberOfDice; i++) {
            diceList.add(new Dice());
        }

        int totalValue = 0;

        for (int i = 0; i < diceList.size(); i++) {
            Dice dice = diceList.get(i);
            int value = dice.getValue();
            System.out.println("Dadu ke-" + (i + 1) + " bernilai " + value);
            totalValue += value;
        }

        System.out.println("Total nilai dadu keseluruhan " + totalValue);

        scanner.close();
    }
}