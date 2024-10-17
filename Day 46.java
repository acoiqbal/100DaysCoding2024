import java.util.Scanner;
public class Main {
    
    public static void main(String[] args) {
        boolean a, b;
        a = false;
        b = true;
        
        boolean c =! a;
        boolean d =! b;

        System.out.println("hasil negasi dari A = " + c);
        System.out.println("hasil negasi dari B = " + d);
        
        System.out.println("----------------------");
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan true atau false = ");
        boolean e = sc.nextBoolean();
        
        boolean g =! e;
       
        System.out.println("Hasil negasi E = " + g);
        
        System.out.println("----------------------");
        System.out.print("Masukkan true atau false = ");
        boolean h = sc.nextBoolean();
        
        boolean j =! h;
       
        System.out.println("Hasil negasi dari H = " + j);
        
        sc.close();
    }
}
