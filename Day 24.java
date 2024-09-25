public class Main {
    
    public static void main(String[] args) {
        Float a, b, c, d, e;
        a = 15.55657885F;
        b = 5.686579795F;
        c = 20.86857788F;
        d = 10.97645899F;
        e = 6.868321267F;
        
        System.out.printf("A = %.2f\n", a);
        System.out.printf("B = %.2f\n", b);
        System.out.printf("C = %.2f\n", c);
        System.out.printf("D = %.2f\n", d);
        System.out.printf("E = %.2f\n", e);
        System.out.println();
        
        Float f;
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
        
        System.out.println("--------------");
        System.out.printf("A = %.1f\n", a);
        System.out.printf("B = %.2f\n", b);
        System.out.printf("C = %.3f\n", c);
        System.out.printf("D = %.4f\n", d);
        System.out.printf("E = %.5f\n", e);
        System.out.println();
    }

          }
