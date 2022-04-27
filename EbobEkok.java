package ebobekok;
import java.util.Scanner;
public class EbobEkok {
    public static void main(String[] args) {
        // sayıların girişi
        Scanner sc=new Scanner(System.in);
        System.out.print("1.Sayı: ");
        int number1=sc.nextInt();
        System.out.print("2.Sayı: ");
        int number2=sc.nextInt();
        
        int ebob=1;//aralarında asal olurlarsa ebob=1 olur
        System.out.println("Bu iki sayını ebobunu hesaplama");
        if(number1>number2){
            for(int i=1;i<=number2;i++){
                if(number1%i==0 && number2%i==0)
                    ebob=i;
            }
        }
        else {
            for(int i=1;i<=number1;i++){
                if(number1%i==0 && number2%i==0)
                    ebob=i;
            }
        }
        System.out.println(number1+"- "+number2+" ebobu: "+ebob);
        
        System.out.println("Bu iki sayının ekokunu hesaplama");
        int ekok=number1*number2;// sayılar aralarında asal olursa ekoku sayıların çarpımıdır
        for(int i=1;i<=ekok;i++){
            if(i%number1==0 && i%number2==0){
                ekok=i;
                break;// devam ederse sayıların çarpımına eşit olur
            }
                
        }
        System.out.println(number1+"- "+number2+" ekoku: "+ekok);
        
    }
    
}
