import java.util.Scanner;
public class Main {
    
    public static void main(String[] args) {
        System.out.println("perulangan for");
        for (int i = 10; i >= 1; i--) {
            System.out.print(i);
        }
        System.out.println();
        
        Scanner sc = new Scanner(System.in);
        int b;
        System.out.print("Masukkan angka : ");
        b = sc.nextInt();
        System.out.print("Masukkan angka : ");
        int c = sc.nextInt();
        
        for (int i = b; i >= c; i--) {
            System.out.println(i);
          
        }
        System.out.println();
        System.out.println("inputan 2");
        System.out.print("Masukkan angka : ");
        int e = sc.nextInt();
        System.out.print("Masukkan angka : ");
        int f = sc.nextInt();
        
        for (int i = e; i >= f; i-=2) {
               System.out.println(i);
        }     
        System.out.println("Sekian dari saya");
        sc.close();
    }
}
