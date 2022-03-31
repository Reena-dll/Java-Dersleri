import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String kullaniciAd;
        String kullaniciSoyad;
        int kullaniciYasi;
        int kullaniciKm;
        int yolculukTipi; // Tek yön - Gidiş Dönüş
        double ucret = 0;
        double indirim;

        System.out.print("***** Uçak Bilet Satış *****");
        System.out.println("\n \n");

        System.out.print("İsminizi Giriniz: ");
        kullaniciAd = input.nextLine();

        System.out.print("Soyadınızı Giriniz: ");
        kullaniciSoyad = input.nextLine();

        System.out.print("Yaşınızı Giriniz: ");
        kullaniciYasi = input.nextInt();
        if (kullaniciYasi >= 1 && kullaniciYasi <= 100) {
            System.out.print("Kaç Km Gideceksiniz: ");
            kullaniciKm = input.nextInt();
            if (kullaniciKm >= 1 && kullaniciKm <= 5000) {
                System.out.print("Yolculuk Tipini Seçiniz: \n 1- Tek Yön \n 2- Gidiş-Dönüş ");
                yolculukTipi = input.nextInt();
                if (yolculukTipi == 1 || yolculukTipi == 2) {
                    ucret = kullaniciKm * 0.10;
                    if (kullaniciYasi < 12) {
                       indirim = ucret/2;
                       ucret-=indirim;
                    } else if (kullaniciYasi >= 12 && kullaniciYasi <= 24) {

                        indirim = ucret*0.10;
                        ucret-=indirim;
                    } else if (kullaniciYasi >= 65) {
                       indirim = ucret*0.30;
                        ucret -=indirim;
                    }
                    if (yolculukTipi == 2) {
                        indirim = ucret*0.20;
                        ucret -=indirim;
                        ucret*=2;
                    }
                } else {
                    System.out.println("Hatalı Veri Girdiniz!!!");
                }

            } else {
                System.out.print("Hatalı Veri Girdiniz!!!");
            }
            System.out.println("Toplam Tutar : " + ucret);
        } else {
            System.out.print("Hatalı Veri Girdiniz!!!");
        }


    }
}
