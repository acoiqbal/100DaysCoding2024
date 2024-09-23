public class Main {
    
    public static void main(String[] args) {
        Integer a, b, c, d, e;
        a = 40;
        b = 10;
        c = 25;
        d = 38;
        e = 30;
        
        System.out.printf("A = %d.\n", a);
        System.out.printf("B = %d.\n", b);
        System.out.printf("C = %d.\n", c);
        System.out.printf("D = %d.\n", d);
        System.out.printf("E = %d.\n", e);
        System.out.println();
        
        Integer f;
        f = a;
        a = c;
        c = f;
        
        System.out.println("--------------");
        System.out.printf("A = %d\n", a);
        System.out.print("B = "+b);
        System.out.println("\nC = "+c);
        System.out.printf("D = %d\n", d);
        System.out.println("E = "+e);
        
        System.out.println("--------------");
        System.out.println("A = "+(a + 5));
        System.out.println("B = "+(b - 6));
        System.out.println("C = "+(c - 8));
        System.out.println("D = "+(d - 3));
        System.out.println("E = "+(e + 4));
        System.out.println();
    }

}
