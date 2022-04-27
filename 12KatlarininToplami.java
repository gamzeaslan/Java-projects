package 12katlarinintoplami;
import java.util.Scanner;
public class 12KatlarininToplami {
    public static void main(String[] args) {
       Scanner sc=new Scanner (System.in);
       System.out.print("Sayı: ");
       int number=sc.nextInt();
       int toplam=0;
       for(int i=0;i<=number;i++){
           if(i%12==0)
               toplam +=i;
       }
        System.out.println(toplam);
    }
    
}
