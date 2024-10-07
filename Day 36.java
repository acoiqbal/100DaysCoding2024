import java.util.Scanner;

public class Day36 {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        
        System.out.print("Masukkan inputan : ");
        int a = sc.nextInt();
        
        String b = "";
        
        for (int i = 0; i < 8; i++) {
          b = a % 2 + b;
          a = a / 2;
        }
        
        System.out.println("hasil konversi binary = " + b);
        
        System.out.print("masukkkan inputan : ");
        int c = sc.nextInt();
        
        System.out.println("hasil 77% dari = " + c + " adalah : " + (c * 0.77) );
        
        sc.close();
    }
}
