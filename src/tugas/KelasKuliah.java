package tugas;

import java.util.ArrayList;

public class KelasKuliah {
    private ArrayList<Mahasiswa> daftarMahasiswa = new ArrayList<>();

    public void tambahMahasiswa(Mahasiswa m) {
        daftarMahasiswa.add(m);
    }

    public double hitungRataRata() {
        if (daftarMahasiswa.isEmpty()) return 0;
        double total = 0;
        for (Mahasiswa m : daftarMahasiswa) {
            total += m.getNilai();
        }
        return total / daftarMahasiswa.size();
    }

    public int jumlahLulus() {
        int count = 0;
        for (Mahasiswa m : daftarMahasiswa) {
            if (m.lulus()) count++;
        }
        return count;
    }

    public void tampilkanSemua() {
        System.out.println("== Daftar Mahasiswa ==");
        for (Mahasiswa m : daftarMahasiswa) {
            System.out.println(m.getNama() + " (" + m.getNpm() + ") - Nilai: " + m.getNilai());
        }
    }
    
    public int getJumlahData() {
        return daftarMahasiswa.size();
    }
}
