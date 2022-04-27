package atmprojesi;
import java.util.Scanner;
public class ATMProjesi {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       int denemeSayisi=3;
       double bakiye =1234.34;
       while(denemeSayisi>0){
           
           System.out.print("Kullanıcı Adı: ");
           String username =sc.nextLine();
           System.out.print("Şifre: ");
           String password=sc.nextLine();
           if(username.equals("code")&& password.equals("1234")){
         System.out.println("Hoşgeldiniz");
        System.out.print("1-Kartla İşlem\n2-Kartsız işlem\nİşlem no: ");
        int islemNo1=sc.nextInt();
        switch(islemNo1){
            case 1:
                System.out.println("Kartlı İşlemi Seçtiniz\nLütfen Kartınızı takınız\n1-Para Yatırma\n2-Para Çekme\n3-Bakiye Sorgulama\nÇıkış\nişlem no");
                int islemNo2=sc.nextInt();
                switch(islemNo2){
                    case 1:
                        System.out.println("Para Yatırma İşlemini Seçtiniz\nLütfen Yatırılacak Miktarı Giriniz: ");
                        double yatirilanPara=sc.nextDouble();
                        bakiye+=yatirilanPara;
                        System.out.println("Para Yatırma İşlemi Başarılı\nMevcut Bakiyeniz: "+bakiye);
                        
                        break;
                    case 2:
                        System.out.println("Para Çekme İşlemini Seçtiniz\nLütfen çekilecek miktarı giriniz: ");
                        double cekilecekPara=sc.nextDouble();
                        if(cekilecekPara>bakiye)
                            System.out.println("Yetersiz Bakiye\nLütfen mevcut bakiyeyi aşmıyacak miktar giriniz");
                        else{
                            bakiye-=cekilecekPara;
                            System.out.println("Para çekme başarılı\nMevcut bakiyeniz: "+bakiye);
                        }
                        break;
                    case 3:
                        System.out.println("Bakiye sorgulamayı seçtiniz\nMevcut bakiyeniz: "+bakiye);
                        break;
                    case 4:
                        System.out.println("Hoşçakalın");
                        break;
                    default:
                        System.out.println("Yanlış Tuşlama");
                       
                }
                break;
            case 2:
                System.out.println("Kartsız işlemi seçtiniz");
                break;
        }
        break;
           }
           
           else{
               denemeSayisi--;
               System.out.println("Lütfen tekrar deneyiniz");
               if(denemeSayisi==0)
               System.out.println("Hesap bloke oldu");
       
       else 
       System.out.println("kalan deneme hakkınız: "+denemeSayisi);
           }
           
       
       }
    }
  
    }
    

