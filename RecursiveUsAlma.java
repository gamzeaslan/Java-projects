package recursiveusalma;
import java.util.Scanner;
public class RecursiveUsAlma {
    public static double recursiveUsAlma(double taban,int kuvvet){
        double carpma=1;
        if(kuvvet==0){
        return 1;
        }
        
           return(taban*recursiveUsAlma(taban,kuvvet-1)) ;
        
    }
    public static void main(String[] args) {
       Scanner sc=new Scanner (System.in);
       System.out.print("Taban: ");
       double taban=sc.nextDouble();
       System.out.print("Kuvvet: ");
       int kuvvet=sc.nextInt();
        System.out.println(recursiveUsAlma(taban, kuvvet));
      
    }
    
}
