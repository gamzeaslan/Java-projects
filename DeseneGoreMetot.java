package desenegoremetot;
import java.util.Scanner;
public class DeseneGoreMetot {
    // metot tanımı
    public static void desenMetot(int number){
        int number2=number;
        // sayı 0'dan büyükse 5 azalt
        while(number2>0){
            System.out.println(number2);// ilk yazdır sonra azalt(0 alınmaz)
            number2-=5;
            
        }
        // sayı 0 ise
        if(number2==0){
            // girilen sayıya kadar 5 arttır
            while(number2<=number){
                number2+=5;
                System.out.println(number2);// ilk artt
                
            }
          
    }
    }
    
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        System.out.print("Sayı: ");
        int number=sc.nextInt();
        desenMetot(number);
    }
       
        
    
}
