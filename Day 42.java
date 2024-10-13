import java.util.Scanner;
public class Main {
    
    public static void main(String[] args) {
        boolean a, b;
        a = 'A' == 'B';
        b = 5 != 2;

        System.out.println("hasil perbandingan A = " + a);
        System.out.println("Hasil perbandingan B = " + b);
      
        System.out.println("----------------------");
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan angka = ");
        int e = sc.nextInt();
        System.out.print("masukkan angka = ");
        int f = sc.nextInt();
        
        boolean g = e == f;
       
        System.out.println("apakah E sama dengan F = " + g);
        
        System.out.println("----------------------");
        System.out.print("Masukkan angka = ");
        int h = sc.nextInt();

        System.out.print("masukkan angka = ");
        int i = sc.nextInt();
        
        boolean j = h != i;
       
        System.out.println("apakah H Tidak sama dengan I = " + j);
        
        sc.close();
    }
}

          
