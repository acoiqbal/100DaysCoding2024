import java.util.Scanner;
public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String a;
        System.out.println("inputan nilai :");
        
        System.out.println("nama siswa : andi, budi, evi, rara, rudi, rizki");
        System.out.print("masukkan nama siswa : ");
        a = sc.nextLine();
        
        switch (a){
            case "andi":
            System.out.println("nilai = 100");
            break;
            case "budi":
            System.out.println("nilai = 90");
            break;
            case "evi":
            System.out.println("nilai = 80");
            break;
            case "rara":
            System.out.println("nilai = 70");
            break;
            case "rudi":
            System.out.println("nilai = 60");
            break;
            case "rizki":
            System.out.println("nilai = 50");
            break;
        }
       
        sc.close();
    }
}
