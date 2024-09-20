package day.pkg4;

public class Day19 {

    public static void main(String[] args) {
        // type data reference
        String a, b;
        a = "hai apa kabar";
        b = a;
        // membuat referensi objek yang sama dengan a
        System.out.println(b);
        
        b = "iya baik";
        // mengubah nilai pada variable b
        System.out.println("A = " + a);
        System.out.println("B = " + b);
        System.out.printf("A = %s ", a);
        System.out.println();

        System.out.println("--------------------");

        String c = "pengertian tipe data reference : ";
        String d = "tipe data reference merupakan";
        String e = "tipe data yang";
        String f = "menunjuk ke lokasi memori";
        String g = "dimana data sebenarnya disimpan";

        System.out.println(c);
        System.out.printf("%s, %s %s %s ", d, e, f, g);
        System.out.println();
    }
}
