package bagian3.perpustakaan;

public class Buku {
    // Atribut menggunakan private final agar data aman dan tidak berubah setelah dibuat
    private final String judul;
    private final String penulis;
    private final int tahunTerbit;
    private boolean dipinjam;

    // Konstruktor dengan 3 parameter (sesuai instruksi poin 2)
    public Buku(String judul, String penulis, int tahunTerbit) {
        this.judul = judul;
        this.penulis = penulis;
        this.tahunTerbit = tahunTerbit;
        this.dipinjam = false; // Buku baru selalu dianggap tersedia
    }

    // Getter untuk mengakses data
    public String getJudul() {
        return judul;
    }

    public String getPenulis() {
        return penulis;
    }

    public int getTahunTerbit() {
        return tahunTerbit;
    }

    public boolean isDipinjam() {
        return dipinjam;
    }

    // Setter untuk mengubah status pinjam
    public void setDipinjam(boolean dipinjam) {
        this.dipinjam = dipinjam;
    }

   
    public String info() {
        String status = dipinjam ? "Dipinjam" : "Tersedia";
        return judul + " (" + tahunTerbit + ") oleh " + penulis + " [" + status + "]";
    }
}
