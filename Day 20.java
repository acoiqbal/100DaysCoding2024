
package day.pkg4;

public class Day20 {

    public static void main(String[] args) {
        // inisialisasi tipe data reference
        Byte a = 20;
        Byte b = 15;
        Byte c = 18;
        Byte d = 22;
        Byte e = 17;
        
        // menampilkan jumlah kelereng sebelum pertukaran
        System.out.println("Sebelum pertukaran");
        System.out.printf("Ali  memiliki %d kelereng.\n", a);
        System.out.printf("Budi memiliki %d kelereng.\n", b);
        System.out.printf("Cici memiliki %d kelereng.\n", c);
        System.out.printf("Dedi memiliki %d kelereng.\n", d);
        System.out.printf("Evi  memiliki %d kelereng.\n", e);
        System.out.println();
        
        // melakukan pertukaran kelereng 
        Byte f;
        f = a;
        a = b;
        b = f;

        f = c;
        c = d;
        d = f;
        
        // menampilkan jumlah kelereng sesudah pertukaran
        System.out.println("Sesudah pertukaran");
        System.out.println("Ali  memiliki " + a + " kelereng");
        System.out.println("Budi memiliki " + b + " kelereng");
        System.out.println("Cici memiliki " + c + " kelereng");
        System.out.println("Dedi memiliki " + d + " kelereng");
        System.out.println("evi  memiliki " + e + " kelereng");
        System.out.println();
        
         // melakukan penambahan dan menampilkan jumlah kelereng setelah penambahan
        System.out.println("Setelah penambahan kelereng");
        System.out.println("Ali  memiliki " + (a + 5) + " kelereng");
        System.out.println("Budi memiliki " + (b + 3) + " kelereng");
        System.out.println("Cici memiliki " + (c + 2) + " kelereng");
        System.out.println("Dedi memiliki " + (d + 4) + " kelereng");
        System.out.println("evi  memiliki " + e + " kelereng");
    }

}
