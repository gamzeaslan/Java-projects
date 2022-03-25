package taksimetrehesaplama;
import java.util.Scanner ;
public class TaksimetreHesaplama {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        System.out.print("Mesafe: ");
        double mesafe =sc.nextDouble();
        double ucret=10+mesafe*2.20;
        if(ucret<20)
            ucret=20;
        System.out.println(mesafe +"'de Ödenecek Tutar: "+ucret);
        
        
    }
    
}
