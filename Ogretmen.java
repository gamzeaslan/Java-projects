package main1;
public class Ogretmen {
    String isim;
    String telefonNo;
    String brans;
    Ogretmen(String isim,String telefonNo,String brans){
        this.brans=brans;
        this.isim=isim;
        this.telefonNo=telefonNo;
    }
    void ogretmenBilgileriniYazdir(){
        System.out.println("Öğretmenin adı: "+this.isim);
        System.out.println("Öğretmenin branşı: "+this.brans);
        System.out.println("Öğretmenin telefon numarası: "+this.telefonNo);
        
    }
}
