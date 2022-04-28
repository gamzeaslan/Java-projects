package main1;
public class Main1 {
    public static void main(String[] args) {
        Ogretmen ogretmen1=new Ogretmen("Ayşe", "900", "RSM");
        Ogretmen ogretmen2=new Ogretmen("Elif", "9999","MTH");
        Ogretmen ogretmen3=new Ogretmen("Ahmet", "5000", "TRH");
        ogretmen1.ogretmenBilgileriniYazdir();
        ogretmen2.ogretmenBilgileriniYazdir();
        ogretmen3.ogretmenBilgileriniYazdir();
        
        Ders resim=new Ders("Resim", "101", "RSM");
        resim.bransDogrulama(ogretmen1);
        resim.dersBilgileriniYazdir();
        Ders matematik=new Ders("Matematik", "101", "MTH");
        matematik.bransDogrulama(ogretmen2);
        matematik.dersBilgileriniYazdir();
        Ders tarih=new Ders("Tarih", "101", "TRH");
        tarih.bransDogrulama(ogretmen3);
        tarih.dersBilgileriniYazdir();
        
        Ogrenci ahmet=new Ogrenci("Ahmet","1134","102",resim,matematik,tarih);
        ahmet.notEkle(15, 80, 65);
        ahmet.notYazdir();
        ahmet.notOrtalamasiHesapla();
        ahmet.gecmeDurumu();
        
    }
    
}
