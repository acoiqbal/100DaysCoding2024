import java.util.Scanner;
public class Main {
    
    public static void main(String[] args) {
       int a, b;
        a = 12;
        b = 10;

        a += 2;
        b -= 3;

        System.out.println("hasil penjumlahan A = " + a);
        System.out.println("Hasil pengurangan B = " + b);
      
        System.out.println("----------------------");
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan angka = ");
        int c = sc.nextInt();
        System.out.print("masukkan angka = ");
        int d = sc.nextInt();
        c += d;
       
        System.out.println("Hasil penjumlah C dan D = " + c);
        
        System.out.println("----------------------");
        System.out.print("Masukkan angka = ");
        int e = sc.nextInt();

        System.out.print("masukkan angka = ");
        int f = sc.nextInt();
        
        e -= f;
       
        System.out.println("Hasil pengurangan E dan F = " + e);
        
        sc.close();
    }
}

