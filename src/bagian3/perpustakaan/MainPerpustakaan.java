package bagian3.perpustakaan;

public class MainPerpustakaan {
    public static void main(String[] args) {
        // Membuat objek pengelola
        Perpustakaan perpus = new Perpustakaan();

        // 1. Menambahkan buku dengan 3 parameter (Judul, Penulis, Tahun)
        perpus.tambahBuku(new Buku("Laskar Pelangi", "Andrea Hirata", 2005));
        perpus.tambahBuku(new Buku("Bumi Manusia", "Pramoedya", 1980));
        perpus.tambahBuku(new Buku("Negeri 5 Menara", "Ahmad Fuadi", 2009));

        // 2. Menampilkan koleksi awal
        perpus.tampilkanKoleksi();
        System.out.println();

        // 3. Uji coba meminjam buku
        perpus.pinjamBuku("Bumi Manusia");
        System.out.println();

        // 4. Uji coba Latihan 3.4 No. 1: Mengembalikan buku
        perpus.kembalikanBuku("Bumi Manusia");
        System.out.println();

        // 5. Uji coba Latihan 3.4 No. 3: Mencari buku berdasarkan penulis
        perpus.cariPenulis("Andrea Hirata");
        System.out.println();

        // 6. Menampilkan jumlah buku tersedia di akhir
        System.out.println("Jumlah buku tersedia: " + perpus.jumlahTersedia());
    }
}