public class Main {
    
    public static void main(String[] args) {
        boolean a, b, c;
        a = 4 > 3;
        b = 5 < 8;
        c = 7 < 3;

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

        boolean j = true;
        boolean k = false;

        System.out.println("3 > 4 = " + k);
        System.out.println("2 < 5 = " + j);
        System.out.println();
        System.out.println("Sekian");
    }

}
