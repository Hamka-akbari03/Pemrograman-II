package com.tugas.util;

import java.util.Scanner;

// SOLID - SRP (Single Responsibility Principle):n
public class InputHelper implements IInputHelper {
    private Scanner scanner = new Scanner(System.in);

    @Override
    public String getString(String prompt) {
        System.out.print(prompt + ": ");
        return scanner.nextLine();
    }

    @Override
    public int getInt(String prompt) {
        System.out.print(prompt + ": ");
        try {
            return Integer.parseInt(scanner.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("❌ Input harus angka!");
            return -1;
        }
    }
}
