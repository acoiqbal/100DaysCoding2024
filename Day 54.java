package day.pkg4;

import java.util.Scanner;

public class Day54 {

    public static void main(String[] args) {
        System.out.println("perulangan for increment");

        for (int i = 0; i < 10; i++) {
            System.out.println("Angka : " + i);
        }
        System.out.println("--------------------------");
        for (int i = 1; i <= 10; i *= 2) {
            System.out.println("Angka : " + i);
        }
        System.out.println();
        
        Scanner sc = new Scanner(System.in);
        System.out.println("perulangan for increment menggunakan Scanner");
        
        int a, b;
        System.out.print("Masukkan input : ");
        a = sc.nextInt();
        System.out.print("Masukkan angka : ");
        b = sc.nextInt();

        for (int i = a; i < b; i+=2) {
            System.out.println("Angka : " + i);
        }
        sc.close();
    }

}
