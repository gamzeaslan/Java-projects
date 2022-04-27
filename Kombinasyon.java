package kombinasyon;
import java.util.Scanner;
public class Kombinasyon {
    public static int faktoriyelMetot(int number){
        int carpim=1;
      for(int i=1;i<=number;i++)
          carpim *=i;
        return carpim;
    }
    public static void main(String[] args) {
      // kullanıcıdan n ve r'yi aldır
      Scanner sc=new Scanner (System.in);
      System.out.print("N: ");
      int n=sc.nextInt();
        System.out.print("R: ");
        int r=sc.nextInt();
        int kombinasyon=faktoriyelMetot(n)/(faktoriyelMetot(r)*faktoriyelMetot(n-r));
        System.out.println(n+"'in "+r+"'li kombinasyonu: "+kombinasyon);
    }
    
}
