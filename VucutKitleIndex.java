package vucutkitleındex;
import java.util.Scanner;
public class VucutKitleIndex {
    public static void main(String[] args) {
       Scanner sc=new Scanner (System.in);
       // Kullanıcıdan boy ve kilo bilgisini alma
       System.out.print("Boy(cm): ");
       int boy=sc.nextInt();
       System.out.print("Kilo(kg): ");
       double kilo=sc.nextDouble();
       double index=(kilo/(boy*boy));
       System.out.println("Vücut Kitle İndeksiniz: "+index);
    }
    
}
