public class Main {
    
    public static void main(String[] args) {
        Short a, b, c, d, e;
        a = 3;
        b = 5;
        c = 8;
        d = 2;
        e = 7;
        
        System.out.println("Sebelum pertukaran");
        System.out.printf("A = %d.\n", a);
        System.out.printf("B = %d.\n", b);
        System.out.printf("C = %d.\n", c);
        System.out.printf("D = %d.\n", d);
        System.out.printf("D = %d.\n", e);
        System.out.println();
        
        Short f;
        f = a;
        a = b;
        b = c;
        c = d;
        d = e;
        e = f;
        
        System.out.println("Sesudah pertukaran");
        System.out.println("A = "+a);
        System.out.println("B = "+b);
        System.out.println("C = "+c);
        System.out.println("D = "+d);
        System.out.println("E = "+e);
        System.out.println();
        
        Short g = 2023;
        Short h = 2024;
        Short i = 2025;
        
        System.out.printf("tahun lalu yaitu tahun %d adalah tahun pertama saya masuk kuliah.\n",g);
        System.out.println("tahun ini yaitu "+ h +" saya sudah masuk semester 3.");
        System.out.print("dan tahun depan yaitu "+ i +" saya sudah masuk semester 4.");
        
    }

}
