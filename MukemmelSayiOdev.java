package mukemmelsayiodev;
import java.util.Scanner;
public class MukemmelSayiOdev {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Sayı: ");
        int toplam=0;
        int number=sc.nextInt();
        for(int i=1;i<number;i++){
            if(number%i==0){
                toplam+=i;
            }
        }
        if(number==toplam)
            System.out.println("Mükemmel Sayıdır");
        else
            System.out.println("Mükemmel Sayı Değildir");
    }
    
}
