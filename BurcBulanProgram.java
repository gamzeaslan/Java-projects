package burcbulanprogram;
import java.util.Scanner;
public class BurcBulanProgram {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        System.out.print("Hangi Ayda Doğdunuz: ");
        String month=sc.nextLine();
        if(month.equalsIgnoreCase("Ocak")){
            System.out.print("Ocak Ayının Hangi Günü Doğunuz: ");
            int day=sc.nextInt();
            if(day>=1 && day<=21)
                System.out.println("Burcunuz Oğlak");
            else if(day>21 && day<=31)
                System.out.println("Burcunuz Kova");
        }
        if(month.equalsIgnoreCase("Şubat")){
          System.out.print("Şubat Ayının Hangi Günü Doğunuz: ");
            int day=sc.nextInt();
            if(day>=1 && day<=19)
                System.out.println("Burcunuz Kova");
            else
                System.out.println("Burcunuz Balık");
          
        }
        if(month.equalsIgnoreCase("Mart")){
          System.out.print("Mart Ayının Hangi Günü Doğunuz: ");
            int day=sc.nextInt();
            if(day>=1 && day<=20)
                System.out.println("Burcunuz Balık");
            else
                System.out.println("Burcunuz Koç");
          
        }
        if(month.equalsIgnoreCase("Nisan")){
          System.out.print("Nisan Ayının Hangi Günü Doğunuz: ");
            int day=sc.nextInt();
            if(day>=1 && day<=20)
                System.out.println("Burcunuz Koç");
            else
                System.out.println("Burcunuz Boğa");
          
        }
        if(month.equalsIgnoreCase("Mayıs")){
          System.out.print("Mayıs Ayının Hangi Günü Doğunuz: ");
            int day=sc.nextInt();
            if(day>=1 && day<=21)
                System.out.println("Burcunuz Boğa");
            else
                System.out.println("Burucunuz İkizler");
          
        }
        if(month.equalsIgnoreCase("Haziran")){
          System.out.print("Haziran Ayının Hangi Günü Doğunuz: ");
            int day=sc.nextInt();
            if(day>=1 && day<=22)
                System.out.println("Burcunuz İkizler");
            else
                System.out.println("Burucunuz Yengeç");
          
        }
        if(month.equalsIgnoreCase("Temmuz")){
          System.out.print("Temmuz Ayının Hangi Günü Doğunuz: ");
            int day=sc.nextInt();
            if(day>=1 && day<=22)
                System.out.println("Burcunuz Yengeç");
            else
                System.out.println("Burucunuz Aslan");
          
        }
        if(month.equalsIgnoreCase("Ağustos")){
          System.out.print("Ağustos Ayının Hangi Günü Doğunuz: ");
            int day=sc.nextInt();
            if(day>=1 && day<=22)
                System.out.println("Burcunuz Aslan");
            else
                System.out.println("Burucunuz Başak");
          
        }
        if(month.equalsIgnoreCase("Eylül")){
          System.out.print("Eylül Ayının Hangi Günü Doğunuz: ");
            int day=sc.nextInt();
            if(day>=1 && day<=22)
                System.out.println("Burcunuz Başak");
            else
                System.out.println("Burucunuz Terazi");
          
        }
        if(month.equalsIgnoreCase("Ekim")){
          System.out.print("Ekim Ayının Hangi Günü Doğunuz: ");
            int day=sc.nextInt();
            if(day>=1 && day<=22)
                System.out.println("Burcunuz Terazi");
            else
                System.out.println("Burucunuz Akrep");
          
        }
        if(month.equalsIgnoreCase("Kasım")){
          System.out.print("Kasım Ayının Hangi Günü Doğunuz: ");
            int day=sc.nextInt();
            if(day>=1 && day<=21)
                System.out.println("Burcunuz Akrep");
            else
                System.out.println("Burucunuz Yay");
          
        }
        if(month.equalsIgnoreCase("Aralık")){
          System.out.print("Aralık Ayının Hangi Günü Doğunuz: ");
            int day=sc.nextInt();
            if(day>=1 && day<=21)
                System.out.println("Burcunuz Yay");
            else
                System.out.println("Burucunuz Oğlak");
          
        }
        
    }
    
    
}
