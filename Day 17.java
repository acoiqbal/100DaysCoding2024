package day.pkg4;

public class Day17 {

    public static void main(String[] args) {
        char a, b, c, d, e, f, g, h, i;
        a = 'a';
        b = 'b';
        c = 'c';
        d = 'd';
        e = 'e';
        f = 'f';
        g = 'g';
        h = 'h';
        i = 'i';
        System.out.printf("Char : %C, %C, %C, %C, %C, %C, %C, %C, %C",a, b, c, d, e, f, g, h, i);
        System.out.println();
        System.out.println("--------------------------");
        
        char j = '4';
        char k = '7';
        char l = '3';
        char m = '9';
        char n = '5';
        char o;
        System.out.println("char Angka : "+j+","+k+","+l+","+m+","+n);
        
        System.out.println("--------------------------");
         
        o = j;
        j = m;
        m = k;
        k = l;
        l = n;
        n = o;
        
        System.out.print("char Angka sesudah di shuffle : "+j+","+k+","+l+","+m+","+n);
        System.out.println();
        
    }
}
