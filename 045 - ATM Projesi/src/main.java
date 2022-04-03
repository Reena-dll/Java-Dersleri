import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String userName;
        String password;
        int right = 3;
        int balance = 1500;
        int select;

        while (right > 0) {

            System.out.print("Kullanıcı Adınız: ");
            userName = input.nextLine();
            System.out.print("Kullanıcı Parolası: ");
            password = input.nextLine();

            if (userName.equals("Reena") && password.equals("oguzhan123")) {
                System.out.println("Merhaba, Reena Bankasına Hoşgeldiniz!");
                do {
                    System.out.println("1- Para Yatırma\n2- Para Çekme \n3- Bakiye Sorgula\n4-Çıkış Yap");
                    System.out.print("Lütfen Yapmak İstediğiniz İşlemi Seçiniz: ");
                    select = input.nextInt();
                    switch (select) {
                        case 1:
                            System.out.print("Para Mikatarı: ");
                            int price = input.nextInt();
                            balance += price;
                            break;
                        case 2:
                            System.out.print("Para Mikatarı: ");
                            price = input.nextInt();
                            if (price > balance) {
                                System.out.println("Bakiye Yetersiz");
                            } else {
                                balance -= price;
                            }
                            break;
                        case 3:
                            System.out.println("Bakiyeniz: " + balance);
                            break;

                    }

                } while (select != 4);
                System.out.println("Tekrar görüşmek üzere.");
                break;
            } else {
                right--;
                System.out.println("Hatalı Kullanıcı Adı ve Şifre. Tekrar Deneyiniz.");
                if (right == 0) {
                    System.out.println("Hesabınız bloke olmuştur. Lütfen banka ile iletişime geçiniz.");
                } else {
                    System.out.println("Kalan Hakkınız: " + right);
                }

            }
        }

    }
}
