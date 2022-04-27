package havasicakliginagoreetkinlikonerme;
import java.util.Scanner;
public class HavaSicakliginaGoreEtkinlikOnerme {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        System.out.print("Hava Sicaklığı: ");
        double temperature=sc.nextDouble();
        if(temperature<-30){
            System.out.println("Hava çok soğuk , mümkün oldukça evden çıkmayınız");
        }
        else if(temperature<5){
            System.out.println("Kayağa gidebilirsiniz"); 
        }
        else if(temperature<15 && temperature>5){
            System.out.println("Sinemaya Gidebilirsiniz");
        }
        else if(temperature <25 && temperature>15){
            System.out.println("Pikniğe gidebilirsiniz");
        }
        else if(temperature>25 && temperature <50){
            System.out.println("Yüzmeye gidebilirsiniz");
        }
        else {
            System.out.println("Girdiğiniz hava sıcaklığında önerilen bir etkinlik yoktur");
        }
    }
    
}
