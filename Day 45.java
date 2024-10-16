import java.util.Scanner;
public class Main {
    
    public static void main(String[] args) {
        boolean a, b;
        a = false;
        b = true;
        
        boolean c = a || b;

        System.out.println("hasil A dan B = " + c);
        
        System.out.println("----------------------");
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan true atau false = ");
        boolean e = sc.nextBoolean();
        System.out.print("masukkan true atau false = ");
        boolean f = sc.nextBoolean();
        
        boolean g = e || f;
       
        System.out.println("Hasil E dan F = " + g);
        
        System.out.println("----------------------");
        System.out.print("Masukkan true atau false = ");
        boolean h = sc.nextBoolean();

        System.out.print("masukkan true atau false = ");
        boolean i = sc.nextBoolean();
        
        boolean j = h || i;
       
        System.out.println("Hasil H dan I = " + j);
        
        sc.close();
    }
}

