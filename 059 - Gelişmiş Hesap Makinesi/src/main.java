import java.util.Scanner;

public class main {

    static int sum(int a, int b) {
        return a + b;
    }

    static int minus(int a, int b) {
        return a - b;
    }

    static int times(int a, int b) {
        return a * b;
    }

    static int divided(int a, int b) {
        if (b == 0) {
            return 0;
        }
        return a / b;
    }

    static int power(int a, int b) {
        int power = 1;

        if (b == 0) {
            return 1;
        }

        if (a == 0) {
            return 0;
        }

        for (int i = 1; i <= b; i++) {
            power *= a;
        }
        return power;
    }

    static int mod(int a, int b) {
        return a % b;
    }

    static void calc(int a, int b){
        System.out.println("Çevresi: "+ 2 * (a+b));
        System.out.println("Alanı "+ a*b);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int select;

        String menu = "1- Toplama İşlemi\n" +
                "2- Çıkarma İşlemi\n" +
                "3- Çarpma İşlemi\n" +
                "4- Bölme İşlemi\n" +
                "5- Üslü Sayı Hesaplama\n" +
                "6- Mod Alma İşlemi\n" +
                "7- Dikdörtgen Çevre ve Alan Hesabı\n" +
                "0- Çıkış Yap";

        do {
            System.out.println("*******************");
            System.out.println(menu);
            System.out.print("Bir İşlem Seçiniz: ");
            select = input.nextInt();

            if (select == 0) {
                System.out.println("Tekrar Bekleriz...");
                break;
            }

            if (select >= 8){
                System.out.println("Geçersiz İşlem Girdiniz...");
                break;
            }

            System.out.print("Birinci Sayıyı Giriniz: ");
            int a = input.nextInt();
            System.out.print("İkinci Sayıyı Giriniz Sayıyı Giriniz: ");
            int b = input.nextInt();
            switch (select) {
                case 1:
                    System.out.println("Toplam: " + sum(a, b));
                    break;
                case 2:
                    System.out.println("Sonuç: " + minus(a, b));
                    break;
                case 3:
                    System.out.println("Sonuç: " + times(a, b));
                    break;
                case 4:
                    if (divided(a, b) == 0) {
                        System.out.println("İkinci Sayı 0'dan Büyük Olmalı...");
                    } else {
                        System.out.println("Bölüm: " + divided(a, b));
                    }
                    break;
                case 5:
                    if (power(a, b) == 0) {
                        System.out.println("Birinci Sayı 0 Olamaz...");
                    } else {
                        System.out.println("Sonuç : " + power(a, b));
                    }
                    break;
                case 6:
                    System.out.println("Sonuç = "+ mod(a,b));
                    break;
                case 7:
                    calc(a,b);
                    break;
                default:
                    System.out.println("Geçersiz Bir İşlem Girdiniz!!!");
                    break;

            }
        } while (select != 0);
    }
}
