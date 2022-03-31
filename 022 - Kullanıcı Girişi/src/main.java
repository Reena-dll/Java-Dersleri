import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int secim = 0;
        String newPassword;
        String userName, password;
        String enterPassword = "12345";

        System.out.print("Kullanıcı adınızı girin : ");
        userName = input.nextLine();
        System.out.print("Şifrenizi girin : ");
        password = input.nextLine();

        if (userName.equals("Reena") && password.equals(enterPassword)) {
            System.out.println("Giriş Yaptınız");

        } else {
            System.out.println("Bilgileriniz Yanlış. Şifrenizi sıfırlamak ister misiniz \n 1- Evet \n 2- Hayır ?");
            secim = input.nextInt();
            if (secim == 1) {
                System.out.print("Lütfen yeni şifrenizi giriniz : ");
                input.nextLine();
                newPassword = input.nextLine();
                if (enterPassword.equals(newPassword) || password.equals(newPassword)) {
                    System.out.println("Şifre oluşturulamadı, lütfen başka şifre giriniz.");
                } else{
                    enterPassword = newPassword;
                    System.out.println("Şifre değiştirildi");
                    System.out.println("Şifreniz: "+ enterPassword);
                }

            } else if (secim == 2) {
                System.out.println("Tekrar Bekleriz...");
            }
        }
    }
}
