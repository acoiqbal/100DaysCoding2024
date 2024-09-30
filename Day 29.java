package day.pkg4;

import java.math.BigInteger;

public class Day29 {

    public static void main(String[] args) {
        BigInteger a = new BigInteger("88888888888");
        BigInteger b = new BigInteger("77777777777");
        BigInteger c = new BigInteger("33333333333");
        BigInteger d = new BigInteger("060904");
        BigInteger e = new BigInteger("7893451267");

        System.out.println("A = " + a);
        System.out.printf("B = %d\n", b);
        System.out.println("C = " + c);
        System.out.printf("D = %d\n", d);
        System.out.println("E = " + e);
        
        System.out.println("-----------------");
        
        BigInteger f;
        f = a;
        a = e;
        e = b;
        b = c;
        c = d; 
        d = f;
        
        System.out.println("A setelah di tukar = "+a);
        System.out.println("B setelah di tukar = "+b);
        System.out.println("C setelah di tukar = "+c);
        System.out.println("D setelah di tukar = "+d);
        System.out.println("E setelah di tukar = "+e);        
    }
}
