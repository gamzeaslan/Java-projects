package odev1notortalamasi;
import java.util.Scanner;
public class Odev1NotOrtalamasi {
    public static void main(String[] args) {
       Scanner sc=new Scanner (System.in);
       
       // fizik notlarının kullanıcıdan alınması
       System.out.print("Fizik 1.Sınav= ");
        int fizikNot1= sc.nextInt();
       System.out.print("Fizik 2.Sınav= ");
        int fizikNot2= sc.nextInt();
        
        // fizik ortalmasınının hesaplanması
        double fizikNotOrtalamasi=(fizikNot1+fizikNot2)/2;
        String fizikCikti=(fizikNotOrtalamasi>60) ? "Sınıfı Geçti":"Sınıfı Kaldı";
        System.out.println("Fizikten :"+fizikCikti);
        
        System.out.println("-----------------");
        
        // matematik notlarının kullanıcıdan alınması
       System.out.print("matematik 1.Sınav= ");
        int matematikNot1= sc.nextInt();
       System.out.print("matematik 2.Sınav= ");
        int matematikNot2= sc.nextInt();
        
        
        // matematik ortalmasınının hesaplanması
        double matematikNotOrtalamasi=(matematikNot1+matematikNot2)/2;
        String matematikCikti=(matematikNotOrtalamasi>60) ? "Sınıfı Geçti":"Sınıfı Kaldı";
        System.out.println("matematik :"+matematikCikti);
        
          System.out.println("-----------------");
        
          
        // kimya notlarının kullanıcıdan alınması
       System.out.print("kimya 1.Sınav= ");
        int kimyaNot1= sc.nextInt();
       System.out.print("kimya 2.Sınav= ");
        int kimyaNot2= sc.nextInt();
        
        // kimya ortalmasınının hesaplanması
        double kimyaNotOrtalamasi=(kimyaNot1+kimyaNot2)/2;
        String kimyaCikti=(kimyaNotOrtalamasi>60) ? "Sınıfı Geçti":"Sınıfı Kaldı";
        System.out.println("kimya :"+kimyaCikti);
        
        System.out.println("-----------------");
        
        // muzik notlarının kullanıcıdan alınması
       System.out.print("muzik 1.Sınav= ");
        int muzikNot1= sc.nextInt();
       System.out.print("muzik 2.Sınav= ");
        int muzikNot2= sc.nextInt();
        
        // muzik ortalmasınının hesaplanması
        double muzikNotOrtalamasi=(muzikNot1+muzikNot2)/2;
        String muzikCikti=(muzikNotOrtalamasi>60) ? "Sınıfı Geçti":"Sınıfı Kaldı";
        System.out.println("muzik:"+muzikCikti);
        
         System.out.println("-----------------");
         
        // tarih notlarının kullanıcıdan alınması
       System.out.print("tarih 1.Sınav= ");
        int tarihNot1= sc.nextInt();
       System.out.print("tarih 2.Sınav= ");
        int tarihNot2= sc.nextInt();
        
        // fizik ortalmasınının hesaplanması
        double tarihNotOrtalamasi=(tarihNot1+tarihNot2)/2;
        String tarihCikti=(tarihNotOrtalamasi>60) ? "Sınıfı Geçti":"Sınıfı Kaldı";
        System.out.println("tarih :"+tarihCikti);
        
         System.out.println("-----------------");
         
        // turkce notlarının kullanıcıdan alınması
       System.out.print("turkce 1.Sınav= ");
        int turkceNot1= sc.nextInt();
       System.out.print("turkce 2.Sınav= ");
        int turkceNot2= sc.nextInt();
        
        // fizik ortalmasınının hesaplanması
        double turkceNotOrtalamasi=(turkceNot1+turkceNot2)/2;
        String turkceCikti=(turkceNotOrtalamasi>60) ? "Sınıfı Geçti":"Sınıfı Kaldı";
        System.out.println("turkce :"+turkceCikti);
    }
    
}
