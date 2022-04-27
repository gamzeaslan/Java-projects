package pkg20kuvvetleriodev;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        System.out.println("Sayı: ");
        int number=sc.nextInt();
        for(int i=0;i<=number;i++){
            if((int)Math.pow(20, i)<=number){
                System.out.println((int)Math.pow(20, i));
            }
        }
    }
    
}
