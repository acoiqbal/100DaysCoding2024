import java.util.Scanner;
public class Main {
    
    public static void main(String[] args) {
        int a, b;
        a = 65;
        b = 75;
        
        if (a >= 70 ) {
            System.out.println("nilai anda memenuhi");
        }else{
            System.out.println("nilai anda error");
        }
        
        if (b <= 70) {
            System.out.println("nilai anda tidak memenuhi");
        }else{
            System.out.println("nilai anda memenuhi");
        }
        
        System.out.println("----------------------");
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan nilai : ");
        int c = sc.nextInt();
        
        if (c >= 70){
            System.out.println("anda lulus");
        }else{
            System.out.println("anda tidak lulus");
        }
        
        System.out.print("Masukkan nilai : ");
        int d = sc.nextInt();
        
        if (d <= 70) {
            System.out.println("anda tidak lulus");
        }else{
            System.out.println("anda lulus");
        }
        
        sc.close();
    }
}
