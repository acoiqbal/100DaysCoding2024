import java.util.Scanner;
public class Main {
    
    public static void main(String[] args) {
        System.out.println("perulangan while");
        int a = 10;
        while (a >= 1){
            System.out.println("angka : " + a);
            a--;
        }
        System.out.println();
        
        Scanner sc = new Scanner(System.in);
        int b;
        System.out.print("Masukkan angka : ");
        b = sc.nextInt();
        System.out.print("Masukkan angka : ");
        int c = sc.nextInt();
        
        while (b >= c){
            System.out.print(b + " ");
            b-=2;
        }
        System.out.println();
        System.out.println("inputan 2");
        System.out.print("Masukkan angka : ");
        int e = sc.nextInt();
        System.out.print("Masukkan angka : ");
        int f = sc.nextInt();
        
        while (e >= f){
            System.out.print(e + " ");
            e/=2;
        }
        System.out.println("Sekian dari saya");
        sc.close();
    }
}
