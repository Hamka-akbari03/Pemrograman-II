package PRAK203_2410817110007_MuhammadHamkaAkbari;

public class Soal3Main {
    public static void main(String[] args) {
        // Nama kelas yang diinstansiasi disesuaikan dengan nama kelas yang sudah diperbaiki.
        Pegawai p1 = new Pegawai();

        // Pada baris ini terjadi error karena kekurangan titik koma (;). Akses langsung ke atribut sesuai dokumen.
        // pl.nama = "Roi"
        p1.nama = "Roi";

        // Akses langsung ke atribut 'asal'.
        p1.asal = "Kingdom of Orvel";

        // Memanggil method 'setJabatan' sesuai dokumen.
        p1.setJabatan("Assasin");

        // Atribut 'umur' perlu diisi nilainya agar output sesuai dengan yang diminta.
        p1.umur = 17;

        // Memanggil method 'getNama' dan label output disesuaikan.
        System.out.println("Nama: " + p1.getNama());

        // Memanggil method 'getAsal'.
        System.out.println("Asal: " + p1.getAsal());

        // Mengakses atribut 'jabatan' secara langsung sesuai dokumen.
        System.out.println("Jabatan: " + p1.jabatan);

        // Mengakses atribut 'umur' secara langsung dan menambahkan kata "tahun" agar output sesuai.
        System.out.println("Umur: " + p1.umur + " tahun");
    }
    // Kurung kurawal penutup untuk method main() yang salah posisi telah dipindahkan ke akhir blok.
    // }
}
