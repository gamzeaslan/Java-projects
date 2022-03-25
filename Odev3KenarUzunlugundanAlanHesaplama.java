package odev3kenaruzunlugundanalanhesaplama;
import java.util.Scanner;
public class Odev3KenarUzunlugundanAlanHesaplama {
    public static void main(String[] args) {
        // Üçgenin Kenar Uzunluklarını Kullanıcıdan Alma
        Scanner sc=new Scanner (System.in);
        System.out.print("1.Kenar: ");
        double kenar1=sc.nextDouble();
        System.out.print("2.Kenar: ");
        double kenar2=sc.nextDouble();
        System.out.print("3.Kenar: ");
        double kenar3=sc.nextDouble();
        double u=(kenar1+kenar2+kenar3)/2;
        double ucgenAlan=u*(u-kenar1)*(u-kenar2)*(u-kenar3);
        System.out.println(kenar1+"-"+kenar2+"-"+kenar3+" kenarlarına sahip üçgenin alanı= "+Math.sqrt(ucgenAlan));
        
    }
    
}
