package manavkasaprogrami;
import java.util.Scanner;
public class ManavKasaProgrami {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Armut kilo:");
        double armutKilo=sc.nextDouble();
        
        System.out.print("Elma kilo:");
        double elmaKilo=sc.nextDouble();
        
        System.out.print("Domates kilo:");
        double domatesKilo=sc.nextDouble();
        
        System.out.print("Muz kilo:");
        double muzKilo=sc.nextDouble();
        
        System.out.print("Patlıcan kilo:");
        double patlicanKilo=sc.nextDouble();
        
        final double armutFiyat=2.14;
        final double elmaFiyat=3.67;
        final double domatesFiyat=1.11;
        final double muzFiyat=0.95;
        final double patlicanFiyat=5.00;
        
        double toplamFiyat=elmaKilo*elmaFiyat+armutKilo*armutFiyat+domatesKilo*domatesFiyat+muzKilo*muzFiyat+patlicanKilo*patlicanFiyat;
        System.out.println("Toplam Alışveriş Tutarı: "+toplamFiyat);
        
        
    }
    
}
