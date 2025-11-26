package com.tugas.main;

import com.tugas.service.*;
import com.tugas.ui.*;
import com.tugas.util.*;

// SOLID - DIP (Dependency Inversion Principle):
public class MainMenu {
    private final IUserService userService;
    private final IInputHelper inputHelper;

    public MainMenu() {
        this.inputHelper = new InputHelper();

        // IMPLEMENTASI PROXY PATTERN DI SINI:
        IUserService realService = new UserService();
        this.userService = new UserServiceProxy(realService);
    }

    public void run() {
        int choice;
        do {
            System.out.println("\n========================================");
            System.out.println("   APLIKASI SOLID & DESIGN PATTERNS");
            System.out.println("========================================");
            System.out.println("1. Tambah Data Pengguna");
            System.out.println("2. Lihat Semua Data");
            System.out.println("3. Keluar");
            System.out.println("========================================");

            choice = inputHelper.getInt("Pilih Menu");

            IMenu menu = null;
            if (choice == 1) menu = MenuFactory.createMenu("INPUT", userService, inputHelper);
            if (choice == 2) menu = MenuFactory.createMenu("VIEW", userService, inputHelper);

            if (menu != null) {
                menu.show();
            } else if (choice != 3) {
                System.out.println(" Pilihan tidak valid, coba lagi.");
            }

        } while (choice != 3);

        System.out.println(" Terima kasih! Keluar dari program...");
    }
}