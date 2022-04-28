package main1;
public class Ders {
    Ogretmen ogretmen;
    String isim;
    String kod;
    String önek;
    int not;
    Ders(String isim,String kod,String önek){
        this.isim=isim;
        this.kod=kod;
        this.önek=önek;
        int not=0;
    }
    void dersBilgileriniYazdir(){
        System.out.println("Dersin ismi: "+this.isim);
        System.out.println("Dersin kodu: "+this.kod);
        System.out.println("Dersin öneki: "+this.önek);
        System.out.println("Dersin Öğretmeni: "+this.ogretmen.isim);
    }
    void bransDogrulama(Ogretmen ogretmen){
        if(ogretmen.brans.equals(önek)){
            this.ogretmen=ogretmen;
        }
        else
            System.out.println("Ders ile öğretmen uyuşmazlığı vardır");
    }
}
