package harmonikseri;
import java.util.Scanner;
public class HarmonikSeri {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        System.out.print("Seri Boyutu: ");
        int seriBoyutu=sc.nextInt();
        double toplam=0;
        for(double i=1;i<=seriBoyutu;i++){
            toplam+=(1/i);
            
        }
        System.out.println(toplam);
            
    }
    
}
