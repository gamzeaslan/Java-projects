package hesapmakinesi;
import java.util.Scanner;
public class HesapMakinesi {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        System.out.print("1.Sayı: ");
        double sayi1=sc.nextDouble();
        System.out.print("2.Sayı: ");
        double sayi2=sc.nextDouble();
        System.out.println("1:Toplama\n2:Çıkarma\n3:Çarpma\n4:Bölma\nİşlem No: ");
        int islemNo=sc.nextInt();
        switch(islemNo){
            case 1:
                System.out.println("Toplama: "+(sayi1+sayi2));
                break;
            case 2:
                System.out.println("Çıkarma: "+(sayi1-sayi2));
                break;
                case 3:
                System.out.println("Çarpma: "+(sayi1*sayi2));
                break;
                case 4:
                System.out.println("Bölme: "+(sayi1/sayi2));
                break;
                
        }
    }
    
}
