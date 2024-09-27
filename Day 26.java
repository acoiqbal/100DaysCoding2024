public class Main {
    
    public static void main(String[] args) {
        Character a, b, c, d, e;
        a = 'a' ;
        b = 'b';
        c = 'c';
        d = 'd';
        e = 'e';
        
        System.out.printf("A = %C\n", a);
        System.out.printf("B = %C\n", b);
        System.out.printf("C = %C\n", c);
        System.out.printf("D = %C\n", d);
        System.out.printf("E = %C\n", e);
        System.out.println();
        
        Character f;
        f = a;
        a = e;
        e = d;
        d = c;
        c = b;
        b = f;
        
        System.out.println("--------------");
        System.out.printf("A = %c\n", a);
        System.out.println("B = "+b);
        System.out.println("C = "+c);
        System.out.printf("D = %c\n", d);
        System.out.println(String.format("E = %c",e));
        
    }

}
