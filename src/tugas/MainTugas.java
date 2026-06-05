package tugas;
 
// Nama: [Sukma Sastra Wijaya]
// NPM: [2410010462]

public class MainTugas {
    public static void main(String[] args) {
        KelasKuliah kelas = new KelasKuliah();

        // Menambah minimal 5 objek Mahasiswa 
        kelas.tambahMahasiswa(new Mahasiswa("Yandi", "101", 85.0));
        kelas.tambahMahasiswa(new Mahasiswa("Putra", "102", 55.0));
        kelas.tambahMahasiswa(new Mahasiswa("Adam", "103", 90.0));
        kelas.tambahMahasiswa(new Mahasiswa("jaya", "104", 45.0));
        kelas.tambahMahasiswa(new Mahasiswa("Rayhan", "105", 70.0));

        // Menampilkan mata kuliah (array string, ukuran tetap) [cite: 602]
        String[] matkul = {"PBO", "Struktur Data", "Basis Data"};
        System.out.println("Mata Kuliah: " + String.join(", ", matkul));
        System.out.println();

        kelas.tampilkanSemua();
        
        // Menampilkan rata-rata dan jumlah lulus [cite: 603]
        System.out.println("\nRata-rata nilai: " + kelas.hitungRataRata());
        System.out.println("Jumlah mahasiswa lulus: " + kelas.jumlahLulus());

        // Menambahkan satu objek Mahasiswa baru [cite: 603]
        kelas.tambahMahasiswa(new Mahasiswa("Fani", "106", 65.0));
        System.out.println("\nJumlah data terbaru: " + kelas.getJumlahData());
    }
}
