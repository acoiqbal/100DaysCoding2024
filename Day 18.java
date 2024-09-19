package day.pkg4;

public class Day18 {

    public static void main(String[] args) {
        boolean a, b, c;
        a = 2 > 3;
        b = 5 < 3;
        c = 1 < 3;

        System.out.println("A = " + a);
        System.out.println("B = " + b);
        System.out.println("C = " + c);

        System.out.println("-------------");

        boolean d = 'A' == 'C';
        boolean e = 'B' == 'b';
        boolean f = 'C' != 'S';

        System.out.println("D = " + d);
        System.out.println("E = " + e);
        System.out.println("F = " + f);

        System.out.println("-------------");

        boolean g, h, i;
        g = 5 > 6;
        h = 'C' == 2;
        i = 4 < 5;

        System.out.printf("G = %b", g);
        System.out.println();
        System.out.printf("H = %b", h);
        System.out.println();
        System.out.printf("I = %b", i);
        System.out.println();

    }
}
