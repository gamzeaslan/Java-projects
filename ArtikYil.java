package artikyil;
import java.util.Scanner;
public class ArtikYil {
    public static void main(String[] args) {
       Scanner sc=new Scanner (System.in);
       System.out.print("Yıl: ");
        int year=sc.nextInt();
        if(year%4==0){
            if(year%100==0){
                if(year%400==0){
                    System.out.println("Artık Yıldır");
                }
                else 
                    System.out.println("Artık Yıl Değildir");
            }
            else 
                System.out.println("Artık Yıldır");
        }
        else 
            System.out.println("Artık Yıl Değilidr");
    }
    
}
