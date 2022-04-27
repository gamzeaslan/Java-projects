package sinifgecmehesaplama;
import java.util.Scanner;
public class SinifGecmeHesaplama {
    public static void main(String[] args) {
      Scanner sc=new Scanner (System.in);
      System.out.print("Matemamtik Notu: ");
      double mathNote=sc.nextDouble();
      if(0<=mathNote && 100>=mathNote){
          System.out.print("Kimya Notu: ");
          double chemistryNote=sc.nextDouble();
          if(chemistryNote>=0 && chemistryNote<=100){
              System.out.print("Fizik notu :");
              double physicsNote=sc.nextDouble();
              if(0<=physicsNote && 100>=physicsNote){
                  System.out.print("Türkçe Notu: ");
                  double turkishNote=sc.nextDouble();
                  if(0<=turkishNote && 100>=turkishNote){
                      System.out.print("Müzik Notu: ");
                      double musicNote=sc.nextDouble();
                      if(0<=musicNote && 100>=musicNote){
                          double average=(mathNote+chemistryNote+physicsNote+turkishNote+musicNote)/5;
                          if(average>=55){
                              System.out.println("Sınıfı Geçtiniz");
                          }
                          else {
                              System.out.println("Kaldınız");
                          }
                      }
                      else{
                         System.err.println("Müzik Notunu hatalı girdiniz");
                      }
                  }
                  else{
                     System.err.println("Türkçe Notunu hatalı girdiniz");
                 }
              }
              else{
                 System.err.println("Fizik Notunu hatalı girdiniz");
               }
          }
          else{
          System.err.println("Kimya Notunu hatalı girdiniz");
         }
      }
      else{
          System.err.println("Matematik Notunu hatalı girdiniz");
      }
    }
    
}
