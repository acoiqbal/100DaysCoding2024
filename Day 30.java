import java.math.BigDecimal;
public class Main {
    
    public static void main(String[] args) {
        BigDecimal a = new BigDecimal("10.69");
        BigDecimal b = new BigDecimal("67.90");
        BigDecimal c = new BigDecimal("76.54");
        BigDecimal d = new BigDecimal("55.66");
        BigDecimal e = new BigDecimal("77.44");

        System.out.println("A = " + a);
        System.out.printf("B = %.2f\n", b);
        System.out.println("C = " + c);
        System.out.printf("D = %.2f\n", d);
        System.out.println("E = " + e);
        
        System.out.println("-----------------");
        
        BigDecimal f;
        f = a;
        a = e;
        e = b;
        b = c;
        c = d; 
        d = f;
        
        System.out.println("A = "+a);
        System.out.println("B = "+b);
        System.out.println("C = "+c);
        System.out.println("D = "+d);
        System.out.println("E = "+e);
    }

}
