public class Main {
    
    public static void main(String[] args) {
        int a = 1234;
        byte b = 125;
        short c = 127;
        long d = 4567;
        
        double e = 12.3;
        float f = 45.6f;
        
        String g = "true";
        
        long i = (long) a;
        int j = (int) d;
        byte k = (byte) c;
        short l = (short) b;
        
        float m = (float) e;
        double n = (double) f;
            
        boolean o = Boolean.parseBoolean(g);
        
        // Menampilkan hasil type casting
        System.out.println("A = " + i );
        System.out.println("B = " + j);
        System.out.println("C = " + k);
        System.out.println("D = " + l);
        
        System.out.println("E = " + m);
        System.out.println("F = " + n);
        
        System.out.println("G = " + o);
        
        System.out.println("Sekian");
    }
}

