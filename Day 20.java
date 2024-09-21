package day.pkg4;

public class Day20 {

    public static void main(String[] args) {
        byte a = 20;
        byte b = 15;
        byte c = 18;
        byte d = 22;
        byte e = 17;
        
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
        
        // melakukan penambahan kelereng
        a += 5;
        b += 3;
        c += 2;
        d += 4;
        
        // menampilkan jumlah kelereng setelah di tambah
        System.out.println("Setelah penambahan kelereng");
        System.out.println("Ali  memiliki " + a + " kelereng");
        System.out.println("Budi memiliki " + b + " kelereng");
        System.out.println("Cici memiliki " + c + " kelereng");
        System.out.println("Dedi memiliki " + d + " kelereng");
        System.out.println("evi  memiliki " + e + " kelereng");
    }

}
