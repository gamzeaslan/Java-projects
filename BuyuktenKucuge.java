package buyuktenkucuge;
import java.util.Scanner;
public class BuyuktenKucuge {
    public static void main(String[] args) {
       Scanner sc=new Scanner (System.in);
       System.out.print("1.Sayı: ");
       double number1=sc.nextDouble();
       System.out.print("2.Sayı: ");
       double number2=sc.nextDouble();
       System.out.print("3.Sayı: ");
       double number3=sc.nextDouble();
       // sayıların eşit olma durumu
       
       if(number1==number2){
           if(number2==number3)
               System.out.println("Hepsi eşit");
           else if(number3>number1){
               System.out.println(number3+">"+number2+"="+number1);
           }
           else if(number1>number3){
               System.out.println(number1+"="+number2+">"+number3);
           }
               
       }
       
       if(number3==number1){
           if(number3>number2){
               System.out.println(number3+"="+number1+">"+number2);
           }
           else if(number2>number3){
               System.out.println(number2+">"+number3+"="+number1);
           }
       }
       
       if(number2==number3){
           if(number2>number1){
               System.out.println(number2+"="+number3+">"+number1);
           }
           else if(number1>number2){
               System.out.println(number1+">"+number2+"="+number3);
           }
       }
       // sayıların eşit olmadığı durum
       if(number1>number2 && number1 >number3){
           if(number2>number3){
               System.out.println(number1+">"+number2+">"+number3);
           }
           else if(number3>number2){
               System.out.println(number1+">"+number3+">"+number2);
           }
           
       }
       if(number2>number3 && number2>number1){
           if(number3>number1){
               System.out.println(number2+">"+number3+">"+number1);
           }
           else if(number1>number3){
               System.out.println(number2+">"+number1+">"+number3);
           }
       }
       if(number3>number2 && number3>number1){
           if(number2>number1){
               System.out.println(number3+">"+number2+">"+number1);
           }
           else if(number1>number2){
               System.out.println(number3+">"+number1+">"+number2);
           }
       }
    }
    
}
