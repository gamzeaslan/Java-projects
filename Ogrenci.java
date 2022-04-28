package main1;
public class Ogrenci {
   Ders ders1;
   Ders ders2;
   Ders ders3;
   String isim;
   String ogrenciNo;
   String sınıf;
   double  ortalama;
   
   Ogrenci(String isim,String ogrenciNo,String sınıf,Ders ders1,Ders ders2,Ders ders3){
     this.ders1=ders1;
     this.ders2=ders2;
     this.ders3=ders3;
     this.isim=isim;
     this.ogrenciNo=ogrenciNo;
     this.sınıf=sınıf;
   }
   void notEkle(int not1,int  not2,int not3){
       if(not1>=0 && not1<=100){
           ders1.not=not1;
       }
       if(not2>=0 && not2<=100){
           ders2.not=not2;
       }
       if(not3>=0 && not3<=100){
           ders3.not=not3;
       }
   }
   void notYazdir(){
       System.out.println(this.ders1.isim+" notu: "+this.ders1.not);
       System.out.println(this.ders2.isim+" notu: "+this.ders2.not);
       System.out.println(this.ders3.isim+" notu: "+this.ders3.not);
   }
   void notOrtalamasiHesapla(){
        this.ortalama=(this.ders1.not+this.ders2.not+this.ders3.not)/3;
       System.out.println("Ortalama: "+this.ortalama);
   }
   void gecmeDurumu(){
       if(this.ortalama>55){
           System.out.println("Geçtiniz");
       }
       else
           System.out.println("Kaldınız");
   }
}
