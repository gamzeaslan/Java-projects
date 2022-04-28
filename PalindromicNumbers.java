package palindromicnumbers;
import java.util.Scanner;
public class PalindromicNumbers{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Sayı: ");
        int number=sc.nextInt();
        int number2=number;
        int newNumber=0;
        while(number>0){
            int kalan=number%10;
            newNumber=newNumber*10+kalan;
            number=number/10;
        }
        if(number2==newNumber)
            System.out.println("Polindromik sayıdır");
        else
            System.out.println("Polindromik değildir");
    }
    
}