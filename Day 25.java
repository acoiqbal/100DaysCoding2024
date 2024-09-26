public class Main {
    
    public static void main(String[] args) {
        Double a, b, c, d, e;
        a = 7.55657885;
        b = 5.686579795;
        c = 2.86857788;
        d = 9.97645899;
        e = 6.868321267;
        
        System.out.printf("A = %.1f\n", a);
        System.out.printf("B = %.1f\n", b);
        System.out.printf("C = %.1f\n", c);
        System.out.printf("D = %.1f\n", d);
        System.out.printf("E = %.1f\n", e);
        System.out.println();
        
        Double f;
        f = a;
        a = e;
        e = d;
        d = c;
        c = b;
        b = f;
        
        System.out.println("--------------");
        System.out.printf("A = %.2f\n", a);
        System.out.println(String.format("B = %.2f",b));
        System.out.println(String.format("C = %.2f",c));
        System.out.printf("D = %.2f\n", d);
        System.out.println(String.format("E = %.2f",e));
        
    }

}
