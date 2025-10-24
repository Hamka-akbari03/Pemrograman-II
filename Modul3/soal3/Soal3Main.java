package soal3;

import java.util.ArrayList;
import java.util.Scanner;

public class Soal3Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Student> studentList = new ArrayList<>();

        int choice = -1;

        while (choice != 0) {
            printMenu();
            choice = Integer.parseInt(scanner.nextLine());

            switch (choice) {
                case 1:
                    System.out.print("Masukkan Nama Mahasiswa: ");
                    String name = scanner.nextLine();
                    System.out.print("Masukkan NIM Mahasiswa (harus unik): ");
                    String nim = scanner.nextLine();

                    boolean isUnique = true;
                    for (Student student : studentList) {
                        if (student.getNim().equals(nim)) {
                            isUnique = false;
                            break;
                        }
                    }

                    if (isUnique) {
                        studentList.add(new Student(name, nim));
                        System.out.println("Mahasiswa " + name + " ditambahkan.");
                    } else {
                        System.out.println("Mahasiswa dengan NIM " + nim + " sudah ada.");
                    }
                    break;

                case 2:
                    System.out.print("Masukkan NIM Mahasiswa yang akan dihapus: ");
                    String nimToRemove = scanner.nextLine();

                    boolean removed = studentList.removeIf(student -> student.getNim().equals(nimToRemove));

                    if (removed) {
                        System.out.println("Mahasiswa dengan NIM " + nimToRemove + " dihapus.");
                    } else {
                        System.out.println("Mahasiswa dengan NIM " + nimToRemove + " tidak ditemukan.");
                    }
                    break;

                case 3:
                    System.out.print("Masukkan NIM Mahasiswa yang akan dicari: ");
                    String nimToSearch = scanner.nextLine();
                    boolean found = false;

                    for (Student student : studentList) {
                        if (student.getNim().equals(nimToSearch)) {
                            System.out.println("NIM: " + student.getNim() + ", Nama: " + student.getName());
                            found = true;
                            break;
                        }
                    }

                    if (!found) {
                        System.out.println("Mahasiswa dengan NIM " + nimToSearch + " tidak ditemukan.");
                    }
                    break;

                case 4:
                    System.out.println("Daftar Mahasiswa:");
                    if (studentList.isEmpty()) {
                        System.out.println("Tidak ada data mahasiswa.");
                    } else {
                        for (Student student : studentList) {
                            System.out.println("NIM: " + student.getNim() + ", Nama: " + student.getName());
                        }
                    }
                    break;

                case 0:
                    System.out.println("Terima kasih!");
                    break;

                default:
                    System.out.println("Pilihan tidak valid. Silakan coba lagi.");
                    break;
            }
            System.out.println();
        }

        scanner.close();
    }

    private static void printMenu() {
        System.out.println("Menu:");
        System.out.println("1. Tambah Mahasiswa");
        System.out.println("2. Hapus Mahasiswa berdasarkan NIM");
        System.out.println("3. Cari Mahasiswa berdasarkan NIM");
        System.out.println("4. Tampilkan Daftar Mahasiswa");
        System.out.println("0. Keluar");
        System.out.print("Pilihan: ");
    }
}
