import java.util.Scanner;
public class Main {
    
    public static void main(String[] args) {
       int a, b;
        a = 12;
        b = 10;

        a += 2;
        b -= 3;

        System.out.println("hasil penjumlahan A dan B = " + a);
        System.out.println("Hasil pengurangan C dan D = " + b);
      
        System.out.println("----------------------");
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan angka = ");
        int c = sc.nextInt();
        System.out.print("masukkan angka = ");
        int d = sc.nextInt();
        c += d;
       
        System.out.println("Hasil penjumlah A dan B = " + c);
        
        System.out.println("----------------------");
        System.out.print("Masukkan angka = ");
        int e = sc.nextInt();

        System.out.print("masukkan angka = ");
        int f = sc.nextInt();
        
        e -= f;
       
        System.out.println("Hasil penjumlah A dan B = " + e);
        
        sc.close();
    }
}

