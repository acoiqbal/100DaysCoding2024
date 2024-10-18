import java.util.Scanner;
public class Main {
    
    public static void main(String[] args) {
        int a, b;
        a = 80;
        b = 60;
        
        if (a >= 70) {
            System.out.println("nilai anda memenuhi");
        }
        
        if (b <= 70) {
            System.out.println("nilai anda tidak memenuhi");
        }
        
        System.out.println("----------------------");
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan nilai : ");
        int c = sc.nextInt();
        
        if (c >= 70){
            System.out.println("anda lulus");
        }
        
        System.out.print("Masukkan nilai : ");
        int d = sc.nextInt();
        
        if (d <= 70) {
            System.out.println("anda tidak lulus");
        }
        
        sc.close();
    }
}

