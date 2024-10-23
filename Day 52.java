package day.pkg4;
import java.util.Scanner;
public class Day52 {

    public static void main(String[] args) {
        int a = 75;
        String c = (a > 70) ? "nilai memenuhi" : "nilai tidak memenuhi";
        System.out.println("nilai : " + a);
        System.out.println("status : " + c);

        int b = 55;
        String d = (b > 70) ? "nilai memenuhi" : "nilai tidak memenuhi";
        System.out.println("nilai : " + b);
        System.out.println("status : " + d);
        System.out.println();
        
        Scanner sc = new Scanner(System.in);

        System.out.println("inputan nilai\n");

        System.out.print("masukkan nama siswa : ");
        String e = sc.nextLine();
        System.out.print("masukkan nilai : ");
        int f = sc.nextInt();

        String g = (f > 70 && f < 100) ? "lulus" : "tidak lulus";

        System.out.println();
        System.out.println("nama siswa : " + e);
        System.out.println("status : " + g);

        sc.close();

    }

}
