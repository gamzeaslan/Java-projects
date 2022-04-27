package cinzodyagi;
import java.util.Scanner;
public class CinZodyagi {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        System.out.print("Doğum Yılı: ");
        int dogumYili=sc.nextInt();
        String cinZodyag[]={"Maymun","Horoz","Köpek","Domuz","Fare","Öküz","Kaplan","Tavşan","Ejderha","Yılan","At","Koyun"};
        int kalan=dogumYili%12;
        System.out.println("Çin Zodyağı: "+(cinZodyag[kalan]));
    }
    
    
}
