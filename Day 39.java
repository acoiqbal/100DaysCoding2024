import java.util.Scanner;
public class Main {
    
    public static void main(String[] args) {
       int a, b;
        a = 50;
        b = 45;

        a %= 9;
        b %= 2;

        System.out.println("hasil sisa bagi A = " + a);
        System.out.println("Hasil sisa bagi B = " + b);
      
        System.out.println("----------------------");
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan angka = ");
        int c = sc.nextInt();
        System.out.print("masukkan angka = ");
        int d = sc.nextInt();
        c %= d;
       
        System.out.println("Hasil sisa bagi C dan D = " + c);
        
        System.out.println("----------------------");
        System.out.print("Masukkan angka = ");
        int e = sc.nextInt();

        System.out.print("masukkan angka = ");
        int f = sc.nextInt();
        
        e /= f;
       
        System.out.println("Hasil pembagian E dan F = " + e);
        
        sc.close();
    }
}

