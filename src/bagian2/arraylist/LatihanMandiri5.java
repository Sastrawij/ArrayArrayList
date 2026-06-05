package bagian2.arraylist;

import java.util.ArrayList;

public class LatihanMandiri5 {
        public static void main(String[] args) {
        ArrayList<Integer> angka = new ArrayList<>();
        angka.add(10);
        angka.add(45);
        angka.add(23);
        angka.add(89);
        angka.add(56);
        
        int max = angka.get(0);
        for (int a : angka) {
            if (a > max) max = a;
        }
        System.out.println("Nilai terbesar: " + max);
    }
}
