package day.pkg4;

public class Day16 {

    public static void main(String[] args) {
        float A1, A2, A3, A4;
        float B1, B2, B3, B4;
       
        System.out.println();
        
        B1 = 7.7f;
        B2 = 6.4f;
        B3 = 3.3f;
        B4 = 5.5f;
        System.out.printf("Float B : B1 = %.1f, B2 = %.1f, B3 = %.1f, B4 = %.1f",B1, B2, B3, B4);
        System.out.println(); 
        
       System.out.println("---------------------------------");
        
        A1 = B1;
        A2 = B2;
        A3 = B3;
        A4 = B4;
        System.out.println("Float A setelah di update : A1 = "+A1+","+" A2 = "+A2+","+" A3 = "+A3+","+" A4 = "+A4);
        
        System.out.println("---------------------------------");
        
        B1 = 4f;
        B2 = 8f;
        B3 = 12f;
        B4 = 16f;
        float B5;
        System.out.println("Float B sebelum di shuffle : B1 = "+B1+","+" B2 = "+B2+","+" B3 = "+B3+","+" B4 = "+B4);
        
        B5 = B1;
        B1 = B3;
        B3 = B4;
        B4 = B2;
        B2 = B5;
        System.out.println("Float B sesudah di shuffle : B1 = "+B1+","+" B2 = "+B2+","+" B3 = "+B3+","+" B4 = "+B4);
                
    }
}
