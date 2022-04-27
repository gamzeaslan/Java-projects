package ucakbiletihesaplama;
import java.util.Scanner;
public class UcakBiletiHesaplama {
    public static void main(String[] args) {
       Scanner sc=new Scanner (System.in);
       System.out.print("Mesafe(km türünden) : ");
       double mesafe=sc.nextDouble();
       double indirimsizUcret=mesafe*0.10;
        System.out.print("Yaş: ");
        int yas=sc.nextInt();
        System.out.println("Lütfen yolculuk tipini seçiniz");
        System.out.print("1-Tek Yön\n2-Çift Yön\nHangi tip: ");
        int number=sc.nextInt();
        
        if(number ==1)
        {
            if(yas<12){
                System.out.println("Ucret: "+(indirimsizUcret-indirimsizUcret*0.5));
            }
            else if(yas>=12 && yas<24){
                System.out.println("Ucret: "+(indirimsizUcret-indirimsizUcret*0.1));
            }
            else if(yas>=65){
                System.out.println("Ucret: "+(indirimsizUcret-indirimsizUcret*0.2));
            }
        }
        else if(number==2){
            if(yas<12){
                System.out.println("Ucret: "+(indirimsizUcret-indirimsizUcret*0.7));
            }
            else if(yas>=12 && yas<24){
                System.out.println("Ucret: "+(indirimsizUcret-indirimsizUcret*0.3));
            }
            else if(yas>=65){
                System.out.println("Ucret: "+(indirimsizUcret-indirimsizUcret*0.4));
            }
        }
    }
    
}
