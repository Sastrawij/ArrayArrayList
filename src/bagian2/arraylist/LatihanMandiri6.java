package bagian2.arraylist;

import java.util.ArrayList;

public class LatihanMandiri6 {
       public static void main(String[] args) {
        ArrayList<String> nama = new ArrayList<>();
        nama.add("Andi");
        nama.add("Budi");
        nama.add("Anisa");
        nama.add("Citra");
        nama.add("Ahmad");
        nama.add("Dedi");
        
        System.out.println("Nama yang diawali huruf A:");
        for (String n : nama) {
            if (n.startsWith("A")) {
                System.out.println(n);
            }
        }
       }
}