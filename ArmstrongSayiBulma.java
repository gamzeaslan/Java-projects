package armstrongsayibulma;
import java.util.Scanner;
public class ArmstrongSayiBulma {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Sayı: ");
        int basamakSayisi=1;
        int number =sc.nextInt();
        int number2=number;
        int number3=number;
        //ilk sayının basamak sayısını hesapla 
        // sonra basamaklarına ayır ve  üslerini alıp topla
        // son adım kontrol
        int toplam1=0;
        int toplam2=0;
        while(number>=10){
            int kalan=number%10;
            basamakSayisi++;
            number=number/10;   
        }
        while(number2>0){
             int kalan=number2%10;
             toplam2+=kalan;
            toplam1+=(int)Math.pow(kalan, basamakSayisi);
            number2=number2/10;
        }
        if(toplam1==number3){
            System.out.println("Armstrong Sayıdır");
        }
        else
            System.out.println("Armstrong Sayı Değildir");
        System.out.println("Girilen "+number3+ " sayısının basamaklarının toplamı: "+toplam2);
    }
    
    
}
