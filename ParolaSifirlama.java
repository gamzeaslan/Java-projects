package parolasifirlama;
import java.util.Scanner;
public class ParolaSifirlama {
    public static void main(String[] args) {
       Scanner sc=new Scanner (System.in);
        // kullanıcı adı girişi
        System.out.print("Kullanıcı Adı: ");
        String username1=sc.nextLine();
        // şifre girişi
        System.out.print("Parola: ");
        String password1=sc.nextLine();
        // kullanıcı adının doğru girişi
        if(username1.equals("code")){
            // şifrenin doğru girişi
            if(password1.equals("12345")){
                System.out.println("Sisteme Giriş Başarılı");
            }
            //kullanıcı adının doğru,şifrenin yanlış girişi
            else {
                System.out.println("Hatalı Şifre Girişi");
                System.out.print("Lütfen Şifreyi Tekrar Giriniz: ");
                 String password2=sc.nextLine();
                 // yeni şifre girişi doğruysa
                if(password2.equals("12345")){
                    System.out.println("Doğru Şifre");
                    
                }
                //yeni şifre girişi doğru değilse
                else{
                    System.out.println("Girilen Şifre Yanlıştır");
                    System.out.print("Şifreyi Sıfırlamak İster Misiniz? ");
                    String answer=sc.nextLine();
                    switch(answer){
                        // şifre sıfırlanmak isteniyorsa
                        case "Evet":
                            System.out.println("Şifreyi Sıfırlamayı Seçtiniz");
                            // yeni şifre girişi
                            System.out.print("Yeni Şifreyi Giriniz: ");
                            String newPassword=sc.nextLine();
                            // yeni şifrenin eski şifreyle aynı olması
                            if(newPassword.equals("12345")){
                                System.out.println("Yeni şifre eski şifreyle aynı olamaz");
                            }
                            // yeni şifrenin hatalı girilen şifreyle aynı olması
                            else if(newPassword.equals(password2)){
                                System.out.println("Yeni Şifre Hatalı Şifreyle Aynı Olamaz");
                            }
                            else {
                                System.out.println("Şifre Sıfırlama İşlemi Başarılı");
                            }
                            break;
                            // şifre sıfırlanmak istenmiyorsa
                        case "Hayır":
                            System.out.println("Şifre Sıfırlama İşlemi başarısız");
                            break;
                            
                }
                }
                // Şifre Sıfırlama İşlemi
                
               
            }
        }
        // Eğer Kullanıcı Adı Girişi Hatalıysa
        else {
            System.out.println("Hatalı Kullanıcı Adı Girişi");
            // tekrar giriş isteniyor
            System.out.print("Kullanıcı Adını Tekrar Giriniz: ");
            String username2=sc.nextLine();
            // doğru yeni giriş
            if(username2.equals("code")){
                System.out.println("Doğru kullanıcı Adı Girişi ");
            }
            // tekrardan hatalı kullanıcı adı girişi
            else{
                System.out.print("Lütfen Kullanıcı Adını Tekrar Giriniz: ");
                String newUsername=sc.nextLine();
                
                if(newUsername.equals("code")){
                    System.out.println("Doğru kullanıcı adı girişi");
                }
                else {
                    // Kullanıcı adının 2.denemede de hatalı girişi
                    System.out.println("Yanlış Kullanıcı adını girdiniz");
                    // kullanıcı adının 3.girişi
                    System.out.print("Kullanıcı Adını Sıfırlamak İste misiniz ? ");
                    String answer =sc.nextLine();
                    switch(answer){
                        case "Evet":
                            // Kullanıcı Adını Sıfırlama
                            System.out.println("Kullanıcı Adını Sıfırlamayı Seçtiniz");
                            System.out.print("Yeni Kullanıcı Adını Giriniz: ");
                            String newPassword=sc.nextLine();
                            // eski kullanıcı adı ile aynı yeni kullanıcı adı oluşturma
                            if(newPassword.equals("code")){
                                System.out.println("Yeni kullanıcı adı eski kullanıcı adıyla aynı olamaz");
                            }
                            else if(newPassword.equals(username2)){
                                System.out.println("Yeni Kullanıcı Adını Hatalı Kullanıcı Adıyla Aynı Olamaz");
                            }
                            break;
                        case "Hayır":
                            System.out.println("Kullanıcı Adını Sıfırlama İşlemi başarısız");
                            break;
                            
                }
               
                }
            }
        }
    }
    
}
