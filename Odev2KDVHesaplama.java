package odev2kdvhesaplama;
import java.util.Scanner;
public class Odev2KDVHesaplama {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        System.out.print("Alinan Miktar= ");
        double alinanMiktar=sc.nextDouble();
       double kdvOrani=(alinanMiktar>1000) ? 0.08 :0.18;
       double kdvliFiyat= alinanMiktar+kdvOrani*alinanMiktar;
       System.out.println("KDV'li Fiyat= "+kdvliFiyat);
        
    }
    
}
