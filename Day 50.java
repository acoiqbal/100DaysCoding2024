import java.util.Scanner;
public class Main {
    
    public static void main(String[] args) {
        int a, b;
        a = 65;
        b = 75;
        
        if (a >= 70 ) {
            System.out.println("nilai anda memenuhi");
        }else if (a == 65){
            System.out.println("nilai anda error");
        }else{
            System.out.println("inputan error");
        }
        
        if (b <= 70) {
            System.out.println("nilai anda tidak memenuhi");
        }else if (b == 75){
            System.out.println("nilai anda memenuhi");
        }else{
            System.out.println("inputan error");
        }
        
        System.out.println("----------------------");
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan nilai : ");
        int c = sc.nextInt();
        
        if (c >= 70 && c <= 100){
            System.out.println("anda lulus");
        }else if (c <= 70 && c >= 30){
            System.out.println("anda tidak lulus");
        }else{
            System.out.println("error");
        }
        
        sc.close();
    }
}
