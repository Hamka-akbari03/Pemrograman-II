package PRAK203_2410817110007_MuhammadHamkaAkbari;

// Pada baris ini terjadi error karena nama class tidak sesuai dengan nama file dan tidak sesuai dengan yang dipanggil di Soal3Main.java (new Pegawai()).
// public class Employee {
public class Pegawai {
    public String nama;

    // Pada baris ini terjadi error karena tipe data 'char' hanya dapat menampung satu karakter,
    // sedangkan input yang diberikan adalah sebuah String ("Kingdom of Orvel").
    // public char asal;
    public String asal;

    public String jabatan;
    public int umur;

    public String getNama() {
        return nama;
    }

    // Pada baris ini terjadi error karena return type method tidak sesuai dengan tipe data variabel 'asal' yang sudah diperbaiki menjadi String.
    // public String getAsal() {
    public String getAsal() {
        // Pada baris ini terjadi error karena variabel 'asal' yang bertipe char tidak bisa dikembalikan sebagai String secara langsung.
        // return asal;
        return asal;
    }

    // Pada baris ini terjadi error karena method 'setJabatan' membutuhkan parameter untuk menerima input jabatan, namun di sini tidak dideklarasikan.
    // public void setJabatan() {
    public void setJabatan(String j) {
        // Variabel 'j' belum didefinisikan di dalam method ini.
        // this.jabatan = j;
        this.jabatan = j;
    }
}
