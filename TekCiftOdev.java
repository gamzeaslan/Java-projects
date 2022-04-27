package tekciftodev;

import java.util.Scanner;

public class TekCiftOdev {
    
    public static void main(String[] args) {
        boolean bool=true;
        int toplam=0;
        Scanner sc=new Scanner (System.in);
        do{
            System.out.print("Sayı: ");
            int sayi=sc.nextInt();
            if(sayi%2==0){
                if(sayi%4==0)
                toplam +=sayi;
            }
            else 
                bool=false;
        }
        while(bool);
        System.out.println(toplam);
        
    }
    
}
