package gelismishesapmakinesi;
import java.util.Scanner;
public class GelismisHesapMakinesi {
    public static void toplama(double number1,double number2){
        System.out.println(number1+"+"+number2+"= "+(number1+number2));
    }
    public static void cikarma(double number1,double number2){
        System.out.println(number1+"-"+number2+"="+(number1-number2));
    }
    public static void carpma(double number1,double number2){
        System.out.println(number1+"*"+number2+"= "+(number1*number2));
    }
    public static void bolme(double number1,double number2){
        System.out.println(number1+"/"+number2+"="+(double)(number1/number2));
    }
    public static void usAlma(double taban,int kuvvet){
        int carpma=1;
        for(int i=1;i<=kuvvet;i++){
            carpma*=taban;
        }
        System.out.println(taban+" üssü "+kuvvet+"="+carpma);
    }
    public static void faktoriyel(int number){
        if(number==0){
            System.out.println("0!=1");
        }
        int carpma=1;
        for(int i=1;i<=number;i++){
           carpma *=i; 
        }
        if(number !=0)
            System.out.println(number+"!= "+carpma);
    }
    public static void modAlma(int number1,int number2){
        System.out.println(number1+"'in "+number2+"'ye göre modu: "+(number1%number2));
    }
    public static void diktorgenAlanVeCevre(double kisaKenar,double uzunKenar){
        System.out.println("Dikdörtgenin alanı : "+(uzunKenar*kisaKenar));
        System.out.println("Dikdörgenin çevresi: "+(2*(uzunKenar+kisaKenar)));
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("1-Toplama İşlemi\n2-Çıkarma İşlemi\n3-Çarpma İşlemi\n4-Bölme İşlemi\n5-Üs Alma\n"
                + "6-Faktöriyel Hesaplama\n7-Mod Alma\n8-Dikdörtgen Alan Ve Çevre Hesabı\nLütfen İşlen Numaranızı Giriniz: ");
        int islemNo=sc.nextInt();
        switch(islemNo){
            case 1:
                System.out.println("Toplama İşlemini Seçtiniz");
                System.out.print("1.Sayı: ");
                double number1=sc.nextDouble();
                System.out.print("2.Sayı: ");
                double number2=sc.nextDouble();
                toplama(number1,number2);
                
                break;
            case 2 :
                System.out.println("Çıkarma İşlemini Seçtiniz");
                System.out.print("1.Sayı: ");
                number1=sc.nextDouble();
                System.out.print("2.Sayı: ");
                number2=sc.nextDouble();
                cikarma(number1,number2);
                break;
            case 3:
                System.out.println("Çarpma İşlemini Seçtiniz");
                System.out.print("1.Sayı: ");
                number1=sc.nextDouble();
                System.out.print("2.Sayı: ");
                number2=sc.nextDouble();
                carpma(number1,number2);
                break;
            case 4:
                System.out.println("Bölme İşlemini Seçtiniz");
                System.out.print("1.Sayı: ");
                number1=sc.nextDouble();
                System.out.print("2.Sayı: ");
                number2=sc.nextDouble();
                bolme(number1,number2);
                break;
            case 5:
                System.out.println("Üs Alma İşlemini Seçtiniz");
                System.out.print("Taban: ");
                double taban=sc.nextDouble();
                System.out.print("Kuvvet: ");
                 int kuvvet =sc.nextInt();
                usAlma(taban, kuvvet);
                break;
            case 6:
                System.out.println("Faktöriyel Hesaplamayı Seçtiniz");
                System.out.print("Fakötiyeli Alınacak Sayı: ");
                int number=sc.nextInt();
                faktoriyel(number);
                break;
            case 7:
                System.out.println("Mod Alma İşlemini seçtiniz");
                System.out.print("Modu Alınacak İfade: ");
                int moduAlinan=sc.nextInt();
                System.out.println("Hangi Sayıya Göre modu Alınacak: ");
                int moduAlan=sc.nextInt();
                modAlma(moduAlinan, moduAlan);
                break;
            case 8:
                System.out.println("Dikdörtgen Alan Ve Çevre Hesaplama İşlemini Seçtiniz");
                System.out.print("Uzun Kenar: ");
                double uzunKenar=sc.nextDouble();
                System.out.print("Kısa Kenar: ");
                double kisaKenar=sc.nextDouble();
                diktorgenAlanVeCevre(kisaKenar,uzunKenar);
                break;
            default:
                System.out.println("Geçersiz işlem numarası girdiniz");
        }
        
    }
    
}
