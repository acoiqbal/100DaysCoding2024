public class Main {
    
    public static void main(String[] args) {
        Long a, b, c, d, e;
        a = 15L;
        b = 5L;
        c = 20L;
        d = 10L;
        e = 6L;
        
        System.out.printf("A = %d.\n", a);
        System.out.printf("B = %d.\n", b);
        System.out.printf("C = %d.\n", c);
        System.out.printf("D = %d.\n", d);
        System.out.printf("E = %d.\n", e);
        System.out.println();
        
        Long f;
        f = a;
        a = e;
        e = d;
        d = c;
        c = b;
        b = f;
        
        System.out.println("--------------");
        System.out.printf("A = %d\n", a);
        System.out.println("B = "+b);
        System.out.println("C = "+c);
        System.out.printf("D = %d\n", d);
        System.out.println("E = "+e);
        
        System.out.println("--------------");
        System.out.println("A = "+(a + 7));
        System.out.println("B = "+(b - 6));
        System.out.println("C = "+(c * 5));
        System.out.println("D = "+(d / 2));
        System.out.println("E = "+(e % 3));
        System.out.println();
    }

}
