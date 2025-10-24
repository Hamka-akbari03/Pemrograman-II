package soal1;

import java.util.Random;

public class Dice {
    private int value;

    public Dice() {
        this.roll();
    }

    private void roll() {
        Random rand = new Random();
        this.value = rand.nextInt(6) + 1;
    }

    public int getValue() {
        return this.value;
    }
}