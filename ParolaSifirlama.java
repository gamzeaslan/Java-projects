package parolasifirlama;
import java.util.Scanner;
public class ParolaSifirlama{
    static String password="12345";
    static String username="code";
    public static void main(String args[]){
        Scanner sc=new Scanner (System.in);
        System.out.print("Kullanıcı Adını Giriniz: ");
        String inputUsername=sc.nextLine();
        if(inputUsername.equals(username)){
            System.out.println("Doğru Kullanıcı Adı Girişi");
            System.out.print("Şifreyi Giriniz: ");
            String inputPassword=sc.nextLine();
            if(inputPassword.equals(password)){
                System.out.println("Doğru Şifre Girişi");
                
            }
            else{
                System.out.println("Yanlış Şifre Girişi\nLütfen Şifrenizi Tekrar Giriniz: ");
                inputPassword=sc.nextLine();
                if(inputPassword.equals(password)){
                    System.out.println("Doğru Şifre Girişi");
                }
                else{
                    System.out.println("Şifrenizi Sıfırlamak İster Misiniz?\nEvet İçin 1'e basın\nHayır İçin 2'ye Basın: ");
                    int number=sc.nextInt();
                    switch(number){
                        case 1:
                            System.out.println("Şifre Sıfırlamayı Seçtiniz");
                            System.out.print("Yeni Şifreyi Giriniz: ");
                            String newPassword=sc.nextLine();
                            if(newPassword.equals(password)){
                             System.out.println("Yeni Şifre Eski Şifreyle Aynı Olamaz");
                             System.out.println("Lütfen şifreyi tekrar giriniz: ");
                             newPassword=sc.nextLine();
                            if(newPassword.equals(password)){
                              System.out.println("Yeni Şifre Eski Şifreyle Aynı Olamaz");
                            }
                           else{
                              password=newPassword;
                              System.out.println("Şifre Sıfırlama İşlemi Başarılı");
                            }                 
                            }
                             
                            break;
                        case 2:
                            System.out.println("Şifre Sıfırlanmayacak");
                            break;
                        default:
                            System.out.println("Yanlış Giriş yaptınız \nLütfen evet için 1'i , hayır için 2'yi giriniz");
                    }
                }
            }
        }
        else{
            System.out.println("Yanlış Kullanıcı Adı Girdiniz");
            System.out.println("Lütfen Kullanıcı Adınızı Tekrar Giriniz: ");
             inputUsername=sc.nextLine();
             if(inputUsername.equals(username)){
                    System.out.println("Doğru Kullanıcı Adı Girişi");
                    System.out.print("Şifreyi Giriniz: ");
            String inputPassword=sc.nextLine();
            if(inputPassword.equals(password)){
                System.out.println("Doğru Şifre Girişi");
                System.out.println("Sisteme Giriş Başarılı");
                
            }
            else{
                System.out.println("Yanlış Şifre Girişi\nLütfen Şifrenizi Tekrar Giriniz: ");
                inputPassword=sc.nextLine();
                if(inputPassword.equals(password)){
                    System.out.println("Doğru Şifre Girişi");
                    System.out.println("Sisteme Giriş Başarılı");
                }
                else{
                    System.out.println("Şifrenizi Sıfırlamak İster Misiniz?\nEvet İçin 1'e basın\nHayır İçin 2'ye Basın: ");
                    int number=sc.nextInt();
                    switch(number){
                        case 1:
                            System.out.println("Şifre Sıfırlamayı Seçtiniz");
                            System.out.print("Yeni Şifreyi Giriniz: ");
                            String newPassword=sc.nextLine();
                             if(newPassword.equals(password)){
                              System.out.println("Yeni Şifre Eski Şifreyle Aynı Olamaz");
                              System.out.println("Lütfen şifreyi tekrar giriniz: ");
                              newPassword=sc.nextLine();
                            if(newPassword.equals(password)){
                              System.out.println("Yeni Şifre Eski Şifreyle Aynı Olamaz");
                            } 
                            else{
                              password=newPassword;
                              System.out.println("Şifre Sıfırlama İşlemi Başarılı");
                            }
                           }
                             
                            break;
                        case 2:
                            System.out.println("Şifre Sıfırlanmayacak");
                            break;
                        default:
                            System.out.println("Yanlış Giriş yaptınız \nLütfen evet için 1'i , hayır için 2'yi giriniz");
                    }
                }
            }
        
                }
                else{
                    System.out.println("Kullanıcı Adınızı Sıfırlamak İster Misiniz?\nEvet İçin 1'e basın\nHayır İçin 2'ye Basın: ");
                    int number=sc.nextInt();
                    switch(number){
                        case 1:
                            System.out.println("Kullanıcı Adı Sıfırlamayı Seçtiniz");
                            System.out.print("Yeni Kullanıcı Adınızı Giriniz: ");
                            String newUsername=sc.nextLine();
                            if(newUsername.equals(username)){
                             System.out.println("Yeni Kullanıcı Adı Eski Kullanıcı Adıyla Aynı Olamaz");
                             System.out.println("Lütfen Kullanıcı Adını tekrar giriniz: ");
                             newUsername=sc.nextLine();
                           if(newUsername.equals(username)){
                             System.out.println("Yeni Kullanıcı Adı Eski Kullanıcı Adıyla Aynı Olamaz");
                             System.out.println("Kullanıcı Adı Sıfırlama Başarısız");
                            }
                             else{
               password=newUsername;
               System.out.println("Kullanıcı Adı Sıfırlama İşlemi Başarılı");
           }
       }
       else{
         password=newUsername;
        System.out.println("Kullanıcı Adı Sıfırlama İşlemi Başarılı"); 
       }
                            break;
                        case 2:
                            System.out.println("Kullanıcı Adı Sıfırlanmayacak");
                            break;
                        default:
                            System.out.println("Yanlış Giriş yaptınız \nLütfen evet için 1'i , hayır için 2'yi giriniz");
                    }
                }
             
        }
    }
}