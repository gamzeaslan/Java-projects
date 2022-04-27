package maxmin;
import java.util.Scanner;
public class MaxMin {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        System.out.print("Gireceğiniz sayı adetini giriniz: ");
        int sayiAdeti=sc.nextInt();
        int array []=new int [sayiAdeti];
        // kullanıcı girişini diziye ata
        for(int i=0;i<sayiAdeti;i++){
            System.out.print("Sayı: ");
            array[i]=sc.nextInt();
        }
        // dizinin elemanlarından min ve max elemanları bul
        int min=array[0];// ilk değer olarak dizinin ilk elemanını seç(aslında neyi seçtiğin farketmez) 
        int max=array[0];
        // max ve min  bulma 
        for(int i=1;i<array.length;i++){
            if(max<array[i]){
                max=array[i];
            }
            if(min>array[i]){
                min=array[i];
            }
        }
        
        System.out.println("Max: "+max+"\nMin: "+min);
    }
    
}
