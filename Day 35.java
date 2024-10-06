package day.pkg4;

import java.util.Scanner;

public class Day35 {

    public static void main(String[] args) {
        int a, b, c, d;
        a = 12;
        b = 5;
        int hasil1 = a + b;

        c = 17;
        d = 2;
        int hasil2 = c - d;

        System.out.println("hasil penjumlahan A dan B = " + hasil1);
        System.out.println("Hasil pengurangan C dan D = " + hasil2);
      
        System.out.println("----------------------");
        Scanner sc = new Scanner(System.in);

        System.out.print("2 + 3 = ");
        int g = sc.nextInt();

        System.out.print("10 - 5 = ");
        int h = sc.nextInt();

        System.out.println("Hasil 2 + 3 = " + g);
        System.out.println("Hasil 10 - 5 = " + h);
        
        sc.close();

    }
}
