package metottsuzushesaplama;
import java.util.Scanner;
public class MetottsuzUsHesaplama {
    public static void main(String[] args) {
    Scanner sc=new Scanner (System.in);
    System.out.print("Taban: ");
    double taban=sc.nextDouble();
    System.out.print("Kuvvet: ");
    double kuvvet =sc.nextDouble();
    double carpim=1;
    for(int i=1;i<=kuvvet;i++){
        carpim*=taban;
    }
        System.out.println(taban+" üssü "+kuvvet+" değeri: "+carpim);
    }
    
}
