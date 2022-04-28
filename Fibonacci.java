
package fibonacci; 
import java.util.Scanner ;
public class Fibonacci{
    public static void main(String[] args) {
     int adedi;
        int sayi1=1;
        int sayi2=1;
        Scanner klavye =new Scanner (System.in);
        System.out.print("bir tamsayı değeri giriniz= ");
        adedi=klavye.nextInt();
        System.out.println("1");
        System.out.println("1");
        for( int i=1;i<=adedi-2;i++){
            int toplam =sayi1+sayi2;
            System.out.println(toplam);
            sayi1=sayi2;
            sayi2=toplam;
        }
    }
    
}
