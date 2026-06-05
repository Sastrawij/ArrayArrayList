package bagian2.arraylist;

import java.util.ArrayList;

public class LatihanMandiri4 {
    public static void main(String[] args) {
        ArrayList<String> daftar = new ArrayList<>();
        daftar.add("Apel");
        daftar.add("Jeruk");
        daftar.add("Mangga");
        daftar.add("Pisang");
        
        daftar.remove(1); // Menghapus item ke-2 (indeks 1)
        
        System.out.println("Daftar belanja: " + daftar);
        System.out.println("Jumlah item: " + daftar.size());
    }
}
