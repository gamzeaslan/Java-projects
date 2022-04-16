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
        // üçgenin çevresinin yarısını hesaplama
        double u=(kenar1+kenar2+kenar3)/2;
        //üçgenin alanının karesini hesaplama
        double ucgenAlan=u*(u-kenar1)*(u-kenar2)*(u-kenar3);
        // yukarıdaki değerin karekökünü alıp çıktı olarak verme
        System.out.println(kenar1+"-"+kenar2+"-"+kenar3+" kenarlarına sahip üçgenin alanı= "+Math.sqrt(ucgenAlan));
        
    }
    
}
