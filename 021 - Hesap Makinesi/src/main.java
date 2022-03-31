import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        int sayi1;
        int sayi2;
        int istek;
        double sonuc = 0;
        Scanner input = new Scanner(System.in);
        System.out.print("Birinci Sayıyı Giriniz : ");
        sayi1 = input.nextInt();
        System.out.print("İkinci Sayıyı Giriniz : ");
        sayi2 = input.nextInt();

        System.out.println("İşlem seçiniz. \n 1- Toplama İşlemi \n 2- Çıkarma İşlemi \n 3- Çarpma İşlemi \n 4- Bölme İşlemi");
        istek = input.nextInt();

        /*if (istek == 1) {
            sonuc = sayi1 + sayi2;

        } else if (istek == 2) {
            sonuc = sayi1 - sayi2;
        } else if (istek == 3) {
            sonuc = sayi1*sayi2;
        } else if (istek == 4){
            sonuc = sayi1/sayi2;
        } else {
            System.out.println("Yanlış Seçim Yaptınız");
        }
        System.out.println("Sonuç : "+ sonuc);   */

        switch (istek){
            case 1: sonuc= sayi1+sayi2; break;
            case 2: sonuc = sayi1 - sayi2; break;
            case 3: sonuc = sayi1*sayi2; break;
            case 4: sonuc = sayi1/sayi2; break;

            default:System.out.println("Yanlış Seçim Yaptınız");

        }
        System.out.println("Sonuç : "+ sonuc);

    }
}
