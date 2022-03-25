package dairealancevrehesaplama;
import java.util.Scanner;
public class DaireAlanCevreHesaplama {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Yarıçap: ");
        double yariCap=sc.nextDouble();
        final double PI=3.14159;
        double alan=PI*yariCap*yariCap;
        double cevre=2*PI*yariCap;
        System.out.println(yariCap+" yarıçaplı dairenin alanı= "+alan+"\n"+yariCap+" yarıçaplı dairenin çevresi= "+cevre);
    }
    
}
