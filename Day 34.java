package day.pkg4;

import java.util.Scanner;

public class Day34 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Biodata saya");
        System.out.print("Silahkan masukkan nama anda : ");
        String a = sc.nextLine();

        System.out.print("Masukkan Nim anda : ");
        String b = sc.nextLine();

        System.out.print("Masukkan alamat anda : ");
        String c = sc.nextLine();

        System.out.print("Masukkan umur anda : ");
        int d = sc.nextInt();

        System.out.print("Masukkan tinggi anda : ");
        double e = sc.nextDouble();
        
        System.out.println("---------------------------");
        System.out.println("Nama anda adalah : " + a);
        System.out.println("Nim anda adalah : " + b);
        System.out.println("Alamat anda : " + c);
        System.out.println("Umur anda : " + d);
        System.out.println("Tinggi anda " + e);
        
        sc.close();
    }
}
