package bigtosmall;
import java.util.Scanner;
public class BigToSmall{
    public static void main(String args[]){
        Scanner input=new Scanner(System.in);
        System.out.print("Number 1: ");
        double number1=input.nextDouble();
        
        System.out.print("Number 2: ");
        double number2=input.nextDouble();
        
        System.out.print("Number 3: ");
        double number3=input.nextDouble();
        
        if(number1 !=number2 && number1 !=number3 && number2 !=number3){
            
            if(number1>number2 && number1>number3){
                
                if(number2>number3)
                    System.out.println(number1+">"+number2+">"+number3);
                
                else
                     System.out.println(number1+">"+number3+">"+number2);
            }
            
            else if(number2 >number1 && number2>number3){
                
                if(number1>number3)
                     System.out.println(number2+">"+number1+">"+number3);
                
                else
                     System.out.println(number2+">"+number3+">"+number1);
            }
            
            else{
                if(number1>number2)
                     System.out.println(number3+">"+number1+">"+number2);
                
                else
                     System.out.println(number3+">"+number2+">"+number1);
            }
        }
        
        else
            System.out.println("there is equality");
        
        
    }
}
